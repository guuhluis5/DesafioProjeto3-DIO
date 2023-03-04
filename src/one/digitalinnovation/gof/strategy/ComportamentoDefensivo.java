package one.digitalinnovation.gof.strategy;

public class ComportamentoDefensivo implements Comportamento 
{

	@Override
	public void moverParaFrente() 
	{
		System.out.println("Movendo-se defensivamente para Frente");
	}

	@Override
	public void moverParaDireita() 
	{
		
		System.out.println("Movendo-se defensivamente para Direita");
	}

	@Override
	public void moverParaEsquerda() 
	{
		System.out.println("Movendo-se defensivamente para Esquerda");
	}

	@Override
	public void parado() 
	{
		System.out.println("Robo parado");
	}

}
