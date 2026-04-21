import java.util.*;
class Graph {
	private List<Integer>[] g;
	public Graph(int v) {
		g = (ArrayList<Integer>[]) new ArrayList[v];

		for(int i = 0; i < v; i++) {
			g[i] = new ArrayList<>();
		}
	}
	public void addEdge(int v1, int v2) {
		g[v1].add(v2);
		g[v2].add(v1);
	}
}
