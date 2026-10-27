package Day2;

public class ParameterPassingMain {
	private static void changeIndex(int idx) {
		idx=10;
	}
	private static void changeBookTitle(Book currentBook) {
		currentBook.setTitle("DSA");
	}
	public static void main(String[] args) {
		int index=7;
		System.out.println("Index before change: "+index);
		changeIndex(index);
//		index =8;
		System.out.println("Index after change: "+index);
		System.out.println("===================================");
		Book b=new Book("FDS","kadam",500,335.5F);
		System.out.println("Book title before change:"+b.getTitle());
		changeBookTitle(b);
		System.out.println("Book title after change:"+b.getTitle());
	}
}
