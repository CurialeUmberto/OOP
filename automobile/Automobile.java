package automobile;

public class Automobile extends Veicolo {

	public Automobile() {
		super();
	}
	
	public Automobile(String targa, String casaProduttrice, String nome, Double prezzo) {
		super();		
	}

	public Double getPrezzo() {
		Double prezzo = super.getPrezzo();
		if(prezzo < 10000)
			return prezzo * 0.95;
		if(prezzo < 20000)
			return prezzo * 0.90;
		return prezzo;
	}
	
	@Override
	public String toString() {
		return getTarga() + ";" + getCasaProduttrice() + ";" + getNome() + ";" + getPrezzo();
	}
	
	public String getStringForFile() {
		return "automobile" + ";" + getTarga() + ";" + getCasaProduttrice() + ";" + getNome() + ";" + super.getPrezzo();
	}
	
}
