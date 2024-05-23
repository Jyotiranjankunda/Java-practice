import java.util.ArrayList;

public class Class32_Graphs {
  static class Edge {
    int src;
    int dest;

    public Edge(int s, int d){
      this.src = s;
      this.dest = d;
    }
  }

  static class WeightedEdge{
    int src;
    int dest;
    int wt;

    public WeightedEdge(int s, int d, int w){
      this.src = s;
      this.dest = d;
      this.wt = w;
    }
  }

  public static void createGraph(ArrayList<Edge> graph[]){
    // Initially the array is null, we need to remove null and put empty arraylist there.

    for (int i = 0; i < graph.length; i++) {
      graph[i] = new ArrayList<Edge>();
    }

    graph[0].add(new Edge(0, 2));

    graph[1].add(new Edge(1, 2));
    graph[1].add(new Edge(1, 3));

    graph[2].add(new Edge(2, 0));
    graph[2].add(new Edge(2, 1));
    graph[2].add(new Edge(2, 3));

    graph[3].add(new Edge(3, 1));
    graph[3].add(new Edge(3, 2));
  }

  public static void createWeightedGraph(ArrayList<WeightedEdge> graph[]){
    // Initially the array is null, we need to remove null and put empty arraylist there.

    for (int i = 0; i < graph.length; i++) {
      graph[i] = new ArrayList<WeightedEdge>();
    }

    graph[0].add(new WeightedEdge(0, 2, 2));

    graph[1].add(new WeightedEdge(1, 2, 10));
    graph[1].add(new WeightedEdge(1, 3, 0));

    graph[2].add(new WeightedEdge(2, 0, 2));
    graph[2].add(new WeightedEdge(2, 1, 10));
    graph[2].add(new WeightedEdge(2, 3, -1));

    graph[3].add(new WeightedEdge(3, 1, 0));
    graph[3].add(new WeightedEdge(3, 2, -1));
  }

  public static void main(String[] args) {
    int V = 4;

    ArrayList<Edge> graph[] = new ArrayList[V];
    createGraph(graph);

    // print 2's neighbours
    System.out.println("Neighbours of 2 : ");
    for(int i=0; i<graph[2].size(); i++){
      Edge e = graph[2].get(i);
      System.out.print(e.dest + " ");
    }
    System.out.println();

    // Weighted graph
    ArrayList<WeightedEdge> weightedGraph[] = new ArrayList[V];
    createWeightedGraph(weightedGraph);

    // print neighbours of 2 and their weights
    for (int i = 0; i < weightedGraph[2].size(); i++) {
      WeightedEdge e = weightedGraph[2].get(i);
      System.out.println("Neighbour : " + e.dest + ", Weight : " + e.wt);
    }
  }
}
