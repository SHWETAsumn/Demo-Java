import java.util.*;

public class Area {

    int rectangle,square,triangle;
    //int l,b,h,a1,a2,r ;
    
    double circle;

    Scanner sc=new Scanner(System.in);

    
    

    int a1 = sc.nextInt();
    int a2 = sc.nextInt();
    int l = sc.nextInt();
    int b = sc.nextInt();
    int h = sc.nextInt();
    int r = sc.nextInt();

    void shape_area(){

        triangle = (b*h)/2;
        rectangle = (l*b);
        square = (a1*a2);
        circle = (3.14*(r*r));
        System.out.println("Area of Triangle = " +triangle);
        System.out.println("Area of Rectangle = " +rectangle);
        System.out.println("Area of Square = " +square);
        System.out.println("Area of Circle = " +circle);
    }
    void shape_perimeter(){

        triangle = (b*h)/2;
        rectangle = (l*b);
        square = (a1*a2);
        circle = (3.14*(r*r));
        System.out.println("perimeter of Triangle = " +triangle);
        System.out.println("perimeter of Rectangle = " +rectangle);
        System.out.println("perimeter of Square = " +square);
        System.out.println("perimeter of Circle = " +circle);
    }
    public static void main(String arg[]) {

        System.out.println("Enter value of a1 a2 l b h r");


        Area obj=new Area();

        obj.shape_area();

       //System.out.println(obj.a1);
        
    }

    
}
