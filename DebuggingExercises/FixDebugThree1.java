// This class calculates a waitperson's tip as 15% of the bill
public class DebugThree1
{
   public static void main(String args[])
   {
      double myCheck = 50.00;
      double yourCheck = 19.95;
      System.out.println("Tips are");
       System.out.println("My Check");
      calcTip(myCheck);
       System.out.println("Your Check");
      calcTip(yourCheck);
    }
    public static void calcTip(double bill)
    {
      final double RATE = 0.15,tip;
      tip = bill * RATE;
      System.out.println("The tip should be at least " + tip);
    }
}
