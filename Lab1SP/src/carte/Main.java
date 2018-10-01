package carte;

public class Main {
	
	public static void main(String[] args) {
		Carte carte = new Carte("Codul lui Da Vinci");
		carte.addAutor(new Autor("Dan Brown"));
		Integer indexCapitol = carte.createCapitol("Capitolul 1");
	}

}
