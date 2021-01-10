package ch10;

import java.util.Scanner;

public class Player {
	private Scanner sc; 
	private String name; 
	private String word; 
	
	public Player(String name) {
		this.name = name; 
		sc = new Scanner(System.in); 
	}
	
	public String getName() {
		return name;
	}

	public String getUserWord() {
		System.out.print(name + " > ");
		word = sc.next(); 
		return word; 
	}
	
	public boolean checkWord(String lastWord) {
		boolean result = false;
		int lastIndex = lastWord.length() - 1;
		
		if (lastWord.charAt(lastIndex) == word.charAt(0)) {
			result = true;
		}
		
		return result;
	}
}

