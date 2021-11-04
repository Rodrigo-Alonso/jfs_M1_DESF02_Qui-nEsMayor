package cl.edutecno;

import java.util.Scanner;

public class Fechas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa la primera fecha como DD/MM/AAAA");
		String fecha1 = sc.next();
		
		System.out.println("Ingresa la segunda fecha como DD/MM/AAAA");
		String fecha2 = sc.next();
		
		int dia1 = Integer.parseInt(fecha1.substring(0,2));
		int mes1 = Integer.parseInt(fecha1.substring(3,5));
		int año1 = Integer.parseInt(fecha1.substring(6));
		
		int dia2 = Integer.parseInt(fecha2.substring(0,2));
		int mes2 = Integer.parseInt(fecha2.substring(3,5));
		int año2 = Integer.parseInt(fecha2.substring(6));
			    
		if (año1 < año2) {
			System.out.println("Persona 1 es mayor");
		} else if (año1 > año2) {
			System.out.println("Persona 2 es mayor");
		} else if (año1 == año2) {
			if (mes1 < mes2) {
				System.out.println("Persona 1 es mayor");
			} else if (mes1 > mes2) {
				System.out.println("Persona 2 es mayor");
			} else if (mes1 == mes2) {
				if (dia1 < dia2) {
					System.out.println("Persona 1 es mayor");
				} else if (dia1 > dia2) {
					System.out.println("Persona 2 es mayor");
				} else if (dia1 == dia2) {
					System.out.println("Tienen la misma edad");
				}
			}
		}
		
		/* #Prueba de opc. 2 de codigo simplificado, problemas con OR
		if (año1 > año2 || mes1 > mes2  || dia1 > dia2) {
			System.out.println("Persona 2 es mayor");
		} else if (año2 > año1 || mes2 > mes1 || dia2 > dia1) {
		    System.out.println("Persona 1 es mayor");
		} else {
		    System.out.println("Tienen la misma edad ");
		}*/
		
		sc.close();
	}

}
