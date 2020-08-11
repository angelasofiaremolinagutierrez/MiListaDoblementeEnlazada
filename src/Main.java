import co.edu.upb.list.List;
import co.edu.upb.list.ListNode;

public class Main {

    public static void main(String[] args) {
	    List list = new List();
        for (int i = 0; i <5 ; i++) {
            list.add(i);
        }

        printDoubleList(list);
        list.insert(list.head.next,1.5);
        printDoubleList(list);

    }
    public static void printDoubleList(List list){
        ListNode rec = list.head;
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(rec.toString());
            rec = rec.next;
        }
        System.out.println("\n");
    }
}
