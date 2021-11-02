package com.lds.demo.com.tuling.suanfa;

import java.util.*;

/**
 * @描述: 手写一个动态数组 ArrayList
 * @Author EastCool·Lee
 * @Date 2019/9/16 下午3:56
 */
public class ArrayList implements List {

    /**
     * 维护数组的长度
     */
    private int size;

    /**
     * 维护数组
     */
    private Object[] data;

    /**
     * 数组默认的长度
     */
    private static final int DEFAULT_CAPACITY = 1 << 4;

    public ArrayList(int capacity) {
        this.size = 0;
        this.data = new Object[capacity];
    }

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(int index, Object element) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        //首先判断容器是否还够用,不够用则扩容,1.5倍扩容
        if (data.length == size) {
            int newCapacity = data.length + data.length >> 1;
            grow(newCapacity);
        }

        //index后面的索引都往后移动一位,从最后一个开始移动,否则会出现数据覆盖的情况
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = element;
        size++;
    }

    private void grow(int newCapacity) {
        Object[] newData = new Object[newCapacity];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
        //本地native方法扩容,效率很高
        //data = Arrays.copyOf(data, newCapacity);
    }

    @Override
    public Object remove(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Object obj = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i] = data[i - 1];
        }
        data[size] = null;

        //容量缩减
        if (size <= (data.length >> 1)) {
            grow(size >> 1);
        }

        return obj;
    }


    @Override
    public Object get(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return data[index];
    }

    @Override
    public void set(int index, Object o) {

    }


    @Override
    public int indexOf(Object o) {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(1 << 4);
    }


}
