package com.atividade;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Testes {
    private LinkedList< LinkedList<Integer> > grafo;
    private int tamanho_grafo = 14;
   
   @BeforeEach
   public void criarGrafo(){

      this.grafo = new LinkedList<>();
         for(int i=0; i < this.tamanho_grafo; i++){
            this.grafo.add(new LinkedList<Integer>());
      }

      this.grafo.get(5).add(4);
      this.grafo.get(5).add(8);
      this.grafo.get(4).add(11);
      this.grafo.get(11).add(7);
      this.grafo.get(11).add(2);
      this.grafo.get(8).add(13);
      this.grafo.get(8).add(3);
   }

   // Existe um PEQUENO detalhe dentro do problema de somar caminhos em uma árvore binária. 
   // Caso você consigar fazer este teste passar, significa que seu código tratou este PEQUENO detalhe.
   // Parabéns :)
   @Test
   public void testBonusOpcional(){
      LinkedList< LinkedList<Integer> > grafoTeste;
      int tamanho_grafo_teste = 11;

      grafoTeste = new LinkedList<>();
      for(int i=0; i < tamanho_grafo_teste; i++){
         grafoTeste.add(new LinkedList<Integer>());
      }

      grafoTeste.get(5).add(4);
      grafoTeste.get(5).add(10);
      grafoTeste.get(10).add(4);

		Solucao s = new Solucao(grafoTeste, 5, 19);

      s.solucionar();

      boolean expected = true;
      boolean actual = s.tem;

      assertEquals(expected, actual);
   }

   // você pode modificar este teste para avaliar diferentes grafos
   @Test
   public void vocePodeModificarEsteTeste()
   {
      LinkedList< LinkedList<Integer> > grafoTeste;
      int tamanho_grafo_teste = 11;

      grafoTeste = new LinkedList<>();
      for(int i=0; i < tamanho_grafo_teste; i++){
         grafoTeste.add(new LinkedList<Integer>());
      }

      grafoTeste.get(5).add(4);
      grafoTeste.get(5).add(10);

		Solucao s = new Solucao(grafoTeste, 5, 15);

      s.solucionar();

      boolean expected = true;
      boolean actual = s.tem;

      assertEquals(expected, actual);
   }

   @Test
   public void test01()
   {
      Solucao s = new Solucao(this.grafo, 5, 27);
      s.solucionar();
      boolean expected = true;
      boolean actual = s.tem;
      assertEquals(expected, actual);
   }

   @Test
   public void test02()
   {
      Solucao s = new Solucao(this.grafo, 5, 22);
      s.solucionar();
      boolean expected = true;
      boolean actual = s.tem;
      assertEquals(expected, actual);
   }

   @Test
   public void test03()
   {
      Solucao s = new Solucao(this.grafo, 5, 26);
      s.solucionar();
      boolean expected = true;
      boolean actual = s.tem;
      assertEquals(expected, actual);
   }

   @Test
   public void test04()
   {
      Solucao s = new Solucao(this.grafo, 5, 16);
      s.solucionar();
      boolean expected = true;
      boolean actual = s.tem;
      assertEquals(expected, actual);
   }
}
