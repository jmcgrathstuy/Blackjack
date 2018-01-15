import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CasinoGui extends JFrame implements ActionListener{
    private boolean gameStarted = false; 
    private Container pane;
    private JButton hit,stand,startGame,doubleDown,newRound; 
    private JTextField playerName,Bet;
    private JLabel Total , Money , Name , BetCount, PlayerCards , DealerCards; 
    //BET AND SETNAME SET FOR POP UP WHEN STARTGAME IS PRESSED


    public CasinoGui () {
	this.setTitle("Casino");
	this.setSize(800,800);
	this.setLocation(250,0);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	
	pane = this.getContentPane();
	//pane.setLayout(new FlowLayout());
	pane.setLayout(null);
	hit = new JButton ("Hit");
	stand = new JButton("Stand");
	startGame = new JButton("StartGame");
	doubleDown = new JButton("DoubleDown");
	playerName = new JTextField("Input Name");
	Total = new JLabel("Total Card Value : 0");
	Money = new JLabel("Money : 50");
	Name = new JLabel("Name : Undetermined");
	newRound = new JButton("New Round"); 
	BetCount = new JLabel("Bet : Undetermined");
	DealerCards = new JLabel("Cards : "); 
	PlayerCards = new JLabel("Cards : ");

	hit.setBounds( 25, 700 , 100 , 50);
	stand.setBounds(150 , 700 , 100 , 50) ;
	doubleDown.setBounds(275 , 700 , 100 , 50);
	startGame.setBounds(650 , 50 , 100 , 50) ;
	newRound.setBounds(650 , 100 , 100 , 50);
	Money.setBounds(650 , 150 , 100 , 25);
	Total.setBounds(25 , 675 , 200 , 25);
	Name.setBounds(650 ,175 , 300 , 25);
	BetCount.setBounds(650 , 200 , 200 , 25);
	DealerCards.setBounds(25 , 0 , 500 , 25); 
	PlayerCards.setBounds(25 , 650 , 500 , 25);  
	
	
	//(HORIZ BOUNDS , VERT BOUNDS , LENGTH , WIDTH) 
	
	hit.addActionListener(this);
	stand.addActionListener(this);
	startGame.addActionListener(this);
	doubleDown.addActionListener(this);
        playerName.addActionListener(this);
	newRound.addActionListener(this);
	

	pane.add(DealerCards); 
	pane.add(PlayerCards); 
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
    }
    
    public static void main(String[] args){
	CasinoGui g = new CasinoGui();
	g.setVisible(true);
	
    }

	
    public void actionPerformed(ActionEvent e) {
	String s = e.getActionCommand(); 
	String tempName = "";
	
	System.out.println(s);
	if(s.equals("StartGame")) {String input = JOptionPane.showInputDialog("Please enter a name");
	    tempName = input; 
	    Name.setText("Name :" + input);
	    gameStarted = true;}
		
	Dealer guy = new Dealer();
	Deck thisDeck = new Deck();
    Player a = new Player(tempName , 50);
	
	int BeginRoundPlay = -1; 
	Boolean RoundPlay = false; 
	
	if(s.equals("New Round") && gameStarted == true) {
	    guy.reset();
	    thisDeck.reset();
	    String thing = JOptionPane.showInputDialog("Please enter a bet amount");
	    if(Integer.parseInt(thing) > a.getMoney())
			{JOptionPane.showMessageDialog(null , "You need more money lol");}
	    else{a.setBet(Integer.parseInt(thing));
			a.setMoney(a.getMoney() - a.getBet());
			Money.setText("Money : " + a.getMoney());
			BetCount.setText("Bet : " + a.getBet());
		
		while(BeginRoundPlay < 0){	
		guy.Draw(thisDeck); 
		guy.Draw(thisDeck); 
		DealerCards.setText("Cards :" + "FACEDOWN , " + guy.position(1).getName()); 
		a.Draw(thisDeck); 
		a.Draw(thisDeck);
		PlayerCards.setText("Cards : " +  a.position(0).getName() + " , " +  a.position(1).getName());
		Total.setText("Total : " + /*(a.position(0).getValue() + a.position(1).getValue())*/ a.getTotal());
	    BeginRoundPlay++;
		RoundPlay = true;
		if(RoundPlay){
			System.out.println("Roundplay activated");
		}else{
			System.out.println("Not activated");
		}
		}}}
		
		if(RoundPlay){
			System.out.println("Roundplay activated");
		}else{
			System.out.println("Not activated");
		}
	if(s.equals("Hit") && gameStarted == true && RoundPlay == true) {
		System.out.println("testingFSADFDSFSDAFSF");
	    a.Draw(thisDeck);
	    Total.setText("Total : " + a.getTotal());
	    PlayerCards.setText( PlayerCards.getText() + ", " + a.position(a.getHand().size() - 1).getName());
	
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
	    
	    
		
		    
			    