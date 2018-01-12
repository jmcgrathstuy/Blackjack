public class TestTable{


    public static void main(String[] args){
	Player P1 = new Player("Ethan");
        Player P2 = new Player("James");
        Deck thisDeck = new Deck();
	P1.Draw(thisDeck);
	P1.Draw(thisDeck);
	System.out.println(P1.getCardCount());

	


    }


}
