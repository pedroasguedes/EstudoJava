/**
 *  Fundamentos do Java
 * Variaveis, operadores e estruturas de controle
 * Exercício 1 - APP Eleitor
 * Desenvolver um APP no modo console que em função da idade do
 * Eleitor avise se o voto e obrigatório ou nao
 * Abaixo de 16 anos -VOTO PROIBIDO
 * Entre 18 e 70 (Incluindo 18 e 70) - VOTO OBRIGATÓRIO
 * 16,17 OU ACIMA DE 70 - VOTO FACULTATIVO
 * 
 */
package fundamentos;

import java.util.Scanner;

/**
 * @author pedro.asguedes
 *
 */
public class Eleitor {

	/**
	 * Método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// variavel
		int idade;
		// objetos
		Scanner teclado = new Scanner(System.in);
		System.out.println("APP ELEITOR ===============");
		System.out.print("Digite sua idade");
		// entrada
		idade = teclado.nextInt();
		// apoio ao teste do fluxo (verificar se a idade foi capturada)
		// System.out.print(idade);
		if (idade < 16) {
			System.out.println("PROIBIDO VOTAR");
		} else if (idade > 17 && idade < 71) {
			System.out.println("VOTO OBRIGATORIO");
		} else {
			System.out.println("VOTO FACULTATIVO");
		}
		// encerrar a captura de dados
		teclado.close();
		
		
	}

}
