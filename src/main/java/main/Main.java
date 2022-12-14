package main;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import main.crud.GenericDAO;
import main.model.Deck;
import main.model.Usuario;
@SpringBootApplication
public class Main {

	public static <T> void main(String[] args) {
		
//		Deck deck1 = new Deck(null, "Manolo", null, null);
//		
//		GenericDAO<Deck> genericDAODeck = new GenericDAO(Deck.class);
//		
//		genericDAODeck.insertarRegistroJPA(deck1);
//	
//		ArrayList<Deck> user = genericDAODeck.listarRegistros("Deck");
//	
//		
		SpringApplication.run(Main.class, args);
		
		
	}
	
}
