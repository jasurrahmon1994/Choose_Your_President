package model;

public class CandidateProgram extends AbsModel{
    private Candidate candidate;
    private String textOfProgram;

    public CandidateProgram(int id, Candidate candidate, String textOfProgram) {
        super(id);
        this.candidate = candidate;
        this.textOfProgram = textOfProgram;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public String getTextOfProgram() {
        return textOfProgram;
    }

    public void setTextOfProgram(String textOfProgram) {
        this.textOfProgram = textOfProgram;
    }

    
    
}
