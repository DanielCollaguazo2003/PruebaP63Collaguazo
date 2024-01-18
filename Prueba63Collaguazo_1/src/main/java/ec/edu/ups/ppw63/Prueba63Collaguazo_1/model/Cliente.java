package ec.edu.ups.ppw63.Prueba63Collaguazo_1.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Cliente {
	@Id
	@GeneratedValue
	private int codigo;
	private String dni;
	private String nombre;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="codigo_cliente")
	private List<Deuda> deudaList;

	
	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public List<Deuda> getDeudaList() {
		return deudaList;
	}


	public void setDeudaList(List<Deuda> deudaList) {
		this.deudaList = deudaList;
	}

	public void addDeuda (Deuda deuda) {
		if (deudaList == null)
			deudaList = new ArrayList<Deuda>();
			
		deudaList.add(deuda);
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", dni=" + dni + ", nombre=" + nombre + ", deudaList=" + deudaList + "]";
	}
}