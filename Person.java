abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [date_of_brith=" + age + ", name=" + name + "]";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


}