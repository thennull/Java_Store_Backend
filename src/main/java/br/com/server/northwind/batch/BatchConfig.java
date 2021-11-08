package br.com.server.northwind.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BatchConfig {
   
   @Autowired
   private StepBuilderFactory sbf;
   
   @Autowired
   private JobBuilderFactory jbf;
   
   @Bean
   public Reader tableReader() {
      return new Reader();
   }
   
   @Bean
   public Writer tableWriter() {
      return new Writer();
   }
   
   @Bean
   public Processor tableProcessor() {
      return new Processor();
   }
   
   @Bean
   public TableJobListener tableListener() {
      return new TableJobListener();
   }
   
   @Bean
   public Step step() {
      return sbf.get( "step1" ).<String, String>chunk( 1 )
            .reader(this.tableReader())
            .writer(this.tableWriter())
            .processor(this.tableProcessor())
            .build();
   }
   
   @Bean
   public Job tableJob() {
      return jbf.get( "job1" ).incrementer( new RunIdIncrementer() )
            .listener( this.tableListener() )
            .start( this.step() )
            .build();
   }
}
