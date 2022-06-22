/**
 * Conta corrente 
 */
package contas;

/**
 * @author Pedro Guedes
 *
 */
public class PessoaFisica {

	/**
	 * Método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Cliente 1

		Conta cc1 = new Conta();
		cc1.setCliente("Leandro Ramos");
		cc1.setSaldo(1000000);
		System.out.println("Cliente: " + cc1.getCliente());
		cc1.exibirSaldo();
		cc1.sacar(1200);
		cc1.exibirSaldo();

		// Cliente 2

		Conta cc2 = new Conta();
		cc2.setCliente("Jefferson Cruz");
		cc2.setSaldo(970);
		System.out.println("Cliente: " + cc2.getCliente());
		cc2.exibirSaldo();
		cc2.depositar(20000);
		cc2.exibirSaldo();
		
		// transferencia
		
		System.out.println("___________________________________");
		System.out.println("Cliente: " + cc2.getCliente());
		System.out.println("Favorecido: " + cc1.getCliente());
		cc2.transferir(cc1, 18000);
		cc2.exibirSaldo();
		
		//Relatorio Gerencial
		Conta gerente = new Conta();
		double relatorio = gerente.soma(cc1.getSaldo(), cc2.getSaldo());
		System.out.println("Saldo total nas contas: " + relatorio);
		
	}

}
