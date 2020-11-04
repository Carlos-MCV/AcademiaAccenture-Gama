public class Manager extends Employees{
    private Sale manager;
    private Authorization authorization;


    public Manager(String name,int id,int password) {
        this.name=name;
        this.id=id;
        this.password=password;
    }


    public void autorize(){
        this.authorization.setAutorized(true);
    }

    public Sale getManager() {
        return manager;
    }

    public Authorization getAuthorization() {
        return authorization;
    }

    public void setAuthorization(Authorization authorization) {
        this.authorization = authorization;
    }
}
