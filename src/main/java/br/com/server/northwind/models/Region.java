package br.com.server.northwind.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "region")
public class Region {
   
   @Id
   @SequenceGenerator( name = "region_sequence", sequenceName = "region_sequence", allocationSize = 1)
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "region_sequence")
   @Column(nullable = false, updatable = false)
   private Long regionid;
   
   @NotNull
   private String regiondescription;
}
