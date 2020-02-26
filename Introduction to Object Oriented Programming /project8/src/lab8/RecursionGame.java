package lab8;

import java.util.ArrayList;

/**
 * @author Emin Okic
 * 	Computer Science ISU '21
 */

/**
 * RecursionGame Class extending object
 * 
 * Implementation of a variation of the "twenty-four" game.
 */
public class RecursionGame extends Object {
	
	private static final String RecursionGame_xyz = null;
	private final int intValue;
	private final String text;
	
	/**
	 * RecursionGame Constructor
	 * 
	 *Constructs a new RecursionGame of an integer 
	 *by initializing a the integer and a String from the integer.
	 *
	 *@param v - integer value
	 */
	public RecursionGame(int v)
	{
		intValue = v;
        text = "" + v;
	}
	
	/**
	 *  RecursionGame Constructor
	 *  
	 * Constructs a new RecursionGame by combining the two given RecursionGame objects 
	 * using the given operator. 
	 * The method must compute the value using the given operator 
	 * as well as a String text representation of the combined expression. 
	 * Allowed operators are '+', '-', '*', '/' and '^'.
	 *
	 *@param e1 - left hand side
	 *@param e2 - right hand side
	 *@param op - operator with which to combine e1 and e2
	 */
	public RecursionGame(RecursionGame e1,
            									 RecursionGame e2,
            															char op)
	{
		if (op == '+') {
            intValue = e1.intValue() + e2.intValue();
        } else if (op == '-') {
            intValue = e1.intValue() - e2.intValue();
        } else if (op == '*') {
            intValue = e1.intValue() * e2.intValue();
        } else if (op == '/') {
            intValue = e1.intValue() / e2.intValue();
        } else {
            throw new IllegalArgumentException("Operator must be one of '+', '*', '-', '/'");
        }

        // finally, create a text representation of the combined expression
        text = "(" + e1 + " " + op + " " + e2 + ")";
	}
	
	/**
	 *  Find Combinations Method
	 *  
	 * Lists all ways to obtain the given target number
	 *  using arithmetic operations on the values in the given RecursionGame list. 
	 * Results in string form are added to the given list, 
	 * where the string form of a value is obtained from the toString() of the Value object. 
	 * 
	 * Special rules are:
	 *  1) you are not required to use all given numbers
	 *  2) division is integer division and is only allowed when remainder is zero. 
	 *  		For addition and multiplication, a + b and b + a are considered to be distinct solutions, 
	 *  			and likewise a * b and b * a are considered as different solutions.
	 *
	 *@param list - the values to be used
	 *@param target - the target number to be obtained from the values in the list
	 *@param results - list of all results, as strings
	 */
	
	public static void findCombinations(java.util.ArrayList<RecursionGame> list,
            																										  int target,
            													java.util.ArrayList<java.lang.String> results)
	{
        ArrayList<RecursionGame> _list = new ArrayList<>(list);
        ArrayList<RecursionGame> _copy = new ArrayList<>();
        RecursionGame _exp = new RecursionGame(0);
        RecursionGame _xyz;
        char _op = ' ';

        if (list.size() == 1) {
            if (list.get(0).intValue() == target) {
                results.add(list.get(0).toString());
            }
        } else {
            for (RecursionGame x : list) {
                _copy.addAll(list);
                _exp = _copy.remove(0);
                findCombinations(_copy, target, results);
            }

            // for each pair of numbers x, y in the list
            //    for each allowable arithmetic combination z of x and y
            //        create a copy of the list without x and y, but z added.
            //        find solutions using that list
        }	
	}
	
	/**
	 *  Int Value Method
	 *  
	 * Returns the integer value stored in this object.
	 * 
	 * @return the integer value of this object
	 */
	public int intValue()
	{
		return intValue;
		
	}
	
	/**
	 *  String to String Method
	 *  
	 * Returns the text representation of this object.
	 * 
	 * @Override toString in class java.lang.Object
	 * @return string representation of this object
	 */
	public java.lang.String toString()
	{
		return text;
		
	}
	
	

}
