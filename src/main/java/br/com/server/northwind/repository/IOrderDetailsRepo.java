package br.com.server.northwind.repository;

import br.com.server.northwind.models.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderDetailsRepo extends JpaRepository<OrderDetails, Long> {
}
