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
        if (setCardsSelected() == true) 
        {
            dealer.setCardsSelected(cardsOnBoard, selectedCardsIndex, cardsSelected); 
            dealer.checkIfTriple(); 
            resetCardsSelected(); 
        }
    }
    
    public void addedToWorld(World world) 
    {
        cardsOnBoard = (ArrayList) getWorld().getObjects(Card.class); 
    }
    
    private void selectCards()
    {
        for (int i = 0; i < cardsOnBoard.size(); i ++)
        {
            if(Greenfoot.mouseClicked(cardsOnBoard.get(i)))
            {
                if (cardsOnBoard.get(i).getIsSelected())
                {
                    cardsOnBoard.get(i).setIsSelected(false); 
                    cardsOnBoard.get(i).setImage(cardsOnBoard.get(i).getCardImage());
                    selectedCardsIndex.remove(selectedCardsIndex.indexOf(i)); 
                }
                else
                {
                    cardsOnBoard.get(i).setIsSelected(true); 
                    cardsOnBoard.get(i).setImage(cardsOnBoard.get(i).getSelectedCardImage()); 
                    selectedCardsIndex.add(i); 
                }
            }
        }
    }
    
    private void resetCardsSelected()
    {
        for (int i = 0; i < cardsOnBoard.size(); i ++)
        {
            cardsOnBoard.get(i).setIsSelected(false); 
            cardsOnBoard.get(i).setImage(cardsOnBoard.get(i).getCardImage()); 
        }
    }
    
    private boolean setCardsSelected()
    {
        if (selectedCardsIndex.size() == 3)
        {
            cardsSelected[0] = cardsOnBoard.get(selectedCardsIndex.get(0));
            cardsSelected[1] = cardsOnBoard.get(selectedCardsIndex.get(1));
            cardsSelected[2] = cardsOnBoard.get(selectedCardsIndex.get(2));
            return true; 
        }
        else 
        {
            return false; 
        }
    }
    
}
