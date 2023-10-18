package com.TIENDA.service;

import com.TIENDA.domain.Categoria;
import java.util.List;


public interface CategoriaService {
// Exponer metodos que pueden 
    
    public List<Categoria> getCategorias (boolean activo);
    public Categoria getCategoria (Categoria categoria);
}
