package br.com.server.northwind.models;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

@Data
@Entity
@Table(name = "usstates")
public class UsStates {
   
   @Id
   @SequenceGenerator( name = "usstates_sequence", sequenceName = "usstates_sequence", allocationSize = 1)
   @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "usstates_sequence")
   @Column(nullable = false, updatable = false)
   private Long stateid;
   
   @Length(max = 2)
   private String stateabbr;
   
   @Length(max = 100)
   private String statename;
   
   @Length(max = 50)
   private String stateregion;
}
