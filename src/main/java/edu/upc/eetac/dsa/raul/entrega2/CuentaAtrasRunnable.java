package edu.upc.eetac.dsa.raul.entrega2;

public class CuentaAtrasRunnable implements Runnable {

	int segundos;
	String id;
	
	public CuentaAtrasRunnable(String id, int segundos) {
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
