package david.augusto.luan.domain.model;

import lombok.*;

@Data
@Getter @Setter
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
	
	
}
