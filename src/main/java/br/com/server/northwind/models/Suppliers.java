package br.com.server.northwind.models;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "suppliers")
public class Suppliers {

   @Id
   @SequenceGenerator( name = "suppliers_sequence", sequenceName = "suppliers_sequence", allocationSize = 1)
   @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "suppliers_sequence")
   @Column(nullable = false, updatable = false)
   private Long supplierid;
   
   @NotNull
   @Length(max = 40)
   private String companyname;
   
   @Length(max = 30)
   private String contactname;
   
   @Length(max = 30)
   private String address;
   
   @Length(max = 60)
   private String city;
   
   @Length(max = 15)
   private String region;
   
   @Length(max = 10)
   private String postalcode;
   
   @Length(max = 15)
   private String country;
   
   @Length(max = 24)
   private String phone;
   
   @Length(max = 24)
   private String fax;
   
   private String homepage;
}
