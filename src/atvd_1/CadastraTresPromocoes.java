package atvd_1;

import java.util.ArrayList;

import atvd_1.model.Promocao;

public class CadastraTresPromocoes {
	private Promocao promo;
	
	private ArrayList<Integer> promoId = new ArrayList<>();
	
	public CadastraTresPromocoes() {
		this.promo = new Promocao();
	}
	
	public void cadastrar() {
		promoId.clear();
		promoId.add(promo.cadastraPromo("Monitor","LED 21 polegadas",10.00,"2021-10-21","2021-12-01"));
		promoId.add(promo.cadastraPromo("Mouse","Sem fio DELL",5.00,"2021-10-21","2021-12-10"));
		promo.cadastraPromo("KIT Mouse / Teclado","Sem fio Logitech",5.00,"2021-10-25","2021-12-25");
		
	}
	
	public int getPromoId(int index){
		return this.promoId.get(index);
	} 
}
