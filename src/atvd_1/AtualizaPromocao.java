package atvd_1;

import atvd_1.model.Promocao;

public class AtualizaPromocao {

	private Promocao promo;

	public AtualizaPromocao() {
		this.promo = new Promocao();
	}

	public int atualizar(int id) {
		int sucesso = promo.atualizaPromo(id,"MONITOR TV", "LED 32 POLEGADAS", 12.00, "2021-10-21", "2021-12-15");
		return sucesso;
	}
}
