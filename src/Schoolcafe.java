public class Schoolcafe {

    public int balance;

    public Schoolcafe(int i) {
        balance = i;
    }

    public void deposit(int i) {
        balance = balance + i;

    }

    public void withdraw(int i) {
        balance = balance - i;

    }
}

