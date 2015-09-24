
public final class Utilities {

	/**
	 * 
	 * @param base the base value
	 * @param expValue the exponent value
	 * @return value taken to the exponent, expValue
	 */
	public static double expWithSquaring(double base, int expValue) {
		
		//Checks if exponent is zero and return 1 in that case 
		if (expValue==0) {
			return 1;
		}
		
		//There are often odd currentExponents in the while loop; This variable will keep a running product of the odd factors
		double leftOverBase = 1;
		
		//Base that is currently being used in the loop (squared each time)
		double currentBase = base;
		
		//Exponent that is currently being used in the loop (divided by 2 each time)
		int currentExponent = Math.abs(expValue);

		//Squares currentBase until exponent==1 (in which currentBase would be the answer)
		while(currentExponent > 1) {
			
			//If currentExponent is odd, subtract one and divide by 2, and multiply currentBase with the running products of left over odd exponents, leftOverBase
			if(currentExponent%2!=0) {	
				leftOverBase*=currentBase;
				currentExponent = (currentExponent-1)/2;
				
			//In the standard even case, divide currentExponent by 2
			} else {
				currentExponent /=2;
			}
			
			//In both the even and odd cases, we multiply currentBase by itself
			currentBase *= currentBase;

		}


		//return 1/answer if exponent is negative
		if (expValue<0) {
			return 1/(currentBase*leftOverBase);
		
		//return answer if exponent is positive
		} else {
			return currentBase*leftOverBase;
		}

	}


}
