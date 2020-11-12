package david.augusto.luan.domain.model;

import david.augusto.luan.domain.exceptions.SaldoInsuficienteException;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int conta, String titular, double saldo) {
		super(agencia, conta, titular, saldo);
	}

	public ContaCorrente(int agencia, int conta, String titular) {
		super(agencia, conta, titular);
	}

	public ContaCorrente() {
	}
	
	

	@Override
	public void depositar(double valor) {
		super.depositar(valor);
	}

	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {
		super.sacar(valor);
	}

	public static void main(String[] args) throws SaldoInsuficienteException {
		ContaCorrente c = new ContaCorrente(001,1234, "Luan");
		c.setSaldo(1500);
		System.out.println("O saldo de " + c.getTitular() + " é: R$ " + c.getSaldo());
		c.sacar(2000);
		System.out.println("O saldo de " + c.getTitular() + " após sacar é: R$ " + c.getSaldo());
	}
}
