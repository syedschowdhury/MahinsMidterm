package datastructure;

import java.util.List;
import java.util.Scanner;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your limit: ");
		int limit = input.nextInt();
		System.out.println("Please enter your numbers: ");
		List<Integer> list = new java.util.ArrayList<Integer>();
		for (int i = 0; i <limit ; i++) {
			list.add(input.nextInt());
		}
		for (int j = 0; j <list.size() ; j++) {
			System.out.println(list.get(j));
		}
	

	}

}
