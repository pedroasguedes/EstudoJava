/**
 * POO - Encapsulamento e métodos especiais
 */
package contas;

/**
 * @author Pedro Guedes
 *
 */
public class Conta {
	// Atributos
	// Para encapsular (proteger) uma variável devemos usar o modificador private e criar métodos específicos (get e set)	
	//para outras classe e pacotes terem acesso às variáveis
		// Encapsulamento Passo 1 : Modificador private
	
	private String cliente;
	private double saldo;

	
	/**
	 * Construtor
	 */
	public Conta() {
		System.out.println("------------------------");
		System.out.println("Agência 0261");
	}

	// Encapsulamento Passo 2: criaros metodos especificos (get e set) | Eclipse - botão direito do mouse
	//- Source - Generate Getters and Setters - Selecionar as variáveis encapsuladas
	/**
	 * Ler o conteudo da variavel cliente
	 * @return cliente
	 */
	
	public String getCliente() {
		return cliente;
	}
	/**
	 * Setar um nome a variavel cliente
	 * @param cliente
	 */
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	/**
	 * Obter o saldo do cliente
	 * @return saldo
	 */
	
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Setar um valor a conta corrente
	 * @param saldo
	 */
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	//Métodos
	/**
	 * Método simples que exibe o valor do saldo
	 */
	protected void exibirSaldo() {
		System.out.println("Saldo: R$ " + saldo);
	}
	/**
	 * Método simples com uma variável local para sacar valores
	 * @param valor
	 */

	protected void sacar (double valor) {
		saldo -= valor;
		System.out.println("Débito: R$" + valor);
	}
	
	/**
	 * Método simples com uma variável local para depositar valores
	 * @param valor
	 */

	protected void depositar (double valor) {
		saldo += valor;
		System.out.println("Débito: R$" + valor);
	}
	
	/**
	 * Metodo simples com uma variavel local e um objeto que sera criado para indicar
	 * a conta de destino da transferência do valor
	 * @param destino
	 * @param valor
	 */
	protected void transferir (Conta destino,double valor) {
		this.sacar(valor);
		destino.depositar(valor);
		System.out.println("Transferência: R$" + valor);
	}
	
	/**
	 * Método com retorno obrigatorio da variavel total
	 * @param cc1
	 * @param cc2
	 * @return total
	 */
	double soma (double cc1, double cc2) {
		double total = cc1 + cc2;
		return total;
	}
	
	
}
