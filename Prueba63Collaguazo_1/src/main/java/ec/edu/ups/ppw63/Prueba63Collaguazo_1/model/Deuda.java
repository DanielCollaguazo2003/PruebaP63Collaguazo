package ec.edu.ups.ppw63.Prueba63Collaguazo_1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Deuda {

	@Id
	@GeneratedValue
	private int codigo;
	private double valor;
	private String mes;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	@Override
	public String toString() {
		return "Deuda [codigo=" + codigo + ", valor=" + valor + ", mes=" + mes + "]";
	}
	
	
}
