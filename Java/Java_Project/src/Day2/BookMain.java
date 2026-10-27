package Day2;

public class BookMain {
     public static void main(String[]args) {
    	 Book bk=new Book();
//    	 Book mybook=new Book("my rule my den","Mr.XYZ",200,500.5f);
    	 Book bk2=new Book(200.5f,"Denly","Joe",50);
    	 bk.setTitle("Wise and Dormentary");
    	 bk.setAuthor("Mr.Ben");
    	 bk.setPageCount(256);
    	 bk.setPrice(523.25F);
    	 
    	 System.out.println(bk.getTitle());
    	 System.out.println(bk.getAuthor());
    	 System.out.println(bk.getPageCount());
    	 System.out.println(bk.getPrice());
    	 
    	 
    	 
     }
}
