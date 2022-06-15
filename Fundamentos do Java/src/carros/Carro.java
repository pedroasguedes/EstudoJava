/**
 * 
 */
package carros;

/**
 * @author Pedro guedes
 *
 */
public class Carro {

	/**
	 * 
	 */
	public Carro() {
		super();
		System.out.println("===============================");
	}
	// Atributos
	int numero;
	int chassi;
	int ano;
	String cor;
	String nome;

	// Modelos
		// void -> Método simples sem retorno
		/**
		 * Método usado para ligar o carro
		 */
		void ligar() {
			System.out.println("Carro Ligado");
		}
		/**
		 * Método usado para desligar o carro
		 */
		void desligar() {
			System.out.println("Carro Desligado");
		}
		/**
		 * Método usado para acelerar o carro
		 */
		void acelerar() {
			System.out.println("Carro acelerado");
		}
	
}