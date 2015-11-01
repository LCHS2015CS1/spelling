import greenfoot.*;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Actor containing a text string in a specified font and color.
 * 
 * @author Michael Nichols 
 */
public class Text extends Actor {

    private String str;
    private Font font;
    private Color color;
    
    /**
     * Main constructor for Text.
     */
    public Text(String str, Font font, Color color) {
        this.str = str;
        this.font = font;
        this.color = color;
        createImage();
    }
    
    private void createImage() {
        GreenfootImage img = getImage();
        Graphics g = img.getAwtImage().getGraphics();
        FontMetrics metrics = g.getFontMetrics(font);
        int height = metrics.getHeight();
        int width = metrics.stringWidth(str);
        img = new GreenfootImage(width, height);
        img.setFont(font);
        img.setColor(color);
        img.drawString(str, 0, height-1-metrics.getDescent());
        setImage(img);
    }
}
