package carte;

import java.util.ArrayList;
import java.util.List;

public class Carte {
	
	private String titlu;
	private Cuprins cuprins;
	private List<Capitol> listaCapitole;
	
	public Carte(String titlu) {
		this.titlu = titlu;
	}
	
	List<Autor> listaAutori = new ArrayList<>();
	
	public void addAutor(Autor numeAutor) {
		listaAutori.add(numeAutor);
	}
	
	public Integer createCapitol(String numarCapitol) {
		return null;
	}
	
	
}
