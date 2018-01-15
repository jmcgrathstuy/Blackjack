import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CasinoGui extends JFrame implements ActionListener{
    private Container pane;
    private JButton hit,stand,startGame,doubleDown;
    private JTextField playerName,Bet;
    private JLabel Total , Money , Name; 
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
	

	hit.setBounds( 25, 700 , 100 , 50);
	stand.setBounds(150 , 700 , 100 , 50) ;
	doubleDown.setBounds(275 , 700 , 100 , 50);
	startGame.setBounds(650 , 50 , 100 , 50) ;
	Money.setBounds(650 , 100 , 100 , 25);
	Total.setBounds(25 , 675 , 200 , 25);
	Name.setBounds(650 ,125 , 300 , 25);
	
	
	//(HORIZ BOUNDS , VERT BOUNDS , LENGTH , WIDTH) 
	
	hit.addActionListener(this);
	stand.addActionListener(this);
	startGame.addActionListener(this);
	doubleDown.addActionListener(this);
        playerName.addActionListener(this);
	
	pane.add(Name);
	pane.add(hit);
	pane.add(stand);
	pane.add(startGame);
	pane.add(doubleDown);
	pane.add(playerName);
	pane.add(Money);
	pane.add(Total);
    }
    
    public static void main(String[] args){
	CasinoGui g = new CasinoGui();
	g.setVisible(true);
	
    }

	
    public void actionPerformed(ActionEvent e) {
	String s = e.getActionCommand(); 
	System.out.println(s);
	if(s.equals("StartGame")) {String input = JOptionPane.showInputDialog("Please enter a name");
	    Player a = new Player(input , 50);
	    Dealer guy = new Dealer(); 
	    Deck thisDeck = new Deck(); 
	    Name.setText("Name :" + input);
	}
	    
    }
	    
    }

	    
		