package org.usbank.aiml.dip.pojoDetails;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"targetFileLocation","targetFormat","targetFilename"})
public class TargetSystemdetails {
    private String targetFileLocation;
    private String targetFormat;
    private String targetFilename;

    public TargetSystemdetails(String targetFileLocation, String targetFormat, String targetFilename) {
        this.targetFileLocation = targetFileLocation;
        this.targetFormat = targetFormat;
        this.targetFilename = targetFilename;
    }

    public String getTargetFilename() {
        return targetFilename;
    }

    public void setTargetFilename(String targetFilename) {
        this.targetFilename = targetFilename;
    }

    public TargetSystemdetails() {

    }
    public String getTargetFileLocation() {
        return targetFileLocation;
    }

    public void setTargetFileLocation(String targetFileLocation) {
        this.targetFileLocation = targetFileLocation;
    }

    public String getTargetFormat() {
        return targetFormat;
    }

    public void setTargetFormat(String targetFormat) {
        this.targetFormat = targetFormat;
    }

    @Override
    public String toString() {
        return "TargetSystemdetails{" +
                "targetFileLocation='" + targetFileLocation + '\'' +
                ", targetFormat='" + targetFormat + '\'' +
                ", targetFilename='" + targetFilename + '\'' +
                '}';
    }
}
