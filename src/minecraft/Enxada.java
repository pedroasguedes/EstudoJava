/**
 * POO - Fundamentos
 */
package minecraft;

/**
 * @author pedro.asguedes Classe modelo com herança (extends)
 */
public class Enxada extends Bloco {

	/**
	 * Construtor
	 */
	public Enxada() {
		System.out.println("____CAMPO____");
	}

	// atributos
	boolean conquista;

	// método
	/**
	 * Método usado para arar a terra 
	 */
	void arar() {
		System.out.println("Terra preparada para o plantio");
		// atenção
		conquista = true;
	}
	
	// Polimorfismo sobrescrita do método minerar)
	void minerar() {
		System.out.println("Dano causado");
		
	}
}
