package pl.shopping.warehouse.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import pl.shopping.warehouse.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {


    Optional<Product> findByProductID(Integer productID);

}