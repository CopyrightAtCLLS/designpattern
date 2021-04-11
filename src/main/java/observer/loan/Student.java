package observer.loan;

import java.util.LinkedList;
import java.util.List;

public class Student implements debtor {
    private List<Bank> banks = new LinkedList<>();

    @Override
    public void borrow(Bank bank) {
        banks.add(bank);
    }

    @Override
    public void notifyBanks() {
        banks.forEach(bank -> bank.recover());
    }

    public static void main(String[] args) {
        Bank ABC = new Bank() {
            String name = "ABC";

            @Override
            public void recover() {
                System.out.println(name + " has recovered money");
            }
        };
        Bank ICBC = new Bank() {
            String name = "ICBC";

            @Override
            public void recover() {
                System.out.println(name + " has recovered money");
            }
        };
        Student student = new Student();
        student.borrow(ABC);
        student.borrow(ICBC);
        student.notifyBanks();
    }
}
