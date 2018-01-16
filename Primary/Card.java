public class Card {
    private int Value; //The amount that the card is worth 
    private String Name;//The name of the card 

    public Card (String name , int worth) {

	//If the worth is inputted as being above 11 (impossible, because 11 is the highest number, and less than 0,  because it is impossible, return an error. 
	if(worth > 11|| worth < 0) {
	    throw new IllegalArgumentException() ;
    }
	setName(name);
	setValue(worth);


    }
    //mutators and accessors
    public String getName(){
	return Name;
    }

    public void setName(String  temp) {
	Name = temp;
    }

    public int  getValue() {
s	return Value; }
    
    public void setValue(int  temp) {
	Value = temp;}
    //Returns true if the card is an ace
    public boolean isAce(){
        return Name == "Ace";
    }
}
