package example.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Borrower {
	private int id;
	private String name;
	@Autowired(required=false)
	@Qualifier("myAnotherBook") //Qualifies
	private Book book;
	public Borrower() {
		// TODO Auto-generated constructor stub
	}
	public Borrower(int id, String name, Book book) {
		super();
		this.id = id;
		this.name = name;
		this.book = book;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "Borrower [id=" + id + ", name=" + name + ", book=" + book + "]";
	}
	

}
