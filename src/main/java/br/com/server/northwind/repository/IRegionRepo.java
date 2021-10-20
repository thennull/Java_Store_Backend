package br.com.server.northwind.repository;

import br.com.server.northwind.models.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRegionRepo extends JpaRepository<Region, Long> {
}
