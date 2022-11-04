package list;

import java.util.NoSuchElementException;

public class TestListUsingArray {
    public static void main(String[] args) throws NoSuchElementException {
        ListArray<String> list = new ListArray<>();
        list.addFist("aaa");
        list.addFist("bbb");
        list.addFist("ccc");
        list.removeFirst();
        list.print();

        if (list.isContains("aaa")) {
            list.addFist("xxxx");
        }
        list.print();
    }
}
