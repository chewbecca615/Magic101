public class Monster extends Enemy
{
    //instance variables
    static String terrain;

    //constructors
    public Monster(String name, int might, boolean isHostile, String terrain)
    {
        super(name, might, isHostile);
        this.terrain = terrain;
    }// end full constructor

    public Monster()
    {
        super();
        terrain = "land";
    }//end null constructor

    // getter
    public String getTerrain()
    {
        return terrain;
    }// end

    //setter
    public void setTerrain(String terrain)
    {
        this.terrain = terrain;
    } //end

    //BrainMethods
    public String mightReact()
    {
        if (might < 10)
        {
            return "Weak!";
        }//end if
        else if (might >= 10 && might < 20)
        {
            return "Careful";
        }//endd else if
        else          //(might > 20)
        {
            return "Whoa!";
        }
    }// end brain method mightReact

    public String compareTerrain()
    {
        if (terrain.equalsIgnoreCase("land"))
        {
            return "You can run away";
        }
        else if (terrain.equalsIgnoreCase("water"))
        {
            return "You can swim away";
        }
        else
        {
            return "Bummer for you!";
        }
    }


    //toString   this is the test output method

    @Override
    public String toString()
    {
        return super.toString() +
                "\n\tterrain = " + terrain;
    } // end toString (there is only one!)
}
