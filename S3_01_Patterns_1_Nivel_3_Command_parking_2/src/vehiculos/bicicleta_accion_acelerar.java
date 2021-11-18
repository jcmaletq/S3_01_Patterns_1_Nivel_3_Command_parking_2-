package vehiculos;
import acciones.*;
public class bicicleta_accion_acelerar implements Int_order {
private bicicleta mi_bici;
public bicicleta_accion_acelerar (bicicleta b) {
	mi_bici = b;
}
@Override
public void ejecuta () {
	mi_bici.acelerar();
}

}