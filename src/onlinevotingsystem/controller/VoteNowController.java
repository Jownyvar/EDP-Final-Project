package onlinevotingsystem.controller;

import java.util.Vector;
import onlinevotingsystem.model.CandidatesModel;
import onlinevotingsystem.model.PositionsModel;

public class VoteNowController {

    PositionsModel positionsModel = new PositionsModel();
    CandidatesModel candidatesModel = new CandidatesModel();

    public Vector<String> getAvailablePositions() {
        return positionsModel.availablePositions();
    }

    public Vector<String> getParties() {
        return candidatesModel.candidateParty();
    }

    public Vector<Vector<String>> getCandidatesData() {
        return candidatesModel.candidatesData();
    }

    public Vector<Vector<String>> getFilteredCandidateData(String position, String party) {
        return candidatesModel.filterCandidateData(position, party);
    }
}
