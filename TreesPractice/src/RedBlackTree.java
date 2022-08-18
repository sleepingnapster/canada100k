public class RedBlackTree extends Bst {

    public void postInsert(Node x) {
        //case root
        if (isRoot(x)) {
            makeBlack(x);
        }


        Node y = getParent1(x);
        Node z = getParent1(y);
        Node s = getSibling(y);

        if ((y != null && z != null) && s != null) {

            if (isRed(x) && isRed(y)) {
                //case 1
                if (isBlack(s)) {
                    Node tempOrphan = disconnectOtherSiblingFromParent(x, y);
                    Node a = z;
                    disconnectSiblingFromParent(x, z);

                }

                //case 2
                if (isRed(s)) {
                    makeBlack(s);
                    makeBlack(y);
                    makeRed(z);
                    postInsert(z);
                }
            }
        }


    }


}
/**
 * CASE 1
 * B
 * B        R
 * R
 */