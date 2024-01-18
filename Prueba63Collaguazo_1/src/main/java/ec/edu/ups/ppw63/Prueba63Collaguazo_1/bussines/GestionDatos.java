package ec.edu.ups.ppw63.Prueba63Collaguazo_1.bussines;

import java.util.List;

import ec.edu.ups.ppw63.Prueba63Collaguazo_1.dao.ClienteDao;
import ec.edu.ups.ppw63.Prueba63Collaguazo_1.model.Cliente;
import ec.edu.ups.ppw63.Prueba63Collaguazo_1.model.Deuda;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;

@Singleton
@Startup
public class GestionDatos {

	@Inject
	private ClienteDao daoCliente;
	
	@PostConstruct
	public void init() {
		
		Cliente cli1 = new Cliente();
		cli1.setNombre("Daniel Collaguazo");
		cli1.setDni("0102735974");
		
		Deuda deu1 = new Deuda();
		deu1.setMes("Enero");
		deu1.setValor(35.5);
		
		Deuda deu2 = new Deuda();
		deu2.setMes("Febrero");
		deu2.setValor(40.5);
		
		Deuda deu3 = new Deuda();
		deu3.setMes("Marzo");
		deu3.setValor(55.5);
		
		cli1.addDeuda(deu1);
		cli1.addDeuda(deu2);
		cli1.addDeuda(deu3);
		
		daoCliente.insert(cli1);
		
		
		Cliente cli2 = new Cliente();
		cli1.setNombre("Daniel Collaguazo");
		cli1.setDni("0102735974");
		
		Deuda deu4 = new Deuda();
		deu4.setMes("Enero");
		deu4.setValor(85.5);
		
		Deuda deu5 = new Deuda();
		deu5.setMes("Febrero");
		deu5.setValor(10.5);
		
		
		cli2.addDeuda(deu4);
		cli2.addDeuda(deu5);
		
		daoCliente.insert(cli2);
		
		
		
		System.out.println("\n------------- Facturas2");
		List<Cliente> list = daoCliente.getAll();
		for (Cliente cli: list) {
			System.out.println(cli);
		}
		
	}
}
