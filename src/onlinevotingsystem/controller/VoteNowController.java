package onlinevotingsystem.controller;

import java.util.Vector;
import onlinevotingsystem.model.CandidatesModel;
import onlinevotingsystem.model.PositionsModel;
import onlinevotingsystem.model.VotesModel;

public class VoteNowController {

    PositionsModel positionsModel = new PositionsModel();
    CandidatesModel candidatesModel = new CandidatesModel();
    VotesModel votesModel = new VotesModel();

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

    public void submitVote(String voterID, Vector<String> votedCandidates) {
        votesModel.submitVote(voterID, votedCandidates);
    }

    public Vector<Vector<String>> getMaxVotesPerPosition() {
        return positionsModel.maxVotesPerPosition();
    }

    public boolean getUserHasVoted(String voterID) {
        return votesModel.userHasVoted(voterID);
    }

    public int getMaxVote(String position) {
        for (Vector<String> max : getMaxVotesPerPosition()) {
            if (position.equals(max.getFirst())) {
                return Integer.parseInt(max.getLast());
            }
        }
        return 0;
    }

    public boolean hasReachedMaxVote(String positionToCheck, Vector<String> positions) {
        int max = getMaxVote(positionToCheck);
        int ctr = 0;
        for (String position : positions) {
            if (!position.equals(positionToCheck)) {
                continue;
            }
            ctr++;
            if (ctr >= max) {
                return true;
            }
        }
        return false;
    }
}
