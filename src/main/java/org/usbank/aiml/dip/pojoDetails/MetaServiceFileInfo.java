package org.usbank.aiml.dip.pojoDetails;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;

@JsonPropertyOrder({"eventID","eventSubmittedDate","submittedBy","sourceSystem","targetSystemDetails"})
public class MetaServiceFileInfo {
    // private SourceFileDetails[] SourceFileDetails;

    private String eventID;
    private String eventSubmittedDate;
    private String submittedBy;
    private String sourceSystem;
    private TargetSystemdetails targetSystemDetails;
    private ArrayList<SourceFileDetails> sourceFileDetails;

    public MetaServiceFileInfo(String eventID, String eventSubmittedDate, String submittedBy, String sourceSystem,TargetSystemdetails targetSystemDetails, ArrayList<SourceFileDetails> sourceFileDetails) {
        this.eventID = eventID;
        this.eventSubmittedDate = eventSubmittedDate;
        this.submittedBy = submittedBy;
        this.sourceSystem = sourceSystem;
        this.targetSystemDetails= targetSystemDetails;
        this.sourceFileDetails = sourceFileDetails;
    }

    public ArrayList<SourceFileDetails> getSourceFileDetails() {
        return sourceFileDetails;
    }

    public void setSourceFileDetails(ArrayList<SourceFileDetails> sourceFileDetails) {
        this.sourceFileDetails = sourceFileDetails;
    }

    public MetaServiceFileInfo() {

    }

    public TargetSystemdetails getTargetSystemDetails() {
        return targetSystemDetails;
    }

    public void setTargetSystemDetails(TargetSystemdetails targetSystemDetails) {
        this.targetSystemDetails = targetSystemDetails;
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getEventSubmittedDate() {
        return eventSubmittedDate;
    }

    public void setEventSubmittedDate(String eventSubmittedDate) {
        this.eventSubmittedDate = eventSubmittedDate;
    }

    public String getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
    }

    public String getSourceSystem() {
        return sourceSystem;
    }

    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    @Override
    public String toString() {
        return "MetaServiceFileInfo{" +
                "eventID='" + eventID + '\'' +
                ", eventSubmittedDate='" + eventSubmittedDate + '\'' +
                ", submittedBy='" + submittedBy + '\'' +
                ", sourceSystem='" + sourceSystem + '\'' +
                ", targetSystemDetails=" + targetSystemDetails +
                ", sourceFileDetails=" + sourceFileDetails +
                '}';
    }
}