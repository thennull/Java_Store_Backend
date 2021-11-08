package br.com.server.northwind.batch;

import org.springframework.batch.item.ItemProcessor;

public class Processor implements ItemProcessor<String, String> {
   @Override
   public String process ( String inputStr ) throws Exception {
      System.out.println("Running Input Process...");
      String tableName = inputStr;
      return "Processing table: " + tableName.toUpperCase();
   }
}
