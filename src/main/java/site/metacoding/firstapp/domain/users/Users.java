package site.metacoding.firstapp.domain.users;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Users {

	private Integer usersId;
	private String username;
	private String password;
	private String email;
	private Timestamp createdAt;

	public Users(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
	}
}
