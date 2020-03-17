package carrellottf.backend;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Prodotto {
	int id;
	String nome;
	int prezzo;
}
