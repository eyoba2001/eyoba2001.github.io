package mvc.webshop.service;

import mvc.webshop.domain.Product;

public class ProductAdapter {
    public static Product getProduct(ProductDTO productDTO){
        Product product = new Product();
        if (productDTO != null) {
            product = new Product(productDTO.getId(),productDTO.getName(),productDTO.getDescription(),productDTO.getPrice());
        }
        return product;
    }

    public static ProductDTO getProductDTO(Product product){
        ProductDTO productDTO = new ProductDTO();
        if (product != null) {
            productDTO = new ProductDTO(product.getId(),product.getName(),product.getDescription(),productDTO.getPrice());
        }
        return productDTO;
    }
}
