package br.com.server.northwind.batch;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class TableJobListener implements JobExecutionListener {
   @Override
   public void beforeJob ( JobExecution jobExecution ) {
      System.out.println( "Job started..." );
      System.out.println( jobExecution.getJobInstance().getJobName() );
   }
   
   @Override
   public void afterJob ( JobExecution jobExecution ) {
      System.out.println( "Job ended..." );
      System.out.println( "Job status: " + jobExecution.getStatus().toString() );
   }
}
