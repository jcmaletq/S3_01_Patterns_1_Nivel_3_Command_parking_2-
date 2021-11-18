package vehiculos;
import acciones.*;
public class avion_accion_acelerar implements Int_order {
private avion mi_avion;
public avion_accion_acelerar (avion a) {
	mi_avion = a;
}
public void ejecuta () {
	mi_avion.acelerar();
}
}