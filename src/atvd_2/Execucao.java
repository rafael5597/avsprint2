package atvd_2;
import java.util.Scanner;
import atvd_2.util.ProcuraNaFrase;

public class Execucao {

	public static void main(String[] args) {
		String mensagem;
		int emoticonDivertido;
		int emoticonChateado;

		System.out.println("Digite uma mensagem: ");
		System.out.print(">");

		try (Scanner entrada = new Scanner(System.in)) {
			
			mensagem = entrada.nextLine();
			
			ProcuraNaFrase frase = new ProcuraNaFrase(mensagem);
			
			emoticonDivertido = frase.retornarOcorrencias(":-)");
			emoticonChateado  = frase.retornarOcorrencias(":-(");

			if(emoticonDivertido == emoticonChateado) {
				System.out.println("Neutro!");
			} else if(emoticonDivertido < emoticonChateado){
				System.out.println("Chateado!");
			} else {
				System.out.println("Divertido!");
			}
			
			System.out.printf("%n%n%n%s","** Programa finalizado **");
			
		}
	}
}
