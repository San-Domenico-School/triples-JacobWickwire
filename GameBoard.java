import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Game Board for Triples
 * 
 * @author (Jacob Wickwire) 
 * @version (2.0)
 */
public class GameBoard extends World
{
    private final int NUM_CARDS_IN_DECK = 81;
    
    public GameBoard()
    {   
        super(430, 600, 1, false); 
        //new Tester("Slide");
        new Tester(NUM_CARDS_IN_DECK);
    }


}
