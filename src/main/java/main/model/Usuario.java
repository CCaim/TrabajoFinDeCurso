package main.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "usuarios")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUsuario")
	private Integer id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany(mappedBy= "usuario", fetch = FetchType.EAGER)
	private Set<Deck> Decks;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Deck> getDecks() {
		return Decks;
	}

	public void setDecks(Set<Deck> decks) {
		Decks = decks;
	}
	
	@Override
	public String toString() {
		String resultado ="";
		
		resultado += ("Usuarios [id=" + id + ", nombre=" + nombre + "]\n");
		for (Deck d:Decks) {
			resultado += d.toString();
		}
		return resultado;
	}
}
