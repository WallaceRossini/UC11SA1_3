package banco_xyz;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente_1 = new Cliente(
				100,
				34567,
				"123.456.789-00",
				"José da Silva",
				"15/06/1995",
				"Av. dos Autonomistas 234",
				"(11)9123-456",
				100.0,
				"abc#123");
		
		
		System.out.println(cliente_1.MostrarCliente());
	
		
		ContaCorrente conta_corrente_1 = new ContaCorrente(
				12345, 
				cliente_1.getAgencia(), 
				cliente_1.getConta(),
				50.0,
				1, 
				"10/12/2021",
				cliente_1.getSaldo());
	
		System.out.println(conta_corrente_1.RegistrarOcorrencia());

	}

}
