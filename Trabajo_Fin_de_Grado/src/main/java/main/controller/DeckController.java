package main.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import main.crud.CartaRepo;
import main.crud.DeckRepo;
import main.crud.UserRepo;
import main.model.Carta;
import main.model.Deck;
import main.model.Usuario;

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
		ArrayList<Deck> misDecks = (ArrayList<Deck>) deckRepo.findAll();
		ArrayList<Usuario> misUsuarios = (ArrayList<Usuario>) userRepo.findAll();
		ArrayList<Carta> misCartas = (ArrayList<Carta>) cartaRepo.findAll();
		
		
		model.addAttribute("listarCartas", misCartas);
		model.addAttribute("listarUsuarios",misUsuarios);
		model.addAttribute("listarDecks", misDecks);
		
		model.addAttribute("deckEditar", new Deck());
		model.addAttribute("deckNuevo", new Deck());
		return "decks";
		
	}
	
	
}
