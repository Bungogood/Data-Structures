class Queue<T> {
    private class Node {
        public T data;
        public Node next;

        Node(T d) {
            this.data = d;
            this.next = null;
        }
    }

    private Integer length;
    private Node head;
    private Node tail;
    
    public Queue() {
        this.length = 0;
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public Integer getLength() {
        return this.length;
    }

    public void clear() {
        this.head = null;
    }

    public T peek() {
        return this.isEmpty() ? null : this.head.data;
    }

    public void enqueue(T d) {
        Node tmp = new Node(d);
        if (this.isEmpty()) {
            this.tail = tmp;
            this.head = tmp;
        } else {
            this.tail.next = tmp;
            this.tail = tmp;
        }
        this.length++;
    }

    public T dequeue() {
        if (this.isEmpty()) {
            return null;
        } else {
            Node tmp = this.head;
            this.head = this.head.next;
            this.length--;
            return tmp.data;
        }
    }

    public void display() {
        System.out.print(this.length);
        System.out.print(": ");
        if (!this.isEmpty()) {
            Node tmp = this.head;
            while (tmp.next != null) {
                System.out.print(tmp.data);
                System.out.print("->");
                tmp = tmp.next;
            }
            System.out.print(tmp.data);
        }
        System.out.println("");
    }
}

class main {
    public static void main(String[] args) {
        Queue<Integer> s = new Queue<Integer>();
        s.enqueue(1);
        s.enqueue(2);
        s.enqueue(4);
        s.dequeue();
        s.display();
    }
}