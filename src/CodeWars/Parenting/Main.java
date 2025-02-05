package src.CodeWars.Parenting;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Parent parent = new CodeWars.Parenting.Parent();
        ChildOne childOne = new ChildOne();
        childOne.setRandomId(Math.random());

        ChildTwo childTwo = new ChildTwo();
        childTwo.setRandomChar('q');

       List<Parent> parentList = new ArrayList<>();
       parentList.add(parent);
       parentList.add(childOne);
       parentList.add(childTwo);
       parentList.add(new Parent());
       parentList.add(new ChildOne());
       parentList.add(new ChildTwo());

      parentList.forEach(p ->  System.out.println(p.toString()));

    }
}
