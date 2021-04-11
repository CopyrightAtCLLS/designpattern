package prototype.shallowcopy;

import java.util.Date;

public class Cell implements Cloneable {
    private String name;
    private Date birthday;

    public Cell(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Cell{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
