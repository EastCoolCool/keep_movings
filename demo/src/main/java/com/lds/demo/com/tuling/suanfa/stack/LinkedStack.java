package com.lds.demo.com.tuling.suanfa.stack;

import java.util.EmptyStackException;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2019/9/17 上午10:00
 */
public class LinkedStack<E> implements Stack<E> {


    class Node {
        private E data;
        private Node next;

        public Node(E data) {
            this(data, null);
        }

        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    private int size;

    /**
     * 栈顶节点数据
     */
    private Node top;

    @Override
    public String toString() {
        return "LinkedStack{" +
                "size=" + size +
                ", top=" + top +
                '}';
    }

    @Override
    public boolean empty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void push(E e) {
        top = new Node(e,top);
        size++;
    }

    @Override
    public E pop() {
        if(size == 0) {
            throw new EmptyStackException();
        }
        E result = top.data;
        top = top.next;
        size--;
        return result;
    }

    @Override
    public E peek() {
        if(size == 0) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public static void main(String[] args){
        LinkedStack linkedStack = new LinkedStack<>();
        linkedStack.push("1111111");
        linkedStack.push("2222222");
        linkedStack.push("3333333");
        System.out.println(linkedStack);
        System.out.println(linkedStack.size());
        for (int i = 0;i<3;i++){
            System.out.println(linkedStack.pop());
            System.out.println(linkedStack.size());
        }
    }


}
