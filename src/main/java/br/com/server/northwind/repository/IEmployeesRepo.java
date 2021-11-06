package br.com.server.northwind.repository;

import br.com.server.northwind.models.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeesRepo extends JpaRepository<Employees, Long> {
}
