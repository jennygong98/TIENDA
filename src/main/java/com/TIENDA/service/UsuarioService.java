package com.TIENDA.service;

import com.TIENDA.domain.Usuario;
import org.springframework.security.core.userdetails.*;

public interface UsuarioService {

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

    public Usuario getUsuarioPorUsername(String username);

}
