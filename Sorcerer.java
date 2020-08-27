public class Sorcerer
{
    String name;
    int might;
    int numOfSpells;
    double health;

    public Sorcerer(String name, int might, int numOfSpells, double health)
    {
        this.name = name;
        this.might = might;
        this.numOfSpells = numOfSpells;
        this.health = health;
    }// end full constructor

    public Sorcerer()
    {
        name = "null";
        might = 0;
        numOfSpells = 0;
        health  = 3.0;
    }//end null constructor

    // setters
    public void setName(String name)
    {
        this.name = name;
    } //end
    public void setMight(int might)
    {
        this.might = might;
    } //end
    public void setNumOfSpells(int numOfSpells)
    {
        this.numOfSpells = validateSpells(numOfSpells);
    } //end
    public void setHealth(double health)
    {
        this.health = health;
    }

    //getters
    public String getName()
    {
        return name;
    }// end
    public int getMight()
    {
        return might;
    }// end
    public int getNumOfSpells()
    {
        return numOfSpells;
    }// end
    public double getHealth()
    {
        return health;
    }// end

    // brain method
    public String mightReact()
    {
        if (might < 10)
        {
            return "Weak!";
        }//end if
        else //(might > 11)
        {
            return "Strong!";
        }
    }// end brain method mightReact

    public int validateSpells (int numOfSpells)
    {
        while (numOfSpells < 0)     //keep checking until wingspan is greater than equal to -1
        {
            System.out.println("You can't have negative number of spells! Try again.");
            numOfSpells++;      //cheat until allow user entry
        }
        return numOfSpells;
    }//end method to validate numOfSpells entry

    @Override
    public String toString()
    {
        return "This sorcerer has: " +
                "\n\tName: = " + name +
                "\n\tmight = " + might +
                "\n\tnumber of spells: = " + numOfSpells +
                "\n\thealth: = " + health;

    } // end toString (there is only one!)
}
