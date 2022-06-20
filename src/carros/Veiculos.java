 package carros;

/**
 * Método principal
 */

public class Veiculos {
	/**
	 * @author pedro guedes
	 * Classe responsável pela craiação dos objetos
	 */
	public static void main(String[] args) {
		// Objeto 1
				Carro camaro = new Carro();
				camaro.ano = 1966 ;
				camaro.cor = "Verde";
				camaro.nome = "Camaro";
				System.out.println("Nome do veiculo: " + camaro.nome);
				System.out.println("Ano de fabricação: " + camaro.ano);
				System.out.println("Cor do carro: " + camaro.cor);
				camaro.ligar();
				camaro.desligar();
				camaro.acelerar();
				
				// Objeto 2
				Carro fusca = new Carro();
				fusca.ano = 1935 ;
				fusca.cor = "Vermelho";
				fusca.nome = "Fusca";
				System.out.println("Nome do veiculo: " + fusca.nome);
				System.out.println("Ano de fabricação: " + fusca.ano);
				System.out.println("Cor do carro: " + fusca.cor);
				fusca.ligar();
				fusca.desligar();
				fusca.acelerar();
				
	}

}