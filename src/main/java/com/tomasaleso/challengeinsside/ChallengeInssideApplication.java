package com.tomasaleso.challengeinsside;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.tomasaleso.challengeinsside.cliente.Cliente;
import com.tomasaleso.challengeinsside.ordenDeCompra.ordenDeCompra;
import com.tomasaleso.challengeinsside.telefono.Telefono;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengeInssideApplication {

	public static List<Telefono> telefonos = new ArrayList<>();
	public static List<Cliente> clientes = new ArrayList<>();
	public static List<ordenDeCompra> ordenDeCompras = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(ChallengeInssideApplication.class, args);

		// agrego telefonos, clientes y odenes de compra en memoria para pruebas, al
		// usar un orm se deben eliminar y modificar como acceden a los datos los service de c/u
		telefonos.add(new Telefono("Samsung", "S10", "100", "1"));
		telefonos.add(new Telefono("Samsung", "S20", "200", "2"));
		telefonos.add(new Telefono("Samsung", "S21", "210", "3"));
		telefonos.add(new Telefono("Samsung", "S22", "220", "4"));

		clientes.add(new Cliente("Tomas", "Aleso", 40238956, "Av Lafuente", "+54 1155231123"));
		clientes.add(new Cliente("Juan", "Perez", 16923321, "Av Nazca", "+54 1155234431"));
		clientes.add(new Cliente("Mariano", "Lopez", 40238956, "Av Gaona", "+54 1111233753"));

		ordenDeCompras.add(new ordenDeCompra(Arrays.asList("1", "2"), 40238956, 1));
		ordenDeCompras.add(new ordenDeCompra(Arrays.asList("1", "2", "3"), 40238956, 2));

	}

}
