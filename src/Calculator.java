package String-Calculator;

public class Calculator {
	
	public static int Add( String num ) {
		
		if ( num.equals( "" ) return 0;
		
		else if ( num.contains( "," ) ) return sum( SplitNumbers ( text ) );
		
		return 1;
	}
	
	private static int ToInt( String n ) {
		return Integer.parseInt( n );
	}
	
	private static String[] SplitNumbers( String n ) {
	    return n.split ( ",|\n" );
	}
	
	private static int sum( String[] num ){
 	    int total = 0;
		
        for ( String n : num ) {
		    total += toInt ( n );
		}
		
		return total;
    }
}