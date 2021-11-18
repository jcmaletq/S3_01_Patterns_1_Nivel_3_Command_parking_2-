package vehiculos;
import acciones.*;
public class barco_accion_acelerar implements Int_order {
private barco mi_barco;
public barco_accion_acelerar (barco a) {
	mi_barco = a;
}
public void ejecuta () {
	mi_barco.acelerar();
}

}