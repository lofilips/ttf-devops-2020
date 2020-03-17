package carrellottf.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import carrellottf.backend.Carrello;
import carrellottf.backend.Prodotto;
import lombok.Data;

@Data
public class CarrelloTag extends TagSupport {

	private Carrello carrello;
	private String addUrl;

	private List<Prodotto> prodotti = new ArrayList<>();
	private int i = 0;

	@Override
	public int doStartTag() throws JspException {
		try {
			carrello.getProdotti().forEach(p -> prodotti.add(p));
			String s = "<a href=\"" + addUrl + "\">aggiungi prodotto</a><br/>\r\n" + "	<table>\r\n"
					+ "		<tr><th>descrizione</th><th>prezzo</th><th>quantita</th><th></th></tr>";
			pageContext.getOut().print(s);
		} catch (IOException e) {
			e.printStackTrace();
			throw new JspException(e);
		}
		if (i < prodotti.size()) {
			pageContext.setAttribute("carrello", carrello);
			pageContext.setAttribute("prodotto", prodotti.get(i));
			return EVAL_BODY_INCLUDE;
		}
		return SKIP_BODY;
	}

	@Override
	public int doAfterBody() throws JspException {
		i++;
		if (i < prodotti.size()) {
			pageContext.setAttribute("carrello", carrello);
			pageContext.setAttribute("prodotto", prodotti.get(i));
			return EVAL_BODY_AGAIN;
		}
		return SKIP_BODY;
	}

	@Override
	public int doEndTag() throws JspException {
		try {
			pageContext.getOut().print("</table>");
		} catch (IOException e) {
			e.printStackTrace();
			throw new JspException(e);
		}
		return EVAL_PAGE;
	}

}
