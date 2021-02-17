package projeto1;

import java.util.Date;

public class Proprietario {
	
	private String cpf;
	private String rg;
	private String nome;
	private Endereco endereco;
	private Date dataDeNascimento;
	
	Proprietario(String nome, String cpf, String rg, Endereco endereco) {
		
		//1 - Verificar se a String é nula
		if (nome == null || cpf == null || rg == null ) {
            throw new RuntimeException("Erro de Preenchimento de String");
        }
		//2- Verificar se a String está vazia
        if (nome.isEmpty() || cpf.isEmpty() || rg.isEmpty()) {
            throw new RuntimeException("Erro de Preenchimento de String");
        }
        //3 - Verificar se a String não possui algum caractere válido
        if (nome.trim().isEmpty() || cpf.trim().isEmpty() || rg.trim().isEmpty()) {
            throw new RuntimeException("Erro de Preenchimento de String");
        }        
		
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
