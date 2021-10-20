package br.com.server.northwind.models;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "categories")
public class Categories {
   @Id
   @SequenceGenerator( name = "category_sequence", sequenceName = "category_sequence",  allocationSize = 1)
   @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "category_sequence")
   private Long categoryid;
   @NotNull
   @Length(max = 15)
   private String categoryname;
   private String description;
   private Byte picture;
}
