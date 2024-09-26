package com.pavan.config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.metamodel.EntityType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import java.util.ArrayList;
import java.util.*;

import java.util.Set;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

    @Autowired
    private EntityManager entityManager;

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
       exposeIds(config);

    }

    private void exposeIds(RepositoryRestConfiguration config){
        Set<EntityType<?>> entities = entityManager.getMetamodel().getEntities(); // getting all entity classes from the entity manager
    List<Class> entityClasses= new ArrayList<>(); // creating a list to store entity classes

        //get entity types for enitites
    for(EntityType tempEntityType : entities){
        entityClasses.add(tempEntityType.getJavaType()); // adding entities to list
    }

    //expose ids for domain types
    Class[] domainTypes = entityClasses.toArray(new Class[0]);

    config.exposeIdsFor(domainTypes);
    }
}
