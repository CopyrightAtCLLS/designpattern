package composite;

public class Main {
    public static void main(String[] args) {
        OrganizationComponent university = new University("SWU", "位于重庆");

        OrganizationComponent computerCollege = new College("计信院", "计信院");
        OrganizationComponent mathCollege = new College("数统院", "数统院");
        university.add(computerCollege);
        university.add(mathCollege);

        OrganizationComponent se = new Department("SE", "SE");
        OrganizationComponent cs = new Department("CS", "CS");
        OrganizationComponent math = new Department("math", "math");
        computerCollege.add(se);
        computerCollege.add(cs);
        mathCollege.add(math);

        university.print();
        System.out.println("\n*****************************\n");
        computerCollege.print();
        System.out.println("\n*****************************\n");
        se.print();
    }
}
