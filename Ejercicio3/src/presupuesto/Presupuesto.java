package presupuesto;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
	// atributos 
	private LocalDate fecha;
	private String cliente;
	private List<Item> items = new ArrayList<Item>();
	
	// getters, setters y constructores
	public String getCliente () {
		return this.cliente;
	}
	public Presupuesto cliente (String cliente) {
		this.cliente = cliente;
		return this;
	}

	// metodos a implementar
	public void agregarItem (Item item) {
		this.items.add(item);
	}
	
	public double calcularTotal() {
		return items.stream().mapToDouble(Item -> Item.costo()).sum();
	}


}
