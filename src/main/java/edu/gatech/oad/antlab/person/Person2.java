package edu.gatech.oad.antlab.person;

import java.util.Random;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Alex Teichner
 * @version 1.1
 */
public class Person2 {
	/**
	 * Holds the persons real name
	 */
	private String name;

	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	public Person2(String pname) {
		name = pname;
	}
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
		int length = input.length();
		char[] array = new char[length];
		Random rand = new Random();
		int index;
		for (int i = 0; i < length; i++) {
			while (true) { //Keep-alive to ensure full randomization and no overwrites
				index = rand.nextInt(length);
				if (array[index] == 0) {
					array[index] = input.charAt(i); //Place the character into a random location
					break; //Break out of keep-alive
				}
			}
		} //continue on the next character

		StringBuilder sBuilder = new StringBuilder(); //Using StringBuilder to ensure robustness at large input length
		for (char c : array) {
			sBuilder.append(c);
		}
		return sBuilder.toString(); //Return a string
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
		return name + calc(input);
	}
}
