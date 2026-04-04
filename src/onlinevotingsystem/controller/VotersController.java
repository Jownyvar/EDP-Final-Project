package onlinevotingsystem.controller;

import java.util.Vector;
import onlinevotingsystem.model.VotersModel;

public class VotersController {

    private VotersModel vm = new VotersModel();
    
    public Vector<Vector<String>> getVotersData() {
        return vm.votersData();
    }

    public boolean updateInfo(String fName, String mName, String lName, String sex, String college, String dateOfBirth, long voterID) {
        return vm.updateInfo(fName, mName, lName, sex, college, dateOfBirth, voterID);
    }
    
    public Vector<Vector<String>> searchVoter(String voterName){
        return vm.searchVoterName(voterName);
    }
}
