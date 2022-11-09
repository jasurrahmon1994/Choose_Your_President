package model;

public abstract class AbsModel {
    private int id;

    public AbsModel(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

}
