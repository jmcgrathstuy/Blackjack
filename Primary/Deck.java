
import java.util.*;

public class Deck{

    ArrayList <Card> data = new ArrayList<Card>(52);
	Random rand = new Random();
    //This is essentially here to define every single card in a deck(not including suits)
	Card two1 = new Card("Two" , 2, "cardImages/twoClub");
	Card two2 = new Card("Two" , 2, "cardImages/twoSpade");
	Card two3 = new Card("Two" , 2, "cardImages/twoHeart");
	Card two4 = new Card("Two" , 2, "cardImages/twoDiamond");
	Card three1 = new Card("Three" , 3, "cardImages/threeClub");
	Card three2 = new Card("Three" , 3, "cardImages/threeSpade");
	Card three3 = new Card("Three" , 3, "cardImages/threeHeart");
	Card three4 = new Card("Three" , 3, "cardImages/threeDiamond");
	Card four1 = new Card("Four" , 4, "cardImages/fourClub");
	Card four2 = new Card("Four" , 4, "cardImages/fourSpade");
	Card four3 = new Card("Four" , 4, "cardImages/fourHeart");
	Card four4 = new Card("Four" , 4, "cardImages/fiveDiamond");
	Card five1 = new Card("Five" , 5, "cardImages/fiveClub");
	Card five2 = new Card("Five" , 5, "cardImages/fiveSpade");
	Card five3 = new Card("Five" , 5, "cardImages/fiveHeart");
	Card five4 = new Card("Five" , 5, "cardImages/sixDiamond");
	Card six1 = new Card("Six" , 6, "cardImages/sixClub");
	Card six2 = new Card("Six" , 6, "cardImages/sixSpade");
	Card six3 = new Card("Six" , 6, "cardImages/sixHeart");
	Card six4 = new Card("Six" , 6, "cardImages/sixDiamond");
	Card seven1 = new Card("Seven" , 7, "cardImages/sevenClub");
	Card seven2 = new Card("Seven" , 7, "cardImages/sevenSpade");
	Card seven3 = new Card("Seven" , 7, "cardImages/sevenHeart");
	Card seven4 = new Card("Seven" , 7, "cardImages/sevenDiamond");
	Card eight1 = new Card("Eight" , 8, "cardImages/eightClub");
	Card eight2 = new Card("Eight" , 8, "cardImages/eightSpade");
	Card eight3 = new Card("Eight" , 8, "cardImages/eightHeart");
	Card eight4 = new Card("Eight" , 8, "cardImages/eightDiamond");
	Card nine1 = new Card("Nine" , 9, "cardImages/nineClub");
	Card nine2 = new Card("Nine" , 9, "cardImages/nineSpade");
	Card nine3 = new Card("Nine" , 9, "cardImages/nineHeart");
	Card nine4 = new Card("Nine" , 9, "cardImages/nineDiamond");
	Card ten1 = new Card("Ten" , 10, "cardImages/tenClub");
	Card ten2 = new Card("Ten" , 10, "cardImages/tenSpade");
	Card ten3 = new Card("Ten" , 10, "cardImages/tenHeart");
	Card ten4 = new Card("Ten" , 10, "cardImages/tenDiamond");
	Card Jack1 = new Card("Jack" , 10, "cardImages/jackClub");
	Card Jack2 = new Card("Jack" , 10, "cardImages/jackSpade");
	Card Jack3 = new Card("Jack" , 10, "cardImages/jackHeart");
	Card Jack4 = new Card("Jack" , 10, "cardImages/jackDiamond");
	Card Queen1 = new Card("Queen" , 10, "cardImages/queenClub");
	Card Queen2 = new Card("Queen" , 10, "cardImages/queenSpade");
	Card Queen3 = new Card("Queen" , 10, "cardImages/queenHeart");
	Card Queen4 = new Card("Queen" , 10, "cardImages/queenDiamond");
	Card King1 = new Card("King" , 10, "cardImages/kingClub");
	Card King2 = new Card("King" , 10, "cardImages/kingSpade");
	Card King3 = new Card("King" , 10, "cardImages/kingHeart");
	Card King4 = new Card("King" , 10, "cardImages/kingDiamond");
	Card Ace1 = new Card("Ace" , 11, "cardImages/aceClub");
	Card Ace2 = new Card("Ace" , 11, "cardImages/aceSpade");
	Card Ace3 = new Card("Ace" , 11, "cardImages/aceHeart");
	Card Ace4 = new Card("Ace" , 11, "cardImages/aceDiamond");


    

    public Deck() {
	//This adds all the cards to the deck
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

    //This draws a random card in the deck, and removes the card from the deck. 
    public Card draw () {
		int whichSpot = rand.nextInt(data.size());
		Card pickedCard = data.get(whichSpot);
		Card copyCard = new Card( pickedCard.getName(), pickedCard.getValue(), pickedCard.getFacePath());
		data.remove(whichSpot);
		return copyCard;
	}
    
    //This draws a specific card from the Deck with a given name, and if all of the cards with that name have been taken, then it returns an error. 
    public Card NameDraw(String taco) {
	for(int counter = 0; counter < cardsLeft(); counter++ ){
	    if(data.get(counter).getName() == taco){
		Card copyCard = new Card(data.get(counter).getName(),data.get(counter).getValue(), data.get(counter).getFacePath());
		data.remove(counter);
		return copyCard;
	    }
	}
	System.out.println("None of that card remains");
	throw new IllegalArgumentException();
    }
		

    //This returns the number of cards left in the deck. 
    public int cardsLeft () {
		return data.size();
	}
    
	public ArrayList getData(){
		return data;
	}
	
	public String toString(){
		String toReturn = "[";
		for( int stepper = 0; stepper < data.size(); stepper++){
			toReturn += data.get(stepper).getName();
			if( stepper < data.size() - 1){
				toReturn += ", ";
			}
		}
		toReturn += "]";
		return toReturn;
	}


    //This reset resets the Deck.
    public void reset () {
		data.clear();
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

	
	public static void main(String[] args){
		//Using this for testing as we put together all the code for this class
		Deck testDeck = new Deck();
		System.out.println(testDeck.cardsLeft());
		System.out.println(testDeck.draw().getName());
		System.out.println(testDeck.cardsLeft());
		System.out.println(testDeck.toString());
		System.out.println(testDeck.draw().getName());
		System.out.println(testDeck.draw().getName());
		System.out.println(testDeck.draw().getName());
		System.out.println(testDeck.draw().getName());
		System.out.println(testDeck.draw().getName());
		System.out.println(testDeck.draw().getName());
		System.out.println(testDeck.draw().getName());
		System.out.println(testDeck.draw().getName());
		System.out.println(testDeck.draw().getName());
		System.out.println(testDeck.draw().getName());
		System.out.println(testDeck.draw().getName());
		System.out.println(testDeck.toString());
		System.out.println(testDeck.cardsLeft());
		testDeck.reset();
		System.out.println(testDeck.cardsLeft());
		
	}
}