package com.vcoelho.servicosmobile.repository;

import com.vcoelho.servicosmobile.entity.Product;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author vinicius
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	List<Product> findByNameIgnoreCaseContaining(String name);
}
