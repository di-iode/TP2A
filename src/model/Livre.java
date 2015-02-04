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
	public string toString(){
		return super() + " c'est un livre de " + Livre.auteur + " de "+ Livre.nbPages+" page"
	}
}
