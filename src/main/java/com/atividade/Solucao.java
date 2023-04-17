package com.atividade;

import java.util.LinkedList;

public class Solucao {

    private static final int BRANCO = -1;
    private static final int CINZA = 0;
    private static final int PRETO = 1;
    public int[] cor;

    private LinkedList<LinkedList<Integer>> grafo;
    public boolean tem;
    private int raiz;
    private int targetSum;

    public Solucao(LinkedList<LinkedList<Integer>> grafo, int raiz, int targetSum) {
        this.grafo = grafo;
        this.tem = false;
        this.raiz = raiz;
        this.targetSum = targetSum;
        cor = new int[grafo.size()];
    }
    private void startDFS(){
        for (int u = 0; u < grafo.size(); u++) {
            cor[u] = BRANCO;
        }
        dfs(raiz, targetSum, 0);
    }

    private void dfs(int valorVerticeAtual, int targetSum, int somatorioTotal) {
        cor[valorVerticeAtual] = CINZA;

        if (grafo.get(valorVerticeAtual).isEmpty()) {
            somatorioTotal += valorVerticeAtual; 

            if (somatorioTotal == targetSum) { 
                this.tem = true; 
            }
            return;
        }
        if(cor[valorVerticeAtual] == CINZA){
            somatorioTotal += valorVerticeAtual;
        }
        LinkedList<Integer> adj = grafo.get(valorVerticeAtual);

        for (int i = 0; i < adj.size(); i++) {
            int v = adj.get(i);
            dfs(v, targetSum, somatorioTotal); 
        }
        cor[valorVerticeAtual] = PRETO;
    }
    public void solucionar() {
        startDFS();
    }
}
