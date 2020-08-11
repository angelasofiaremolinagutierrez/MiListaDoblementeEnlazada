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

    public boolean isEquals(ListNode nodo){ //si un nodo es igual a otro
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
