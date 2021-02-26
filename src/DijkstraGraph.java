/**
 * This class contains the implementation of the  Dijkstra Algorithm
 * done during the lecturer tutorials with few changes.
 */
public class DijkstraGraph {

  static int V = 0;

  // A costructor to allow to set the number of vertices dinamically
  public DijkstraGraph(int v) {
    V = v;
  }

  // check which node/vertex has the min distance and return its index as reference
  private int minDistance(int dist[], Boolean cloudSet[]) {
    int min = Integer.MAX_VALUE; // Store the highest possible number
    int minIndex = -1;

    for (int v = 0; v < V; v++) {
      if ((cloudSet[v] == false) && (dist[v] <= min)) {
        min = dist[v];
        minIndex = v;
      }
    }
    return minIndex;
  }

  // the main dijkstra Algorithm
  public void dijkstra(int graphWeight[][], int src) {
    int dist[] = new int[V];
    // store which vertix has been visited
    Boolean cloudSet[] = new Boolean[V];
    // All to distances to a MAX INTEGER VALUE we have in JAVA (Integer.MAX_VALUE)
    // Flag all node as not visited yet
    for (int i = 0; i < V; i++) {
      dist[i] = Integer.MAX_VALUE;
      cloudSet[i] = false;
    }
    // starting node/vertex
    dist[src] = 0;

    for (int count = 0; count < V - 1; count++) {
      int u = minDistance(dist, cloudSet);
      cloudSet[u] = true;

      for (int z = 0; z < V; z++) {
        if (
          !cloudSet[z] &&
          graphWeight[u][z] != 0 &&
          dist[u] != Integer.MAX_VALUE &&
          dist[u] + graphWeight[u][z] < dist[z]
        ) {
          // update the new shortest distance calculated
          dist[z] = dist[u] + graphWeight[u][z];
        }
      }
    }

    printSolution(dist, V);
  }

  private void printSolution(int dist[], int n) {
    System.out.println("Vertex Distance from Source:");
    for (int i = 0; i < V; i++) {
      System.out.println("vertex  V" + (i + 1) + " tt " + dist[i]);
    }
  }
}
