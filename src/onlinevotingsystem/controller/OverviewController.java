package onlinevotingsystem.controller;

import java.util.Vector;
import onlinevotingsystem.model.AccountModel;
import onlinevotingsystem.model.VotesModel;

public class OverviewController {

    private AccountModel accountModel = new AccountModel();
    private VotesModel votesModel = new VotesModel();

    public int getRegisteredVoters() {
        return accountModel.totalRegisteredVoters();
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
        return votesModel.winningCandidates();
    }
    
}
