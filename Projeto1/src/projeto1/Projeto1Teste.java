package projeto1;

public class Projeto1Teste {

	public static void main(String[] args) {
		
		Endereco endereco = new Endereco("Rua X, 109", "Bairro Y", "Guaratinguetá", "SP", "12509-750", "-");	
		
		Proprietario proprietario = new Proprietario("Fulano da Silva", "84292884064", "161265248", endereco);
		
		Marca marca = new Marca("Fiat", 123, 2012,"FIAT-123-2012");
				
	}

}

