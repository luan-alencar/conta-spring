package david.augusto.luan.domain.model;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int conta, String titular, double saldo) {
		super(agencia, conta, titular, saldo);
	}

	public ContaCorrente(int agencia, int conta, String titular) {
		super(agencia, conta, titular);
	}

	public ContaCorrente() {
	}
	
	public void depositar(double valor) {
		double total = 0;
		total = this.getSaldo() +valor;
	}

	public static void main(String[] args) {
		ContaCorrente c = new ContaCorrente(001,1234, "Luan");
		c.setSaldo(1500);
		System.out.println("O saldo de " + c.getTitular() + " é: R$ " + c.getSaldo());
	}
}
