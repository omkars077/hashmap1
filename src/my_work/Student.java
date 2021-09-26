package my_work;

public class Student {
    String name;
    String sub;
    int age;

    public Student(String name, String sub, int age) {
        this.name = name;
        this.sub = sub;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
