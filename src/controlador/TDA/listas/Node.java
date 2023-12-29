package controlador.TDA.listas;

public class Node<E> {
    private E info;
    private Node<E> next;

    public Node(E info) {
        this.info = info;
        next = null;
    }

    public Node(E info, Node<E> next) {
        this.info = info;
        this.next = next;
    }

    public Node() {
        next = null;
        info = null;
    }

    public E getInfo() {
        return info;
    }

    public void setInfo(E info) {
        this.info = info;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}
