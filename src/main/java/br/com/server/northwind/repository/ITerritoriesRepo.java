package br.com.server.northwind.repository;

import br.com.server.northwind.models.Territories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITerritoriesRepo extends JpaRepository<Territories, String> {
}
