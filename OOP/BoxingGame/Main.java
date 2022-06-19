package BoxingGame;

public class Main {

	public static void main(String[] args) {
		
		 Fighter player1 = new Fighter();
	        Fighter player2 = new Fighter();

	        player1.createPlayer(1);
	        player2.createPlayer(2);

	        Ring ring = new Ring(player1, player2, 85,120);
	        ring.playerControl();

	    }
	}