import java.math.BigDecimal;
import java.math.BigInteger;

public final class Utilities {

	/**
	 * 
	 * @param base the base value
	 * @param expValue the exponent value
	 * @return value taken to the exponent, expValue
	 */
	public static BigDecimal expWithSquaring(BigDecimal base, BigInteger expValue) {
		
		//Checks if exponent is zero and return 1 in that case 
		if (expValue.compareTo(BigInteger.ZERO)==0) {
			return BigDecimal.ONE;
		}
		
		//There are often odd currentExponents in the while loop; This variable will keep a running product of the odd factors
		BigDecimal leftOverBase = new BigDecimal(String.valueOf(1));
		
		//Base that is currently being used in the loop (squared each time)
		BigDecimal currentBase = base;
		
		//Exponent that is currently being used in the loop (divided by 2 each time)
		BigInteger currentExponent = expValue.abs();

		//Squares currentBase until exponent==1 (in which currentBase would be the answer)
		while(currentExponent.compareTo(BigInteger.ONE) == 1) {
			
			//If currentExponent is odd, subtract one and divide by 2, and multiply currentBase with the running products of left over odd exponents, leftOverBase
			if(currentExponent.remainder(new BigInteger(String.valueOf(2))).compareTo(BigInteger.ZERO)!=0) {	
				leftOverBase=currentBase.multiply(leftOverBase);
				currentExponent = currentExponent.subtract(BigInteger.ONE).divide(new BigInteger(String.valueOf(2)));
				
			//In the standard even case, divide currentExponent by 2
			} else {
				currentExponent = currentExponent.divide(new BigInteger(String.valueOf(2)));
			}
			
			//In both the even and odd cases, we multiply currentBase by itself
			currentBase = currentBase.multiply(currentBase);

		}


		//return 1/answer if exponent is negative
		if (expValue.compareTo(BigInteger.ZERO)<0) {
			return BigDecimal.ONE.divide((currentBase.multiply(leftOverBase)));
		
		//return answer if exponent is positive
		} else {
			return currentBase.multiply(leftOverBase);
		}

	}


}
