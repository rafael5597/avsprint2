package atvd_2.util;

public class ProcuraNaFrase {
	private StringBuilder frase;
	
	public ProcuraNaFrase(String frase) {
		this.frase = new StringBuilder(frase);
	}
	
	public int retornarOcorrencias(String palavra) {
		int tamanho = 0;
		int ocorrencias = 0;
		int indice = 0;
		
		while (indice != -1) {
			indice = frase.indexOf(palavra, indice + tamanho);
			if (indice != -1) {
				ocorrencias++;
			}
			tamanho = palavra.length();
		}
		return ocorrencias;
	}
	
}
