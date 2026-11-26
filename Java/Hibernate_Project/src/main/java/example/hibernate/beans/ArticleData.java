package example.hibernate.beans;

import java.time.LocalDate;

public class ArticleData {
	private String author;
	private LocalDate date;

	public ArticleData() {
		// TODO Auto-generated constructor stub
	}

	public ArticleData(String author, LocalDate date) {
		super();
		this.author = author;
		this.date = date;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "ArticleData [author=" + author + ", date=" + date + "]";
	}

}
