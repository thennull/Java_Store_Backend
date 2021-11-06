package br.com.server.northwind.models;

import lombok.Data;
import org.hibernate.validator.constraints.Length;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Entity
@Table(name = "employees")
public class Employees {
   
   @Id
   @SequenceGenerator( name = "employees_sequence", sequenceName = "employees_sequence", allocationSize = 1)
   @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "employees_sequence")
   @Column(nullable = false, updatable = false)
   private Long employeeid;
   
   @NotNull
   @Length(max = 20)
   private String lastname;
   
   @Length(max = 60)
   private String address;
   
   @Temporal( TemporalType.DATE )
   private Date birthdate;
   
   @Length(max = 15)
   private String city;
   
   @Length(max = 15)
   private String country;
   
   @Length(max = 4)
   private String extension;
   
   @NotNull
   @Length(max = 10)
   private String firstname;
   
   @Temporal( TemporalType.DATE )
   private Date hiredate;
   
   @Length(max = 24)
   private String homephone;
   
   private String notes;
   
   private byte[] photo;
   
   @Length(max = 255)
   private String photopath;
   
   @Length(max = 10)
   private String postalcode;
   
   @Length(max = 15)
   private String region;
   
   private Integer reportsto;
   
   @Length(max = 30)
   private String title;
   
   @Length(max = 25)
   private String titleofcourtesy;
}
