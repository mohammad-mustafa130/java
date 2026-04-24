import java.util.*;
class Graph {
	private int Vcnt, Ecnt;
	private boolean digraph;

	private class Node {
		int v;
		Node next;
		Node(int x, Node t) {
			v = x;
			next = t;
		}
	}
	Node[] adj;
	Graph(int v, boolean flag) {
		Vcnt = v;
		Ecnt = 0;
		digraph = flag;
		adj = new Node[v];
	}
	int v() {
		return Vcnt;
	}
	int e() {
		return Ecnt;
	}
	boolean directed() {
		return digraph;
	}
	void insert(int v, int w) {
		adj[v] = new Node(w, adj[v]);
		if(!digraph) {
			adj[w] = new Node(v, adj[w]);
		}
		Ecnt++;
	}
	AdjList getAdjList(int v) {
		return new AdjLinkedList(v);
	}
	interface AdjList {
		int beg();
		int nxt();
		boolean end();
	}
	private class AdjLinkedList implements AdjList {
		private int v;
		private Node t;
		AdjLinkedList(int v) {
			this.v = v;
			t = null;
		}
		public int beg() {
			t = adj[v];
			return t == null ? -1 : t.v;
		}
		public int nxt() {
			if(t != null) t = t.next;
			return t == null ? -1 : t.v;
		}
		public boolean end() {
			return t == null;
		}
	}
	public void show(Graph g) {
		for(int i = 0; i < g.v(); i++) {
			System.out.print(i + " : ");

			AdjList a = g.getAdjList(i);

			for(int j = a.beg(); !a.end(); j = a.nxt()) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	void randE(Graph g, int e) {
		for(int i = 0; i < e; i++) {
			int v = (int)(g.v() * Math.random());
			int w = (int)(g.v() * Math.random());
			g.insert(v,w);
		}
	}
}

