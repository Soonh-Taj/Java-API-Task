/**
 * Copyright (c) 2017, ABC and/or its affiliates. All rights reserved.
 * ABC PROPRIETARY/CONFIDENTIAL. Use is subject to license terms
 **/

/**
 * The <code>SoonhAPI</code> class represents arithmatic operations.
 * Equation formula is to add the two numbers , subtract two numbers multiply two numbers,
 * are implemented as methods of this class.
 * @author Soonh Taj - 14SW69
 * @since JDK1.8
 */

public class soonhAPI {
	/** These values are used for equation variable storage. */
	private int aAdd;
	private int bAdd;
	private int aSubtract;
	private int bSubtract;
	private int aMultiply;
	private int bMultiply;
	private int addResult;
	private int subtractResult;
	private int multiplyResult;

     /**
     * Uses the param values as a and b use to calculate the value of a+b 
     * This method doesn't perform any range checking.
     * Both params are used to calculate summed up value 
     * @param      a     The first value to put into the formula.
     * @param      b     The second value to put into the formula.
     */
	public int additionTheorem(int a, int b) {
		this.aAdd = a;
		this.bAdd = b;
		this.addResult = this.aAdd + this.bAdd;
		return this.addResult;
	}

     /**
     * Uses the param values as a and b use to calculate the value of a-b 
     * This method doesn't perform any range checking.
     * Both params are used to calculate subtracted up value 
     * @param      a     The first value to put into the formula.
     * @param      b     The second value to put into the formula.
     */
public int subtractionTheorem(int a, int b) {
		this.aSubtract = a;
		this.bSubtract = b;
		this.subtractResult = this.aSubtract-this.bSubtract;
		return this.subtractResult;
	}

     /**
     * Uses the param values as a and b use to calculate the value of a*b 
     * This method doesn't perform any range checking.
     * Both params are used to calculate multiplied up value 
     * @param      a     The first value to put into the formula.
     * @param      b     The second value to put into the formula.
     */
public int multiplyTheorem(int a, int b) {
		this.aMultiply = a;
		this.bMultiply = b;
		this.multiplyResult = this.aMultiply*this.bMultiply;
		return this.multiplyResult;
	}

public static void main(String args[]){
		
	soonhAPI testAdd=new soonhAPI();
	System.out.println(testAdd.additionTheorem(6,7));
	}
}


