public class TestTable{

    Player P1 = new Player("Ethan");
    Player P2 = new Player("James");
    Deck curDeck = new Deck();
    

    public static void main(String[] args){
	P1.draw(curDeck);
	P1.draw(curDeck);
	P1.getCardCount();

	


    }


}
