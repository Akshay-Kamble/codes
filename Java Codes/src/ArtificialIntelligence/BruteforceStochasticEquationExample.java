package ArtificialIntelligence;

import java.util.concurrent.ThreadLocalRandom;

/* solves same equation 2 ways - Bruteforce and Stochastic way
 Equation, y = (x+1)^2-3
 Bruteforce : check value of y for every value of x
 Stochastic : check value of y for n random values of x
*/
public class BruteforceStochasticEquationExample {

	public static void main(String[] args) {
		double start = -2;
		double end = 2;
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		double dx = 0.01;
		double answer;
		double xMax=0;
		double xMin=0;
		// bruteforce
		for(double i = start; i<=end;i=i+dx) {
			answer = solveEquation(i);
			if(answer > max)
			{
				max = answer;
				xMax = i;
			}
			if(answer < min)
			{
				min = answer;
				xMin = i;
			}
				
		}
		System.out.println("Bruteforce : ");
		System.out.println("Min value recorded at x = " + xMin + " : "+min);
		System.out.println("Max value recorded at x = " + xMax + " : "+max);
		
		System.out.println("Stochastic : ");
		
		// Stochastic Search
		min = Double.MAX_VALUE;
		max = Double.MIN_VALUE;
		
		double randomNumber;
		for(int j =1;j<100;j++) 
		{
			randomNumber = ThreadLocalRandom.current().nextDouble(start, end);
			answer = solveEquation(randomNumber);
			if(answer > max)
			{
				max = answer;
				xMax = randomNumber;
			}
			if(answer < min)
			{
				min = answer;
				xMin = randomNumber;
			}
			
		}
		System.out.println("Min value recorded at x = " + xMin + " : "+min);
		System.out.println("Max value recorded at x = " + xMax + " : "+max);
		
		
				
	}
	
	private static double solveEquation(double x) {
		// y = (x+1)^2-3
		return (x+1)*(x+1)-3;
		
	}

}
