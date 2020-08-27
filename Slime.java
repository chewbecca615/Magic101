public class Slime extends Enemy
{
    // instance variables
    static boolean sticky;

    //constructors
    public Slime(String name, int might, boolean isHostile, boolean sticky)
    {
        super(name, might, isHostile);
        this.sticky = sticky;
    }// end full constructor

    public Slime()
    {
        super();
        sticky = true;
    }//end null constructor

    public boolean getSticky()
    {
        return sticky;
    }

    public void setSticky(boolean sticky)
    {
        this.sticky = stuck(sticky);
    }

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

    public boolean stuck(boolean sticky)
    {
        if(sticky = true)
            return true;
        else
            return false;
    }

    //toString   this is the test output method

    @Override
    public String toString()
    {
        return super.toString() +
                "\n\tsticky = " + sticky;
    } // end toString (there is only one!)
}
