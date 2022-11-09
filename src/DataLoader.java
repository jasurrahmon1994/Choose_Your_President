import model.Party;
import DB.DB;
import model.Candidate;
import model.CandidateProgram;
import model.Degree;
import model.User;
import model.Vote;

public class DataLoader {
    public static void run() {

        Party party1 = new Party(++DB.partiesCount, "Yolg'onchilar", "Bizning hamma gapimiz yolg'on.");
        Party party2 = new Party(++DB.partiesCount, "Kemiruvchilar", "Biz hamma narsani kemiramiz.");
        Party party3 = new Party(++DB.partiesCount, "Poraxo'rlar", "Korrupsiya - kelajak poydevori.");
        Party party4 = new Party(++DB.partiesCount, "DaraxtKesarlar", "Daraxtlar - bizning dushmanimiz.");
        Party party5 = new Party(++DB.partiesCount, "Shavkatli kunlar", "Mendan yahshisi yo'q.");
        DB.parties.add(party1);
        DB.parties.add(party2);
        DB.parties.add(party3);
        DB.parties.add(party4);
        DB.parties.add(party5);

        Candidate candidate1 = new Candidate(++DB.candidatesCount, "Buratino", "Aldaganov", "SSSR o'g'li", Degree.MASTER,
                party1);
        Candidate candidate2 = new Candidate(++DB.candidatesCount, "Krisa", "Ratov", "SSSR o'g'li", Degree.BACHELOR,
                party2);
        Candidate candidate3 = new Candidate(++DB.candidatesCount, "Poraxo'r", "Poraolganov", "SSSR o'g'li",
                Degree.BACHELOR, party3);
        Candidate candidate4 = new Candidate(++DB.candidatesCount, "Uyqurar", "Uybuzarov", "SSSR o'g'li", Degree.MASTER,
                party4);
        Candidate candidate5 = new Candidate(++DB.candidatesCount, "Shovkat aka", "Engzo'rov", "SSSR o'g'li", Degree.PHD,
                party5);
        DB.candidates.add(candidate1);
        DB.candidates.add(candidate2);
        DB.candidates.add(candidate3);
        DB.candidates.add(candidate4);
        DB.candidates.add(candidate5);

        CandidateProgram program1 = new CandidateProgram(++DB.candidatesCount, candidate1,
                "Bizning gaplarimizga ishonmang. Aks holda, holingizga voy");
        CandidateProgram program2 = new CandidateProgram(++DB.candidatesCount, candidate2,
                "Kemirish uchun joy qolmasa, o'zingizni kemiramiz. Yahshisi, bizga ovoz bering.");
        CandidateProgram program3 = new CandidateProgram(++DB.candidatesCount, candidate3,
                "Korrupsiya bilan bizning kelajagimiz buyuk, siznikini esa bilmadim");
        CandidateProgram program4 = new CandidateProgram(++DB.candidatesCount, candidate4,
                "Daraxtlar ko'pligidan hammayoq soya-salqin. Shuni yo'q qilishi bizning vazifamiz");
        CandidateProgram program5 = new CandidateProgram(++DB.candidatesCount, candidate5,
                "Raqiblarim orasida mendan zo'ri yo'q, sizning esa boshqa variantingiz yo'q.");

        DB.programs.add(program1);
        DB.programs.add(program2);
        DB.programs.add(program3);
        DB.programs.add(program4);
        DB.programs.add(program5);

        User user1 = new User(++DB.usersCount, "Jasur", "Rahmonov", "AA", "1234567", "1111111", "root");
        User user2 = new User(++DB.usersCount, "Ulugbek", "Rahmonov", "AA", "1234567", "2222222", "root");
        User user3 = new User(++DB.usersCount, "Asror", "Rahmonov", "AA", "1234567", "3333333", "root");
        User user4 = new User(++DB.usersCount, "Davron", "Rahmonov", "AA", "1234567", "4444444", "root");
        User user5 = new User(++DB.usersCount, "Elbek", "Rahmonov", "AA", "1234567", "5555555", "root");
        DB.users.add(user1);
        DB.users.add(user2);
        DB.users.add(user3);
        DB.users.add(user4);
        DB.users.add(user5);

        Vote vote1 = new Vote(++DB.votesCount, user1, candidate1);
        Vote vote2 = new Vote(++DB.votesCount, user2, candidate2);
        Vote vote3 = new Vote(++DB.votesCount, user3, candidate3);
        Vote vote4 = new Vote(++DB.votesCount, user4, candidate4);
        DB.votes.add(vote1);
        DB.votes.add(vote2);
        DB.votes.add(vote3);
        DB.votes.add(vote4);
        

    }
}
