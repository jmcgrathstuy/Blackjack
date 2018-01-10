import java.util.*;

public class Deck{

    ArrayList <Card> data = new ArrayList<Card>(52);



    

    public Deck () {

	

	Card two1 = new Card("Two" , 2);

	Card two2 = new Card("Two" , 2);

	Card two3 = new Card("Two" , 2);

	Card two4 = new Card("Two" , 2);

	Card three1 = new Card("Three" , 3);

	Card three2 = new Card("Three" , 3);

	Card three3 = new Card("Three" , 3);

	Card three4 = new Card("Three" , 3);

	Card four1 = new Card("Four" , 4);

	Card four2 = new Card("Four" , 4);

	Card four3 = new Card("Four" , 4);

	Card four4 = new Card("Four" , 4);

	Card five1 = new Card("Five" , 5);

	Card five2 = new Card("Five" , 5);

	Card five3 = new Card("Five" , 5);

	Card five4 = new Card("Five" , 5);

	Card six1 = new Card("Six" , 6);

	Card six2 = new Card("Six" , 6);

	Card six3 = new Card("Six" , 6);

	Card six4 = new Card("Six" , 6);

	Card seven1 = new Card("Seven" , 7);

	Card seven2 = new Card("Seven" , 7);

	Card seven3 = new Card("Seven" , 7);

	Card seven4 = new Card("Seven" , 7);

	Card eight1 = new Card("Eight" , 8);

	Card eight2 = new Card("Eight" , 8);

	Card eight3 = new Card("Eight" , 8);

	Card eight4 = new Card("Eight" , 8);

	Card nine1 = new Card("Nine" , 9);

	Card nine2 = new Card("Nine" , 9);

	Card nine3 = new Card("Nine" , 9);

	Card nine4 = new Card("Nine" , 9);

	Card ten1 = new Card("Ten" , 10);

	Card ten2 = new Card("Ten" , 10);

	Card ten3 = new Card("Ten" , 10);

	Card ten4 = new Card("Ten" , 10);

	Card Jack1 = new Card("Jack" , 10);

	Card Jack2 = new Card("Jack" , 10);

	Card Jack3 = new Card("Jack" , 10);

	Card Jack4 = new Card("Jack" , 10);

	Card Queen1 = new Card("Queen" , 10);

	Card Queen2 = new Card("Queen" , 10);

	Card Queen3 = new Card("Queen" , 10);

	Card Queen4 = new Card("Queen" , 10);

	Card King1 = new Card("King" , 10);

	Card King2 = new Card("King" , 10);

	Card King3 = new Card("King" , 10);

	Card King4 = new Card("King" , 10);

	Card Ace1 = new Card("Ace" , 11);

	Card Ace2 = new Card("Ace" , 11);

	Card Ace3 = new Card("Ace" , 11);

	Card Ace4 = new Card("Ace" , 11);
	
	data.add(two1);
	data.add(two2);
	data.add(two3);
	data.add(two4);
	data.add(three1);
	data.add(three2);
	data.add(three3);
	data.add(three4);
	data.add(four1);
	data.add(four2);
	data.add(four3);
	data.add(four4);
	data.add(five1);
	data.add(five2);
	data.add(five3);
	data.add(five4);
	data.add(six1);
	data.add(six2);
	data.add(six3);
	data.add(six4);
	data.add(seven1);
	data.add(seven2);
	data.add(seven3);
	data.add(seven4);
	data.add(eight1);
	data.add(eight2);
	data.add(eight3);
	data.add(eight4);
	data.add(nine1);
	data.add(nine2);
	data.add(nine3);
	data.add(nine4);
	data.add(ten1);
	data.add(ten2);
	data.add(ten3);
	data.add(ten4);
	data.add(Jack1);
	data.add(Jack2);
	data.add(Jack3);
	data.add(Jack4);
	data.add(Queen1);
	data.add(Queen2);
	data.add(Queen3);
	data.add(Queen4);
	data.add(King1);
	data.add(King2);
	data.add(King3);
	data.add(King4);
	data.add(Ace1);
	data.add(Ace2);
	data.add(Ace3);
	data.add(Ace4);
	
	}

;

	

	

	

	

	

	

	



    public void Draw () {}



    public int CardsLeft () {
		return data.size();
	}



    public  void Reset () {
		
	}

	
	public static void main(String[] args){
		//i'm using this for testing as i put together all the code for this class
		Deck testDeck = new Deck();
		System.out.println(testDeck.CardsLeft());
	}
}