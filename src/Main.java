import co.edu.upb.list.List;

public class Main {

    public static void main(String[] args) {
	    List list = new List();
        for (int i = 0; i <5 ; i++) {
            list.add(i);
        }
        System.out.println(list.get(list.tail));
    }
}
