package FinalExam.SuperMarket.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import FinalExam.SuperMarket.Model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {}

