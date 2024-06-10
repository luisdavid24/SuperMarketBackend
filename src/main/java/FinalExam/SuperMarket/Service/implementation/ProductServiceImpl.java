package FinalExam.SuperMarket.Service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import FinalExam.SuperMarket.Model.Product;
import FinalExam.SuperMarket.Persistence.IProductDAO;
import FinalExam.SuperMarket.Service.IProductService;


@Service
public class ProductServiceImpl  implements IProductService{

    @Autowired
    private IProductDAO productDAO;

    @Override
    @Transactional(readOnly=true)
    public Product findById(Long id) {
        return productDAO.findById(id).orElseThrow();
    }

    @Override
    @Transactional(readOnly=true)
    public List<Product> findAll() {
        return (List<Product>) productDAO.findAll();
    }

    @Override
    public void createProduct(Product product) {
       productDAO.save(product);
    }

    @Override
    public void deleteById(Long id) {
        productDAO.deleteById(id);
    }
    
}
