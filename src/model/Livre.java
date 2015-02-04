package model;

// TO DO ...
public class Livre extends Document{

	private String auteur;
	private int nbPages;
	
	public Livre(String titre, String auteur, int nbPages){
		super(titre);
		this.auteur=auteur;
		this.nbPages=nbPages;
	}
	
	@Override
	public String toString(){
		return super.toString() + " c'est un livre de " + this.auteur + " de "+ this.nbPages+" page";
	}
}
