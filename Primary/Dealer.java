public class Dealer extends Person {
    public Dealer() {}

    
	

    public void hit(Deck thisDeck) {
	while(getTotal() < 17) 
	    {Draw(thisDeck);}
    
    }
	
	
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
	
	public void fullTurn(Deck thisDeck){
		while(!checkCool()){
			Draw(thisDeck);
		}
	}
	
}



    

