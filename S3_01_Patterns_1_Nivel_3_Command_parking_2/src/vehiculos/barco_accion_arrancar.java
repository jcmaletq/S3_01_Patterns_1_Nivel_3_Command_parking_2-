package vehiculos;
import acciones.*;
public class barco_accion_arrancar implements Int_order {
private barco mi_avi;
public barco_accion_arrancar (barco b) {
	mi_avi = b;
}
public void ejecuta () {
	mi_avi.arrancar();
}

}
