package br.com.server.northwind.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "territories")
public class Territories {
   
   @Id
   @Column( nullable = false, updatable = false )
   private String territoryid;
   
   @NotNull
   private String territorydescription;
   
   @NotNull
   private Long regionid;
}
