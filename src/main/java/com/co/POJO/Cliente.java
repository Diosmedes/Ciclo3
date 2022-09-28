/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.co.POJO;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author BRYAN
 */
@Data//toma los atributos y crea todo el esquema de la base de datos 
@Entity
@Table(name="cliente")
public class Cliente implements Serializable {
    @Id
    private Integer idcliente;
    private String nombre;
    private String apellido;
    private String correo;
    private String usuario;
    private String password;
}
