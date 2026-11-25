package example.hibernate.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Article_Master")
public class Article {
	@Id
	@Column(name="art_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer articleId;
	@Column(name="art_headline",length = 40)
	private String headLine;
	@Column(name="art_author",length = 30)
	private String author;
	@Column(name="art_date")
	private LocalDate publishedOn;
	
	public Article() {
		// TODO Auto-generated constructor stub
	}

	public Article(Integer articleId, String headLine, String author, LocalDate publishedOn) {
		super();
		this.articleId = articleId;
		this.headLine = headLine;
		this.author = author;
		this.publishedOn = publishedOn;
	}

	public Integer getArticleId() {
		return articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	public String getHeadLine() {
		return headLine;
	}

	public void setHeadLine(String headLine) {
		this.headLine = headLine;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public LocalDate getPublishedOn() {
		return publishedOn;
	}

	public void setPublishedOn(LocalDate publishedOn) {
		this.publishedOn = publishedOn;
	}

	@Override
	public String toString() {
		return "Article [articleId=" + articleId + ", headLine=" + headLine + ", author=" + author + ", publishedOn="
				+ publishedOn + "]";
	}
	
}
