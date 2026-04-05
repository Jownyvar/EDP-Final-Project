package onlinevotingsystem.controller;

import java.util.Vector;
import onlinevotingsystem.model.AccountModel;
import onlinevotingsystem.model.CandidatesModel;
import onlinevotingsystem.model.VotesModel;

public class OverviewController {

    private AccountModel accountModel = new AccountModel();
    private VotesModel votesModel = new VotesModel();
    private CandidatesModel candidatesModel = new CandidatesModel();
    
    public int getRegisteredVoters() {
        return accountModel.totalRegisteredVoters();
    }

    public int getTotalVotes() {
        return votesModel.getTotalVotes();
    }

    public int getVoteCompletePercentage() {
        int totalVotes = votesModel.getTotalVotes();
        int totalVoters = accountModel.totalRegisteredVoters();
        if (totalVoters == 0) {
            return 0;
        }
        return (totalVotes * 100) / totalVoters;
    }

    public Vector<Vector<String>> getWinningCandidates() {
        return votesModel.candidatesWithVotes();
    }
    
    public int getRegisteredCandidates(){
        return candidatesModel.registeredTotalCandidates();
    }

}
