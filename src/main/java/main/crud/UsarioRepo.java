package main.crud;

import org.springframework.data.jpa.repository.JpaRepository;

import main.model.Usuario;

public interface UserRepo extends JpaRepository<Usuario, Integer> {

}
