public class Player extends Person{

    private int CardCount = 0;
    ArrayList<Card> Hand = new ArrayList<Card>(0);
    private int Total = 0;
    private String Name = "";

    public String getName(){
	return Name;
    }

    public void setName(String newName){
	Name = newName;
    }
    

    public void hit(){
	
    }

    public void stand(){

    }



}
