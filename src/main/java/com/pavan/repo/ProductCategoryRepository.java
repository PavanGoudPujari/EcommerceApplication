package com.pavan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.pavan.entity.ProductCategoryEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(path="product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategoryEntity, Long> {
}

