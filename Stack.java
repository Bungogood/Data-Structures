class Stack<T> {
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
    
    public Stack() {
        this.length = 0;
        this.head = null;
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

    public void push(T d) {
        Node tmp = new Node(d);
        tmp.next = this.head;
        this.head = tmp;
        this.length++;
    }

    public T pop() {
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
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(4);
        s.pop();
        s.display();
    }
}