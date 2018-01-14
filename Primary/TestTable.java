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
	System.out.println(P1.getTotal());
	System.out.println(P1.checkBust());
	System.out.println(P1.compareTo(P2));
	System.out.println(thisDeck.cardsLeft()); 
	P1.reset();
	thisDeck.reset(); 
	P1.intentionalDraw(thisDeck,"Ace");
	System.out.println(P1.position(0).getName());
	System.out.println(P1.position(0).getValue());
	P1.intentionalDraw(thisDeck,"Ace");
	P1.intentionalDraw(thisDeck,"Ace");
	P1.intentionalDraw(thisDeck,"Ace");
	P1.intentionalDraw(thisDeck,"Ace"); //Should return an error
		
	


    }


}
