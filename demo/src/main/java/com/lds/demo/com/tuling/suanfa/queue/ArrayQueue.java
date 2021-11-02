package com.lds.demo.com.tuling.suanfa.queue;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2019/9/17 下午3:23
 */
public class ArrayQueue<E> implements Queue<E> {


    private final static int DEFAULT_CAPACITY = 10;

    /**
     * 队列长度(数组长度)
     */
    private int size;

    /**
     * 维护一个数组
     */
    private E[] data;

    /**
     * 队头元素
     */
    private int head;

    /**
     * 队尾元素
     */
    private int tail;

    public ArrayQueue() {
        this.size = 0;
        this.data = (E[]) new Object[DEFAULT_CAPACITY];
        this.head = -1;
        this.tail = -1;
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
        if (data.length==size){
            grow(size * 2);
        }
        //todo 扩容
        tail = (tail + 1) % data.length;
        data[tail] = e;
        if (size == 0) {
            head = tail;
        }
        size++;
    }

    @Override
    public E dequeue() {
        if (size == 0) {
            throw new RuntimeException("队列为空...");
        }
        E result = data[head];
        head = (head + 1) % data.length;
        size--;
        //todo 缩容
        if (size<(data.length/2)){
            grow(data.length/2);
        }
        return result;
    }

    @Override
    public E peek() {

        if (size == 0) {
            throw new RuntimeException("队列为空...");
        }

        return data[head];
    }

    public void grow(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[((head + i) % data.length)];
        }
        data = newData;
        head = 0;
        tail = size - 1;
    }


    public static void main(String[] args){
        Queue<Integer> queue = new ArrayQueue<>();
        for(int i=0; i<20; i++) {
            queue.enqueue(i+1);
        }

        for(int i=0; i<18; i++) {
            System.out.println("The element is: " + queue.dequeue());
        }
    }


}
