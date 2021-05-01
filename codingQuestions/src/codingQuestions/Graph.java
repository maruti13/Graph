package codingQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {

	private Node[] nodeList;
	private int[][] adjMatrix;
	private int numberNode;
	Queue<Integer> queue = new LinkedList<Integer>();
	
	
	Graph(int size){
		int MAX_NODES = size;
		nodeList = new Node[MAX_NODES];
		adjMatrix = new int[MAX_NODES][MAX_NODES];
		numberNode = 0;
		
	}
	
	void addNode(int element) {
		nodeList[numberNode++] = new Node(element);
	}
	void addEdge(int start, int end) {
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1;
	}
	private void printNode(int index) {
		System.out.println(nodeList[index].data);
	}
	
	private int getAdjUnvisitedNode(int node) {
		for(int j=0; j<numberNode ; j++) {
			if(adjMatrix[node][j] == 1 && nodeList[j].visited == false) {
				return j;
			}
		}
		return -1;
	}
	
	void bfs() {
		nodeList[0].visited = true;
		queue.add(0);
		printNode(0);
		int node1;
		while(!queue.isEmpty()) {
			int node2 = queue.remove();
			while((node1 = getAdjUnvisitedNode(node2)) != -1) {
				queue.add(node1);
				printNode(node1);
				nodeList[node1].visited = true;
				
			}
		}
		
	}
	void dfs(int n) {
		nodeList[n].visited= true;
		printNode(n);
		int node1;
		while((node1 = getAdjUnvisitedNode(n))!=-1) {
			dfs(node1);
		}
	}
	
	
}
