import java.util.Random;


/**
 * The Demon class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [40/20]
 * Implements a maximum/minimum hitpoint total for the creature type [100/25]
 * 
 * @author Alessandro Marucci
 * @version 04.09.2025 v1.1
 */
public class Demon extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_DEMON_HP = 100;
    private static final int MIN_DEMON_HP = 25;
    private static final int MAX_DEMON_STR = 40;
    private static final int MIN_DEMON_STR = 20;
    private int magicDamage;

    /**
     * Constructor for objects of class Demon -
     * Note that the calling class does not need to know anything about the 
     * requirements of demon minimum and maximum values
     * 
     * The instantiating class asks for a Demon and the demon class is responsible for
     * return a Demon object with values in the appropriate range
     * 
     */
    public Demon()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_DEMON_STR-MIN_DEMON_STR)+MIN_DEMON_STR,
            Randomizer.nextInt(MAX_DEMON_HP-MIN_DEMON_HP)+MIN_DEMON_HP        
        );
          
    }
    
    /**
     * Determines if magic damage will be inflicted or not.
     * @return a value between 1 and str to be used to cause damage to another creature
     */
    public int magicDamage(){
        Random random = new Random();
        //int str = elfStr();
        magicDamage = str + 50;
        double probability = 0.05;
        
        int damage = random.nextInt(str * 2);
        return damage;
        }
    
    // attack() - not overridden because Humans generate basic damage
    // takeDamage(int) - not overridden, because Humans take all damage assigned to them

}
