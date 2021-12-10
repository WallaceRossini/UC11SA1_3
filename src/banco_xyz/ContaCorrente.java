package banco_xyz;

public class ContaCorrente {
	
	
	private Integer numero_doc_cc;
	private Integer agencia_cc;
	private Integer conta_cc;
	private Double valor_cc;
	private Integer tipo_cc;
	private String data_ocorrencia_cc;
	private Double saldo_cc;
	
	public void ContaCorrente() {
		
	}
	
	public ContaCorrente(Integer numero_doc_cc, Integer agencia_cc, Integer conta_cc, Double valor_cc, Integer tipo_cc,
			String data_ocorrencia_cc, Double saldo_cc) {
		super();
		this.numero_doc_cc = numero_doc_cc;
		this.agencia_cc = agencia_cc;
		this.conta_cc = conta_cc;
		this.valor_cc = valor_cc;
		this.tipo_cc = tipo_cc;
		this.data_ocorrencia_cc = data_ocorrencia_cc;
		this.saldo_cc = saldo_cc;
	}
	
	public String RegistrarOcorrencia() {
		
		Double saldo_atual = null;
		String tipo = null;
		
		switch (tipo_cc) {
		case 1: {
			saldo_atual = saldo_cc + valor_cc;
			tipo = "Depósito";
		}
		case 2 :{
			saldo_atual = saldo_cc - valor_cc;
			tipo = "Saque";
		}
		
		}
		
		return 
				"--- Conta Corrente--- \n" +
				"Número Documento: " + numero_doc_cc + "\n" +
				"Agência: " + agencia_cc + "\n" +
				"Conta: " + conta_cc + "\n" +
				"Valor: " + valor_cc + "\n" +
				"Tipo: " + tipo_cc + " (" + tipo + ")"+ "\n" +
				"Data Ocorrência: " + data_ocorrencia_cc + "\n" +
				"Saldo anterior: " + saldo_cc  + "\n" + 
				"Saldo atualizado:" + saldo_atual + "\n" +
				"Mensagem: Ocorrência Registrada";
		
	}



	public Integer getNumero_doc_cc() {
		return numero_doc_cc;
	}
	public void setNumero_doc_cc(Integer numero_doc_cc) {
		this.numero_doc_cc = numero_doc_cc;
	}
	public Integer getAgencia_cc() {
		return agencia_cc;
	}
	public void setAgencia_cc(Integer agencia_cc) {
		this.agencia_cc = agencia_cc;
	}
	public Integer getConta_cc() {
		return conta_cc;
	}
	public void setConta_cc(Integer conta_cc) {
		this.conta_cc = conta_cc;
	}
	public Double getValor_cc() {
		return valor_cc;
	}
	public void setValor_cc(Double valor_cc) {
		this.valor_cc = valor_cc;
	}
	public Integer getTipo_cc() {
		return tipo_cc;
	}
	public void setTipo_cc(Integer tipo_cc) {
		this.tipo_cc = tipo_cc;
	}
	public String getData_ocorrencia_cc() {
		return data_ocorrencia_cc;
	}
	public void setData_ocorrencia_cc(String data_ocorrencia_cc) {
		this.data_ocorrencia_cc = data_ocorrencia_cc;
	}
	public Double getSaldo_cc() {
		return saldo_cc;
	}
	public void setSaldo_cc(Double salco_cc) {
		this.saldo_cc = salco_cc;
	}
	

}
