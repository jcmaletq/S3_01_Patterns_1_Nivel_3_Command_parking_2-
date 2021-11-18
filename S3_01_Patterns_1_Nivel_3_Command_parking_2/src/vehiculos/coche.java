package vehiculos;

import acciones.*;
//  request class
public class coche {
public coche_accion_arrancar arrancar;
public coche_accion_acelerar acelarar ;
public coche_accion_frenar frenar ;
	
	
	public coche() {
		arrancar = new coche_accion_arrancar(this);
		acelarar = new coche_accion_acelerar(this);
		frenar = new coche_accion_frenar(this);
	}
	public void arrancar() {
		System.out.println("coche arrancando");
		
	}
	public void acelerar() {
		System.out.println("coche acelerando");
		
	}
	public void frenar() {
		System.out.println("coche frenando");
		
	}

}
