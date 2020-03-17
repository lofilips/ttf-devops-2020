package carrellottf.web;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import carrellottf.backend.User;
import carrellottf.backend.UserRepository;

public class Utils {
	public static final String COOKIE_NAME = "ttfuser";

	public static User getUser(HttpServletRequest r) {
		if (r.getCookies() != null)
			for (Cookie c : r.getCookies())
				if (c.getName().equals(COOKIE_NAME))
					return UserRepository.getInstance().get(c.getValue());
		return null;
	}
	
	public static void setUser(HttpServletResponse res, User u) {
		Cookie c = new Cookie(COOKIE_NAME, u==null?"":u.getLogin());
		if (u==null)
			c.setMaxAge(0);
		res.addCookie(c);
	}
}
