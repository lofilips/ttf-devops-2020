package carrellottf.web;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class HelloTag extends TagSupport {
	@Override
	public int doStartTag() throws JspException {
		try {
			pageContext.getOut().print("<b>saluti da HelloTag</b><br/>");
		} catch (IOException e) {
			e.printStackTrace();
			throw new JspException(e);
		}
		return SKIP_BODY;
	}

	@Override
	public int doEndTag() throws JspException {
		try {
			pageContext.getOut().print("tag chiuso");
		} catch (IOException e) {
			e.printStackTrace();
			throw new JspException(e);
		}
		return EVAL_PAGE;
	}
}