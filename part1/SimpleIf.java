class SimpleIf
{
   public static double max(double x, double y)
   {
      /* TO DO: Write an if statement to determine which
         argument is larger and return that value.
      */

      if(x<y) { return y; }
      if(x>y) { return x; }

      return 0; // clearly not correct -- but testable
   }
}
