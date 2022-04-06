package Aplication;

import java.util.ArrayList;

/**
 * Esta clase crea farmacias con sus respectivos inventarios de medicamentos.
 * @author Mariano
 *
 */

public class Pharmacy {
	
	private String name;
	ArrayList <Medicament> medicaments = new ArrayList<>();

	
	
	public Pharmacy(String pName) {
		
		this.name = pName;
		
	}
	
	/**
	 * Clase main de la aplicacion 
	 * @param args Argumentos del metodo
	 */
	
	public static void main(String[] args) {
		
		Pharmacy pharmacy1 = new Pharmacy("Farmacia la bomba");
		Medicament acetominafen = new Medicament("Acetominafen", 5);
		Medicament ibuprofeno = new Medicament("Ibuprofeno", 2);		
		Medicament cremaRosas = new Medicament("Crema de Rosas", 8);
		
		pharmacy1.addMedicament(acetominafen);
		pharmacy1.addMedicament(ibuprofeno);
		pharmacy1.addMedicament(cremaRosas);
		
		pharmacy1.getMedicaments();
	}
	
	/**
	 * Agrega medicamentos a la farmacia
	 * @param pMedicament
	 */
	public void addMedicament(Medicament pMedicament) {
		
		medicaments.add(pMedicament);
	}
	
	/**
	 * Metodo que muestra el nombre de la farmacia
	 */
	
	public void getName() {
		
		System.out.println(this.name);
	}
	
	/**
	 * Metodo que muestra todos los medicamentos en la farmacia 
	 * con la respectiva cantidad de este 
	 */
	
	public void getMedicaments() {
		
		for(Medicament currentMedicament : medicaments) {
			
			System.out.printf("Hay %d de %s%n",currentMedicament.getAmount(),currentMedicament.getName());
		}
	}

}
