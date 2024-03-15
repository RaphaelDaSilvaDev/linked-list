public class App {
    public static void main(String[] args) {
        System.out.println("Initialize List");
        List<String> myList = new List<>();

        System.out.println("Get empty list size");
        System.out.println(myList.size());

        System.out.println("Adding items into list");
        myList.add("c1");
        myList.add("c2");
        myList.add("c3");

        System.out.println("Updated list size");
        System.out.println(myList.size());
        System.out.println("List View");
        System.out.println(myList);

        System.out.println("Get first element of list");
        System.out.println(myList.get(1));

        System.out.println("Remove second element of list");
        myList.remove(1);

        System.out.println("Updated list size");
        System.out.println(myList.size());
        System.out.println("List View");
        System.out.println(myList);

        System.out.println("Last item of list");
        System.out.println(myList.last());

        System.out.println("Add new element");
        myList.add("c4");

        System.out.println("New last item of list");
        System.out.println(myList.last());
        System.out.println("List View");
        System.out.println(myList);

        System.out.println("Remove first element of list");
        myList.remove(0);
        System.out.println("List View");
        System.out.println(myList);

        System.out.println("Remove last element of list");
        myList.remove(1);
        System.out.println("First element of list");
        System.out.println(myList.first());
        System.out.println("Last element of list");
        System.out.println(myList.last());
        System.out.println("List View");
        System.out.println(myList);

    }
}
