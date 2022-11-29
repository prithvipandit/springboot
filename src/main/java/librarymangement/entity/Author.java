package librarymangement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Author {
	
	@Id
	private Integer authorId;
	private String name;
	
	public Author() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getID() {
		return this.authorId;
	}
	public void setID(Integer id) {
		this.authorId = id;
	}
	
	
	

}
