package vehiculos;
import acciones.*;
//clase concreta implementa la interace
public class coche_accion_frenar implements Int_order {
private coche mi_coche;
public coche_accion_frenar (coche c) {
	mi_coche = c;
}
public void ejecuta () {
	mi_coche.frenar();
}

}
