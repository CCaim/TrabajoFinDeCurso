package main.servicio.impl;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import main.crud.UsuarioRepo;
import main.model.Rol;
import main.model.Usuario;
import main.servicio.interfaces.UsuarioService;

public class UsuarioServiceImplements implements UsuarioService {
	@Autowired
	private UsuarioRepo usuarioRepo;
	private Object roles;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Usuario> usuario = usuarioRepo.findByUsername(username);

		if (usuario.isPresent()) {
			Usuario springUserMio = usuario.get();
			return springUserMio;
		} else {
			throw new UsernameNotFoundException("Usuario no encontrado");
		}
		
	}


}
