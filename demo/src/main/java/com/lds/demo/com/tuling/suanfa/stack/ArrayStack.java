package com.lds.demo.com.tuling.suanfa.stack;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @描述: 数组实现栈
 * @Author EastCool·Lee
 * @Date 2019/9/17 上午9:32
 */
public class ArrayStack<E> implements Stack<E> {

    /**
     * 维护一个数组,实现栈
     */
    private E[] data;

    /**
     * 维护一个数组的长度
     */
    private int size;

    /**
     * 栈顶元素索引
     */
    private int top;

    private static final int DEFAULT_CAPACITY = 10;

    public ArrayStack(int capacity) {
        this.size = 0;
        this.top = -1;
        data = (E[]) new Object[capacity];
    }

    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    @Override
    public String toString() {
        return "ArrayStack{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
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
        //长度判断是否需要扩容
        if (size >= data.length) {
            grow(data.length << 1);
        }

        data[++top] = e;
        size++;

    }

    @Override
    public E pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }

        if(size < data.length/2) {
            grow(data.length/2);
        }

        size--;
        return data[top--];
    }

    @Override
    public E peek() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return data[top];
    }


    public void grow(int newCapacity) {
        data = Arrays.copyOf(data, newCapacity);
    }

    public static void main(String[] args){
        ArrayStack arrayStack = new ArrayStack();
        arrayStack.push("1111111");
        arrayStack.push("2222222");
        arrayStack.push("3333333");
        System.out.println(arrayStack);
        System.out.println(arrayStack.size);
        for (int i = 0;i<3;i++){
            System.out.println(arrayStack.pop());
        }
    }

}
