public class Person {
    String name;
    int age;
    int cashAmount;
    BankAccount account;

    public Person(String name) {
        this(name, 12, 0);
    }

    public Person(String name, int age) {
        this(name, age, 0);
    }

    public Person(String name, int age, int cashAmount) {
        this.name = name;
        this.cashAmount = cashAmount;
        this.age = age;

        if(cashAmount < 0) {
            this.cashAmount = 0;
        }
        if(age < 0){
            this.age = 12;
        }
    }

    public void setCashAmount(int cashAmount) {
        this.cashAmount = cashAmount;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

//    ******************************************************

    // 첫 번째 파라미터: 받는 사람 (Person)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(Person to, int amount) {
        // insert code here
        return this.account.transfer(to, amount);
    }

    // 첫 번째 파라미터: 받는 사람의 계정 (BankAccount)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(BankAccount to, int amount) {
        // insert code here
        return this.account.transfer(to, amount);
    }
}
