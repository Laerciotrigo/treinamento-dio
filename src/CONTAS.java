
public abstract class CONTAS implements Iconta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	


	public CONTAS() {
	
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}
	
	@Override
	public void tranferir(double valor, CONTAS contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		// TODO Auto-generated method stub
	}
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
	saldo -= valor;
			
	
	
	}
	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		saldo = saldo+valor;
	}
	
	protected void imprimirInfoscomuns() {
		System.out.println(String.format("agencia:%d",this.agencia));
		System.out.println(String.format("numero:%d",this.numero));
		System.out.println(String.format("Saldo:%.2f",this.saldo));
	}

	




public String nome;
public String endereco;
public String cidade;
public String bairro;
public String estado;
}