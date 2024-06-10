package FinalExam.SuperMarket.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import FinalExam.SuperMarket.Model.Product;
import FinalExam.SuperMarket.Service.IProductService;

@Controller
public class ProductController {

    @Autowired
    private IProductService productService;

    @QueryMapping(name = "findProductById")
    public Product findById(@Argument(name ="productId") String id){
        Long productId=Long.valueOf(id);
        return productService.findById(productId);

    }
}
