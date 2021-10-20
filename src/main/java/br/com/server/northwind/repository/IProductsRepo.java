package br.com.server.northwind.repository;

import br.com.server.northwind.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IProductsRepo extends JpaRepository<Products, Long> {
}
