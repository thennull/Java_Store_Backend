package br.com.server.northwind.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "order_details")
@IdClass( OrderDetailsId.class )
public class OrderDetails {
   
   @Id
   @Column(nullable = false, updatable = false)
   private Long orderid;
   
   @NotNull
   private Double discount;
   
   @Id
   @Column(nullable = false, updatable = false)
   private Long productid;
   
   @NotNull
   private Integer quantity;
   
   @NotNull
   private Double unitprice;
}
