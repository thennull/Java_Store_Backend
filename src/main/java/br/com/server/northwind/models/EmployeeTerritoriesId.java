package br.com.server.northwind.models;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Data
public class EmployeeTerritoriesId implements Serializable {
   
   @NotNull
   private Long employeeid;
   
   @NotNull
   @Length(max = 20)
   private String territoryid;
   
   public EmployeeTerritoriesId(Long employeeid, Long territoryid) {
      this.employeeid = employeeid;
      this.territoryid = Objects.toString( territoryid, null );
   }
}
