package br.com.server.northwind.repository;

import br.com.server.northwind.models.CustomerDemographics;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerDemographicsRepo extends JpaRepository<CustomerDemographics, Long> {
}
