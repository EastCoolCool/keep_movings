package com.lds.demo.com.tuling.suanfa.queue;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2019/9/17 下午5:02
 */
public class LinkedQueue<E> implements Queue<E> {


    class Node {

        private E data;

        private Node next;

        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(E data) {
            this(data, null);
        }

    }

    private int size;

    /**
     * 队头指针
     */
    private Node head;

    /**
     * 队尾指针
     */
    private Node tail;

    public LinkedQueue() {
        this.size = 0;
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean empty() {
        return size == 0;
    }

    @Override
    public void enqueue(E e) {
        Node oldTail = tail;
        tail = new Node(e, null);
        if (size == 0) {
            head = tail;
        } else {
            oldTail.next = tail;
        }
        size++;
    }

    @Override
    public E dequeue() {
        if (size == 0) {
            throw new RuntimeException("队列为空...");
        }
        E result = head.data;
        head = head.next;
        size--;
        if (size == 0) {
            tail = null;
        }
        return result;
    }

    @Override
    public E peek() {
        return head.data;
    }


    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedQueue<>();
        for (int i = 0; i < 20; i++) {
            queue.enqueue(i + 1);
        }

        for (int i = 0; i < 18; i++) {
            System.out.println("The element is: " + queue.dequeue());
        }
    }

}
