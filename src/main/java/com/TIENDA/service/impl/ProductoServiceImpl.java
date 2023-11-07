
package com.TIENDA.service.impl;

import com.TIENDA.dao.ProductoDao;
import com.TIENDA.domain.Producto;
import com.TIENDA.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoServiceImpl implements ProductoService{
    
    @Autowired
    private ProductoDao productoDao;
    
    @Override
    @Transactional (readOnly = true)
    public List<Producto> getProductos(boolean activos) {
        List<Producto> productos = productoDao.findAll();
        
        if (activos) {
            //Para remover los productos donde activo = false
            productos.removeIf(p -> !p.isActivo());
        } 
        return productos;
    }
    @Override
    public Producto getProducto(Producto producto) {
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Producto producto) {
        productoDao.save(producto);
    }
    
    @Override
    @Transactional
    public void delete(Producto producto) {
        productoDao.delete(producto);
    } 
//        //Lista de productos con precio entre ordenados por descripcion ConsultaAmpliada
//        @Override
//        @Transactional(readOnly = true)
//        
//    }
}
