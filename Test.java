

/**
 * Enter two numbers from command line and add them
 *
 */
public class Test 
{
    public static void main( String[] args )
    {
        int x,y,z,s;
        x=Integer.parseInt(args[0]);
        y=Integer.parseInt(args[1]);
	z=Integer.parseInt(args[2]);
        
	s=x+y+z;
        System.out.println("sum of " + x + "+" + y +"and"+z+" is " +s);
	
    }
}
