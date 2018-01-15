import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TableGui extends JFrame implements ActionListener{
    private Container pane;
    private JButton b,b2, b3;
    private JCheckBox c;
	private JLabel l, cl;
	Player Ethan = new Player("Ethan");
	Deck tableDeck = new Deck();

    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();
        System.out.println(s);
        
		if(s.equals("Set Name")){
			l.setText("settered it");
		}
		if(s.equals("Hit")){
			Ethan.setBet(1);
			Ethan.Draw(tableDeck);
			cl.setText(cl.getText() +Ethan.getHand().get(Ethan.getHand().size() - 1).getName() + ", ");
		}
			

    }

    public TableGui() {
        this.setTitle("My first GUI");
        this.setSize(800,800);
        this.setLocation(50,50);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		l = new JLabel(  "PLAYER: " + Ethan.getName() + "    MONEY: " + Integer.toString(Ethan.getTotal()));
		l.setPreferredSize(new Dimension(800, 25));
		

        pane = this.getContentPane();
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
        b = new JButton("Hit");
		b.setMaximumSize(new Dimension(800, 25));
        b2 = new JButton("Stand");
		b2.setPreferredSize(new Dimension(200, 100));
		b3 = new JButton("Set Name");
		b3.setPreferredSize(new Dimension(100, 200));
		l = new JLabel(  "PLAYER: " + Ethan.getName() + "    MONEY: " + Integer.toString(Ethan.getTotal()));
		l.setMaximumSize(new Dimension(800, 25));
		cl = new JLabel(Ethan.getName() + "'s Hand:  ");
		cl.setMaximumSize(new Dimension(800, 200));

        b.addActionListener(this);
        b2.addActionListener(this);
		b3.addActionListener(this);

		pane.add(l);
		pane.add(cl);
        pane.add(b);
        pane.add(b2);
		pane.add(b3);

		
		

    }

    public static void main(String[] args) {
        TableGui g = new TableGui();
        g.setVisible(true);
    }
}