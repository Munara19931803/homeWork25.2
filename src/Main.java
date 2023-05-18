import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        ArrayList<City> arrayList = new ArrayList<>();
        arrayList.add(new City(1, "Berlin"));
        arrayList.add(new City(2, "Moscow"));
        arrayList.add(new City(3, "London"));
        arrayList.add(new City(4, "Chicago"));
        arrayList.add(new City(5, "New York"));
        arrayList.add(new City(6, "Bishkek"));
        arrayList.add(new City(7, "Paris"));
        arrayList.add(new City(8, "Mumbai"));
        arrayList.add(new City(9, "Karakol"));
        TreeSet<City> treeSet = new TreeSet<>(new City().comparator);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getCode() % 2 != 0) {
                treeSet.add(arrayList.get(i));

            }
        }
        treeSet.forEach(System.out::println);
    }
}