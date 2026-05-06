package org.generation.products.service;

import org.generation.products.model.Product;
import org.generation.products.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // GET: obtener todos los productos
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // POST: guardar un producto nuevo
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    // PUT: actualizar producto por id
    public Product updateProduct(Long id, Product product) {
        Product existingProduct = productRepository.findById(id).orElse(null);

        if (existingProduct == null) {
            return null;
        }

        existingProduct.setName(product.getName());
        existingProduct.setDescription(product.getDescription());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setStock(product.getStock());

        return productRepository.save(existingProduct);
    }

    // DELETE: eliminar producto por id
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}