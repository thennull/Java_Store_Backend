package br.com.server.northwind.repository;

import br.com.server.northwind.models.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomersRepo extends JpaRepository<Customers, Long> {
}
