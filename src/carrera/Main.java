package carrera;



public class Main {

	
	final static int MAX_CABALLOS = 10;
	public static void main(String[] args) {
		
		CaballoThread[] caballo =  new CaballoThread[MAX_CABALLOS];
		ControlCarrera controlCarrera = new ControlCarrera();
		
		for(int i=0; i<MAX_CABALLOS;i++) {
			
			caballo[i] = new CaballoThread("Caballo n: "+(i+1),controlCarrera);
			
		}//fin for
		
		for(int i=0; i<MAX_CABALLOS;i++) {
			
			caballo[i].start();
			ControlCarrera.controlSalida(caballo[i].getName());
			
		}//fin for
		
		for(int i=0; i<MAX_CABALLOS;i++) {
			
			try {
				caballo[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}//fin for
		
		controlCarrera.informe();

	}//fin main

}
