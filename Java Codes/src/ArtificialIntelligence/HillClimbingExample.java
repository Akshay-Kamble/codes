package ArtificialIntelligence;

// Algorithm : 
// climb the hill till you are getting the better solution
// if solution at next point is worse, terminate the algiorithm
public class HillClimbingExample {

	// Equation - -(x-1)^2+2
	public static void main(String[] args) {
		
		double start = -2;
		double end = 4;
		double max = hillClimbingSearch(start);
		double dx = 0.1;
		double i =start;
		while(i<=end && hillClimbingSearch(i)>=max)
		{
			max = hillClimbingSearch(i);
			System.out.println("x : " + i + " value : "+max);
			i=i+dx;
		}
		
	}
	
	private static double hillClimbingSearch(double x) {
		return -(x-1)*(x-1)+2;
	}

}
