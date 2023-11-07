
package com.TIENDA.service;

import com.TIENDA.domain.Producto;
import java.util.List;

public interface ProductoService {
   
    //Método que retorna la lista de productos
    public List<Producto> getProductos (boolean activos);
    
    //Se obtiene un Producto, a partir del id de un producto
    public Producto getProducto (Producto producto);
    
    //Se inserta un nuevo producto si el id del producto está vacio
    //Se actualiza un producto si el id del producto NO está vacio
    public void save (Producto producto);
    
    //Se elimina el producto que tiene el id pasado por parámetro
    public void delete(Producto producto);
    
//    //Lista de productos con precio entre ordenados por descripción ConsultaAmpliada
//    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);
//    
//    //Lista de productos utilizando consultas con JPQL
//    public List<Producto> métodoJPQL(double precioInf, double precioSup);
//    
//    //Lista de productos utilizando consultas con SQL Nativo
//    public List<Producto> metodoNativo(double precioInf, double precioSup);
}
