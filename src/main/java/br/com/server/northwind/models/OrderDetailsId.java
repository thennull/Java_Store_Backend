package br.com.server.northwind.models;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class OrderDetailsId implements Serializable {
   @NotNull
   private Long orderid;
   
   @NotNull
   private Long productid;
   
   
}
