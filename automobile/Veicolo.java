package automobile;

public class Veicolo {
    

	private String targa;
	private String casaProduttrice;
	private String nome;
	private Double prezzo;
	
	public Veicolo() {
		super();
		this.targa = targa;
		this.casaProduttrice = casaProduttrice;
		this.nome = nome;
		this.prezzo = prezzo;
	}
	
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public String getCasaProduttrice() {
		return casaProduttrice;
	}
	public void setCasaProduttrice(String casaProduttrice) {
		this.casaProduttrice = casaProduttrice;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}
	
	@Override
	public String toString() {
		return targa + ";" + casaProduttrice + ";" + nome + ";" + prezzo;
	}
	public String getStringForFile() {
		return "veicolo" + ";" + getTarga() + ";" + getCasaProduttrice() + ";" + getNome() + ";" + getPrezzo();
	}
}

