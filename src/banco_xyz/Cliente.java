package banco_xyz;

public class Cliente {
	
	private Integer agencia;
	private Integer conta;
	private String cpf;
	private String nome;
	private String nascimento;
	private String endereco;
	private String telefone;
	private Double saldo;
	private String senha;
	
	
	public void Cliente() {
		
	}


	public Cliente(Integer agencia, Integer conta, String cpf, String nome, String nascimento, String endereco,
			String telefone, Double saldo, String senha) {
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.cpf = cpf;
		this.nome = nome;
		this.nascimento = nascimento;
		this.endereco = endereco;
		this.telefone = telefone;
		this.saldo = saldo;
		this.senha = senha;
	}
	
	public String MostrarCliente() {
		
		return 
			"--- Dados do Cliente--- \n" +
			"Agência: " + agencia + "\n" +
			"Conta: " + conta + "\n" +
			"CPF: " + cpf + "\n" +
			"Nome: " + nome + "\n" +
			"Nascimento: " + nascimento + "\n" +
			"Telefone: " + telefone + "\n" +
			"Saldo: " + saldo + "\n" +
			"Senha: " + senha + "\n" ;
	}


	public Integer getAgencia() {
		return agencia;
	}


	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}


	public Integer getConta() {
		return conta;
	}


	public void setConta(Integer conta) {
		this.conta = conta;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getNascimento() {
		return nascimento;
	}


	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public Double getSaldo() {
		return saldo;
	}


	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
