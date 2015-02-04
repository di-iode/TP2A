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
	
	@Override
	public String toString(){
		return "\t\""+this.titre+"\" est le "+ this.numEnreg + " document crée";
	}
	
	public static void setNbr(int nbr) {
		Document.nbr = nbr;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	ge
	
}

