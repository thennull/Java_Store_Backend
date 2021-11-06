package br.com.server.northwind.repository;

import br.com.server.northwind.models.Shippers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IShippersRepo extends JpaRepository<Shippers, Long> {
}
