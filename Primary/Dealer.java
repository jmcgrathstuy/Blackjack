public class Dealer extends Person {
    public Dealer() {}

    public void hit() {
	if (getTotal() > 17)
	    {Draw(drawDeck);}
	if(getTotal() <= 16)
	    {Stand();}
    }

}

    
