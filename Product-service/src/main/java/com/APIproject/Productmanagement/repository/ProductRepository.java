package com.APIproject.Productmanagement.repository;

import com.APIproject.Productmanagement.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
 @Override
 <S extends Product> S insert(S entity);
}
