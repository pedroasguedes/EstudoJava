/**
 * Seguros
 */
package seguros;

import contas.Conta;

/**
 * @author Pedro Guedes
 *
 */
public class SeguroPessoaFisica extends Conta {

	/**
	 * Método Principal
	 * @param args
	 */
	public static void main(String[] args) {
		// Cliente 3
		//Usando o modificador protected devemos usar a própria herança (SeguroPessoaFisica) para criar o objeto
		SeguroPessoaFisica cc3 = new SeguroPessoaFisica();
		cc3.setCliente("João");
		cc3.setSaldo( 12000);
		System.out.println("Cliente: " + cc3.getCliente());
		cc3.exibirSaldo();
		

	}

}
