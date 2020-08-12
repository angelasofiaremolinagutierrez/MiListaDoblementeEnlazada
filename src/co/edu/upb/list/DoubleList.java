package co.edu.upb.list;

import java.util.Iterator;

public class DoubleList implements DoubleListInterface, Iterable<DoubleListNode> {
    public DoubleListNode head;
    public DoubleListNode tail;

    int size = 0;

    public DoubleList() {
        this.head = null;
        this.head = null;
    }

    public DoubleList(Object object){
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
    public Object get(DoubleListNode node) {
        return node.getObject();
    }

    @Override
    public DoubleListNode search(Object object) {
        DoubleListNode n = head;
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
    public boolean insert(DoubleListNode nodoAtras, Object object) {
        if(nodoAtras.isEquals(this.tail)){
            return insertTail(object);
        }else if(nodoAtras.isEquals(this.head)){
            return insertHead(object);
        }else{

            DoubleListNode nuevoNodo = new DoubleListNode(object);
            nuevoNodo.prev = nodoAtras; //el nuevo agarra al de atras
            nuevoNodo.next = nodoAtras.next; // el nuevo agarra al siguiente
            nodoAtras.next = nuevoNodo; //el de atrás agarra al nuevo y suelta al siguiente
            nuevoNodo.next.prev = nuevoNodo; //el siguiente agarra al nuevo y suelta el de atrás

            size += 1;
            return true;
        }
    }

    @Override
    public boolean insert(Object object, Object objectRef) {
        DoubleListNode nuevoNodo = new DoubleListNode(object);
        DoubleListNode nodoRef = this.search(objectRef);

        nuevoNodo.next = nodoRef.next;// el nuevo agarra al siguiente
        nuevoNodo.prev = nodoRef; //el nuevo agarra al de atras
        nodoRef.next = nuevoNodo; //el de atrás agarra al nuevo y suelta al siguiente
        nuevoNodo.next.prev = nuevoNodo;//el siguiente agarra al nuevo y suelta el de atrás

        size += 1;
        return false;
    }

    @Override
    public boolean insertHead(Object object) {
        DoubleListNode nuevo = new DoubleListNode(object);
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
        DoubleListNode nuevo = new DoubleListNode(object);
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
    public boolean set(DoubleListNode node, Object object) {
        node.setObject(object);
        return true;
    }

    @Override
    public boolean remove(DoubleListNode node) {
        DoubleListNode n = head;
        if(node.isEquals(head)){
            head = head.next;
            
        }
        while (n != null){
            if(n.isEquals(node)){
                DoubleListNode anterior = n.prev;
                DoubleListNode siguiente = n.next;

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
    public Iterator<DoubleListNode> iterator() {
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
    public Object getBeforeTo(DoubleListNode node) {
        // TODO
        return null;
    }

    @Override
    public Object getNextTo() {
        // TODO
        return null;
    }

    @Override
    public Object getNextTo(DoubleListNode node) {
        // TODO
        return null;
    }

    @Override
    public DoubleList subList(DoubleListNode from, DoubleListNode to) {
        // TODO
        return null;
    }

    @Override
    public DoubleList sortList() {
        // TODO
        return null;
    }
}
