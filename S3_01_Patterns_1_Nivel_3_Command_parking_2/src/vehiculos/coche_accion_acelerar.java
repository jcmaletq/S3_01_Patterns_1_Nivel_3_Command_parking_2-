package vehiculos;
import acciones.*;

// clase concreta implementa la interace
public class coche_accion_acelerar implements Int_order {
private coche mi_coche;
public coche_accion_acelerar (coche c) {
	mi_coche = c;
}
public void ejecuta () {
	mi_coche.acelerar();
}

}
