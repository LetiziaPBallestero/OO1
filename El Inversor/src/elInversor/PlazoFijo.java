package elInversor;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements inversion {
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;

	private int diasQuePasaron() {
		return (int) ChronoUnit.DAYS.between(this.fechaDeConstitucion, LocalDate.now());
	}

	public double valorActual() {
		double totalAmount = this.montoDepositado;
		for (int i = 1; i <= diasQuePasaron(); i++) {
			System.out.println (totalAmount);
			totalAmount = +totalAmount * this.porcentajeDeInteresDiario;
		}
		return totalAmount;
	}

	public PlazoFijo() {
	}
	
	public PlazoFijo(LocalDate fecha , double monto , double porcentaje) {
		this.fechaDeConstitucion = fecha;
		this.montoDepositado = monto; 
		this.porcentajeDeInteresDiario = porcentaje;
	}

	// getters and setters
	public LocalDate getFechaDeConstitucion() {
		return fechaDeConstitucion;
	}

	public void setFechaDeConstitucion(LocalDate fechaDeConstitucion) {
		this.fechaDeConstitucion = fechaDeConstitucion;
	}

	public double getMontoDepositado() {
		return montoDepositado;
	}

	public void setMontoDepositado(double montoDepositado) {
		this.montoDepositado = montoDepositado;
	}

	public double getPorcentajeDeInteresDiario() {
		return porcentajeDeInteresDiario;
	}

	public void setPorcentajeDeInteresDiario(double porcentajeDeInteresDiario) {
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}

}
