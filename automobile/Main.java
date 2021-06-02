package automobile;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void stampaMenu() {
		System.out.println("Premi 1 per aggiungere un’automobile");
		System.out.println("Premi 2 per aggiungere una moto");
		System.out.println("Premi 3 per stampare tutti i veicoli");
		System.out.println("Premi 4 per ordinare per prezzo");
		System.out.println("Premi 5 per ordinare per nome");
		System.out.println("Premi 6 per stampare il valore");
		System.out.println("Premi 7 per salvare su file");
		System.out.println("Premi 8 per leggere da file");
		System.out.println("Premi 9 per uscire");
	}
	
	public static void leggiDati(Scanner s, Veicolo v) {
		System.out.println("Inserisci la targa del veicolo");
		String targa = s.next();
		System.out.println("Inserisci la casa produttrice del veicolo");
		String casaProduttrice = s.next();
		System.out.println("Inserisci il nome del veicolo");
		String nome = s.next();
		System.out.println("Inserisci il prezzo del veicolo");
		Double prezzo = s.nextDouble();
		v.setTarga(targa);
		v.setCasaProduttrice(casaProduttrice);
		v.setNome(nome);
		v.setPrezzo(prezzo);
	}

	public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     Concessionaria c = new Concessionaria();
     stampaMenu();
     int scelta = s.nextInt();
     while (scelta != 9 ) {
    	 switch (scelta) {
			case 1: { 
				Automobile a = new Automobile();
				leggiDati(s, a);
				c.aggiungiVeicolo(a);
			}
				break;
			case 2: {
				Moto m = new Moto();
				leggiDati(s, m);
				c.aggiungiVeicolo(m);
			}
				break;
			case 3:
				c.stampaVeicoli();
				break;
			case 4:
				c.ordinaVeicoliPerPrezzo();
				break;
			case 5:
				c.ordinaVeicoliPerNome();
				break;
			case 6:
				Double valore = c.calcolaValore();
				System.out.println("Il valore dei veicoli nella concessionaria è: " + valore);
				break;
			case 7: {
				System.out.println("Inserisci il nome del file su cui vuoi salvare");
				String filename = s.next();
				try {
					c.salvaSuFile(filename);
				} catch (IOException e) {
					System.out.println("Errore nel salvataggio.");
				}
			}break;
			case 8: {
				System.out.println("Inserisci il nome del file da cui vuoi leggere");
				String filename = s.next();
				try {
					c.leggiDaFile(filename);
				} catch (IOException e) {
					System.out.println("Errore nella lettura.");
				}
			}
				break;
			default:
				System.out.println("Scelta non valida!");
				break;
			}
			stampaMenu();
			scelta = s.nextInt();
		}
		System.out.println("Grazie per aver utilizzato i nostri servizi, arrivederci!");
		s.close();
					
	          }
           }
					
					
					
		
					
			
					
					
					
					
					
					
					
					
				
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
     
	
	
	
	
	

