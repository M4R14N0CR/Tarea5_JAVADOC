package Aplication;

/**
 * Esta clase representa diferentes tipos de medicamentos.
 * Estos estan representados por un nombre y una cantidad
 * @author Mariano
 *
 */
public class Medicament {
	
	private String name;
	private int amount;
	
	/**
	 * Crea medicamentos con su nombre y cantidad
	 * @param pName El nombre del medicamento
	 * @param pAmount La cantidad de este medicamento
	 */
	
	public Medicament(String pName, int pAmount) {
		
		this.name = pName;
		this.amount = pAmount;
		
	}
	
	/**
	 * Metodo obtiene el nombre del medicamento
	 * @return Retorna el nombre
	 */
	
	public String getName() {
		
		return this.name;
	}
	
	/**
	 * Obtiene la cantidad del medicamento
	 * @return Retorna la cantidad de ese medicamento
	 */
	
	public int getAmount() {
		
		return this.amount;
	}

}
