package edu.upc.eetac.dsa.raul.entrega2;

public class CuentaAtras extends Thread {

	int segundos;
	String id;
	
	public CuentaAtras(String id, int segundos) {
		super();
		this.segundos = segundos;
		this.id = id;
	}
	
	public void run() {
		while(segundos >= 0) {
			System.out.println("Faltan "+segundos--+" segundos del thread "+id);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("->El thread "+id+" ya ha finalizado.<-");
		return;		
	}


}
