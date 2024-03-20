import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        menu choose = new menu();
        choose.output();
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number == 2){
            circle circle = new circle();
            circle.radius = in.nextDouble();
            circle.angle = in.nextDouble();
            circle.cOutput();
        }
    }
}
class menu {
    void output(){
    System.out.println("Choose a figure:");
    System.out.println("1. Rectangle");
    System.out.println("2. Circle");
    }
}
class circle {
    double radius;
    double angle;
    void cOutput(){
        double area = Math.PI * radius * radius;
            System.out.printf("Circle area: %.3f\n", area);

        double circumFerence = Math.PI * 2 * radius;
            System.out.printf("Circumference: %.3f\n", circumFerence);

        double  sectorArea = Math.PI * radius * radius * angle / 360;
            System.out.printf("Sector area: %.3f", sectorArea);
    }
}