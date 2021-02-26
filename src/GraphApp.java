/**
 * START:       V1
 * DESTINATION: V11
 *
 * C = { V1 }
 * C = { V1, V2 }
 * C = { V1, V2, V3 }
 * C = { V1, V2, V3, V4 }
 * C = { V1, V2, V3, V10 }
 * C = { V1, V2, V3, V10, V8 }
 * C = { V1, V2, V3, V10, V8, V11 }
 * C = { 00, 03, 02, 004, 02, 001 }
 * D = (  0 + 3 + 2  + 4 + 2  + 1 ) = 12
 *
 */

/**
 * This class is used as entry point
 */
public class GraphApp {

  public static void main(String[] args) {
    // This is the matrix related to the grap.png
    //      0  1  2  3  4  5  6  7  8   9  10
    //      V1 V2 V3 V4 V5 V6 V7 V8 V9 V10 V11
    int graphWeights[][] = new int[][] {
      /*V1*/{ 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
      /*V2*/{ 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0 },
      /*V3*/{ 0, 0, 0, 3, 0, 0, 0, 0, 0, 4, 0 },
      /*V4*/{ 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0 },
      /*V5*/{ 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0 },
      /*V6*/{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
      /*V7*/{ 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
      /*V8*/{ 0, 0, 0, 0, 0, 2, 1, 0, 0, 0, 1 },
      /*V9*/{ 2, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 },
      /*V10*/{ 0, 0, 0, 0, 0, 0, 0, 2, 3, 0, 0 },
      /*V11*/{ 0, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0 },
    };

    // here we use the Dijkstra Algorithm to find the shortest path
    // starting from the Vertix 1 (index 0)
    DijkstraGraph dijObject = new DijkstraGraph(11);
    dijObject.dijkstra(graphWeights, 0);
  }
}
