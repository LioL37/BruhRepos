
public class rectangle {
	
    double width;
	
    double height;

    void pOutput() {
        if (width <= 0 || height <= 0) {
            System.out.println("Bad numbers");
            return;
        }

        double perim = 2 * (width + height);
        double area = width * height;
        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

        System.out.printf("Rectangle perimeter: %.3f\n", perim);
        System.out.printf("Rectangle area: %.3f\n", area);
        System.out.printf("Rectangle diagonal: %.3f\n", diagonal);
    }
}