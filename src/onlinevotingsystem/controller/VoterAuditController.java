package onlinevotingsystem.controller;

import java.util.Vector;
import onlinevotingsystem.model.VotesModel;

public class VoterAuditController {

    VotesModel votesModel = new VotesModel();

    public Vector<Vector<String>> getUserVotes(String voterID) {
        return votesModel.userVotes(voterID);
    }
}
