import java.util.*;

public abstract class Person{
    
    private int CardCount = 0; 
    
    ArrayList <Card> Hand = new ArrayList<Card>(0);

    private int Total = 0; 

    public void Check() {}

    public Boolean CheckWin() {}

    public Boolean CheckBust() {}
    
    public void Draw() {}

    public Boolean hasAce() {}

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

    public Boolean compareTo(Person Dude) {
	if(getTotal() > Dude.getTotal()) 
	    {return true;}
	return false;}
}

    




