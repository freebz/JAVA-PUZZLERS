// 고쳤지만 더 좋은 방법으로도 고칠 수 있습니다.
public class LinkedList<E> {
    private Node head = null;

    private class Node {
	E value;
	Node next;

	// 노드 생성자는 노드를 새로운 head로 연결합니다.
	Node(E value) {
	    this.value = value;
	    this.next = head;
	    head = this;
	}
    }

    public void add(E e) {
	new Node(e);
	// 노드를 새로운 head로 연결합니다.
    }

    public void dump() {
	for (Node n = head; n != null; n = n.next)
	    System.out.print(n.value + " ");
    }
}
