package teste;

public class Funcionario {

	private String nome;
	private String cpf;
	private String rg;
	private String telefone;
	private Empresa empresa;
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String cpf, String rg, String telefone, Empresa empresa) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.telefone = telefone;
		this.empresa = empresa;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
		
	}
	
	public void setCpf (String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getRg() {
		return rg;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setEmpresa (Empresa empresa) {
		this.empresa = empresa;
	}
	public Empresa getEmpresa() {
		return empresa;
	}

	@Override
	public String toString() {
		return "Funcionario [nome: " + nome + ", cpf: " + cpf + ", rg: " + rg + ", telefone: " + telefone + ", empresa: "
				+ empresa + "]";
	}

	
	
}
