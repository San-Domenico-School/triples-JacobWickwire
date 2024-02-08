import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList; 

/**
 * a player is YOU! :) 
 * 
 * @author (Jacob Wickwire) 
 * @version (1.0)
 */
public class Player extends Actor
{
    private Dealer dealer; 
    private Card[] cardsSelected; 
    private ArrayList<Card> cardsOnBoard; 
    private ArrayList<Integer> selectedCardsIndex; 
    
    public Player(Dealer dealer)
    {
        this.dealer = dealer; 
        cardsSelected = new Card[3]; 
        cardsOnBoard = new ArrayList<Card>(); 
        selectedCardsIndex = new ArrayList<Integer>(); 
        
    }
    
    public void act()
    {
        selectCards(); 
        boolean threeCardsHaveBeenSelected = setCardsSelected(); 
    }
    
    public void addedToWorld(World world) 
    {
        cardsOnBoard = (ArrayList) getWorld().getObjects(Card.class); 
    }
    
    private void selectCards()
    {
        
    }
    
    private void resetCardsSelected()
    {
        
    }
    
    private boolean setCardsSelected()
    {
        return true; 
    }
    
}
