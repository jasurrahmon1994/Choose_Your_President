package model;

public class Vote extends AbsModel{
    private User user;
    private Candidate candidate;
    
    public Vote(int id, User user, Candidate candidate) {
        super(id);
        this.user = user;
        this.candidate = candidate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }
    
}
