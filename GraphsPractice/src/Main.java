public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Graph g = new Graph();
        g.addVer('a');
        g.addVer('b');
        g.addVer('c');
        g.addVer('d');
        g.addVer('e');
        g.addVer('f');

        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(1,4);
        g.addEdge(2,4);
        g.addEdge(3,4);
        g.addEdge(3,5);
        g.addEdge(4,5);

      // g.dft();

        System.out.println("-----");
        g.bft();

    }
}