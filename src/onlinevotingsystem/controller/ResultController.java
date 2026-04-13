package onlinevotingsystem.controller;

import java.util.Vector;
import onlinevotingsystem.model.SystemSettingsModel;
import onlinevotingsystem.model.VotesModel;

public class ResultController {

    SystemSettingsModel systemSettingsModel = new SystemSettingsModel();
    VotesModel votesModel = new VotesModel();

    public boolean resultRelease() {
        return systemSettingsModel.resultRelease();
    }

    public Vector<Vector<String>> getWinnerCandidates() {
        return votesModel.winnerCandidates();
    }
}
