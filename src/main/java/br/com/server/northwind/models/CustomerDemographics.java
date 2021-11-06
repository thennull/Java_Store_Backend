package br.com.server.northwind.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "customerdemographics")
public class CustomerDemographics {
   
   @Id
   @SequenceGenerator( name = "customerdemo_sequence", sequenceName = "customerdemo_sequence", allocationSize = 1)
   @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "customerdemo_sequence")
   @Column(nullable = false, updatable = false)
   private Long customertypeid;
   
   private String customerdesc;
}
