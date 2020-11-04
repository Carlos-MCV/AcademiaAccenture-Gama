public class Intern extends Employees{

    private Sale intern;

    public Intern(String name, int id, int password) {
        this.name=name;
        this.id=id;
        this.password=password;
    }


    public Sale getIntern() {
        return intern;
    }
}
