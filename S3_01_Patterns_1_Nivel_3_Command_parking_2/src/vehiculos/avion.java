package vehiculos;

public class avion {
	// recibe la peticion
	  public avion_accion_arrancar arrancar;
	  public avion_accion_acelerar acelerar;
	  public avion_accion_frenar frenar;
	public avion() {
		arrancar = new avion_accion_arrancar(this);
		acelerar = new avion_accion_acelerar(this);
		frenar = new avion_accion_frenar(this);	
	}
	
		public void arrancar() {
			System.out.println("avion despegando");	
		}
		public void acelerar() {
			System.out.println("avion acelerando");		
		}		
		public void frenar() {
			System.out.println("avion aterrizando");	
		}	
}
