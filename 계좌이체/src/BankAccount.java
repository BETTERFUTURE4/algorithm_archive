public class BankAccount {
    int balance;
    Person owner;

    public BankAccount(int balance) {
        if(balance < 0){
            this.balance = 0;
            return;
        }
        this.balance = balance;
    }

    public BankAccount(Person owner) {
        this.owner = owner;
        this.balance = 0;
    }

    public BankAccount(int balance, Person owner) {
        this.owner = owner;
        if(balance < 0){
            this.balance = 0;
            return;
        }
        this.balance = balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

//*********************************************

    // 파라미터 : 입금할 액수(정수)
    // 리턴 : 성공여부(불린)
    public boolean deposit(int amount) {
        // 1. write code here
        if(amount < 0 || amount > owner.cashAmount){
            System.out.println("입금 실패입니다. 잔고: "+ balance + "원, 현금: "+ owner.cashAmount + "원");
            return false;
        }
        balance += amount;
        owner.cashAmount -= amount;
        System.out.println( amount + "원 입금하였습니다. 잔고: "+ balance + "원, 현금: "+ owner.cashAmount + "원");
        return true;
    }

    // 파라미터 : 출금할 액수(정수)
    // 리턴 : 성공여부(불린)
    public boolean withdraw(int amount) {
        // 2. write code here
        if (amount < 0 || amount > balance) {
            System.out.println("출금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.cashAmount + "원");
            return false;
        }
        balance -= amount;
        owner.cashAmount += amount;
        System.out.println(amount + "원 출금하였습니다. 잔고: " + balance + "원, 현금: " + owner.cashAmount + "원");
        return true;
    }

    // 첫 번째 파라미터: 받는 사람 (Person)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(Person to, int amount) {
        // insert code here
        if(amount < 0 || amount > balance){
            System.out.println("false - from: " + owner.name
                    + ", to: "+ to.name + ", amount: "
                    + amount + ", balance: " + balance);
            return false;
        }

        balance -= amount;
        to.account.balance += amount;

        System.out.println("true - from: "+ owner.name
                + ", to: "+ to.name + ", amount: "
                + amount + ", balance: " + balance);
        return true;
    }

    // 첫 번째 파라미터: 받는 사람의 계정 (BankAccount)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(BankAccount to, int amount){
        // insert code here
        return transfer(to.owner,amount);
    }
}