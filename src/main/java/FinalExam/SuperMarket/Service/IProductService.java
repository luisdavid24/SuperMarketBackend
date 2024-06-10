package FinalExam.SuperMarket.Service;

import java.util.List;

import FinalExam.SuperMarket.Model.Product;

public interface IProductService {

    Product findById(Long id);

    List<Product> findAll();

    void createProduct(Product product);

    void deleteById(Long id);
}
