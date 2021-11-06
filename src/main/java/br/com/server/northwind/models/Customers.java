package br.com.server.northwind.models;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "customers")
public class Customers {
   
   @Id
   @SequenceGenerator( name = "customer_sequence", sequenceName = "customer_sequence",  allocationSize = 1)
   @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "customer_sequence")
   @Column(nullable = false, updatable = false)
   private Long customerid;
   
   @Length(max = 60)
   private String address;
   
   @Length(max = 15)
   private String city;
   
   @Length(max = 40)
   @NotNull
   private String companyname;
   
   @Length(max = 30)
   private String contactname;
   
   @Length(max = 30)
   private String contacttitle;
   
   @Length(max = 15)
   private String country;
   
   @Length(max = 24)
   private String fax;
   
   @Length(max = 24)
   private String phone;
   
   @Length(max = 10)
   private String postalcode;
   
   @Length(max = 15)
   private String region;
}
