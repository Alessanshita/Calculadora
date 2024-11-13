package ar.com.AAAY;

import java.util.Scanner;

public class ClasePrincipal 
{

	public static void main(String[] args) 
	{
	Scanner teclado = new Scanner(System.in);
	System.out.println("Ingrese un número: ");
	int n1 = teclado.nextInt();
	
	System.out.println("Ingrese el segundo número: ");
	int n2 = teclado.nextInt();
	Calculadora calculadora = new Calculadora();
	
	System.out.println("El resultado de la suma es: " + calculadora.SUMA(n1, n2));

	System.out.println("El resultado de la resta es: " + calculadora.RESTA(n1, n2));
	
	System.out.println("El resultado de la división es: " + calculadora.DIVISION(n1, n2));
	
	System.out.println("El resultado de la multiplicación es: " + calculadora.MULTIPLICACION(n1, n2));
	calculadora.RESTA(n1, n2);
	calculadora.MULTIPLICACION(n1, n2);
	calculadora.DIVISION(n1, n2);
	}
}
