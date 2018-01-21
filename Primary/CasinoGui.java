import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CasinoGui extends JFrame implements ActionListener{
    private boolean gameStarted = false; //A checkmark for the button startGame
    private Container pane;
    private JButton hit,stand,startGame,doubleDown,newRound; 
    private JTextField playerName,Bet;
    private JLabel Total , Money , Name , BetCount, PlayerCards , DealerCards, DealerTotal, DealerHead, PlayerHead, pCard1, pCard2, pCard3, pCard4, pCard5, dCard1, dCard2, dCard3, dCard4, dCard5, dCard6, dCard7;
    //BET AND SETNAME SET FOR POP UP WHEN STARTGAME IS PRESSED
	
	
	public static Dealer guy = new Dealer();
	public static Deck thisDeck = new Deck();
    public static Player a = new Player("noName", 250);
	
	public static int BeginRoundPlay = -1; 
	public static Boolean RoundPlay = false; 
	public static ImageIcon back = new ImageIcon( "okay".getClass().getResource( "/cardImages/cardBack.png"));


    public CasinoGui () {
	this.setTitle("Casino");
	this.setSize(800,800);
	this.setLocation(250,0);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	//this essentially sets up the GUI, with placement of buttons, creation of buttons, actionListeners , etc. 
	pane = this.getContentPane();
	//pane.setLayout(new FlowLayout());
	pane.setLayout(null);
	hit = new JButton ("Hit");
	stand = new JButton("Stand");
	startGame = new JButton("Start Game");
	doubleDown = new JButton("Double Down");
	playerName = new JTextField("Input Name");
	Total = new JLabel("Total Card Value : 0");
	Money = new JLabel("Money : 50");
	Name = new JLabel("Name : Undetermined");
	newRound = new JButton("New Round"); 
	BetCount = new JLabel("Bet : Undetermined");
	DealerCards = new JLabel("Cards : "); 
	PlayerCards = new JLabel("Cards : ");
	DealerTotal = new JLabel("Total Card Value : ");
	DealerHead = new JLabel("The Dealer's Hand");
	PlayerHead = new JLabel("Your Hand");
	pCard1 = new JLabel();
	pCard2 = new JLabel();
	pCard3 = new JLabel();
	pCard4 = new JLabel();
	pCard5 = new JLabel();
	dCard1 = new JLabel();
	dCard2 = new JLabel();
	dCard3 = new JLabel();
	dCard4 = new JLabel();
	dCard5 = new JLabel();
	dCard6 = new JLabel();
	dCard7 = new JLabel();

	hit.setBounds( 25, 700 , 100 , 50);
	stand.setBounds(150 , 700 , 100 , 50) ;
	doubleDown.setBounds(275 , 700 , 100 , 50);
	startGame.setBounds(650 , 50 , 100 , 50) ;
	newRound.setBounds(650 , 100 , 100 , 50);
	Money.setBounds(650 , 150 , 100 , 25);
	Total.setBounds(25 , 675 , 200 , 25);
	Name.setBounds(650 ,175 , 300 , 25);
	BetCount.setBounds(650 , 200 , 200 , 25);
	DealerCards.setBounds(25 , 25 , 500 , 25); 
	PlayerCards.setBounds(25 , 650 , 500 , 25);  
	DealerTotal.setBounds(25, 50, 500, 25);
	DealerHead.setBounds(25, 0, 500, 25);
	PlayerHead.setBounds(25, 625, 500, 25);
	pCard1.setBounds(25, 504, 71, 96);
	pCard2.setBounds(101, 504, 71, 96);
	pCard3.setBounds(177, 504, 71, 96);
	pCard4.setBounds(253, 504, 71, 96);
	pCard5.setBounds(329, 504, 71, 96);
	dCard1.setBounds(25, 75, 71, 96);
	dCard2.setBounds(101, 75, 71, 96);
	dCard3.setBounds(177, 75, 71, 96);
	dCard4.setBounds(253, 75, 71, 96);
	dCard5.setBounds(329, 75, 71, 96);
	dCard6.setBounds(405, 75, 71, 96);
	dCard5.setBounds(481, 75, 71, 96);
	
	
	//(HORIZ BOUNDS , VERT BOUNDS , LENGTH , WIDTH) 
	
	hit.addActionListener(this);
	stand.addActionListener(this);
	startGame.addActionListener(this);
	doubleDown.addActionListener(this);
    playerName.addActionListener(this);
	newRound.addActionListener(this);
	

	pane.add(DealerCards); 
	pane.add(PlayerCards); 
	pane.add(DealerTotal);
	pane.add(Name);
	pane.add(hit);
	pane.add(stand);
	pane.add(startGame);
	pane.add(doubleDown);
	pane.add(playerName);
	pane.add(Money);
	pane.add(Total);
	pane.add(newRound);
	pane.add(BetCount);
	pane.add(DealerHead);
	pane.add(PlayerHead);
	pane.add(pCard1);
	pane.add(pCard2);
	pane.add(pCard3);
	pane.add(pCard4);
	pane.add(pCard5);
	pane.add(dCard1);
	pane.add(dCard2);
	pane.add(dCard3);
	pane.add(dCard4);
	pane.add(dCard5);
	pane.add(dCard6);
	pane.add(dCard7);
    }
    
    public static void main(String[] args){
	CasinoGui g = new CasinoGui();
	g.setVisible(true);
	
    }

	
    public void actionPerformed(ActionEvent e) {
	String s = e.getActionCommand(); 
	String tempName = "";
	
	
	System.out.println(s);
	if(s.equals("Start Game")) {String input = JOptionPane.showInputDialog("Please enter a name");
	    tempName = input; 
	    Name.setText("Name : " + input);
        a.setName(tempName);
		a.setMoney(50);
		a.setBet(0);
		a.reset();
		guy.reset();
		BetCount.setText("Bet : 0");
		Total.setText("Total Card Value : 0");
		DealerTotal.setText("Total Card Value : ");
		PlayerCards.setText("Cards : ");
		DealerCards.setText("Cards : ");
		Money.setText("Money : " + a.getMoney());
		
	    gameStarted = true;
		}
		
	
	
	if(s.equals("New Round") && gameStarted == true) {
	    guy.reset();
	    thisDeck.reset();
	    String thing = JOptionPane.showInputDialog("Please enter a bet amount");
		try {
			boolean meaningless = Integer.parseInt(thing) < 0;
        } catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Try a real number this time");
		}
	    if(Integer.parseInt(thing) > a.getMoney())
			{JOptionPane.showMessageDialog(null , "You're not THAT rich yet!");}
		if(Integer.parseInt(thing) < 1){
			JOptionPane.showMessageDialog(null, "The Dealer won't fall for that one again!");
		}
	    else{a.setBet(Integer.parseInt(thing));
			a.setMoney(a.getMoney() - a.getBet());
			Money.setText("Money : " + a.getMoney());
			BetCount.setText("Bet : " + a.getBet());
		
		while(BeginRoundPlay < 0){	
		guy.Draw(thisDeck); 
		guy.Draw(thisDeck); 
		DealerCards.setText("Cards : " + "FACEDOWN , " + guy.position(1).getName()); 
		dCard1.setIcon(back);
		dCard2.setIcon(guy.position(1).getFace());
		a.Draw(thisDeck); 
		a.Draw(thisDeck);
		PlayerCards.setText("Cards : " +  a.position(0).getName() + " , " +  a.position(1).getName());
		Total.setText("Total Card Value : " + /*(a.position(0).getValue() + a.position(1).getValue())*/ a.getTotal());
		pCard1.setIcon(a.position(0).getFace());
		pCard2.setIcon(a.position(1).getFace());
	    BeginRoundPlay++;
		RoundPlay = true;
		}}}
		
	if(s.equals("Hit") && gameStarted == true && RoundPlay == true && BeginRoundPlay == 0) {
	    a.Draw(thisDeck);
	    Total.setText("Total Card Value : " + a.getTotal());
	    PlayerCards.setText( PlayerCards.getText() + ", " + a.position(a.getHand().size() - 1).getName());
		if( a.getHand().size() == 3){
			pCard3.setIcon(a.position(2).getFace());
		}
		if( a.getHand().size() == 4){
			pCard4.setIcon(a.position(3).getFace());
		}
		if( a.getHand().size() == 5){
			pCard5.setIcon(a.position(4).getFace());
		}
		//pCard1.setIcon(a.position(0).getFace());
		if(a.checkBust() == true){
			JOptionPane.showMessageDialog(null, "Bust!");
			a.setBet(0);
			a.reset();
			BetCount.setText("Bet : 0");
			Total.setText("Total Card Value : 0");
			DealerTotal.setText("Total Card Value : ");
			PlayerCards.setText("Cards : ");
			DealerCards.setText("Cards : ");
			pCard1.setIcon(null);
			pCard2.setIcon(null);
			pCard3.setIcon(null);
			pCard4.setIcon(null);
			pCard5.setIcon(null);
			BeginRoundPlay--;
		}else{
			Total.setText("Total Card Value : " + a.getTotal());
		}
		if(a.fiveCC()){
			JOptionPane.showMessageDialog(null, "Woah there! That's a Five Card Charlie! If you stand now, that's a winning hand!");
		}
	}
	
	if(s.equals("Double Down") && gameStarted == true && RoundPlay == true && BeginRoundPlay == 0){
		if(a.getMoney() >= a.getBet()){
			a.setMoney(a.getMoney() - a.getBet());
			a.setBet(a.getBet() * 2);
			a.Draw(thisDeck);
			Total.setText("Total Card Value : " + a.getTotal());
			PlayerCards.setText( PlayerCards.getText() + ", " + a.position(a.getHand().size() - 1).getName());
			if(a.checkBust() == true){
				JOptionPane.showMessageDialog(null, "Bust!");
				a.setBet(0);
				a.reset();
				BetCount.setText("Bet : 0");
				Total.setText("Total Card Value : 0");
				DealerTotal.setText("Total Card Value : ");
				PlayerCards.setText("Cards : ");
				DealerCards.setText("Cards : ");
				Money.setText("Money : " + a.getMoney());
				pCard1.setIcon(null);
				pCard2.setIcon(null);
				pCard3.setIcon(null);
				pCard4.setIcon(null);
				pCard5.setIcon(null);
				BeginRoundPlay--;
			}else{
				Total.setText("Total Card Value : " + a.getTotal());
				s = "Stand";
			}
		}else{
			JOptionPane.showMessageDialog(null, "You're too broke to double down!");
		}
	}
	
	
	if(s.equals("Stand") && gameStarted == true && RoundPlay == true && BeginRoundPlay == 0){
		guy.fullTurn(thisDeck);
		dCard1.setIcon(guy.position(0).getFace());
		dCard2.setIcon(guy.position(1).getFace());
		if( guy.getHand().size() == 3){
				dCard3.setIcon(guy.position(2).getFace());
		}
		if( guy.getHand().size() == 4){
				dCard3.setIcon(guy.position(2).getFace());
				dCard4.setIcon(guy.position(3).getFace());
		}
		if( guy.getHand().size() == 5){
				dCard3.setIcon(guy.position(2).getFace());
				dCard4.setIcon(guy.position(3).getFace());
				dCard5.setIcon(guy.position(4).getFace());
		}
		if( guy.getHand().size() == 6){
				dCard3.setIcon(guy.position(2).getFace());
				dCard4.setIcon(guy.position(3).getFace());
				dCard5.setIcon(guy.position(4).getFace());
				dCard6.setIcon(guy.position(5).getFace());
		}
		if( guy.getHand().size() >= 7){
				dCard3.setIcon(guy.position(2).getFace());
				dCard4.setIcon(guy.position(3).getFace());
				dCard5.setIcon(guy.position(4).getFace());
				dCard6.setIcon(guy.position(5).getFace());
				dCard7.setIcon(guy.position(6).getFace());
		}
		DealerCards.setText("Cards : ");
		for(int stepper = 0; stepper < guy.getHand().size(); stepper++){
			DealerCards.setText(DealerCards.getText() + guy.position(stepper).getName() + ", ");
		}
		DealerTotal.setText( DealerTotal.getText() + guy.getTotal());
		/*if(a.checkWin(guy)){
			JOptionPane.showMessageDialog(null, "You beat the dealer!");
			a.setMoney(a.getMoney() + (a.getBet() * 2));
			a.setBet(0);
			a.reset();
			BetCount.setText("0");
			Total.setText("Total Card Value : 0");
			DealerTotal.setText("Total Card Value : ");
			PlayerCards.setText("Cards : ");
			DealerCards.setText("Cards : ");
			BeginRoundPlay--;
		}*/
		if(guy.checkBust()){
			JOptionPane.showMessageDialog(null, "The Dealer busted!");
			a.setMoney(a.getMoney() + (a.getBet() * 2));
			
		}else{
		if(a.getTotal() > guy.getTotal() || a.fiveCC() ){
			JOptionPane.showMessageDialog(null, "You beat the Dealer!");
			a.setMoney(a.getMoney() + (a.getBet() * 2));
			
		}
		if(a.getTotal() == guy.getTotal() && !a.fiveCC()){
			JOptionPane.showMessageDialog(null, "You tied the Dealer!");
			a.setMoney(a.getMoney() + a.getBet());
			
		}
		if(a.getTotal() < guy.getTotal() && !a.fiveCC()){
			JOptionPane.showMessageDialog(null, "The Dealer beat you!");
		}}
		a.setBet(0);
		a.reset();
		guy.reset();
		BetCount.setText("Bet : 0");
		Total.setText("Total Card Value : 0");
		DealerTotal.setText("Total Card Value : ");
		PlayerCards.setText("Cards : ");
		DealerCards.setText("Cards : ");
		Money.setText("Money : " + a.getMoney());
		pCard1.setIcon(null);
		pCard2.setIcon(null);
		pCard3.setIcon(null);
		pCard4.setIcon(null);
		pCard5.setIcon(null);
		BeginRoundPlay--;
	}
	
    }
}


	  















  /* while(RoundPlay = true) {

		if(s.equals("Hit") && gameStarted == true && BeginRoundPlay == 0){
		    a.Draw(thisDeck);
		    if(a.checkBust() == true) {
			JOptionPane.showMessageDialog(null , "Bust!");
			a.setBet(0);
			a.reset();
			BetCount.setText("0");
			Total.setText("Total : 0");
			PlayerCards.setText("Cards : ");
			DealerCards.setText("Cards : ");
		    }
		}
	    }
	}
    }
}
	    */	
	    
	    
		
		    
			    