package vehiculos;
import acciones.*;
//clase concreta implementa la interace
public class bicicleta_accion_frenar implements Int_order {
private bicicleta mi_bici;
public bicicleta_accion_frenar (bicicleta b) {
	mi_bici = b;
}
@Override
public void ejecuta () {
	mi_bici.frenar();
}

}
