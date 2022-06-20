/**
 * Fundamentos do Java
 * Gerador de numeros e caracteres aleatorios
 */
package fundamentos;

import java.util.Random;

/**
 * Metodo Pricipal
 * 
 * @author Pedro Guedes
 */
public class NumerosAleatorios {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Uso da classe Random para gerar números aleatórios
		Random gerador = new Random();
		// (100)Gerar numeros entre 0 e 99
		// int numero = gerador.nextInt(100);
		// System.out.println(numero);
		int dado = gerador.nextInt(6) + 1;
		System.out.println("Face do dado: " + dado);
		// Exemplo 3:
		// A linha Abaixo cria um objeto que contém caracteres
		String chassi = new String("0123456789ABCDEFGHIJKLMNOPQRSTUVXYZ");
		System.out.print("Chassi: *");
		for (int i = 0; i < 16; i++) {
			// gerador para gerar um número aleatório entre 0 e tamanho máximo
			// de caracters do objeto chassi (.lenght() -> tamanho da String)
			// (char) convaerter o tipo int para o tipo char
		char numeracao = (char) gerador.nextInt(chassi.length());
		// a linha abaixo imprime o valor da variável numeracao
		// (.charAt() -> imprime apenas 1 caractere
		System.out.print(chassi.charAt(numeracao));
		}
		System.out.println(" *");
	}

}
