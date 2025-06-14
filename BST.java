public class BST{

    public Node raiz;

    public BST(String name, int score){

        raiz = new Node(name, score);
    }

}

class Node {

    String name;
    int score;
    Node left,right;

    public Node(String name, int score) {
        this.name = name;
        this.score = score;
        this.left = null;
        this.right = null;
    }

}
