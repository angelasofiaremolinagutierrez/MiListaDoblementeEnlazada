package co.edu.upb.list;

import java.util.Iterator;

public class List implements ListInterface{
    ListNode head;
    ListNode tail;

    int size = 0;

    public List() {
        this.head = null;
        this.head = null;
    }

    public List(Object object){
        insertTail(object);
    }

    @Override
    public boolean isEmpty() {
        if(size == 0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() { //todo preguntar por este metodo
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public Object getHead() {
        return head;
    }

    @Override
    public Object getTail() {
        return tail;
    }

    @Override
    public Object get(ListNode node) {
        // TODO
        return null;
    }

    @Override
    public Object search(Object object) {
        // TODO
        return null;
    }

    @Override
    public boolean add(Object object) {
        return insertTail(object);
    }

    @Override
    public boolean insert(ListNode node, Object object) {
        // TODO
        size += 1;
        return false;
    }

    @Override
    public boolean insert(Object ob, Object object) {
        // TODO
        size += 1;
        return false;
    }

    @Override
    public boolean insertHead(Object object) {
        // TODO
        size += 1;
        return false;
    }

    @Override
    public boolean insertTail(Object object) {
        ListNode nuevo = new ListNode(object);
        if(isEmpty()){
            head = nuevo;
            tail = head;
        }else{
            nuevo.prev = tail;
            tail.next = nuevo;
            tail = nuevo;
        }
        size += 1;
        return true;
    }

    @Override
    public boolean set(ListNode node, Object object) {
        // TODO
        return false;
    }

    @Override
    public boolean remove(ListNode node) {
        // TODO
        size -= 1;
        return false;
    }

    @Override
    public boolean contains(Object object) {
        // TODO
        return false;
    }

    @Override
    public Iterator<ListNode> iterator() {
        // TODO
        return null;
    }

    @Override
    public Object[] toArray() {
        // TODO
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] object) {
        // TODO
        return new Object[0];
    }

    @Override
    public Object getBeforeTo() {
        // TODO
        return null;
    }

    @Override
    public Object getBeforeTo(ListNode node) {
        // TODO
        return null;
    }

    @Override
    public Object getNextTo() {
        // TODO
        return null;
    }

    @Override
    public Object getNextTo(ListNode node) {
        // TODO
        return null;
    }

    @Override
    public List subList(ListNode from, ListNode to) {
        // TODO
        return null;
    }

    @Override
    public List sortList() {
        // TODO
        return null;
    }
}
