package carrellottf.backend;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

public class ProdottoRepository {

	private static ProdottoRepository instance;
	@Getter
	private List<Prodotto> prodotti = new ArrayList<Prodotto>();

	public Prodotto getProdotto(int id) {
		for (Prodotto p : prodotti)
			if (p.getId() == id)
				return p;
		return null;
	}

	private ProdottoRepository() {
		prodotti.add(new Prodotto(1, "maglietta", 15));
		prodotti.add(new Prodotto(2, "pantalone", 35));
		prodotti.add(new Prodotto(3, "giubbotto", 70));
	}

	static {
		instance = new ProdottoRepository();
	}

	public static ProdottoRepository getInstance() {
		return instance;
	}

}
