import java.util.*;

public class Graph {

    Vertex[] vertexList;
    boolean[] visited;
    int nVertex;
    int VER_MAX = 20;
    Stack<Integer> s;
    Queue<Integer> q;
    int[][] adjMat;

    public Graph() {
        this.vertexList = new Vertex[VER_MAX];
        this.visited = new boolean[VER_MAX];
        adjMat = new int[VER_MAX][VER_MAX];
        this.nVertex = 0;
        s = new Stack<>();
        q = new LinkedList<>();
    }

    public void addVer(char l) {
        vertexList[nVertex++] = new Vertex(l);
    }

    public void displayVer(int v) {
        System.out.println(vertexList[v].label);
    }

    public void displayVer(Vertex v) {
        System.out.println(v.label);
    }

    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public int getUnVisitedAdjVer(int v) {
        for (int i = 0; i < nVertex; i++) {
            if (adjMat[v][i] == 1 && !vertexList[i].visited) {
                return i;
            }
        }
        return -1;
    }

    public List<Integer> getAllUnVisitedAdjVer(int v) {
        List<Integer> unVisitedIndexes = new ArrayList<>();
        for (int i = 0; i < nVertex; i++) {
            if (adjMat[v][i] == 1 && !vertexList[i].visited) {
                unVisitedIndexes.add(i);
            }
        }
        return unVisitedIndexes;
    }

    public void dft() {
        vertexList[0].visited = true;
        displayVer(0);
        s.push(0);

        while (!s.isEmpty()) {
            if (getUnVisitedAdjVer(s.peek()) == -1) {
                s.pop();
            } else {
                int v = getUnVisitedAdjVer(s.peek());
                vertexList[v].visited = true;
                displayVer(v);
                s.push(v);
            }
        }
    }


    public void bft() {
        vertexList[0].visited = true;
        q.add(0);
        while (!q.isEmpty()) {
            int v = q.poll();
            displayVer(v);
            for (Integer ii :  getAllUnVisitedAdjVer(v)) {
                vertexList[ii].visited = true;
                q.add(ii);
            }
        }
    }
}