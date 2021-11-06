package br.com.server.northwind.models;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "shippers")
public class Shippers {
  
  @Id
  @SequenceGenerator( name = "shippers_sequence", sequenceName = "shippers_sequence", allocationSize = 1)
  @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "shippers_sequence")
  @Column(nullable = false, updatable = false)
  private Long shipperid;
  
  @NotNull
  @Length(max = 40)
  private String companyname;
  
  @NotNull
  @Length(max = 24)
  private String phone;
  
}
