package main;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import main.crud.GenericDAO;
import main.model.Usuario;
@SpringBootApplication
public class Main {

	public static <T> void main(String[] args) {
		
		Usuario user1 = new Usuario(null, "Manolo");
		
		GenericDAO<Usuario> genericDAOUser = new GenericDAO(Usuario.class);
		
		genericDAOUser.insertarRegistroJPA(user1);
		
		ArrayList<Usuario> user = genericDAOUser.listarRegistros("Usuario");
		
		
		SpringApplication.run(Main.class, args);
		
		
	}
	
}
