class GraphPathAM {
	private GraphAM g;
	private boolean found;
	private boolean[] visited;

	private boolean searchR(int v, int w) {
		if(v == w) return true;
		visited[v] = true;

		GraphAM.AdjList a = g.getAdjList(v);

		for(int i = a.beg(); !a.end(); i = a.nxt()) {
			if(!visited[i]) {
				if(searchR(i, w)) return true;
			}
		}
		return false;
	}
	GraphPathAM(GraphAM g, int v, int w) {
		this.g = g;
		found = false;
		visited = new boolean[g.v()];
		found = searchR(v,w);
	}
	boolean exists() {
		return found;
	}
}
