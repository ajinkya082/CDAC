package Day2;

public class Book {
    private String title;
    private String author;
    private int pageCount;
    private float price;
    
    public Book() {
    	title="Sunny Days";
    	author="Mr.Sunil Gavaskar";
    	pageCount=500;
    	price=333.2f;
    }
	public Book(String title, String author, int pageCount, float price) {
		this.title = title;
		this.author = author;
		this.pageCount = pageCount;
		this.price = price;
	}
	public Book(float price, String title, String author, int pageCount) {
		this.price = price;
		this.title = title;
		this.author = author;
		this.pageCount = pageCount;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
