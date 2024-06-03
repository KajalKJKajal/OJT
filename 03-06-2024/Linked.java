import java.util.LinkedList;
public class Linked {
    public static void main(String[] args) {
        LinkedList<String> data=new LinkedList<>();
        data.add("white");
        data.add("red");
        data.add("orange");

        data.addFirst("blue");

        data.addLast("black");

        data.removeFirst();

        data.removeLast();

        System.out.println(data);

}
}
// In Java, LinkedList is a class that implements the List interface. 
// Each element in a LinkedList is called a Node, and it contains a reference 
// to the next Node in the list.