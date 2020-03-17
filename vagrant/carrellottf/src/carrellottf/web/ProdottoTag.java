package carrellottf.web;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import carrellottf.backend.Carrello;
import carrellottf.backend.Prodotto;
import lombok.Data;

@Data
public class ProdottoTag extends TagSupport {

	private String removeUrl;

	@Override
	public int doStartTag() throws JspException {
		try {
			Carrello carrello = (Carrello)pageContext.getAttribute("carrello");
			Prodotto p = (Prodotto)pageContext.getAttribute("prodotto");
			String s = "<tr>"+
					"			<td>"+ p.getNome() + "</td>\r\n" + 
					"			<td>" + p.getPrezzo() + "</td>\r\n" + 
					"			<td>" + carrello.getQty(p) + "</td>\r\n" + 
					"			<td><a href=\""+ removeUrl + "?prod=" + p.getId() + "\">remove</a></td>\r\n" + 
					"			</tr>";
			pageContext.getOut().print(s);
		} catch (IOException e) {
			e.printStackTrace();
			throw new JspException(e);
		}
		return SKIP_BODY;
	}

}
