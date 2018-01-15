import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TableGui extends JFrame implements ActionListener{
    private Container pane;
    private JButton b,b2, b3;
    private JCheckBox c;
	private JTextField t;
	private JLabel l, hl, vl;
	Player Player1 = new Player("Player1", 10000);
	Deck tableDeck = new Deck();

    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();
        System.out.println(s);
        
		if(s.equals("Set Name")){
			Player1.setName(t.getText());
			l.setText("PLAYER: " + Player1.getName() + "    MONEY: " + Integer.toString(Player1.getTotal()));
		}
		if(s.equals("Hit")){
			Player1.setBet(100);
			Player1.Draw(tableDeck);
			if(Player1.checkBust()){
				Player1.setMoney(Player1.getMoney() - Player1.getBet());
				Player1.resetHand();
				hl.setText("Hand:  ");
				vl.setText("Hand Value:  " + Player1.getTotal());
			}
			else{
			hl.setText(hl.getText() +Player1.getHand().get(Player1.getHand().size() - 1).getName() + ", ");
			vl.setText("Hand Value:  " + Player1.getTotal());
			}
		}
			

    }

    public TableGui() {
        this.setTitle("My first GUI");
        this.setSize(800,800);
        this.setLocation(50,50);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		l = new JLabel(  "PLAYER: " + Player1.getName() + "    MONEY: " + Integer.toString(Player1.getMoney()));
		l.setPreferredSize(new Dimension(800, 25));
		

        pane = this.getContentPane();
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
		t = new JTextField(15);
        b = new JButton("Hit");
		b.setMaximumSize(new Dimension(800, 25));
        b2 = new JButton("Stand");
		b2.setPreferredSize(new Dimension(200, 100));
		b3 = new JButton("Set Name");
		b3.setPreferredSize(new Dimension(100, 200));
		l = new JLabel(  "PLAYER: " + Player1.getName() + "    MONEY: " + Integer.toString(Player1.getMoney()));
		l.setMaximumSize(new Dimension(800, 25));
		hl = new JLabel("Hand:  ");
		hl.setPreferredSize(new Dimension(800, 100));
		vl = new JLabel("Hand Value:  0");

        b.addActionListener(this);
        b2.addActionListener(this);
		b3.addActionListener(this);

		pane.add(l);
		pane.add(hl);
		pane.add(vl);
        pane.add(b);
        pane.add(b2);
		pane.add(b3);
		pane.add(t);

		
		

    }

    public static void main(String[] args) {
        TableGui g = new TableGui();
        g.setVisible(true);
    }
}