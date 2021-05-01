package codingQuestions;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(8);
		
		g.addNode(50);
		g.addNode(10);
		g.addNode(200);
		g.addNode(20);
		g.addNode(15);
		g.addNode(30);
		g.addNode(5);
		g.addNode(300);
		
		g.addEdge(0,1 );
		g.addEdge(0,2 );
		g.addEdge(1, 4);
		g.addEdge(1,5 );
		g.addEdge(2,3 );
		g.addEdge(4, 5);
		g.addEdge(4,6 );
		g.addEdge(5, 7);
		
		System.out.println("visted node flow is");
		//g.bfs();
		g.dfs(0);
	}

}
