package farolas;

import java.util.ArrayList;
import java.util.List;
/* 
 * crear farolas -> apagadas
 * conectarlas a cuánta farola quiera 
 * escender una y que de prendan todas
 * apagar una y que se apagen todas 
 */
public class Farola {
	private boolean estado;
	private List<Farola> farolas = new ArrayList<Farola>();

	
	public Farola () {
		this.estado = false;
	}

	public void pairWithNeighbor( Farola otraFarola ){
		this.farolas.add(otraFarola);
		otraFarola.addNeighbor(this);
	}
	
	public void addNeighbor (Farola farolita) {
		this.farolas.add(farolita);
	}

	public List<Farola> getNeighbors ()  {
		return farolas;
	}

	public void turnOn() {
		if (!this.estado) {
			this.estado = true;
			farolas.stream().forEach(farola -> farola.turnOn());
			}
	}

	public void turnOff() {
		if (this.estado)  {
			this.estado = false;
			farolas.stream().forEach(farola -> farola.turnOff());
		}
	}

	public boolean isOn() {
		return this.estado;
	}
}
