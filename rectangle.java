package BruhRepos;

public class rectangle {
	double width;
	
	double height;
	
	void pOutput(){
		double perim = 2*(width + height);
		double plosh = width*height;
		double diag = Math.sqrt(Math.pow(width, 2) + Math.pow(height,2));
		
		System.out.printf("Rectangle perimeter: %.3f\n", perim);
		System.out.printf("Rectangle area: %.3f\n ", plosh);
		System.out.printf("Rectangle diagonal: %.3f\n ", diag);
	}
}