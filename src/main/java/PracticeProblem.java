/**

        * File: Lesson 5.6 - parallel arrays

        * Author: Owais Ali Khan

        * Date Created: May 5, 2026

        * Date Last Modified: May 5, 2026

        */

public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int getAge(String[] names, int[] ages, String name) {
	    for (int i = 0; i < names.length; i++) {
	        if (names[i].equals(name)) {
	            return ages[i];
	        }
	    }
		return -1;
	}
	
	public static int[] createLengthArray(String[] words) {
	    int[] lengths = new int[words.length];
	    for (int i = 0; i < words.length; i++) {
	        lengths[i] = words[i].length();
	    }
	    return lengths;
	}
	
	
	public static void swapPeople(String[] names, int[] ages, String name1, String name2) {
	    int name1Index = -1;
	    int name2Index = -1;
	    for (int i = 0; i < names.length; i++) {
	        if (names[i] == name1 && name1Index == -1) {
	            name1Index = i;
	        }
	        if (names[i] == name2 && name2Index == -1) {
	            name2Index = i;
	        }
	    }
	    
	    int temp;

		temp = ages[name1Index];
		ages[name1Index] = ages[name2Index];
		ages[name2Index] = temp;


		String temp1;

		temp1 = names[name1Index];
		names[name1Index] = names[name2Index];
		names[name2Index] = temp1;
	}

}
