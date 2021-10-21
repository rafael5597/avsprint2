// A primeira opção deve cadastrar ofertas e ao selecionar ela deve cadastrar
// automaticamente 3 ofertas na base.
// A segunda opção deve atualizar a primeiro oferta cadastrado na opção 1.// A terceira opção deve excluir a segunda oferta cadastrada.

package atvd_1;

import java.util.Scanner;

public class Execucao {

	public static void main(String[] args) {

		int opcao = -1;
		Scanner entrada = new Scanner(System.in);

		CadastraTresPromocoes cadastraTresPromocoes = new CadastraTresPromocoes();

		while (opcao != 0) {

			System.out.println();
			System.out.println("* * * * * * * * * * * * * * * * * *");
			System.out.println("*   Selecione a opção desejada    *");
			System.out.println("*---------------------------------*");
			System.out.println("*  1-> Cadastrar 3 ofertas        *");
			System.out.println("*  2-> Atualizar primeira oferta  *");
			System.out.println("*  3-> Excluir segunda oferta     *");
			System.out.println("* * * * * * * * * * * * * * * * * *");
			System.out.println("->");

			opcao = entrada.nextInt();

			try {
				switch (opcao) {
				case 1: {
					try {
						cadastraTresPromocoes.cadastrar();
						System.out.println("<< 3 promoções foram cadastradas automaticamente! >>");
					} catch (Exception e) {
						System.out.println(e);
					}

					break;
				}
				case 2: {
					int id = cadastraTresPromocoes.getPromoId(0);
					AtualizaPromocao atualizaPromocao = new AtualizaPromocao();
					if (atualizaPromocao.atualizar(id) != 0) {
						System.out.println("<< Promocao 1 (id " + id + ") foi atualizada! >>");
					}
					
					break;
				}
				case 3: {
					int id = cadastraTresPromocoes.getPromoId(1);
					RemovePromocao removePromocao = new RemovePromocao();
					if(removePromocao.remover(id) != 0) {
						System.out.println("<< Promocao 2 (id " + id + ") foi removida! >>");
					}
					break;
				}
				case 0: {

					break;
				}
				default:
					throw new IllegalArgumentException("Opção não reconhecida: " + opcao);
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		entrada.close();

		System.out.println("<< Programa finalizado >>");
	}
}
