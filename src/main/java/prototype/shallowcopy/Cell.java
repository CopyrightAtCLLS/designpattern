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

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }
}
