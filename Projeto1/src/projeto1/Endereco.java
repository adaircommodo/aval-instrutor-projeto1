package projeto1;

public class Endereco {
	
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private String complemento;
	
	public Endereco(String rua, String bairro, String cidade, String estado, String cep, String complemento) {
		
		if (rua == null || rua.isEmpty() || rua.trim().isEmpty() ) {
            throw new RuntimeException("A RUA do endereço não pode ser vazia!");
        }
		
		if (bairro == null || bairro.isEmpty() || bairro.trim().isEmpty() ) {
            throw new RuntimeException("O BAIRRO do endereço não pode ser vazio!");
        }
		
		if (cidade == null || cidade.isEmpty() || cidade.trim().isEmpty() ) {
            throw new RuntimeException("A CIDADE do endereço não pode ser vazia!");
        }
		
		if (estado == null || estado.isEmpty() || estado.trim().isEmpty() ) {
            throw new RuntimeException("O ESTADO do endereço não pode ser vazio!");
        }
		
		if (cep == null || cep.isEmpty() || cep.trim().isEmpty() ) {
            throw new RuntimeException("O CEP do endereço não pode ser vazio!");
        }
		
		this.setRua(rua);
		this.setBairro(bairro);
		this.setCidade(cidade);
		this.setEstado(estado);
		this.setCep(cep);
		this.setComplemento(complemento);
		
	}
	
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


}
