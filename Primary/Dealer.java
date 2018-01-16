public class Dealer extends Person {
    public Dealer() {}

    
	
    
    public void hit(Deck thisDeck) {
	while(getTotal() < 17) 
	    {Draw(thisDeck);}
    
    }
	
    //checkCool basically checks if the dealer should draw or not, because the dealer has a set of rules that they must abide by. 16 and lower means they hit, while 17 and above means they stand. 
	public Boolean checkCool() {
		int temp = getTotal();
		if (temp > 16){
			if(hasAce()){
				for(int counter = 0; counter < Hand.size(); counter++){
					if(Hand.get(counter).getName() == "Ace" && Hand.get(counter).getValue() == 11 && temp > 21){
						Hand.get(counter).setValue(1);
						temp = temp - 10;
					}
				}
			}
		}
		setTotal(temp);
		if(getTotal() > 16){
	    return true;}
		return false;
	}
    //fullTurn has the dealer draw until his rules no longer permit him to do so. 
	public void fullTurn(Deck thisDeck){
		while(!checkCool()){
			Draw(thisDeck);
		}
	}
	
}



    

