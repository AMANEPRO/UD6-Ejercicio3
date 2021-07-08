package UD6;

import javax.swing.JOptionPane;

public class ejercicio3 {
	public static void main (String []args) {
		String numerousuariobeta=JOptionPane.showInputDialog("Introduce un numero, por favor");
		int numerousuario=Integer.parseInt(numerousuariobeta);
		if (numero(numerousuario)) {
			System.out.println("El numero es primo");
			
		}else {
			System.out.println("El numero no es primo");
		}
	
	
	}
	
	
	
	public static boolean numero(int numerousuario){
		  int contador = 2;
		  boolean primo=true;
		  while ((primo) && (contador!=numerousuario)){
		    if (numerousuario % contador == 0)
		      primo = false;
		    contador++;
		  }
		  return primo;
		}
}
