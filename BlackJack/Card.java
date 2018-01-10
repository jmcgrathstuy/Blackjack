public class Card {
    private int Value;
    private String Name;

    public Card (String name , int worth) {


	if(worth > 11) {
	    throw new IllegalArgumentException() ;
    }
	setName(name);
	setValue(worth);


    }

    public String getName(){
	return Name;
    }

    public void setName(String  temp) {
	Name = temp;
    }

    public int  getValue() {
	return Value; }

    public void setValue(int  temp) {
	Value = temp;}

    public boolean isAce(){
        return Name == "Ace";
    }
}
