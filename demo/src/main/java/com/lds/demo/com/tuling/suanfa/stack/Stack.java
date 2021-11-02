package com.lds.demo.com.tuling.suanfa.stack;


public interface Stack<E> {

    /**
     * 判断栈是否为空
     */
    boolean empty();

    /**
     * 返回栈中元素数量
     */
    int size();

    /**
     * 压栈
     */
    void push(E item);

    /**
     * 弹栈
     */
    E pop();

    /**
     * 查看栈顶元素（不弹栈）
     */
    E peek();
}
