package service;

import java.util.List;

import model.Candidate;
import model.CandidateProgram;
import model.Vote;
import DB.DB;

public class UserServiceImpl implements UserService{

    @Override
    public String getCandidates(List<Candidate> candidates) {
        String res = "";
        for (int i = 0; i < DB.candidates.size(); i++) {
            res += i + 1 + ": " + DB.candidates.get(i).getFirstName() + " " + DB.candidates.get(i).getLastName() + " ";
        }
        return res;
    }

    @Override
    public void showCandidateInfo(int candidateId) {
        Candidate candidateFound = null;
        for(Candidate candidate : DB.candidates){
            if(candidate.getId() == candidateId){
                candidateFound = candidate;
                break;
            }
        }
        if(candidateFound != null){
            System.out.println("Name of party: " + candidateFound.getParty().getName());
            int voteCount = 0;
            for(Vote vote : DB.votes){
                if(vote.getCandidate().getId() == candidateId){
                    voteCount++;
                }
            }
            System.out.println("Number of votes: " + voteCount);
            System.out.println("University degree: " + candidateFound.getDegree());
            for (CandidateProgram program : DB.programs) {
                if(program.getCandidate().getId() == candidateId){
                    System.out.println("Candidate program: " + program.getTextOfProgram());
                }
            }
        }
        
    }
    
}
