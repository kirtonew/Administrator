import java.awt.*;
import java.awt.geom.*;

/**
 * A circle that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */

public class Circle
{
    private int diameter;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;
    
    /**
     * Create a new circle at default position with default color.
     */
    public Circle()
    {
        diameter = 68;
        xPosition = 230;
        yPosition = 90;
        color = "yellow";
    }



    /**
     * Slowly move the circle vertically by 'distance' pixels.
     */
    public void slowMoveVertical()
    {
       
        for(int i = 0; i < 100; i++)
        {
            yPosition += 1;
            draw();
        }
    }
   



    /**
     * Draw the circle with current specifications on screen.
     */
    private void draw()
    {
         isVisible = true;
        
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color, new Ellipse2D.Double(xPosition, yPosition, 
                                                          diameter, diameter));
            canvas.wait(10);
        }
    }


}
