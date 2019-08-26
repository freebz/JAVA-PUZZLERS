public class LinkedList<E> {
    private Node<E> head = null;

    private class Node<E> {
	E value;
	Node<E> next;

	// 노드 생성자는 노드를 새로운 head로 연결합니다.
	Node(E value) {
	    this.value = value;
	    this.next = head;
	    head = this;
	}
    }

    public void add(E e) {
	new Node<E>(e);
	// 노드를 새로운 head로 연결합니다.
    }

    public void dump() {
	for (Node<E> n = head; n != null; n = n.next)
	    System.out.print(n.value + " ");
    }

    public static void main(String[] args) {
	LinkedList<String> list = new LinkedList<String>();
	list.add("world");
	list.add("Hello");
	list.dump();
    }
}
