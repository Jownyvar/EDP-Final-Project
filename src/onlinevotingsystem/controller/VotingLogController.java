package onlinevotingsystem.controller;

import java.util.Vector;
import onlinevotingsystem.model.VotesModel;

public class VotingLogController {
    VotesModel votesModel = new VotesModel();
    
    public Vector<Vector<String>> getVoteLogs(){
        return votesModel.votesLog();
    }
}
