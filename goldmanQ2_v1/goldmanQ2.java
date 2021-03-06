import java.util.*;

class goldmanQ2 {
    public Integer invertDecimal(Integer number)
    {
	StringBuilder sbr = new StringBuilder( Integer.toBinaryString(number) );
	sbr = sbr.reverse();
	while( sbr.length() % 8 != 0 )
	{
		sbr.append( "0" );
	}
	Integer result = Integer.parseInt( sbr.toString(), 2 );
	return result;
    }
}

class main {
    public static void main(String[] args)
    {
	//int input = 0;
	List<Integer> input = new ArrayList<>();
	System.out.println( " please provide input integers that you want to be inverted. If multiple inputs are to be provided please have them space seperated \n" );
	for( String str : args )
	{
	    input.add( Integer.parseInt( str ) );
	}
	goldmanQ2 gq = new goldmanQ2();
	for( int i = 0 ; i < input.size() ; i++ )
	{
	    Integer result = gq.invertDecimal( input.get(i) );
	    System.out.println( " provided input is: " + input.get(i) );
	    System.out.println( " inverted output for " + input.get(i) + " is: " + result + "\n" );
	    
	}
    }
}
