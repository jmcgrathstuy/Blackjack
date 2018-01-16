import java.util.*;

public abstract class Person{
    
    private int CardCount = 0; //This shows the number of cards in the person's hand
    
    ArrayList <Card> Hand = new ArrayList<Card>(0); //This represents the person's hand, with an array list that is filled with Cards (originally, size is set to 0)

    private int Total = 0; //Total value of all the combined cards in the Person's hand. 

    private String name; //The Persons's name. 



    public Boolean checkWin(Person dude) { //This method essentially checks to see if the person has either : Gotten blackjack, hit a five card Charlie, or has beaten the Dealer/ other player. 
		if (getTotal() == 21){
			return true;
		}
		if (fiveCC()) {
			return true;
		}
		if (compareTo(dude)) {
			return true;
		}
		return false;
	} 
     //Checkbust checks whether the player's hand has exceeded 21, and if so, tries to reduce Aces from 11 to 1
	//If reducing Aces can reduce the hand's value below 21 or is not needed, checkbust returns false.
	//If the hand's value exceeds 21 no matter what, checkBust returns true.
	//
	
    public Boolean checkBust() {
		int temp = getTotal();
		if (temp > 21){
			if(hasAce()){
				for(int counter = 0; counter < Hand.size(); counter++){
					if(Hand.get(counter).getName() == "Ace" && Hand.get(counter).getValue() == 11 && temp > 21){
						Hand.get(counter).setValue(1);
						temp = temp - 10;
					}
				}
			}
		}
		System.out.println(temp);
		setTotal(temp);
		if(getTotal() > 21){
	    return true;}
		return false;
	}
	
    //Intentional Draw selects a card from the deck with the given name, and draws that. This is meant to be here for testing /demoing purposes. 
    public void intentionalDraw(Deck thisDeck,String name){
		Card copyCard = thisDeck.NameDraw(name); 
		Hand.add(copyCard); 
		setTotal(Total + copyCard.getValue());
		setCardCount(getCardCount() + 1);
    }
    
    //This is the Draw method, where a person draws from the deck, has his hand , his total, and his card count updated, while having the Deck subtract that card from it's supply of cards. 
    public void Draw(Deck drawDeck) {
		Card copyCard = drawDeck.draw();
		Hand.add(copyCard);
		setTotal(getTotal() + copyCard.getValue());
        setCardCount( getCardCount() + 1);
    }
    //HasAce is to determine whether or not the person has an ace in their hand. This is important because aces can be treated as either 11 or 1 in Blackjack, making it hard to check for busts/wins.Returns True if there is an ace, and false if there is none. 
    public Boolean hasAce() {
        for(int counter = 0; counter < Hand.size(); counter++ ) {
	    if(Hand.get(counter).getName() == "Ace")
		{return true;}
	}
	return false;
    }
    
    abstract void hit( Deck drawDeck);
    //This resets the player's hand, as well as his total value, as well as the number of cards in his hand. 
    public void reset() {
		Hand = new ArrayList<Card> (0);
		Total = 0;
		CardCount = 0;
	}
	
    //Accessors/Mutators
    public int getCardCount () { 
	return CardCount;
	}

    public void setCardCount( int replace) {
	CardCount = replace; 
	}

    public int getTotal() {
	return Total;
	}

    public void setTotal(int replace) {
	Total = replace;
	} 
	
	public ArrayList<Card> getHand(){
		return Hand;
	}
	
	public void resetHand(){
		Hand = new ArrayList<Card> (0);
		setTotal(0);
	}
    //This method return true, if the person has managed to draw a fiveCard Charlie, meaning that they have successfully drawn 5 cards without Busting. Returns true if they have, and false if not. 
    public Boolean fiveCC () {
		if (getCardCount() >= 5 && checkBust() == false){
			return true;
		}
		return false;
	}
    
    
    public Boolean compareTo(Person Dude) {
	if(getTotal() > Dude.getTotal()) 
	    {return true;}
	return false;}
    //Returns true if this Person has a hand total greater than the specified Person
	//
	
	
    public Card position(int place) {
		return Hand.get(place);
    }
	//Returns the card in the Person's hand at index place.
	//

	
	
}

    




