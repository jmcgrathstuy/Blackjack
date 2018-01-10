import java.util.*;

public abstract class Person{
    
    private int CardCount = 0; 
    
    ArrayList <Card> Hand = new ArrayList<Card>(0);

    private int Total = 0; 

    public void Boolean Check(Person dude) {}

    public Boolean checkWin(Person dude) {
	if (getTotal() == 21) {return true;}
	if (fiveCC()) {return true;}
	if (compareTo(dude)) {return true;}
	return false;} 

    public Boolean checkBust() {
        if (getTotal() > 21) {
	    return true;}
	return false;}
    
    public void Draw(Deck drawDeck) {
	Card copyCard = drawDeck.draw();
	Hand.add(copyCard);
	setTotal(Total + copyCard.getValue());
    }

    public int hasAce() {
	for(int counter = 0; counter < Hand.length; counter ++)
	    if( 
    }

    abstract void hit() ;

    abstract void stand(); 

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
}

    




