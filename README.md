[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/7ZHkKdhB)
<img src="assets/images/Unicap_Icam_Tech-01.png" alt="drawing" width="250"/>

## Identificação
**Disciplina**: Grafos
\
**Atividade**: Somar Caminhos

## Instruções
- Sua implementação deve estar dentro da pasta src/**main**/java 
- Não modifique nenhum código dentro da pasta src/**test**/java
- *Commits* fora do prazo **serão completamente desconsiderados**

##  Descrição
Utilize o algoritmo ``DFS`` ou ``BFS`` para solucionar o problema descrito abaixo.

Dado uma árvore binária formada por inteiros, retorne ``true`` se da sua raiz até um nó folha existe uma soma de elementos ao longo do caminho que seja igual a ``targetSum``. 

Sua implementação deve seguir a seguinte assinatura:
```java
  public class Solucao {
    private LinkedList< LinkedList<Integer> > grafo;
    public boolean tem;
     
    public Solucao(LinkedList< LinkedList<Integer> > grafo, int raiz, int targetSum){}
  } 
```