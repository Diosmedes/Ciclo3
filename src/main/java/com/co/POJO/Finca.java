/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.co.POJO;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author BRYAN
 */

@Data//toma los atributos y crea todo el esquema de la base de datos 
@Entity
@Table(name="finca")
public class Finca implements Serializable{
    @Id
    private Integer idfinca;
    private String tipo;
    private String nhabitaciones;
    private String nbaños;
    private String ubicacion;
    private String zonasrecreativas;
}
