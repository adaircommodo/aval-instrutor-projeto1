package projeto1;

public class Marca {
	
	private String nome;
	private int nrDeModelos;
	private int anoDeLancamento;
	private String codigoId;
	
	public Marca(String nome, int nrDeModelos, int anoDeLancamento, String codigoId) {
		
		if (nome == null || nome.isEmpty() || nome.trim().isEmpty() ) {
            throw new RuntimeException("O NOME da Marca não pode ser vazio!");
        }
		
		if (nrDeModelos<1) {
            throw new RuntimeException("O NÚMERO DE MODELO da Marca deve ser diferente zero!");
        }
		
		if (anoDeLancamento<0) {
            throw new RuntimeException("O ANO DE LANÇAMENTO da Marca deve ser diferente zero!");
        }
		
		if (codigoId == null || codigoId.isEmpty() || codigoId.trim().isEmpty() ) {
            throw new RuntimeException("O CÓDIGO IDENTIFICADOR da Marca não pode ser vazio!");
        }
		
		this.nome = nome;
		this.nrDeModelos = nrDeModelos;
		this.anoDeLancamento = anoDeLancamento;
		this.codigoId = codigoId;
		
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNrDeModelos() {
		return nrDeModelos;
	}
	
	public void setNrDeModelos(int nrDeModelos) {
		this.nrDeModelos = nrDeModelos;
	}
	
	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}
	
	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}
	
	public String getCodigoId() {
		return codigoId;
	}
	
	public void setCodigoId(String codigoId) {
		this.codigoId = codigoId;
	}
	
}
