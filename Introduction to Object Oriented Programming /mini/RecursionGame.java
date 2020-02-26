package mini;

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
	
	/**
	 * an integer value initialized as private
	 */
	private int intValue;
	/**
	 * String named "text" initialized as private
	 */
	private String text;
	
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
	public RecursionGame (RecursionGame e1,  RecursionGame e2, char op)
	{
		if (op == '+') {
            intValue = e1.intValue() + e2.intValue();
        } else if (op == '-') {
            intValue = e1.intValue() - e2.intValue();
        } else if (op == '*') {
            intValue = e1.intValue() * e2.intValue();
        } else if (op == '/' && e2.intValue() != 0 && e1.intValue % e2.intValue() == 0 ) {
            intValue = e1.intValue() / e2.intValue();
        }else if (op == '^'){
            		intValue = (int) Math.pow(e1.intValue, e2.intValue);
            }else {
            			text = ("Operator must be one of '+', '*', '-', or '/' ");
            }
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
	public static void findCombinations(ArrayList<RecursionGame> list,
																	int target, ArrayList<String> results) 
	{

		if (list.size() == 1) {
			if (list.get(0).intValue() == target) {
				results.add(list.get(0).toString());
			}
		} else {
			
			for (RecursionGame x : list) 
			{
				ArrayList<RecursionGame> copy = new ArrayList<RecursionGame>();
				copy.addAll(list);
				copy.remove(x);
				findCombinations(copy, target, results);
			}
			
			for (int i = 0; i < list.size() - 1; ++i) 
			{
				for (int j = i + 1; j < list.size(); ++j)
				{
					ArrayList<RecursionGame> copy = new ArrayList<RecursionGame>();
					copy.addAll(list);
					ArrayList<RecursionGame> copy2 = new ArrayList<RecursionGame>();
					// for '+'
					copy2.add(new RecursionGame(list.get(i), list.get(j), '+'));
					copy2.add(new RecursionGame(list.get(j), list.get(i), '+'));
					// for '-'
					copy2.add(new RecursionGame(list.get(i), list.get(j), '-'));
					copy2.add(new RecursionGame(list.get(j), list.get(i), '-'));
					// for '*'
					copy2.add(new RecursionGame(list.get(i), list.get(j), '*'));
					copy2.add(new RecursionGame(list.get(j), list.get(i), '*'));
					// for '/'
					copy2.add(new RecursionGame(list.get(i), list.get(j), '/'));
					copy2.add(new RecursionGame(list.get(j), list.get(i), '/'));
					// for '^'
					copy2.add(new RecursionGame(list.get(i), list.get(j), '^'));
					copy2.add(new RecursionGame(list.get(j), list.get(i), '^'));

					for (RecursionGame e : copy2)
					{
						ArrayList<RecursionGame> arr = new ArrayList<RecursionGame>();
						for (int k = 0; k < copy.size(); ++k) 
						{
							if (k != i && k != j) {
								arr.add(copy.get(k));
							}	
						}
						arr.add(e);
						findCombinations(arr, target, results);
					}
				}
			}
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
