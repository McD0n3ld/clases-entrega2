package edu.upc.eetac.dsa.raul.entrega2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
	public static void main(String[] args) {

		int ejercicio = 0;
		String t = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			try {
				System.out.println("Introduce el numero de ejercicio que quieras comprobar. [8 - 11]. 0 para salir");
				t = br.readLine();
				ejercicio = Integer.parseInt(t);
			} catch (Exception e) {
				System.out.println("No has introducido un numero del 8 al 11");
				continue;
			}

			switch (ejercicio) {

			case 8:
				System.out.println("\n\n--------------------------------------------\nInicio ejercicio 8");
				CuentaAtras contador1 = new CuentaAtras("ID1", 4);
				CuentaAtras contador2 = new CuentaAtras("ID2", 7);
				CuentaAtras contador3 = new CuentaAtras("ID3", 8);

				contador1.start();
				contador2.start();
				contador3.start();

				try {
					contador1.join();
					contador2.join();
					contador3.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Fin del ejercicio 8");
				break;

			case 9:
				System.out.println("\n\n--------------------------------------------\nInicio ejercicio 9");

				CuentaAtrasRunnable contador4 = new CuentaAtrasRunnable("ID1", 4);
				CuentaAtrasRunnable contador5 = new CuentaAtrasRunnable("ID2", 7);
				CuentaAtrasRunnable contador6 = new CuentaAtrasRunnable("ID3", 8);

				Thread t1 = new Thread(contador4);
				Thread t2 = new Thread(contador5);
				Thread t3 = new Thread(contador6);

				t1.start();
				t2.start();
				t3.start();

				try {
					t1.join();
					t2.join();
					t3.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println("Fin del ejercicio 9");
				break;

			case 10:
				System.out.println("\n\n--------------------------------------------\nInicio ejercicio 10");
				CuentaAtrasUltimaEscritura contador7 = new CuentaAtrasUltimaEscritura("ID1", 4);
				CuentaAtrasUltimaEscritura contador8 = new CuentaAtrasUltimaEscritura("ID2", 7);
				CuentaAtrasUltimaEscritura contador9 = new CuentaAtrasUltimaEscritura("ID3", 8);

				contador7.start();
				contador8.start();
				contador9.start();

				try {
					contador7.join();
					contador8.join();
					contador9.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Fin del ejercicio 10");
				break;

			case 11:
				System.out.println("\n\n--------------------------------------------\nInicio ejercicio 11");
				CuentaAtrasUltimaEscrituraSync contador10 = new CuentaAtrasUltimaEscrituraSync("ID1", 4);
				CuentaAtrasUltimaEscrituraSync contador11 = new CuentaAtrasUltimaEscrituraSync("ID2", 7);
				CuentaAtrasUltimaEscrituraSync contador12 = new CuentaAtrasUltimaEscrituraSync("ID3", 8);

				contador10.start();
				contador11.start();
				contador12.start();

				try {
					contador10.join();
					contador11.join();
					contador12.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Fin del ejercicio 11");
				break;

			case 0:
				System.out.println("Fin del test.");
				return;

			default:
				break;
			}
		}
	}
}
