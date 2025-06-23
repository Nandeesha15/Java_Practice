import java.util.*;
public class MatrixGraph {
    int V;
    int adjMatrix[][];

    MatrixGraph(int v){
        V =v;
        adjMatrix = new int[v][v];
    }
    void addEdge(int src ,int dest){
        if(src>0 && src<V && dest >=0 && dest<V){
            adjMatrix[src][dest] = 1;
            adjMatrix[dest][src] = 1;


        }
        else{
            System.out.println("INvalid");
        }

    }
    void printMatrix(){
        for(int i=0;i<V;i++)
        {
            for(int j=0;j<V;j++){
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int v = sc.nextInt();

        MatrixGraph graph = new MatrixGraph(v);
        System.out.println("Enter the number of edges");
        int e = sc.nextInt();
        for(int i =0;i<e;i++){
            System.out.println("Enter the src :");
            int src = sc.nextInt();
            System.out.println("Enter the dest :");
            int dest = sc.nextInt();
            graph.addEdge(src,dest);
        }
        graph.printMatrix();

        
       



        
    }
    
}
