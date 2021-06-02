package automobile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Gestorefile {

	public Integer calcolaMassimo(String nomeFile) throws IOException {
		ArrayList<Integer> numeri = LeggiFile(nomeFile);
		Integer max = Collections.max(numeri);
		return max;
	}

	public Integer calcolaMinimo(String nomeFile) throws IOException {
		ArrayList<Integer> numeri = LeggiFile(nomeFile);
		Integer min = Collections.min(numeri);
		return min;
	}

	public void generaFile(String nomeFile) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(nomeFile));
		Random r = new Random();
		for (int i = 0; i < 50; i++) {
			Integer n = r.nextInt(10);
			writer.append(n.toString());
			writer.newLine();

		}
		writer.close();
	}

	public ArrayList<Integer> LeggiFile(String nomeFile) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(nomeFile));
		ArrayList<Integer> linee = new ArrayList<Integer>();
		while (reader.ready()) {
			String linea = reader.readLine();
			linee.add(Integer.parseInt(linea));
		}
		reader.close();
		return linee;
	}

}
