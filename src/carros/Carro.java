/**
 * 
 */
package carros;

import java.util.Random;

/**
 * @author Pedro guedes
 *
 */
public class Carro {

	/**
	 * 
	 */
	public Carro() {
		Random gerador = new Random();
		String chassi = new String("0123456789ABCDEFGHIJKLMNOPQRSTUVXYZ");
		System.out.print("Chassi: *");
		for (int i = 0; i < 16; i++) {
			char numeracao = (char) gerador.nextInt(chassi.length());
			System.out.print(chassi.charAt(numeracao));
		}
		System.out.println(" *");
	}

	// Atributos
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