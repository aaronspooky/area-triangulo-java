package paquete;

import java.io.*;

public class Triangulo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		double base, altura;
		Double d;
		String cd;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Base del triangulo: ");
		System.out.flush();
		cd = entrada.readLine();
		d = Double.valueOf(cd);
		base = d.doubleValue();
		//ahora se pide la altura; se concatenan llamdas
		System.out.println("Altura del triangulo: ");
		System.out.flush();
		d = Double.valueOf(entrada.readLine());
		altura = d.doubleValue();
		
		System.out.println("El area = " + base*altura/2);
	}

}
