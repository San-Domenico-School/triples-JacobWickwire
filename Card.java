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
        TRIANGLE, SQUARE, CIRCLE, NO_SHAPE; 
    }
   
    public enum Color
    {
        RED, GREEN, BLUE, NO_COLOR; 
    }
   
    public Card(Shape shape, Color color, int numberOfShapes, int shading, GreenfootImage cardImage, GreenfootImage selectedCardImage)
    {
        this.shape = shape; 
        this.color = color; 
        this.numberOfShapes = numberOfShapes; 
        this.shading = shading; 
        this.cardImage = cardImage;
        this.selectedCardImage = selectedCardImage; 
        setImage(cardImage);
        
    }
    
    public Shape getShape()
    {
        return shape; 
    }
    
    public Color getColor()
    {
        return color; 
    }
    
    public boolean getIsSelected()
    {
        return isSelected; 
    }
    
    public int getNumberOfShapes()
    {
        return numberOfShapes; 
    }
    
    public int getShading()
    {
        return shading; 
    }
    
    public GreenfootImage getCardImage()
    {
        return cardImage; 
    }
    
    public GreenfootImage getSelectedCardImage()
    {
        return selectedCardImage; 
    }
    
    public void setIsSelected(boolean isSelected)
    {
        this.isSelected = isSelected; 
    }
    
}

