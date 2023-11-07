
package com.TIENDA.dao;

import com.TIENDA.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductoDao extends JpaRepository <Producto, Long> {
    
//    //Ejemplo de método utilizando Métodos de Query
//    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);
//    
//    //Ejemplo de m[etodo utilizando Consultas con JPQL
//    @Query(value="SELECT a FROM Producto a where a.precio BETWEEN :precioInf AND :precioSup ORDER BY a.descripcion ASC")
//    public List <Producto> metodoJPQL(@Param("precioInf") double precioInf, @Param("precioSup") double precioSup);
//    
//    //Ejemplo de m[etodo utilizando Consultas con SQL nativo
//    @Query(nativeQuery=true,
//            value="SELECT * FROM producto p where p.precio BETWEEN :precioInf AND :precioSup ORDER BY p.descripcion ASC")
//    public List<Producto> metodoNativo(@Param("precioInf") double precioInf, @Param("precioSup") double precioSup);
//  
    
    
}
