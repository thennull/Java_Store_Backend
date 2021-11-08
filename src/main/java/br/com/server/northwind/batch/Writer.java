package br.com.server.northwind.batch;

import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class Writer implements ItemWriter<String> {
   @Override
   public void write ( List<? extends String> tableNameList ) throws Exception {
      System.out.println( "Running writer process..." );
      System.out.println( "Writing: " +  tableNameList);
   }
}
