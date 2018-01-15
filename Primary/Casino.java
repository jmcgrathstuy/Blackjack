import java.util.*;

public class Casino {



    public static void main(String[] args){
    //INPUT NUMBER OF PLAYERS
    //INPUT NAMES OF PLAYERS
    
    boolean playGame = true; 
    
    ArrayList<Player> Gamblers = new ArrayList<Player> (4 /*for the time being*/);
    Player A = new Player("Ethan" , 1000);
    Player B = new Player("James" , 1000);
    Player C = new Player("K" , 1000); 
    Player D = new Player("Holmes" , 1000); 
    Gamblers.add(A);
    Gamblers.add(B);
    Gamblers.add(C);
    Gamblers.add(D);
    //SOMETHING WILL NEED TO CHANGE HERE TO INCORPORATE GETTING RID OF PLAYERS DEPENDANT ON THE NUMBERS OF PLAYERS INPUTTED
    Deck thisDeck = new Deck(); 
    Dealer guy = new Dealer(); 
    while (playGame == true){
	int NumberofRip = 0;
	//IF ENDGAME BUTTON IS PRESSED END IT
	for(int counter = 0; counter < Gamblers.size() ; counter++ ) {
	    if(Gamblers(counter).getMoney() == 0) {NumberofRip ++;}
	}
	if(NumberofRip == Gamblers.size() - 1) {playGame = false;} 
	boolean roundPlay = true;
	while(roundPlay == true)
	    {//PLACE BETS 
		guy.Draw(thisDeck);
		guy.Draw(thisDeck);
		if(guy.checkBust() == true;)//IF DEALER BUSTS , PLAYERS GET DOUBLE  BET BACK
		    {for(int counter = 0; counter < Gamblers.size(); counter++ ) {
			    Gamblers.get(counter).setMoney(getBet() * 2);
			    guy.reset();
			    thisDeck.reset();
			    roundPlay = false;
			}
		    }
		if(guy.checkWin() == true;)//IF DEALER GETS BLACKJACK, PLAYERS GET THEIR BET SUBTRACTED
		    {for(int counter = 0; counter < Gamblers.size(); counter++ ) {
			    Gamblers.get(counter).setMoney(getMoney() - getBet());
			    guy.reset();
			    thisDeck.reset();
			    roundPlay = false;}
		    }
		for(int counter = 0; counter < Gamblers.size() ;counter ++) {//HAS THEM DRAW CARDS. 
		    if(Gamblers.get(counter).getMoney() > 0) {
			Gamblers.get(counter).Draw();
			Gamblers.get(counter).Draw();}
		}
		for(int counter = 0; counter < Gamblers.size(); counter ++ ) {
		    if(Gamblers.get(counter).checkBust() == true;) {
			//Skip turn?
		    //GO THROUGH THE TURNS/BUTTONS
		    
		
		
			
		
	    
	    
    
}
}
    
    
							