package BruhRepos;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        menu choose = new menu();
        choose.output();
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
		if(number == 1){
			rectangle rectangle = new rectangle();
            rectangle.width = in.nextDouble();
            rectangle.height = in.nextDouble();
            rectangle.pOutput();
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