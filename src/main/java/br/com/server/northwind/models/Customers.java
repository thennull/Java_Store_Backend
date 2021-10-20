package br.com.server.northwind.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "customers")
public class Customers {
   @Id
   @SequenceGenerator( name = "customer_sequence", sequenceName = "customer_sequence",  allocationSize = 1)
   @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "customer_sequence")
   private Long customerid;
   private String address;
   private String city;
   @NotNull
   private String companyname;
   private String contactname;
   private String contacttitle;
   private String country;
   private String fax;
   private String phone;
   private String postalcode;
   private String region;
}
