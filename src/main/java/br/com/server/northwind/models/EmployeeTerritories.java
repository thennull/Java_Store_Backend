package br.com.server.northwind.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employeeterritories")
@IdClass( EmployeeTerritoriesId.class )
public class EmployeeTerritories {

   @Id
   @Column(nullable = false, updatable = false)
   private Long employeeid;
   
   @Id
   @Column(nullable = false, updatable = false)
   private String territoryid;
}
