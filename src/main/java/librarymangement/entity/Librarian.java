package librarymangement.entity;


import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Librarian {
	
	@Id
	private String email;
	
	private String password;
	
	public Librarian() {}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
