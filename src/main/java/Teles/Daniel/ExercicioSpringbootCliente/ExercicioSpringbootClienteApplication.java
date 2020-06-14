package Teles.Daniel.ExercicioSpringbootCliente;

import Teles.Daniel.ExercicioSpringbootCliente.model.Cliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExercicioSpringbootClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExercicioSpringbootClienteApplication.class, args);

		Cliente cliente = new Cliente("Daniel", "Teles", 1300);
		System.out.println("\n" + cliente);

		System.out.println("\n" + new Cliente("Vitória","Camargo",1500));
	}

}
