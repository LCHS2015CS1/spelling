import greenfoot.*;

/**
 * A letter in the SpellTower game.
 * 
 */
public class Letter extends Actor
{
    private static final GreenfootImage[] images;

    static {
        images = new GreenfootImage[26];
        for(char c='A'; c<='Z'; c++) {
            images[c - 'A'] = new GreenfootImage(c+".png");
        }
    }

    public Letter(String letter) {
        if(letter.length() != 1 || letter.charAt(0) < 'A' || 
        letter.charAt(0) > 'Z') {
            throw new IllegalArgumentException("Invalid letter");
        }
        setImage(images[letter.charAt(0) - 'A']);
    }
}