

/**
 * The Elf class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [18/5]
 * Implements a maximum/minimum hitpoint total for the creature type [25/8]
 * 
 * @author Alessandro Marucci
 * @version 04.09.2025 v1.1
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;
    private int magicDamage;// The magic damage of this creature

    /**
     * Constructor for objects of class Elf -
     * Note that the calling class does not need to know anything about the 
     * requirements of elf minimum and maximum values
     * 
     * The instantiating class asks for a Elf and the elf class is responsible for
     * return a Elf object with values in the appropriate range
     * 
     */
    public Elf()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR,
            Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP        
        );
          
    }
    
    
    // attack() - not overridden because Elfs generate basic damage
    // takeDamage(int) - not overridden, because Elfs take all damage assigned to them

}
