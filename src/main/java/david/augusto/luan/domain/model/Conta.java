package david.augusto.luan.domain.model;

import david.augusto.luan.domain.exceptions.SaldoInsuficienteException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public abstract class Conta {

	private int agencia;
	private int conta;
	private String titular;
	private double saldo;

	public Conta() {
	}

	public Conta(int agencia, int conta, String titular) {
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
		this.saldo = 0;
	}

	public void sacar(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException();
		}
		this.saldo -= valor;
	}
}
