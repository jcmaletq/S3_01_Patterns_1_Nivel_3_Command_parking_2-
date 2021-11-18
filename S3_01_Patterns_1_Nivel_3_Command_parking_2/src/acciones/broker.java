package acciones;
import java.util.*;
public class broker {
	private List <Int_order> orderList = new ArrayList<>();
public void tomaOrder(Int_order order) {
	orderList.add(order);
}
public void ejecOrder() {
	for (Int_order order : orderList) {
		order.ejecuta();
	}
	orderList.clear();
}
}
