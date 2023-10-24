package com.TIENDA.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data //Facilita el desarrollo de entidades para no crear los get/set de los atributos.
@Entity //Nos dice que esta clase "Categoria" se va a manejar como una entidad
@Table(name = "categoria") //Especifica a que tabla se mapea la clase (BD)
public class Categoria implements Serializable {
   //Version de serializacion: Convierte un objeto en algo mas.
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_categoria")
    private Long idCategoria; //Transforma el id_categoria
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
    
    //Contructor base
    public Categoria () {
        
    }
    
    // Contructor sobrecargado
    public Categoria(String descripcion, String rutaImagen, boolean activo) {
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }
    
}
