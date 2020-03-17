package carrellottf.web;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import carrellottf.backend.User;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class WelcomeTag extends TagSupport {
	
	User utenteDaSalutare;
	int n;
	int i=0;
	@Override
	public int doStartTag() throws JspException {
		pageContext.getRequest().setAttribute("i", i);
		return i<n?EVAL_BODY_INCLUDE:SKIP_BODY;
	}
	
	@Override
	public int doAfterBody() throws JspException {
		i++;
		pageContext.getRequest().setAttribute("i", i);
		return i<n?EVAL_BODY_AGAIN:SKIP_BODY;
	}

}