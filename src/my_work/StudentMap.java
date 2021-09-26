package my_work;

import java.util.HashMap;

public class StudentMap {
    public void demo(){
        HashMap<Integer,Student> details = new HashMap<Integer,Student>();
        Student data1 = new Student("Manoj Kumar","CS",38);
        Student data2 = new Student ("Sanjay singh","IT",34);
        Student data3 = new Student ("Rakesh Singh","AC",36);
        details.put(1,data1);
        details.put(2,data2);
        details.put(3,data3);
        Student var = details.get(1);
        System.out.println(var.getName());
        System.out.println(var.getSub());
        System.out.println(var.getAge());
        Student var1 =details.get(2);
        System.out.println(var1.getName());
        System.out.println(var1.getAge());
        System.out.println(var1.getSub());


    }
    public static void main(String[] args){
        StudentMap obj = new StudentMap();
        obj.demo();
    }
}
