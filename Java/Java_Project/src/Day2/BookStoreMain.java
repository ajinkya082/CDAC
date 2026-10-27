package Day2;

public class BookStoreMain {
	public static void main(String[] args) {
		Book bookFirst=BookStore.getFirstBook();
		System.out.println(bookFirst.getTitle());
		
		Book bookLast=BookStore.getLastBook();
		System.out.println(bookLast.getTitle());
		
		Book currentBook=BookStore.getBookAt(15);
		if(currentBook!=null)
			System.out.println(currentBook.getTitle());
		else
			System.out.println("Unable to find the book at given position!");
	}
}
