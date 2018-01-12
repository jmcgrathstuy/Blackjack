public class Player extends Person{

    //private int CardCount = 0;
    //ArrayList<Card> Hand = new ArrayList<Card>(0);
    //private int Total = 0;
    private String Name;
    private int Bet;
    private int Money;
    


    public Player(String inName){
	setName(inName);
    }

    public int getBet() {
	return Bet;}
    
    public int getMoney() {
	return Money;}

    public void setMoney(int moolah){
	Money = moolah;} 


    public void setBet(int temp) {
	Bet = temp;}

    public void doubleDown() {} 
    
    


    public String getName(){
	return Name;
    }

    public void setName(String newName){
	Name = newName;
    }
    

    public void hit( Deck drawDeck){
	Draw( drawDeck);
    }

    public void stand(){
	int a = 1;
    }



}
