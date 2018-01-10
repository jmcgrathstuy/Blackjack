import java.util.*;

public abstract class Person{
    
    private int CardCount = 0; 
    
    ArrayList <Card> Hand = new ArrayList<Card>(0);

    private int Total = 0; 

    public void Check(Person dude) {}

    public Boolean CheckWin(Person dude) {
	if (getTotal() == 21) {return true;}
	if (FiveCC) {return true;}
	if (compareTo(dude)) {return true;}
	return false;} 

    public Boolean CheckBust() {
        if (getTotal() > 21) {
	    return true;}
	return false;}
    
    public void Draw() {}

    public int hasAce() {}

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

    public Boolean FiveCC () {
	if (getCardCount() >= 5 && CheckBust() == false) 
	    {return true;}
    }

    public Boolean compareTo(Person Dude) {
	if(getTotal() > Dude.getTotal()) 
	    {return true;}
	return false;}
}

    




