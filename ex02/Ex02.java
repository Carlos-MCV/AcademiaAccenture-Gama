package ex02;

public class Ex02 {
    public static void main(String[] args) {

        CheckingAccount checkingNew=new CheckingAccount();

        SavingsAccount savingsNew=new SavingsAccount();

        LifeInsurance insurancenew=new LifeInsurance();

        savingsNew.deposit(40);
        savingsNew.withdraw(10);
        savingsNew.transfer(savingsNew);
        savingsNew.accountIncome();
        savingsNew.situacao();

        checkingNew.deposit(100);
        checkingNew.mostrarTaxa();

    }
}
