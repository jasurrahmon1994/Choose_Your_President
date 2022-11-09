package model;

public class Party extends AbsModel{
    private String name;
    private String motto;

    public Party(int id, String name, String motto) {
        super(id);
        this.name = name;
        this.motto = motto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    

}
