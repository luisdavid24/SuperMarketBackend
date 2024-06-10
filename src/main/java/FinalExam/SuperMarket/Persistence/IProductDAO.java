package FinalExam.SuperMarket.Persistence;

import org.springframework.data.repository.CrudRepository;

import FinalExam.SuperMarket.Model.Product;

public interface IProductDAO extends CrudRepository<Product, Long> {
}
