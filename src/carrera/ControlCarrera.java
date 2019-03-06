package carrera;

public class ControlCarrera {
	
	public static String name;
	public static String log="";
	int puesto = 0;

	public ControlCarrera() {
		
		
		
	}//fin ControlCarrera
	
	
	public synchronized void getGanador(String name) {
		
		this.name = name;
		puesto++;
		log += name + " Ha llegado en el puesto Nº: " +puesto + "\n";
		
		
	}//fin getGanador
	
	public static void controlSalida(String name) {
		
		name = name;
		log += name + " Ha salido!"+"\n";
		
	}//fin caontrolSalida
	
	public void informe() {
		
		System.out.println(log);
		
	}//fin informe

}
