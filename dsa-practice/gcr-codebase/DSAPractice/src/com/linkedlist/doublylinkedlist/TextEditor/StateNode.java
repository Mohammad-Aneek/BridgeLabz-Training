package com.linkedlist.doublylinkedlist.TextEditor;

public class StateNode {
    private String textContent;
    public StateNode next;
    public StateNode prev;

    public StateNode(String textContent) {
        this.textContent = textContent;
        this.next = null;
        this.prev = null;
    }

    public String getContent() {
        return textContent;
    }
}