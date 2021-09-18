package mvc.webshop.repository;

import mvc.webshop.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository  extends MongoRepository<Product,String> {

         //List<Product> findByCatagory(String catagory);
         Product findProductById(String id);
          List<Product>findAll();
          void deleteById(String id);
//        @Query("{'transactions.type':?0}")
//        List<Customer> CustomersWithTransactionType(String a);

    }
