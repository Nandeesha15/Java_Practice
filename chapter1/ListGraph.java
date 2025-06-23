import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.*;

public class ListGraph {
    int V;
    List<List<Integer>> adj;

    ListGraph(int v) {
        V = v;
        adj = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int src, int dest) {
        if (src >= 0 && src < V && dest >= 0 && dest < V) {
            adj.get(src).add(dest); 
            adj.get(dest).add(src); 
        } else {
            System.out.println("Invalid vertices");
        }
    }

    void printList() {
        for (int i = 0; i < V; i++) {
            System.out.println(i + "'s neighbour vertices==>");
            for (int neighbour : adj.get(i)) {
                System.out.print(neighbour + " ");
            }
            System.out.println();
        }

    }

    void bfs(int start) {
        boolean visited[] = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            System.out.println(curr + " ");

            for (int neighbour : adj.get(curr)) {
                if (!visited[neighbour]) {
                    queue.offer(neighbour);
                    visited[neighbour] = true;

                }
            }

        }

    }
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of vertices : ");
    int v = sc.nextInt();

    ListGraph graph = new ListGraph(v);
    System.out.println("Enter the number of edges : ");
    int e = sc.nextInt();

    System.out.println("Enter each edge (src and dest):");
    for (int i = 0; i < e; i++) {
        graph.addEdge(sc.nextInt(), sc.nextInt());
    }

    graph.printList();
    graph.bfs(2);

}
