package list;

public class TestLinkedListBasic {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFist("aaa");
        list.addFist("bbb");
        list.addFist("ccc");
        System.out.println(list.removeFirst());
        list.print();
    }
}
