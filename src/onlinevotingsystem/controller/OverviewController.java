package onlinevotingsystem.controller;

import java.util.Vector;
import onlinevotingsystem.model.AccountModel;
import onlinevotingsystem.model.CandidatesModel;
import onlinevotingsystem.model.PositionsModel;
import onlinevotingsystem.model.VotesModel;

public class OverviewController {

    private AccountModel accountModel = new AccountModel();
    private VotesModel votesModel = new VotesModel();
    private CandidatesModel candidatesModel = new CandidatesModel();
    private PositionsModel positionsModel = new PositionsModel();
    
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

    public Vector<Vector<String>> getCandidatesWithVotes() {
        return votesModel.candidatesWithVotes();
    }
    
    
    public int getRegisteredCandidates(){
        return candidatesModel.registeredTotalCandidates();
    }
    
    public Vector<String> getAvailablePositions(){
        return positionsModel.availablePositions();
    }
    
    public Vector<Vector<String>> getFilteredCandidatesWithVotes(String position){
        return votesModel.filteredCandidatesWithVotes(position);
    }

}
