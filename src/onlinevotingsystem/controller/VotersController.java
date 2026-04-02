package onlinevotingsystem.controller;

import java.util.Vector;
import onlinevotingsystem.model.VotersModel;

public class VotersController {

    private VotersModel vm = new VotersModel();

    public Vector<Vector<String>> getVotersData() {
        return vm.votersData();
    }
}
