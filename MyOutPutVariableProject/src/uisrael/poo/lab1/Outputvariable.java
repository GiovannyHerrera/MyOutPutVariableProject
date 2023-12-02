package uisrael.poo.lab1;

import java.text.*;
import java.util.Locale;
import java.util.Scanner;
public class Outputvariable {
	public static void main(String[] args) {
		long numero=123098;
		double pi=Math.PI;
		String status="";
		int grade=2;
		
		System.out.printf("%d %n",numero);
		System.out.printf("%d08d %n",numero);
		System.out.printf("%+d %n",numero);
		Locale.setDefault(Locale.US);//usa el formato de US para imprimir numeros
		DecimalFormat formato1=new DecimalFormat("###,###.##");
		String valorFormateado1= formato1.format(numero);
		System.out.printf("%s %n", valorFormateado1);
		
		System.out.println("Manejo de operador condicional");
		status=(grade>=7)? "Passed":"Fail";
		System.out.println(status);
		
		
		Scanner lectura = new Scanner (System.in);

		System.out.println("Ingrese un estado");
		status=lectura.next();
		System.out.println(status);
	}
}
