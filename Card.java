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
   
   
   Card(Shape shape, Color color, int numberOfShapes, int shading, GreenfootImage cardImage, GreenfootImage selectedCardImage)
   {
       super();
   }
   
   public static void main(String[] args)
   {
       Card card = new Card(Card.Shape, Card.Color, int numberOfShapes, int shading, greenfoot.GreenfootImage, greenfoot.GreenfootImage);
   }
   
    public enum Shape
   {
          ESC, COMMAND, OPTION, CONTROL, DELETE, RETURN, SHIFT;
   }
   
   public enum Color
   {
          ESC, COMMAND, OPTION, CONTROL, DELETE, RETURN, SHIFT;
   }
   
}

