package co.edu.upb.list;

public class DoubleListNode {
    public DoubleListNode prev;
    private Object object;
    public DoubleListNode next;

    public DoubleListNode() {
        this.prev = null;
        this.object = null;
        this.next = null;
    }
    public DoubleListNode(Object object) {
        this.prev = null;
        this.object = object;
        this.next = null;
    }

    public boolean isEquals(DoubleListNode nodo){ //si un nodo es igual a otro
        if(this.toString().equals(nodo.toString())){
            return true;
        }else{
            return false;
        }
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "{" +
                //"prev=" + prev +
                "object=" + object +
                ", next=" + next +
                '}';
    }
}
