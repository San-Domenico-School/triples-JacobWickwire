import greenfoot.*; 

/**
 * Game Board for Triples
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Card extends Actor
{
   
   Shape shape; 
   Color color; 
   int numberOfShapes; 
   int shading; 
   GreenfootImage cardImage; 
   GreenfootImage selectedCardImage; 
   
   
   
    public enum Shape
   {
          ESC, COMMAND, OPTION, CONTROL, DELETE, RETURN, SHIFT;
   }
   
   public enum Color
   {
          ESC, COMMAND, OPTION, CONTROL, DELETE, RETURN, SHIFT;
   }
   
}

