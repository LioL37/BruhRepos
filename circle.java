public class circle {
    double radius;
    double angle;
    void cOutput(){
        if (radius >= 0 && angle <= 360 && angle >= 0){
        double area = Math.PI * radius * radius;
        System.out.printf("Circle area: %.3f\n", area);

        double circumFerence = Math.PI * 2 * radius;
        System.out.printf("Circumference: %.3f\n", circumFerence);

        double  sectorArea = Math.PI * radius * radius * angle / 360;
        System.out.printf("Sector area: %.3f", sectorArea);
        }   else {
            System.out.printf("Error");
        }
    }
}
