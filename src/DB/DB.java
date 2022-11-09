package DB;
import java.util.ArrayList;

import model.Candidate;
import model.CandidateProgram;
import model.Party;
import model.User;
import model.Vote;

public class DB {

    public static ArrayList<Party> parties = new ArrayList<>();
    public static int partiesCount = 0;
    public static ArrayList<Candidate> candidates = new ArrayList<>();
    public static int candidatesCount = 0;
    public static ArrayList<CandidateProgram> programs = new ArrayList<>();
    public static int programsCount = 0;
    public static ArrayList<User> users = new ArrayList<>();
    public static int usersCount = 0;
    public static ArrayList<Vote> votes = new ArrayList<>();
    public static int votesCount = 0;

}