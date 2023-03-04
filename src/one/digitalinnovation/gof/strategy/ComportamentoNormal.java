package one.digitalinnovation.gof.strategy;

public class ComportamentoNormal implements Comportamento 
{

	@Override
	public void moverParaFrente() 
	{
		System.out.println("Movendo-se normalmente para Frente");
	}

	@Override
	public void moverParaDireita() 
	{
		
		System.out.println("Movendo-se normalmente para Direita");
	}

	@Override
	public void moverParaEsquerda() 
	{
		System.out.println("Movendo-se normalmente para Esquerda");
	}

	@Override
	public void parado() 
	{
		System.out.println("Robo parado");
	}


}
