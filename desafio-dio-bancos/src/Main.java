
public class Main {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Pedro");
		
		
		Conta cc = new ContaCorrente(cliente1);
	
		cc.depositar(100);
		
		
		
		Conta cp = new ContaPoupanca(cliente1);
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}

}
