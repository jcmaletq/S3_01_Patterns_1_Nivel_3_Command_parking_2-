package vehiculos;
import acciones.*;

//clase concreta implementa la interace
public class coche_accion_arrancar implements Int_order {
private coche mi_coche;
public coche_accion_arrancar (coche c) {
	mi_coche = c;
}
public void ejecuta () {
	mi_coche.arrancar();
}

}
