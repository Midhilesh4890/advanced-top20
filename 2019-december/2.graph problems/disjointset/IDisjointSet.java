package com.alg.advtop20.graph.disjointset;

public interface IDisjointSet {
	int find(int x);
	void union(int x, int y);
	void display();
	int size();
}
