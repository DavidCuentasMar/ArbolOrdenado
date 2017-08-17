package arbol;
public class Node {
    int num;
    Node izqNode;
    Node derNode;

    public Node(int num) {
        this.num = num;
        izqNode=null;
        derNode=null;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Node getIzqNode() {
        return izqNode;
    }

    public void setIzqNode(Node izqNode) {
        this.izqNode = izqNode;
    }

    public Node getDerNode() {
        return derNode;
    }

    public void setDerNode(Node derNode) {
        this.derNode = derNode;
    }
    
    
    
}
