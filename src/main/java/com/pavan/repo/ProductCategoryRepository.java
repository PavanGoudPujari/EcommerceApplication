package com.pavan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.pavan.entity.ProductCategoryEntity;

@RepositoryRestResource(path="product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategoryEntity, Long> {
}

