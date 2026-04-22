class GraphAM {
	private int Vcnt, Ecnt;
	private boolean digraph;
	private boolean[][] adj;

	GraphAM(int v, boolean flag) {
		Vcnt = v;
		Ecnt = 0;
		digraph = flag;
		adj = new boolean[v][v];
	}
	int V() {
		return Vcnt;
	}
	int E() {
		return Ecnt;
	}
	boolean directed() {
		return digraph;
	}
	void insert(int v, int w) {
		if(adj[v][w] == false) {
			Ecnt++;
			adj[v][w] = true;
		}
		if(!digraph) {
			adj[w][v] = true;
		}
	}
	void remove(int v, int w) {
		if(adj[v][w] == true) {
			Ecnt--;
			adj[v][w] = false;
		}
		if(!digraph) adj[w][v] = false;
	}
	boolean edge(int v, int w) {
		return adj[v][w];
	}
	AdjList getAdjList(int v) {
		return new AdjArray(v);
	}
	interface AdjList {
		int beg();
		int nxt();
		boolean end();
	}
	private class AdjArray implements AdjList {
		private int i, v;
		AdjArray(int v) {
			this.v = v;
			i = -1;
		}
		public int beg() {
			i = -1;
			return nxt();
		}
		public int nxt() {
			for(i++; i < V(); i++) {
				if(edge(v,i) == true) return i;
			}
			return -1;
		}
		public boolean end() {
			return i >= V();
		}
	}
}
