public class Area {
    public static void main(String[] args) {
        //Area
        int base=10;
        int height=2;
        int length=3;
        int radius=7;
        double pie=3.14;

        int rectangle=length*base;
        System.out.println("Area of rectangle is :"
        +rectangle);

        double circle=pie*radius*radius;
        System.out.println("area of circle is : "+circle);

        double triangle=0.5*base*height;
        System.out.println("Area of Triangle is : "+triangle);


        //perimeter
        double circle1= 2*pie*radius;
        System.out.println("periemter circle is : " + circle1);

        int rect=2*(length+base);
        System.out.println("Perimeter of rect is : "+rect);

        int triangle3=length+base+height;
        System.out.println("Perimete of triangle is : "+ triangle3);
    }
}
