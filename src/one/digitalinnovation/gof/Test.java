package one.digitalinnovation.gof;

import javax.lang.model.util.ElementScanner6;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Bateria;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoAtual;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

public class Test 
{

	public static void main(String[] args) 
	{
		
		// Singleton
		/* 
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		*/
		
		// Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		Robo robo = new Robo();
		robo.setComportamento(normal);
		Bateria bateria = new Bateria();
		ComportamentoAtual atualComportamento = new ComportamentoAtual();

		robo.setComportamento(normal);
		atualComportamento.setComportamentoAtual("normal");
		bateria.setBateria(100);

		if(atualComportamento.getComportamentoAtual() == "normal")
		{
			System.out.println("Você está consumindo a bateria do seu robo normalmente");
			int bateriaAtual = bateria.getBateria();
			bateriaAtual = bateriaAtual - 2;
			System.out.println("No modo normal a bateria é consumida em 2 ponto a cada 5 minutos/ bateria atual:" + bateriaAtual);			
			bateria.setBateria(bateriaAtual);
		}
		else if(atualComportamento.getComportamentoAtual() == "agressivo")
		{
			System.out.println("Você está consumindo a bateria do seu robo rapidamente");
			int bateriaAtual = bateria.getBateria();
			bateriaAtual = bateriaAtual - 3;
			System.out.println("No modo agressivo a bateria é consumida em 3 ponto a cada 5 minutos/ bateria atual:" + bateriaAtual);
			bateria.setBateria(bateriaAtual);
		}

		else if(atualComportamento.getComportamentoAtual() == "defensivo")
		{
			System.out.println("Você está consumindo a bateria do seu robo lentamente");
			int bateriaAtual = bateria.getBateria();
			bateriaAtual = bateriaAtual - 1;
			System.out.println("No modo defensivo a bateria é consumida em 1 ponto a cada 5 minutos/ bateria atual:" + bateriaAtual);
			bateria.setBateria(bateriaAtual);
		}
		else
		{
			System.out.println("Seu robo está parado, não está consumindo bateria nenhuma");
		}

		
		
		// Facade
		/* 
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "14801788");
		
		*/
	}

}
