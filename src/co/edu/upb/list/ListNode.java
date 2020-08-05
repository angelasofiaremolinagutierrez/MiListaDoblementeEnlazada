package co.edu.upb.list;

public class ListNode {
    public ListNode prev;
    private Object object;
    public ListNode next;

    public ListNode() {
        this.prev = null;
        this.object = null;
        this.next = null;
    }
    public ListNode(Object object) {
        this.prev = null;
        this.object = object;
        this.next = null;
    }

    public ListNode getPrev() {
        return prev;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "prev=" + prev +
                ", object=" + object +
                ", next=" + next +
                '}';
    }
}
