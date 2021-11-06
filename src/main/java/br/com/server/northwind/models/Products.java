package br.com.server.northwind.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "products")
public class Products {
   
   @Id
   @SequenceGenerator( name = "product_sequence", sequenceName = "product_sequence", allocationSize = 1)
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_sequence")
   @Column(nullable = false, updatable = false)
   private Long productid;
   
   @NotNull
   private String productname;
   private Long supplierid;
   private Long categoryid;
   private String quantityperunit;
   private Double unitprice;
   private Integer unitsinstock;
   private Integer unitsonorder;
   private Integer reorderlevel;
   @NotNull
   private Integer discontinued;
}
