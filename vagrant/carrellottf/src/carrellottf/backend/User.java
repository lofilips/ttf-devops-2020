package carrellottf.backend;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private String login=null, pw;
	private String name;

	public String toString() {
		return name + "(" + login + ":" + pw + ")";
	}
	
}