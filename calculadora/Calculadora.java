package calculadora;

import javax.swing.JOptionPane;

public class Calculadora {
    //Atributos
	int num1;
	int num2;
	double suma,resta,multiplicar,dividir;
    //Metodos
	public void sumar() {
		suma=num1 + num2;
 
	}
	public void restar() {
		resta=num1 - num2;

	}
	public void multiplicar() {
		multiplicar=num1 * num2;

	}
	public void dividir() {
		dividir=num1 / num2;

	}
        public void ingresarDatos() {
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero"));
	}
        public void mostrarDatos() {
		JOptionPane.showMessageDialog(null,"La suma  es: "+suma+"\n La resta es: "+resta+"\n La multiplicacion es: "+multiplicar+"\n la division es: "+dividir);
  
	}
	
}
