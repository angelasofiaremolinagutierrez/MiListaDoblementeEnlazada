package co.edu.upb.list;

import java.util.Iterator;

public class List implements ListInterface, Iterable<ListNode> {
    public ListNode head;
    public ListNode tail;

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
        return node.getObject();
    }

    @Override
    public ListNode search(Object object) {
        ListNode n = head;
        while(n != null){
            if(n.getObject().toString().equals(object.toString())){
                return n;
            }else{
                n = n.next;
            }
        }
        System.out.println("Ese objeto no se encuentra en la lista");
        return null;
    }

    @Override
    public boolean add(Object object) {
        return insertTail(object);
    }

    @Override
    public boolean insert(ListNode nodoAtras, Object object) {
        if(nodoAtras.isEquals(this.tail)){
            return insertTail(object);
        }else if(nodoAtras.isEquals(this.head)){
            return insertHead(object);
        }else{

            ListNode nuevoNodo = new ListNode(object);
            nuevoNodo.prev = nodoAtras; //el nuevo agarra al de atras
            nuevoNodo.next = nodoAtras.next; // el nuevo agarra al siguiente
            nodoAtras.next = nuevoNodo; //el de atrás agarra al nuevo y suelta al siguiente
            nuevoNodo.next.prev = nuevoNodo; //el siguiente agarra al nuevo y suelta el de atrás

            size += 1;
            return true;
        }
    }

    @Override
    public boolean insert(Object ob, Object object) {
        // TODO
        size += 1;
        return false;
    }

    @Override
    public boolean insertHead(Object object) {
        ListNode nuevo = new ListNode(object);
        if(isEmpty()){
            head = nuevo;
            tail = head;
        }else{
            nuevo.next = head;
            head.prev = nuevo;
            head = nuevo;
        }
        size += 1;
        return true;
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
        node.setObject(object);
        return true;
    }

    @Override
    public boolean remove(ListNode node) {
        ListNode n = head;
        if(node.isEquals(head)){
            head = head.next;
            
        }
        while (n != null){
            if(n.isEquals(node)){
                ListNode anterior = n.prev;
                ListNode siguiente = n.next;

                anterior.next = siguiente;
                siguiente.prev = anterior;
                n = null;
            }else{
                n = n.next;
            }
        }
        size -= 1;
        return true;
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
