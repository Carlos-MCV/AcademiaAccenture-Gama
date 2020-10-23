package ex02;

public class Ex02 {
    public static void main(String[] args) {
        Account conta00=new Account();

        CheckingAccount checkingNew=new CheckingAccount();

        SavingsAccount savingsNew=new SavingsAccount();

        conta00.deposit(40);
        conta00.withdraw(10);
        conta00.transfer(conta00,savingsNew);
        conta00.accountIncome();
        conta00.situacao();

    }
}
