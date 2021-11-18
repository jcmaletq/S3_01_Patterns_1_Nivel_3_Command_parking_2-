package vehiculos;
import acciones.*;
public class bicicleta_accion_arrancar implements Int_order {
private bicicleta mi_bici;
public bicicleta_accion_arrancar (bicicleta b) {
	mi_bici = b;
}
@Override
public void ejecuta () {
	mi_bici.arrancar();
}

}
