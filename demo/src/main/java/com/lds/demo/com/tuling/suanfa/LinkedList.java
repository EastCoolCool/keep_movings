package com.lds.demo.com.tuling.suanfa;


/**
 * @描述: 单向链表实现linkedList
 * @Author EastCool·Lee
 * @Date 2019/9/16 下午10:37
 */
public class LinkedList<E> implements List<E> {

    /**
     * 单向链表
     * <p>
     * 链表包括:数据域 & 指针域(指向下一个节点的指针)
     */
    class Node {
        //数据域
        private E data;
        //指针域
        private Node next;

        public Node(E data) {
            this(data, null);
        }

        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    /**
     * 维护一个头部节点
     */
    private Node head;

    /**
     * 维护一个链表当前size
     */
    private int size;


    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(E o) {
        Node p = head;
        while (null != p) {
            if (p.data.equals(o)) {
                return true;
            }
            p = p.next;
        }
        return false;
    }

    @Override
    public int indexOf(E e) {
        Node p = head;
        int i = 0;
        while (null != p) {
            if (p.data.equals(e)) {
                return i;
            }
            p = p.next;
            i++;
        }
        return -1;
    }

    @Override
    public E get(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node p = head;
        int i = 0;
        while (null != p) {
            if (i == index) {
                break;
            }
            p = p.next;
            i++;
        }
        return p.data;
    }

    @Override
    public void set(int index, E e) {

        //可以等于size 放在链表的尾部
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node p = head;
        for (int i = 0; i < index; i++) {
            p = p.next;
        }
        p.data = e;
    }

    @Override
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            addFirst(e);
        } else if (index == size) {
            addLast(e);
        } else {
            Node p = head;
            for (int i = 0; i < index; i++) {
                p = p.next;
            }
            p.next = new Node(e, p.next);
        }
        size++;

    }

    @Override
    public E remove(int index) {
        return null;
    }


    public void addFirst(E e) {
        //第一个元素为当前节点data,第二个元素为下一个节点node(也就是这次增加前的head)
        Node newNode = new Node(e, head);
        head = newNode;
        size++;
    }

    public void addLast(E e) {
        //遍历 知道next ==null 则说明是尾部
        Node newNode = new Node(e, null);
        Node p = head;
        if (head == null) {
            head = newNode;
        } else {
            while (p.next != null) {
                p = p.next;
            }
            p.next = newNode;
        }

        size++;

    }

}
