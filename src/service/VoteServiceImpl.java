package service;

import DB.DB;
import model.Candidate;
import model.User;
import model.Vote;
import utils.CommonUtils;

public class VoteServiceImpl implements VoteService {

    @Override
    public void vote(String phoneNumber) {
        User userFound = null;
        Candidate candidateFound = null;
        String candidateId = "";
        boolean isVoted = false;
        for (Vote vote : DB.votes) {
            if (vote.getUser().getPhoneNumber().equals(phoneNumber)) {
                isVoted = true;
            }
        }
        if (isVoted) {
            System.out.println("You have already voted.");
            return;
        } else {
            String candidateList = new UserServiceImpl().getCandidates(DB.candidates);
            candidateId = CommonUtils.scannerString(candidateList);
            for (User user : DB.users) {
                if (user.getPhoneNumber().equals(phoneNumber)) {
                    userFound = user;
                    break;
                }
            }
            for (Candidate candidate : DB.candidates) {
                if (candidate.getId() == Integer.parseInt(candidateId)) {
                    candidateFound = candidate;
                    break;
                }
            }
        }
        Vote vote5 = new Vote(++DB.votesCount, userFound, candidateFound);
        DB.votes.add(vote5);
        System.out.println("Thank yor for your vote");
        int selectedVoteCount = 0;
        System.out.println("You voted for: " + DB.candidates.get(Integer.parseInt(candidateId) - 1).getFirstName());
        for (int i = 0; i < DB.candidates.size(); i++) {
            if (DB.votes.get(i).getCandidate().getFirstName().equals(DB.candidates.get(Integer.parseInt(candidateId) - 1).getFirstName())) {
                selectedVoteCount++;
            }
        }

        System.out.println("Vote count of the candidate you voted for: " +
                selectedVoteCount);
    }

}
