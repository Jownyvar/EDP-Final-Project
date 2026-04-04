package onlinevotingsystem.controller;

import onlinevotingsystem.model.SystemSettingsModel;

public class SystemSettingsController {

    private SystemSettingsModel ssm = new SystemSettingsModel();

    public void releaseResult() {
        ssm.releaseResult();
    }
}
