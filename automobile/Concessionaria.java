package automobile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Concessionaria {

private ArrayList<Veicolo> veicoli;
	
	public Concessionaria() {
		veicoli = new ArrayList<Veicolo>();
	}
	
	public void aggiungiVeicolo(Veicolo v) {
		veicoli.add(v);
	}
	
	public void rimuoviVeicolo(Veicolo v) {
		veicoli.remove(v);
	}
	
	public void stampaVeicoli() {
		System.out.println(veicoli);
	}
	
	public void ordinaVeicoliPerPrezzo() {
		veicoli.sort(new Comparator<Veicolo>() {
			@Override
			public int compare(Veicolo o1, Veicolo o2) {
				return o1.getPrezzo().compareTo(o2.getPrezzo());
			}
		});
	}
	
	public void ordinaVeicoliPerNome() {
		veicoli.sort(new Comparator<Veicolo>() {

			@Override
			public int compare(Veicolo o1, Veicolo o2) {
				return o1.getNome().compareTo(o2.getNome());
			}
		});
	}
	
	public Double calcolaValore() {
		Double somma = 0.0;
		for(Veicolo v : veicoli) {
			somma += v.getPrezzo();
		}
		return somma;
	}
	
	public void salvaSuFile(String filename) throws IOException {
		 BufferedWriter w = new BufferedWriter(new FileWriter(filename));
			  for(Veicolo v : veicoli) {
				  w.append(v.toString());
				  w.newLine();
				  
			  }
		w.close();
		
	}
	public void leggiDaFile(String filename) throws IOException{
		    BufferedReader r = new BufferedReader(new FileReader(filename));
		    while (r.ready())
		    {
		    	String line = r.readLine();  
		    	String [] elementi = line.split(";");
		    	}
		    r.close();
 		
	}
}
