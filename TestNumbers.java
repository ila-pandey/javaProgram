

/**
 * Enter n numbers from command line and add them
 *
 */
public class TestNumbers 
{
    public static void main( String[] args )
    {
        int n=0;
	
	for(int i=0;i<args.length;i++){
		System.out.println(args[i]);
		n=n+Integer.parseInt(args[i]);

	}
	
        System.out.println("sum is " +n);
	
    }
}
