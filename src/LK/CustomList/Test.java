package LK.CustomList;

public class Test {
    public static void main(String... args) {
        CustomList<Integer> list = new CustomList<>();
        list.add(8);
        list.add(5);
        System.out.println(list);
        System.out.println(list.get(1));
    }
}