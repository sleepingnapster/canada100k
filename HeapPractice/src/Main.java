public class Main {
    public static void main(String[] args) {


        MinHeap mh = new MinHeap();
        System.out.println("Hello world!");
        mh.add(3);
        mh.add(6);
        mh.add(4);
        mh.add(9);
        System.out.println(mh.poll());
        mh.add(90);
        System.out.println(mh.poll());
        mh.add(88);
        System.out.println(mh.poll());

    }
}