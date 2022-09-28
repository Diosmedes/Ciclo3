/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.co.DAO;

import com.co.POJO.Alquiler;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author BRYAN
 */
public interface AlquilerDAO extends CrudRepository<Alquiler, Integer> {
    
}
