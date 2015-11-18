/*
  Lisa Shi, Aleksandar
  APCS1 pd5
  HW32 -- Irrationality Stops Here
  2015 - 11 - 17 
*/


public class Rational{

    //Instance variables for the numerator and denominator
    private int num;
    private int den;

    //Default constructor (no parameters)
    //Creates a new Rational with the value of 0/1
    public Rational(){
	num = 0;
	den = 1;
    }

    //    Constructor
    // takes 2 parameters, numerator + denominator
    // if an invalid denominator is attempted
    // should print a message and set the number to 0/1

    public Rational(int a, int b){
	if (a == 0 && b == 0) {
	    num = a;
	    den = b;
	}
	else if (b == 0){
	    num = 0;
	    den = 1;
	}
	else {
	    num = a;
	    den = b;
	}
    }

    //    toString
    //returns a string representation of the rational number
    public String toString(){
	return ( num + "/" + den );
    }

    //floatValue
    //Returns a floating point value of the number
    public double floatValue(){
	double swag = num;
	double bag = den;
	
	return swag/bag;
    }
  
    //multiply
    //Takes Rational object as parameter and multiplies by this Rational object
    //Does not return value
    public  void multiply(Rational aleks){
	num *= aleks.num;
	den *= aleks.den;
    }

    //divide
    //Takes Rational object as parameter and divides by this Rational object
    //Does not return value
    public void divide(Rational aleks){
    	if (aleks.num == 0){
	    System.out.print( "error, divide by zero");
    	}
    	else {
	    num *= aleks.den;
	    den *= aleks.num;	    
	}
    }

    public static void main(String[] args){

	
    	//new rational numbers
    	Rational basic = new Rational(1,1); // 1/1
    	Rational test = new Rational(2,3); // 2/3
    	Rational tester = new Rational(1,2); // 1/2
    	Rational testing = new Rational(5,0); // 5/0 - invalid - 0/1
    	Rational testin = new Rational (0,0); // 0/0 - works

    	//testing toString
    	System.out.println( basic.toString() );
    	System.out.println( test.toString() );
    	System.out.println( tester.toString() );
    	System.out.println( testing.toString() );
    	System.out.println( testin.toString() );

	System.out.println("\n" );

    	//testing multiply
    	basic.multiply(test);
    	System.out.println( basic ); //should print out 2/3
    	basic.multiply(testing);

	System.out.println("\n" );
	
    	//testing divide
    	test.divide(tester);
    	System.out.println( test );

    	basic.divide(test);
    	System.out.println( basic ); 
	
    }
}
