package io.mulshankar13.shoppingcart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.mulshankar13.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long >{

}
