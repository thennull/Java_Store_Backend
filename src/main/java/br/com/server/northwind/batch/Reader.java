package br.com.server.northwind.batch;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

/* Apenas um teste de configuração de batch ... será implementado posteriormente */

public class Reader implements ItemReader<String> {
   
   private String[] tablesArr = {"products", "employees", "customers", "orders_details"};
   private int count;
   
   @Override
   public String read ( ) throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
      System.out.println( "Reading..." );
      if(this.count < (this.tablesArr.length - 1)) {
         return this.tablesArr[this.count++];
      } else {
         this.count = 0;
      }
      return null;
   }
}
