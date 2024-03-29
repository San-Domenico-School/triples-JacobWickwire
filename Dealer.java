import java.util.ArrayList;
import greenfoot.*;
/**
 * This is Johnathan. He deals the deck of cards. :) 
 * 
 * @author (Jacob Wickwire) 
 * @version (1.0)
 */

public class Dealer extends Actor
{
    private Deck deck; 
    private ArrayList<Card> cardsOnBoard; 
    private ArrayList<Integer> selectedCardsIndex; 
    private Card[] cardsSelected; 
    private int numCardsInDeck; 
    private int triplesRemaining; 
    
    public Dealer(int numCardsInDeck)
    {
        this.numCardsInDeck = numCardsInDeck; 
        int triplesRemaining = numCardsInDeck / 3; 
        deck = new Deck (numCardsInDeck); 
        cardsSelected = new Card[3]; 
    }
    
    public void addedToWorld(World world)
    {
        dealBoard();
        setUI();
    }
    
    public void dealBoard()
    {
        Greenfoot.playSound("shuffle.wav"); 
        for (int x = 0; x < 3; x++)
        {
            for (int y = 0; y < 5; y++)
            {
                getWorld().addObject(deck.getTopCard(), x * 140 + 75, y * 90 + 50); 
            }
        }
    }
    
    public void setUI()
    {
        Integer cardsLeft = new Integer(deck.getNumCardsInDeck()); 
        getWorld().showText(cardsLeft.toString(), 312, 470);
        
        Integer funnyNumber = new Integer(Scorekeeper.getScore()); 
        getWorld().showText(funnyNumber.toString(), 312, 505);
    }
    
    public void endGame()
    {
        
    }
    
    public void checkIfTriple()
    {
        
    }
    
    public void actionIfTriple()
    {
        
    }
    
    public void setCardsSelected(ArrayList<Card> cards, ArrayList<Integer> integers, Card[] card) 
    {
        
    }
    
}
