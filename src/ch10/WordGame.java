package ch10;
import java.util.Scanner;

public class WordGame {

	private Scanner sc;
	private String startWord; 
	private Player[] players;
	
	public WordGame() {
		sc = new Scanner(System.in);
		startWord = "겨울한파";
	}
	

	private void createPlayers() {
		System.out.print("게임에 참가하는 인원은 몇 명입니까? >> ");
		int nPlayer = sc.nextInt();
		players = new Player[nPlayer]; 
		for (int i = 0; i < players.length; i++) {
			System.out.println("참가자의 이름을 입력하세요 > ");
			String name = sc.next();
			players[i] = new Player(name);
		}
	}
	
	public void run() {
		System.out.println("끝말잇기 게임을 시작합니다.");
		createPlayers();
		String lastWord = startWord;
		
		System.out.println("시작하는 단어는 " + lastWord + "입니다.");
		int next = 0;
		
		while (true) {
			String newWord = players[next].getUserWord();
			
			if (players[next].checkWord(lastWord) == false) {
				System.out.println(players[next].getName() + "이 졌습니다.");
				break;
			}
			
			next++;
			next %= players.length; 
			lastWord = newWord;
		}
	}
}

