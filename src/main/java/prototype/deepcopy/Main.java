package prototype.deepcopy;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cell ancestor = new Cell("Origin", new Date());
        Cell descendent = (Cell) ancestor.clone();
        System.out.println("After copy");
        System.out.println("ancestor : " + ancestor);
        System.out.println("desendent : " + descendent);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("After change");
        descendent.getBirthday().setTime(5);
        System.out.println("ancestor : " + ancestor);
        System.out.println("desendent : " + descendent);
    }
}
