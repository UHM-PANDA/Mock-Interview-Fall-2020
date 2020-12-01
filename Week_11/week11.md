# Week 11: “Graph it out”

#### 1) Search a Maze
Given a 2-d array filled with 1's and 0's representring closed and open spaces respectivley, and coordinates representring the start and end positions, output a 1 if a path exists between the beginning and end coordinates, and 0 if no path exists.
```
input: [ [1,1,1],[0,0,0],[1,1,1] ], 1, 0, 1, 3
output: 1

input: [ [1,1,1],[0,1,0],[1,1,1] ], 1, 0, 1, 3
output: 0
```
#### 2) Clone a graph
Given a reference to a vertex in a graph, create a copy of the graph that is reachable by the input vertex.
```
input: ->u->v->w->u
output: ->u1->v1->w1->u1
```
#### 3) Check to see if a graph is a bipartite graph
A bipartite graph (or bigraph) is a graph whose vertices can be divided into two disjoint and independent sets U and V such that every edge connects a vertex in U to one in V and vice versa. Given a reference to a vertex in the graph, determine if the graph is a bigraph or not.
```
input: [u: v], [v: u]
output: 1

input: [[u:v], [w:v]], [v:u]
output: 0
```
