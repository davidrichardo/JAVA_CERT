package C2Objets.Dog.GuessGame;

class Player{
		int number;
		void guess(){
			number = (int) (Math.random()*10);
		}
	}