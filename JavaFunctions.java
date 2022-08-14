import java.util.Comparator;

public class JavaFunctions implements Comparator<Person>{
    @Override
    public int compare(Person p1, Person p2) {
        int compareResult = p1.getAge() - p2.getAge();
        if (compareResult > 0) {
            System.out.println(p1.getName() + " " + p1.getAge() + " is older then " + p2.getName() + " "+ p2.getAge());
        }
        else if (compareResult == 0) {
            System.out.println(p1.getName() + " " + p1.getAge() + " has the same age as " + p2.getName() + " " + p2.getAge());
        }
        else {
            System.out.println(p2.getName()+ " " + p2.getAge() + " is older then " + p1.getName()+ " " + p1.getAge());
        }
        return compareResult;
    }
    
}
