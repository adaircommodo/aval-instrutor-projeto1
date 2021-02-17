package projeto1;

import java.util.Date;

public class Proprietario {
	
	private String cpf;
	private String rg;
	private String nome;
	private Endereco endereco;
	private Date dataDeNascimento;
	
	Proprietario(String nome, String cpf, String rg, Endereco endereco) {
		        
		this.setNome(nome);
		this.setCpf(cpf);
		this.setRg(rg);
		this.setEndereco(endereco);
		
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
		
	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}
	
	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
		
}
