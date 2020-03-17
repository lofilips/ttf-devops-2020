package carrellottf.backend;

import java.util.*;

public class Carrello {
	private Map<Prodotto, Integer> prodotti = new HashMap<>();

	public Carrello() {
		add(ProdottoRepository.getInstance().getProdotto(1),2);
		add(ProdottoRepository.getInstance().getProdotto(2),4);
	}
	
	public Set<Prodotto> getProdotti() {
		return prodotti.keySet();
	}

	public int getQty(Prodotto p) {
		return prodotti.containsKey(p) ? prodotti.get(p) : 0;
	}

	public void remove(Prodotto p) {
		prodotti.remove(p);
	}

	public void add(Prodotto p, int qty) {
		prodotti.put(p, getQty(p) + qty);
	}

}
