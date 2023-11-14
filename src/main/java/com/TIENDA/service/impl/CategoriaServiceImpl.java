package com.TIENDA.service.impl;

import com.TIENDA.dao.CategoriaDao;
import com.TIENDA.domain.Categoria;
import com.TIENDA.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaDao categoriaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Categoria> getCategorias(boolean activos) {
        List <Categoria> categorias = categoriaDao.findAll();
        if (activos) {
            categorias.removeIf(e -> !e.isActivo());
        }
        return categorias;
    }

    @Override
    public Categoria getCategoria(Categoria categoria) {
        return categoriaDao.findById(categoria.getIdCategoria()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Categoria categoria) {
        categoriaDao.save(categoria);
    }

    @Override
    @Transactional
    public void delete(Categoria categoria) {
        categoriaDao.delete(categoria);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Categoria> getCategoriasPorDescripcion(String descripcion) {
        return categoriaDao.findByDescripcionContainingIgnoreCase(descripcion);
    }  
}
