package com.example.moneyexchangesimulation.Israt_jahan_liya.ModelClass;

public class TellerTraining {
    private String tellerName;
    private String moduleName;
    private boolean certified;
    private String guidanceNote;

    public TellerTraining(String tellerName, String moduleName, boolean certified, String guidanceNote) {
        this.tellerName = tellerName;
        this.moduleName = moduleName;
        this.certified = certified;
        this.guidanceNote = guidanceNote;
    }

    public String getTellerName() {
        return tellerName;
    }

    public void setTellerName(String tellerName) {
        this.tellerName = tellerName;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public boolean isCertified() {
        return certified;
    }

    public void setCertified(boolean certified) {
        this.certified = certified;
    }

    public String getGuidanceNote() {
        return guidanceNote;
    }

    public void setGuidanceNote(String guidanceNote) {
        this.guidanceNote = guidanceNote;
    }

    @Override
    public String toString() {
        return "TellerTraining{" +
                "tellerName='" + tellerName + '\'' +
                ", moduleName='" + moduleName + '\'' +
                ", certified=" + certified +
                ", guidanceNote='" + guidanceNote + '\'' +
                '}';
    }
}
