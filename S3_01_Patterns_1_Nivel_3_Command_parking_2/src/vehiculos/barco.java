package vehiculos;

public class barco {
	// recibe la peticion
	   public barco_accion_arrancar arrancar ;
	   public barco_accion_acelerar acelerar ;
	   public barco_accion_frenar frenar ;
	   
	   public barco() {
		   arrancar = new barco_accion_arrancar(this);
		   acelerar = new barco_accion_acelerar(this);
		   frenar = new barco_accion_frenar(this);   
	   }
		public void arrancar() {
			System.out.println("barco zarpando");	
		}
		public void acelerar() {
			System.out.println("barco acelerando");		
		}		
		public void frenar() {
			System.out.println("barco atracando");	
		}	
}
