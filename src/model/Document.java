package model;

// TO DO ...
public abstract class Document {
	
	private int numEnreg;
	private String titre;
	protected static int nbr;
	
	protected static int nbrPlus() {nbr++;return nbr;}
	
	public Document( String titre) {
		this.titre = titre; 
		numEnreg = nbrPlus();
	}
	
	public String toString(){
		return 
	}
}

