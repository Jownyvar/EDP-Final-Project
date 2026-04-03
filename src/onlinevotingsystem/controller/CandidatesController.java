package onlinevotingsystem.controller;

import java.util.Vector;
import onlinevotingsystem.model.CandidatesModel;

public class CandidatesController {

    private CandidatesModel cm = new CandidatesModel();

    public Vector<Vector<String>> getCandidatesData() {
        return cm.candidatesData();
    }

    public boolean addCandidate(String fName, String mName, String lName, String party, int position) {
        return cm.addCandidate(fName, mName, lName, party, position);
    }

    public boolean removeCandidate(int candidateID) {
        return cm.removeCandidate(candidateID);
    }

    public boolean updateCandidate(int candidateID, String fName, String mName, String lName, String party, int position) {
        return cm.updateCandidate(candidateID, fName, mName, lName, party, position);
    }

    public boolean reinstateCandidate(int candidateID) {
        return cm.reinstateCandidate(candidateID);
    }

    public Vector<Vector<String>> searchByID(String candidateLastName) {
        return cm.searchCandidateID(candidateLastName);
    }
}
