public class Rzutowania {
    public static void main(String[] args){
	byte a = 5, b = 6;
	a = (byte) (a + 2);
	a = (byte) (a * 2); 
	a = (byte) (a + b);

	short c = 1001, d = 1002;
	c = (short) (c + 2);
	c = (short) (c * 2);
	c = (short) (c + b);
	c = (short) (c * b);

	int e = 3;
	e = e * c;
	c = (short) (e);
	e = c;

	double g = 5.21;
	e = (int) (2 * g);
	g = e;

	byte x = 100,  y;
	y = (byte) (x + x + x);
	//y = x + x + x;
	System.out.println("Proste dodawanie 100 + 100 + 100  = " + y );
    }
//Maksymalna wartoœæ zapisana na y = 256. 300 jest wiêksze o 44, wiêc mamy 44 w wyniku.
}