package br.com.server.northwind.repository;

import br.com.server.northwind.models.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoriesRepo extends JpaRepository<Categories, Long> {
}
