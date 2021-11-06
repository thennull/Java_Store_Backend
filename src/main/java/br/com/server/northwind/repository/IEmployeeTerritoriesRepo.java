package br.com.server.northwind.repository;

import br.com.server.northwind.models.EmployeeTerritories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeTerritoriesRepo extends JpaRepository<EmployeeTerritories, Long> {
}
