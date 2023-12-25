package com.LinkedList;

import java.util.LinkedList;

public class LL {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(1);
        ll.add(2);
        ll.add(3);
        ll.addLast(4);
        ll.add(2, 69);

        System.out.println(ll); // [1, 2, 69, 3, 4]
    }
}

