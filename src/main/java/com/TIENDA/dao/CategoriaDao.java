package com.TIENDA.dao;

import com.TIENDA.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

/*Interfaces es exponer metodos que puede ser utilizado por alguien. 
En este caso es para el controler,
Alguien mas tiene que implem..*/

public interface CategoriaDao extends JpaRepository<Categoria, Long>{
    
}
