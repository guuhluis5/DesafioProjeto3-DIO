package one.digitalinnovation.gof.strategy;

public class ComportamentoAgressivo implements Comportamento 
{

	@Override
	public void moverParaFrente() 
	{
		System.out.println("Movendo-se agressivamente para Frente");
	}

	@Override
	public void moverParaDireita() 
	{
		
		System.out.println("Movendo-se agressivamente para Direita");
	}

	@Override
	public void moverParaEsquerda() 
	{
		System.out.println("Movendo-se agressivamente para Esquerda");
	}

	@Override
	public void parado() 
	{
		System.out.println("Robo parado");
	}

}
