package librarymangement.entity;

import javax.persistence.Entity;

import javax.persistence.Id;


@Entity
public class Book {
	
	
	@Id
	private Integer bId;
	
	private Integer authorId;
	
	private String bookName;
	
	private String authorName;
	
	public Book() {}

	public Integer getbId() {
		return bId;
	}

	public void setbId(Integer bId) {
		this.bId = bId;
	}

	public Integer getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

}
