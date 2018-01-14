public class TestTable{


    public static void main(String[] args){
	Player P1 = new Player("Ethan");
        Player P2 = new Player("James");
        Deck thisDeck = new Deck();
	P1.Draw(thisDeck);
	P1.Draw(thisDeck);
	System.out.println(P1.getCardCount());
	System.out.println(P2.getCardCount()); 
	P1.Draw(thisDeck); 
	P1.Draw(thisDeck);
	for(int counter = 0 ; counter < P1.getCardCount(); counter++)
	    {System.out.println(P1.position(counter).getValue());
		System.out.println(P1.position(counter).getName()); 
	    }
	System.out.println(P1.checkBust());
	System.out.println(P1.compareTo(P2));
		
	


    }


}
