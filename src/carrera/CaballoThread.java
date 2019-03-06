package carrera;

public class CaballoThread extends Thread {
	
	private int metrosRe = 0;
	private ControlCarrera controlCarrera;
	

	public CaballoThread(String name,ControlCarrera controlCarrera) {
		super(name);
		this.controlCarrera = controlCarrera;
		
		
		
		
		
		
	}//fin CaballoThread

	@Override
	public void run() {
		
		while(metrosRe<100) {
			
			metrosRe +=  Math.floor(Math.random()*(10-0)+1);
			
			
			
		}//fin while
		
		//llamar a comite
		controlCarrera.getGanador(getName());
		
	}//fin run
	

}//fin class CaballoThread
