package ua.lviv.logos4;

public class Application {
    private int age;
    private String name;


    public Application(int age) {
        this.age = age;
    }

    public Application(int age, String name) {
        this(age);
        this.name = name;
    }


    @Override
    public String toString() {
        return "Men{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
    	Application human = new Application(28, "Vitalii");
        System.out.println(human.toString());
    }
}


