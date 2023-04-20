package com.goutham.examples.graphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class AdjacencyGraph {


    ArrayList<LinkedList<GraphNode>> adjacencyList;

    public AdjacencyGraph() {
        adjacencyList = new ArrayList<>();
    }

    public void addNode(GraphNode node){
        LinkedList<GraphNode> currentList = new LinkedList<>();
         currentList.add(node);
         adjacencyList.add(currentList);
    }

    public void addEdge(int src, int dst){
        LinkedList<GraphNode> currentList = adjacencyList.get(src);
        GraphNode headNodeAtDestination = adjacencyList.get(dst).get(0);
        currentList.add(headNodeAtDestination);
    }

    public boolean checkEdge(int src, int dest){
        LinkedList<GraphNode> srcList = adjacencyList.get(src);
        GraphNode headNodeAtDestination = adjacencyList.get(dest).get(0);
        for(GraphNode node : srcList){
            if(node == headNodeAtDestination){
                return true;
            }
        }
            return false;
    }
    public void print(){
            for(LinkedList<GraphNode> currentList : adjacencyList){
                for(GraphNode node : currentList){
                    System.out.print( node.data + " -> ");
                }
                System.out.println();
            }
    }

}
