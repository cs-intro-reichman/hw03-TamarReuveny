import java.util.Set;

/**
* Computes the periodical payment necessary to re-pay a given loan.
*/
public class LoanCalc {
	
	static double epsilon = 0.001;  // The computation tolerance (estimation error)
	static int iterationCounter = 0;   // Monitors the efficiency of the calculation
	
    /** 
     * Gets the loan data and computes the periodical payment.
     * Expects to get three command-line arguments: sum of the loan (double),
     * interest rate (double, as a percentage), and number of payments (int).  
     */
	public static void main(String[] args) {		
		// Gets the loan data
		double loan = Double.parseDouble(args[0]);
		double rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);
		System.out.println("Loan sum = " + loan + ", interest rate = " + rate + "%, periods = " + n);
		
		// Computes the periodical payment using brute force search
		System.out.print("Periodical payment, using brute force: ");
		System.out.printf("%.2f", bruteForceSolver(loan, rate, n, epsilon));
		System.out.println();
		System.out.println("number of iterations: " + iterationCounter);

		// Computes the periodical payment using bisection search
		System.out.print("Periodical payment, using bi-section search: ");
		System.out.printf("%.2f", bisectionSolver(loan, rate, n, epsilon));
		System.out.println();
		System.out.println("number of iterations: " + iterationCounter);
	}
	
	/**
	* Uses a sequential search method  ("brute force") to compute an approximation
	* of the periodical payment that will bring the ending balance of a loan close to 0.
	* Given: the sum of the loan, the periodical interest rate (as a percentage),
	* the number of periods (n), and epsilon, a tolerance level.
	*/
	// Side effect: modifies the class variable iterationCounter.
    public static double bruteForceSolver(double loan, double rate, int n, double epsilon) {
		
		double g = loan/n;

		double f = endBalance(loan, rate, n, g);

		double bfEpsilon = 0.0001;

		while (Math.abs(f) >= epsilon) {

			g = g + bfEpsilon;

			f = endBalance(loan, rate, n, g);

			iterationCounter++;

		}
		
    	return g;
    }
    
    /**
	* Uses bisection search to compute an approximation of the periodical payment 
	* that will bring the ending balance of a loan close to 0.
	* Given: the sum of theloan, the periodical interest rate (as a percentage),
	* the number of periods (n), and epsilon, a tolerance level.
	*/
	// Side effect: modifies the class variable iterationCounter.
    public static double bisectionSolver(double loan, double rate, int n, double epsilon) { 
		
		iterationCounter = 0;

		double L = 0;

		double H = loan;

    	double g = (L + H)/n;

		double fL = endBalance(loan, rate, n,L);

		double fH = endBalance(loan, rate, n, H);

		double fg = endBalance(loan, rate, n, g);
		
        while ((H - L) > epsilon) {

			if ((fg * fL) > 0) {

				H = g;

				fH = fg;

			} else {

					L = g;

					fL = fg;
				}

				g = g + epsilon;

				fg = endBalance(loan, rate, n, g);

				iterationCounter++;

				}

        // Sets L and H for the next iteration

// the solution must be between g and H // so set L or H accordingly

// the solution must be between L and g // so set L or H accordingly
// Computes the mid-value (𝑔) for the next iteration }

    	return g;
    }
	
	/**
	* Computes the ending balance of a loan, given the sum of the loan, the periodical
	* interest rate (as a percentage), the number of periods (n), and the periodical payment.
	*/
	private static double endBalance(double loan, double rate, int n, double payment) {
		// Replace the following statement with your code

		double x = loan;

		for (int i = 0 ; i < n; i++) {

			x = (x - payment);
			
			x = x * (rate/100);
		}

		return x;

		}
	}





		



			
		

		




