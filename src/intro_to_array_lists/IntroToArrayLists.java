package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> strings = new ArrayList<String>();
		//2. Add five Strings to your list
		strings.add("String 1");
		strings.add("String 2");
		strings.add("String 3");
		strings.add("String 4");
		strings.add("String 5e");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < strings.size(); i++){
			String s = strings.get(i);
			System.out.println("String at element " + i + " " + s);
		}
		System.out.println("\n");
		//4. Print all the Strings using a for-each loop
		for(String s : strings){
			System.out.println(s);
		}
		System.out.println("\n");
		//5. Print only the even numbered elements in the list.
		for(int i = 0; i < strings.size(); i++){
			int j = i + 1;
			if(j%2 == 0) {
					String s = strings.get(i);
					System.out.println("String at element " + i + " " + s);
			}
			}
		System.out.println("\n");
		//6. Print all the Strings in reverse order.
		for(int i = strings.size(); i < 0; i--){
			String s = strings.get(i);
			System.out.println("String at element " + i + " " + s);
		}
		System.out.println("\n");
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i = 0; i < strings.size(); i++){
			for(int j = 0; j < strings.get(i).length(); j++){
				if (strings.get(i).charAt(j) == 'e') {
					String s = strings.get(i);
					System.out.println("String at element " + i + " " + s);
				}
		}
	}
}
}
