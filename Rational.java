public class Rational{
    public static int num;
    public static int den;


    public Rational(){
	num = 0;
	den = 0;
    }

    public Rational(int a, int b){
	if (b == 0){
	    num = 0;
	    den = 1;
	}
	else {
	    num = a;
	    den = b;
	}
    }

    public  String toString(){
	return ( num + "/" + den );
    }

    public static double floatValue(){
	double swag = num/den;
	return swag;
    }

    public static void multiply(Rational aleks){
	num *= aleks.num;
	den *= aleks.den;
   	

    }


    
}
