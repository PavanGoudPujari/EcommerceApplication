package com.pavan.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.pavan.entity.ProductEntity;



@RepositoryRestResource(path="product")
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    Page<ProductEntity> findByCategoryId(@Param("id")Long id, Pageable pageable);

    Page<ProductEntity>findByNameContaining(@Param("name")String name, Pageable pageable);

}

