package br.com.server.northwind.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Entity
@Table(name = "order_details")
@IdClass( OrderDetailsId.class )
public class OrderDetails {
   @Id
   private Long orderid;
   @NotNull
   private Double discount;
   @Id
   private Long productid;
   @NotNull
   private Integer quantity;
   @NotNull
   private Double unitprice;
}
