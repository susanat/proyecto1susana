package com.ipartek.formacion.capìtulo6;

public class Switch {

	public static void main(String[] args) {
		
		int dia = 7 ;
		
		switch (dia){
		
		case 1:
			generarNomina();
			break;
		
		case 5:
			generPagosProveedores();
			break;
		
		default:
			generarInforme();
			enviarInforme();
			break;	
		
		}

	}

	private static void enviarInforme() {
		System.out.println("Y enviar informe");
		
	}

	private static void generarInforme() {
		System.out.println("Dia para generar informes");
		
	}

	private static void generPagosProveedores() {
		System.out.println("Dia para generar pagos a proveedores");
		
	}

	private static void generarNomina() {
		
		System.out.println("Dia para generar nominas");
		
	}
	
	



}
