package projeto1;

public class Carro {
	
	private Proprietario proprietario;
	private String modelo;
	private String cor;
	private Marca marca;
	private String chassi;
	private int	ano;
	private int velocidadeMaxima;
	private int velocidadeAtual;
	private int numeroDeMarchas;
	private int marchaAtual;
	private int numeroDePortas;
	private boolean cambioAutomatico;
	private boolean tetoSolar;
	private boolean carroLigado;
	private double volumeDeCombustivel;
	private double capacidadeTanqueCombustivel;
	private double consumoPorInjecao;
	
	public Carro(Proprietario proprietario, String modelo, String cor, Marca marca, String chassi, 
			int ano, int velocidadeMaxima, int numeroDeMarchas, int numeroDePortas, 
			boolean cambioAutomatico, boolean tetoSolar, double volumeDeCombustivel) {
		
		this.setProprietario(proprietario);
		this.setModelo(modelo);
		this.setCor(cor);
		this.setMarca(marca);
		this.setChassi(chassi);
		this.setAno(ano);
		this.setNumeroDeMarchas(numeroDeMarchas);
		this.setNumeroDePortas(numeroDePortas);
		this.setVelocidadeMaxima(velocidadeMaxima);
		this.setTetoSolar(tetoSolar);
		this.setCambioAutomatico(cambioAutomatico);
		this.setVolumeDeCombustivel(volumeDeCombustivel);
		this.setCapacidadeTanqueCombustivel(volumeDeCombustivel);
		this.setMarchaAtual(0);
		this.setCarroLigado(false);
		
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public int getNumeroDePortas() {
		return this.numeroDePortas;
	}

	public void setNumeroDePortas(int numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}

	public int getNumeroDeMarchas() {
		return numeroDeMarchas;
	}

	public void setNumeroDeMarchas(int numeroDeMarchas2) {
		this.numeroDeMarchas = numeroDeMarchas2;
	}

	public boolean isCambioAutomatico() {
		return cambioAutomatico;
	}

	public void setCambioAutomatico(boolean cambioAutomatico) {
		this.cambioAutomatico = cambioAutomatico;
	}

	public boolean isTetoSolar() {
		return tetoSolar;
	}

	public void setTetoSolar(boolean tetoSolar) {
		this.tetoSolar = tetoSolar;
	}

	public double getVolumeDeCombustivel() {
		return volumeDeCombustivel;
	}

	public void setVolumeDeCombustivel(double volumeDeCombustivel) {
		this.volumeDeCombustivel = volumeDeCombustivel;
	}
	
	public double getCapacidadeTanqueCombustivel() {
		return capacidadeTanqueCombustivel;
	}

	public void setCapacidadeTanqueCombustivel(double capacidadeTanqueCombustivel) {
		this.capacidadeTanqueCombustivel = capacidadeTanqueCombustivel;
	}
	
	public void setCarroLigado(boolean ligado) {
		this.carroLigado = ligado;
	}
	
	public boolean getCarroLigado() {
		return this.carroLigado;
	}
	
	public void setMarchaAtual(int marchaAtual) {
		this.marchaAtual = marchaAtual;
	}
	
	public int getMarchaAtual() {
		return this.marchaAtual;
	}
	
	public void ligar() {
		
		if(this.getVolumeDeCombustivel()<=0) {
			throw new RuntimeException("Opsss ... Tanque vazio!");
		}
		
		if(this.getCarroLigado()) {
			throw new RuntimeException("Reeeccc ... veículo já está ligado!");
		}
				
		if(this.getMarchaAtual()!=0) {
			throw new RuntimeException("Atenção ... Coloque a marcha no ponto neutro!");
		}
		
		this.setCarroLigado(true);
		System.out.println("\nLigando... Veículo ligado com sucesso!");
		
	}
	
	public void acelera() {
		
		if(!this.getCarroLigado()) {
			throw new RuntimeException("Opsss ... veículo está desligado!");
		}
		
		if(this.getMarchaAtual()==0) {
			System.out.println("Vruuummmn ... Vruuummn ... (veículo parado)");
		}
				
		if(this.getVelocidadeAtual() >= this.getVelocidadeMaxima()) {
			
			throw new RuntimeException("Velocidade máxima atingida!");
		
		} else if(this.getMarchaAtual()==-1 || this.getMarchaAtual()>0 ) {
			
			this.injetarCombustivel();
			int novaVelocidade = this.velocidadeAtual + 1; 
			this.setVelocidadeAtual(novaVelocidade);
			System.out.println("Sua velocidade é: " + this.getVelocidadeAtual() +"km/h");
		
		}
		
	}	
	
	public void freia() {
		
		if(this.getVelocidadeAtual() == 0) {
		
			throw new RuntimeException("Veículo já está parado!");
		
		} else {
					
			int novaVelocidade = (this.getVelocidadeAtual()-1>0)
									?this.getVelocidadeAtual()-1
									:0; 
			
			this.setVelocidadeAtual(novaVelocidade);
			
			String msg = "O Veículo reduziu sua velocidade!";
			if(novaVelocidade==0) {
				msg = "O Veículo parou!";
			}
			
			System.out.println(msg);
			System.out.println("Sua velocidade é: " + this.getVelocidadeAtual() +"km/h");
			
		}
		
	}
			
	public void trocaMarcha() {
		
		int novaMarcha = (this.getMarchaAtual()>0 && 
						  this.getMarchaAtual()>=this.getNumeroDeMarchas()) 
							? this.getNumeroDeMarchas() 
							: this.getMarchaAtual()+1;
				
		this.setMarchaAtual(novaMarcha);
		System.out.println("Marcha atual: "+this.getMarchaAtual());
				
	}
		
	public void reduzMarcha() {
		
		int novaMarcha = (this.getMarchaAtual()>0) 
							? this.getMarchaAtual()-1 
							: 1;
				
		this.setMarchaAtual(novaMarcha);
		System.out.println("Marcha atual: "+this.getMarchaAtual());
		
	}
	
	public void marchaRe() {
		
		if(this.getVelocidadeAtual() > 0) {
			throw new RuntimeException("MARCHA RÉ INACESSÍVEL: Veículo em movimento!");
		}
		
		this.setMarchaAtual(-1);
		System.out.println("Marcha atual: "+this.getMarchaAtual()+" (Marcha RÉ)");
	
	}
	
	public void injetarCombustivel() {
		
		double consumo = this.getVolumeDeCombustivel()-this.getConsumoPorInjecao();
		consumo = (consumo<0)?0:consumo;
		this.setVolumeDeCombustivel(consumo);
		
	}
	
	public double getConsumoPorInjecao() {
		return consumoPorInjecao;
	}

	public void setConsumoPorInjecao(double consumoPorInjecao) {
		this.consumoPorInjecao = consumoPorInjecao;
	}

	public void autonomiaEmKm() {
		double autonomia = (this.getVolumeDeCombustivel()/this.getConsumoPorInjecao());
		System.out.println("Autonomia atual de: "+autonomia+" Km");
	}
	
	public void exibirVolumeCombustivel() {
		double porcent = Math.round((this.getVolumeDeCombustivel()*100)/this.getCapacidadeTanqueCombustivel());
		System.out.println("Volume de Combustível: "+this.getVolumeDeCombustivel()+" Litros ("+porcent+"% do tanque)");
	}

}
