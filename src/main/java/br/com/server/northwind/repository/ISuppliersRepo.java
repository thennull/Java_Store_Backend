package br.com.server.northwind.repository;

import br.com.server.northwind.models.Suppliers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISuppliersRepo extends JpaRepository<Suppliers, Long> {
}
