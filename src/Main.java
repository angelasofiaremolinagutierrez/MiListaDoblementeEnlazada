import co.edu.upb.list.DoubleList;
import co.edu.upb.list.DoubleListNode;

public class Main {

    public static void main(String[] args) {
	    DoubleList doubleList = new DoubleList();
        for (int i = 0; i <5 ; i++) {
            doubleList.add(i);
        }

        printDoubleList(doubleList);
        doubleList.insert(doubleList.head.next,1.5);
        printDoubleList(doubleList);

    }
    public static void printDoubleList(DoubleList doubleList){
        DoubleListNode rec = doubleList.head;
        for (int i = 0; i < doubleList.getSize(); i++) {
            System.out.println(rec.toString());
            rec = rec.next;
        }
        System.out.println("\n");
    }
}
