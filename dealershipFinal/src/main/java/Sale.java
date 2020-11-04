import java.util.Random;

public class Sale {
    private Car choosedCar;
    private Intern intern;
    private Manager manager;
    private Seller seller;
    private Sale choosedSeller;
    private Authorization authorization;


    public void sell(){
        if(this.choosedSeller.equals(intern)){
            this.manager.autorize();
            if(this.manager.getAuthorization().isAutorized()){
                System.out.println("O carro: "+this.choosedCar.getName()+" foi vendido com sucesso pelo vendedor "+this.getIntern()+"!!!");
            }else{
                System.out.println("Venda não autorizada...");
            }
        }else {
            System.out.println("O carro: " + this.choosedCar.getName() + " foi vendido com sucesso pelo vendedor " + this.choosedSeller.getChoosedSeller() + "!!!");
        }
    }

    public void chooseSeller(Seller seller,Intern intern,Manager manager){
        Random randomic=new Random();
        int choosed=randomic.nextInt(3);
        if(choosed==3){
            setChoosedSeller(this.intern.getIntern());
        }else if(choosed==2){
            setChoosedSeller(this.manager.getManager());
        }else{
            setChoosedSeller(this.seller.getSeller());
        }
    }


    public Sale getChoosedSeller() {
        return choosedSeller;
    }

    public void setChoosedSeller(Sale choosedSeller) {
        this.choosedSeller = choosedSeller;
    }

    public Car getChoosedCar() {
        return choosedCar;
    }

    public void setChoosedCar(Car choosedCar) {
        this.choosedCar = choosedCar;
    }

    public Intern getIntern() {
        return intern;
    }

    public void setIntern(Intern intern) {
        this.intern = intern;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
}
