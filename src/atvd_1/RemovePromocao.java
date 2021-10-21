package atvd_1;

import atvd_1.model.Promocao;

public class RemovePromocao {

	private Promocao promo;

	public RemovePromocao() {
		this.promo = new Promocao();
	}

	public int remover(int id) {
		int sucesso = promo.removerPromo(id);
		return sucesso;
	}
}
