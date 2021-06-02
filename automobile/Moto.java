package automobile;

public class Moto extends Veicolo {

	

	public Moto() {
	       super();
	}
	public Moto(String targa, String casaProduttrice, String nome, Double prezzo) {
		super();		
	}

	public Double getPrezzo() {
		Double prezzo = super.getPrezzo();
		if(prezzo < 10000)
			return prezzo * 0.97;
		if(prezzo < 20000)
			return prezzo * 0.925;
		return prezzo;
	}
	
	@Override
	public String toString() {
		return getTarga() + ";" + getCasaProduttrice() + ";" + getNome() + ";" + getPrezzo();
	}
	
	public String getStringForFile() {
		return "moto" + ";" + getTarga() + ";" + getCasaProduttrice() + ";" + getNome() + ";" + super.getPrezzo();
	}
}