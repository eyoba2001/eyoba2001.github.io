package mvc.webshop.web;

import mvc.webshop.domain.Product;
import mvc.webshop.service.ProductDTO;
import mvc.webshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/getProduct/{id}")
    public ResponseEntity<?> getProduct(@PathVariable String id){
         Product product= service.findById(id);
        if (product == null) {
            return new ResponseEntity<CustomErrorType>(new CustomErrorType("Product with id= " + id + " is not available"),HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<Product> (product, HttpStatus.OK);
    }
    @GetMapping("/products")
    public ResponseEntity<?> searchBooks() {
        List<Product> allProducts = service.findAll();
        return new ResponseEntity<List<Product>>(allProducts, HttpStatus.OK);
    }
    @DeleteMapping("/products/{id}")
    public ResponseEntity<?> removeproduct(@PathVariable String  id){
        Product product=service.findById(id);
        if(product==null){
            return new ResponseEntity<CustomErrorType>(new CustomErrorType("A product with this id " +
                    "does not exisit"),HttpStatus.NOT_FOUND);
        }
        service.deleteProduct(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/products")
    public ResponseEntity<?> handlePost(@RequestBody ProductDTO product) {

               product = new ProductDTO(product.getId(), product.getName(),product.getDescription(),product.getPrice());
                service.addproduct(product);
                return new ResponseEntity<ProductDTO> (product, HttpStatus.OK);
    }


}
