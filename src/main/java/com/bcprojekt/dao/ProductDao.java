/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcprojekt.dao;

import com.bcprojekt.model.Product;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Matt
 */

public interface ProductDao extends CrudRepository<Product, Integer> {
    
    
    
}
