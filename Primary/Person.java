
import java.util.*;

public abstract class Person{
    
    private int CardCount = 0; 
    
    ArrayList <Card> Hand = new ArrayList<Card>(0);

    private int Total = 0;

    private String name; 



    public Boolean checkWin(Person dude) {
	if (getTotal() == 21) {return true;}
	if (fiveCC()) {return true;}
	if (compareTo(dude)) {return true;}
	return false;} 

    public Boolean checkBust() {
	int temp = getTotal();
        if (temp > 21) {
	    if(hasAce())
		{for(int counter = 0; counter < Hand.size(); counter++)
			{if(Hand.get(counter).getName() == "Ace" && Hand.get(counter).getValue() == 11 && temp > 21)
				{Hand.get(counter).setValue(1);
				    temp = temp - 10;}
			}
		}
	}
	setTotal(temp);
	if(getTotal() > 21){
	    return true;}
	return false;}
				    
				    
    
    
    public void Draw(Deck drawDeck) {
	Card copyCard = drawDeck.draw();
	Hand.add(copyCard);
	setTotal(Total + copyCard.getValue());
        setCardCount( getCardCount() + 1);
    }

    public Boolean hasAce() {
        for(int counter = 0; counter < Hand.size(); counter++ ) {
	    if(Hand.get(counter).getName() == "Ace")
		{return true;}
	}
	return false;
    }

    abstract void hit( Deck drawDeck);

    public void reset() {
	Hand = new ArrayList<Card> (0); }

    public int getCardCount () { 
	return CardCount;}

    public void setCardCount( int replace) {
	CardCount = replace; }

    public int getTotal() {
	return Total;}

    public void setTotal(int replace) {
	Total = replace;} 

    public Boolean fiveCC () {
	if (getCardCount() >= 5 && checkBust() == false) 
	    {return true;}
	return false;}
    

    public Boolean compareTo(Person Dude) {
	if(getTotal() > Dude.getTotal()) 
	    {return true;}
	return false;}

    public Card position(int place) {
	return Hand.get(place);
    }

	
	
}

    




