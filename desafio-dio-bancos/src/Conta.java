
public abstract class Conta implements IConta{
	
	private static int AGENCIA_PADRAO=1;
	private static int SEQUENCIAL = 1;
	
	private Cliente cliente;
	
	public Cliente getCliente() {
		return cliente;
	}




	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	protected int agencia;
	protected int numero;
	protected double saldo;
	
	public Conta(Cliente cliente) {
		this.agencia=Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	
	

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public void sacar(double valor) {
		saldo-=valor;
		
	}

	@Override
	public void depositar(double valor) {
		saldo+=valor;
		
	}

	@Override
	public void transferir(double valor, Conta contadestino) {
		this.sacar(valor);
		contadestino.depositar(valor);
		
	}


	protected void imprimirInfosComuns() {
		
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	
	

}
