import greenfoot.*; 

/**
 * Game Board for Triples
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Card extends Actor
{
   
    

   private Shape shape; 
   private Color color; 
   private boolean isSelected; 
   private int numberOfShapes; 
   private int shading; 
   private GreenfootImage cardImage; 
   private GreenfootImage selectedCardImage; 
   
   public enum Shape
   {
          ESC, COMMAND, OPTION, CONTROL, DELETE, RETURN, SHIFT;
   }
   
   public enum Color
   {
          ESC, COMMAND, OPTION, CONTROL, DELETE, RETURN, SHIFT;
   }
   
   public Card(Shape shape, Color color, int numberOfShapes, int shading, GreenfootImage cardImage, GreenfootImage selectedCardImage)
   {
       
   }
   
   
   
}

