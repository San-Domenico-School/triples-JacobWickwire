/**
 * Scorekeeper keeps the score. :) 
 * 
 * @author (Jacob Wickwire) 
 * @version (1.0)
 */
public class Scorekeeper  
{
    private static int deckSize, score; 
    private static long startTime = System.currentTimeMillis();
    
    public static void setDeckSize(int deckSize)
    {
        Scorekeeper.deckSize = deckSize; 
    }
    
    public static void updateScore()
    {
        score += 1000; 
    }
    
    public static int getScore()
    {
        return score; 
    }
    
    
}
