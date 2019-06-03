package org.usbank.aiml.dip.pojoDetails;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;

@JsonPropertyOrder({"sourceSystem","sourceMetadata","targetmetadata","scheduleInformation","columninformation"})
public class SparkMetaServiceModel {
    private String sourceSystem;
    private SourceFileDetails sourceMetadata;
    private TargetSystemdetails targetmetadata;
    private ScheduleInformation scheduleInformation;
    private ArrayList<AttributesModel> columninformation;

    public SparkMetaServiceModel(String sourceSystem, SourceFileDetails sourceMetadata, TargetSystemdetails targetmetadata, ScheduleInformation scheduleInformation, ArrayList<AttributesModel> columninformation) {
        this.sourceSystem = sourceSystem;
        this.sourceMetadata = sourceMetadata;
        this.targetmetadata = targetmetadata;
        this.scheduleInformation = scheduleInformation;
        this.columninformation = columninformation;
    }

    public SparkMetaServiceModel(){

    }

    public String getSourceSystem() {
        return sourceSystem;
    }

    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    public SourceFileDetails getSourceMetadata() {
        return sourceMetadata;
    }

    public void setSourceMetadata(SourceFileDetails sourceMetadata) {
        this.sourceMetadata = sourceMetadata;
    }

    public TargetSystemdetails getTargetmetadata() {
        return targetmetadata;
    }

    public void setTargetmetadata(TargetSystemdetails targetmetadata) {
        this.targetmetadata = targetmetadata;
    }

    public ScheduleInformation getScheduleInformation() {
        return scheduleInformation;
    }

    public void setScheduleInformation(ScheduleInformation scheduleInformation) {
        this.scheduleInformation = scheduleInformation;
    }

    public ArrayList<AttributesModel> getColumninformation() {
        return columninformation;
    }

    public void setColumninformation(ArrayList<AttributesModel> columninformation) {
        this.columninformation = columninformation;
    }

    @Override
    public String toString() {
        return "SparkMetaServiceModel{" +
                "sourceSystem='" + sourceSystem + '\'' +
                ", sourceMetadata=" + sourceMetadata +
                ", targetmetadata=" + targetmetadata +
                ", scheduleInformation=" + scheduleInformation +
                ", columninformation=" + columninformation +
                '}';
    }
}
