public class BST{

    public Node raiz;

    public BST(String name, int score){

        raiz = new Node(name, score);
    }

    public void  Agregar(String name, int score) {
        raiz = AgregarRecursivo(raiz, name, score);
    }

    private Node AgregarRecursivo(Node raiz , String name, int score){

        if(raiz == null){

            return new Node(name, score);
        }

        else if(score < raiz.score){

            raiz.left = AgregarRecursivo(raiz.left, name, score);
        }
        else if(score > raiz.score){

            raiz.right = AgregarRecursivo(raiz.right, name, score);
        }





return }

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
