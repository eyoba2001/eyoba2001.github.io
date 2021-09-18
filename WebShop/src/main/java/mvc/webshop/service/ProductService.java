package mvc.webshop.service;

import mvc.webshop.domain.Product;
import mvc.webshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;


    public Product findById(String id){
        //return bankRepository.findById(accountNum).get();--you can use this also
           Product product= productRepository.findProductById(id);
           System.out.println(product.getName());

            return product;

    }
    public List<Product> findAll(){
        //return bankRepository.findById(accountNum).get();--you can use this also
       List<Product> products= productRepository.findAll();
        return products;

    }

    public void deleteProduct(String id){
        productRepository.deleteById(id);

    }
    public ProductDTO addproduct(ProductDTO product){

        productRepository.save(ProductAdapter.getProduct(product));
        return product;
    }
//    public CustomerDTO deposite(int accountNumber,double amount){
//        Customer customer=CustomerAdapter.getCustomer(findCustomerByAccountNumber(accountNumber));
//        customer.deposit(amount);
//        return findCustomerByAccountNumber(accountNumber);
//    }
//    public CustomerDTO withdraw(int accountNumber,double amount){
//        Customer customer=CustomerAdapter.getCustomer(findCustomerByAccountNumber(accountNumber));
//        customer.withdraw(amount);
//        return findCustomerByAccountNumber(accountNumber);
//    }
}
