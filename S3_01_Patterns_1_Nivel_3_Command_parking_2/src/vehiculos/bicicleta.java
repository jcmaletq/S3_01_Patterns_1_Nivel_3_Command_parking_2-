package vehiculos;
import acciones.*;
//request class
public class bicicleta {
	public bicicleta_accion_arrancar arrancar;
	public bicicleta_accion_acelerar acelerar ;
	public bicicleta_accion_frenar frenar ;
	
public bicicleta() {
		arrancar = new bicicleta_accion_arrancar(this);
		acelerar = new bicicleta_accion_acelerar(this);
		frenar = new bicicleta_accion_frenar(this);
	}
public void arrancar() {
			System.out.println("bici pedaleando");	
		}
public void acelerar() {
		System.out.println("bici acelerando");		
		}		
public void frenar() {
			System.out.println("bici frenando");	
		}	
}
