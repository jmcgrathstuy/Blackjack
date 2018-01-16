
public class Player extends Person{

    private String Name; //Name of the player
    private int Bet; //The amount of betting money that the person is going to spend in a round 
    private int Money;//The amount of total money that the person has.
    private int HandValue; //The added value of all the cards in that person's hand.
    private Boolean stand = false; //Helps Casino.Gui determine turns. 
    

    //Constructor asks for the Name and starting money
    public Player(String inName, int StartingMoney){
	setName(inName);
	setMoney(StartingMoney);
    }
    //Accessor methods /Mutator Methods
    public int getBet() {
	return Bet;}
    
    public int getMoney() {
	return Money;}

    public void setMoney(int moolah){
	Money = moolah;} 


    public void setBet(int temp) {
	Bet = temp;}
    //This double down is meant to draw from the deck, check if the player busts, then return true if they didn't and false if they did. 
    public Boolean doubleDown(Deck thisDeck) {
	Draw(thisDeck);
	if(checkBust() == false)
	    {setBet(getBet() * 2);
		return true;}
	return false;
	
    }


    
    
    
    //More accessors /Mutators

    public String getName(){
	return Name;
    }

    public void setName(String newName){
	Name = newName;
    }
    
    //Hit simply draws from the deck. Done for simplicity sake/Code structure was later revised to not really include it. 
    public void hit( Deck drawDeck){
	Draw(drawDeck);
	
    }
    //This sets a boolean value in the player to true, which helps CasinoGUi.java tell when a player is finished with their turn, and their cards ready to be evaluated. 
    public void stand(){
	stand  = true;}
    

}




