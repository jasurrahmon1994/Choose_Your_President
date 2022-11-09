package service;

import java.util.List;

import model.Candidate;

public interface UserService {
    String getCandidates(List<Candidate> candidates);
    void showCandidateInfo(int candidateId);
}
