
package calculadora.pkg1;



public class Calculadora1 {
    
	int  suma;
        int resta;
        int multiplicar;
        int division;
  
	
	public int sumar(int n1, int n2) {
            suma = n1+ n2;
            System.out.println("La suma es: "+suma);
            return suma;
        
	}
        public int restar(int n1, int n2) {
            resta = n1- n2;
            System.out.println("La resta es: "+resta);
            return resta;
        
	}
        public int multiplicar(int n1, int n2) {
	    multiplicar=n1 * n2;
            System.out.println("La multipicacion es: "+multiplicar);
            return multiplicar;

	}
	   public int dividir(int n1, int n2) {
        int division = 0;

        if (n2 != 0) {
            division = n1 / n2;
            System.out.println("La división es: " + division);
        } else {
            System.out.println("No es posible dividir entre cero.");
        }
                            
        return division;
   }
 
}
