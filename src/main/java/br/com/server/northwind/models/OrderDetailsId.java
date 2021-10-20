package br.com.server.northwind.models;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderDetailsId implements Serializable {
   private Long orderid;
   private Long productid;
}
