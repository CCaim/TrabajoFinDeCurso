package main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import main.crud.CartaRepo;
import main.crud.DeckRepo;
import main.crud.UserRepo;

@RequestMapping("/decks")
@Controller
public class DeckController {

	@Autowired
	private DeckRepo deckRepo;
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private CartaRepo cartaRepo;
	
	@GetMapping(value = {"", "/"})
	String homeDecks(Model model) {
		
		//Salir a buscar a la BBDD 
		
		
		
		return "decks";
	}
	
	
}
