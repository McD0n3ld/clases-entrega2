package edu.upc.eetac.dsa.raul.entrega2;

public class CuentaAtrasUltimaEscrituraSync extends Thread {

	static int threadsActivos = 0;
	static String ultimaEscritura = "";
	int segundos;
	String id;

	public CuentaAtrasUltimaEscrituraSync(String id, int segundos) {
		super();
		this.segundos = segundos;
		this.id = id;
		this.threadsActivos++;
	}

	public void run() {
		while(segundos >= 0) {
			synchronized(ultimaEscritura) {
				System.out.println(id+" - "+segundos--+" - Ultima escritura "+ultimaEscritura);
				ultimaEscritura = id;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		threadsActivos--;
		System.out.println("Ultima escritura "+ultimaEscritura+" - "+threadsActivos+" Threads activos.");
		return;		
	}
}
