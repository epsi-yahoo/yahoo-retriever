package fr.epsi.example;

public class Operator {
	
	Bidon bidon;
	
	public Operator() {
		this.bidon = new Bidon();
	}
	
	public int add(int a, int b) {
		bidon.returnFour();
		return a + b;
	}
	
	public int addFour(int a) {		
		return a + bidon.returnFour();
	}

	public void setBidon(Bidon bidon) {
		this.bidon = bidon;
	}
	
}
