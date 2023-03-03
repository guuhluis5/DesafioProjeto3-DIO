package one.digitalinnovation.gof.strategy;

public class Robo {
	
	private Comportamento comportamento;

	public Comportamento getComportamento() {
		return comportamento;
	}

	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}
	
	public void moverParaDireita() 
	{
		comportamento.moverParaDireita();
	}

	public void moverParaEsquerda() 
	{
		comportamento.moverParaEsquerda();
	}

	public void moverParaFrente() 
	{
		comportamento.moverParaFrente();
	}

	public void parado() 
	{
		comportamento.parado();
	}
	
}
