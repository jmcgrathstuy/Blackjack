import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Card {
    private int Value; //The amount that the card is worth 
    private String Name;//The name of the card 
	private ImageIcon face;//The image used for displaying the card
	private String facePath;//String containing the path used to set the face image

    public Card (String name , int worth, String imagePath) {

	//If the worth is inputted as being above 11 (impossible, because 11 is the highest number, and less than 0,  because it is impossible, return an error. 
	if(worth > 11|| worth < 0) {
	    throw new IllegalArgumentException() ;
    }
	setName(name);
	setValue(worth);
	face = new ImageIcon( imagePath);
	facePath = imagePath;


    }
    //mutators and accessors
    public String getName(){
	return Name;
    }

    public void setName(String  temp) {
	Name = temp;
    }

    public int getValue() {
	return Value ;}
    
    public void setValue(int  temp) {
	Value = temp;}
    //Returns true if the card is an ace
    public boolean isAce(){
        return Name == "Ace";
    }
	
	public void setFace(ImageIcon newFace){
		face = newFace;
	}
	
	public void setFace(String imagePath){
		face = new ImageIcon( imagePath);
	}
	
	public ImageIcon getFace(){
		return face;
	}
	
	public void setFacePath(String newFacePath){
		facePath = newFacePath;
	}
	
	public String getFacePath(){
		return facePath;
	}
}
