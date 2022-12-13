package ArrayListPractice;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<Person> peopleList = new ArrayList();
        peopleList.add(new Person("Mumflr", 181, true));
        peopleList.add(new Person("Kenbert", 149, false));
        peopleList.add(new Person("Magoo", 175, false));

        System.out.println(peopleList.toString());
    }

}
