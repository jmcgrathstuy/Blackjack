
public class Player extends Person{

    //private int CardCount = 0;
    //ArrayList<Card> Hand = new ArrayList<Card>(0);
    //private int Total = 0;
    private String Name;
    private int Bet;
    private int Money;
	private int HandValue;
    private Boolean stand = false; 
    


    public Player(String inName, int StartingMoney){
	setName(inName);
	setMoney(StartingMoney);
    }

    public int getBet() {
	return Bet;}
    
    public int getMoney() {
	return Money;}

    public void setMoney(int moolah){
	Money = moolah;} 


    public void setBet(int temp) {
	Bet = temp;}

    public Boolean doubleDown(Deck thisDeck) {
	Draw(thisDeck);
	if(checkBust() == false)
	    {setBet(getBet() * 2);
		return true;}
	return false;
	
    }


    
    
    


    public String getName(){
	return Name;
    }

    public void setName(String newName){
	Name = newName;
    }
    

    public void hit( Deck drawDeck){
	Draw(drawDeck);
	
    }

    public Boolean stand(){
	stand  = true;}
    

}




