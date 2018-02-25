package ynm.springbootcap.repositories;

import ynm.springbootcap.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, String> {
}
