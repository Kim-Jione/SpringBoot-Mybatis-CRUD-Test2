package site.metacoding.firstapp.web.dto.request;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.firstapp.domain.users.Users;

@Setter
@Getter
public class JoinDto {
	private String username;
	private String password;
	private String email;
	
	public Users toEntity(){
		Users users= new Users(this.username, this.password, this.email);
		return users;
	}
}