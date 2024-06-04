package applicazioni;

import oggetti.Persona;

public class Es1 {

	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		
		p1.setNome("Mario");
		p1.setCognome("Rossi");
		p1.setCodFiscale("RSSMRO88R38I486P");
		p1.setEta(36);
		
		System.out.println("Piacere sono "+p1.getNome()+" "+p1.getCognome()+", il mio codice fiscale è "
				+p1.getCodFiscale()+" e ho "+p1.getEta()+" anni.");
		
		
	}

}
