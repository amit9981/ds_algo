package com.ds.list;

public class ListNode {
    int data;
    ListNode nextData;

    public ListNode(int data) {
        this.data=data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNextData() {
        return nextData;
    }

    public void setNextData(ListNode nextData) {
        this.nextData = nextData;
    }
}
