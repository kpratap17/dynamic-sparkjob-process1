package org.usbank.aiml.dip.pojoDetails;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"sourceFileName","sourceFileLocation","sourceFileType","sourceFileFormat","isEncrypted","encryptionKeySource"})
public class SourceFileDetails {
    private String sourceFileLocation;
    private String sourceFileName;
    private String encryptionKeySource;
    private String sourceFileType;
    private String isEncrypted;
    private String sourceFileFormat;
    private ScheduleInformation scheduleInformation;

    public SourceFileDetails(String sourceFileLocation, String sourceFileName, String encryptionKeySource, String sourceFileType, String isEncrypted, String sourceFileFormat,ScheduleInformation scheduleInformation) {
        this.sourceFileLocation = sourceFileLocation;
        this.sourceFileName = sourceFileName;
        this.encryptionKeySource = encryptionKeySource;
        this.sourceFileType = sourceFileType;
        this.isEncrypted = isEncrypted;
        this.sourceFileFormat = sourceFileFormat;
        this.scheduleInformation = scheduleInformation;
    }
    public SourceFileDetails() {

    }

    public ScheduleInformation getScheduleInformation() {
        return scheduleInformation;
    }

    public void setScheduleInformation(ScheduleInformation scheduleInformation) {
        this.scheduleInformation = scheduleInformation;
    }

    public String getSourceFileLocation() {
        return sourceFileLocation;
    }

    public void setSourceFileLocation(String sourceFileLocation) {
        this.sourceFileLocation = sourceFileLocation;
    }

    public String getSourceFileName() {
        return sourceFileName;
    }

    public void setSourceFileName(String sourceFileName) {
        this.sourceFileName = sourceFileName;
    }

    public String getEncryptionKeySource() {
        return encryptionKeySource;
    }

    public void setEncryptionKeySource(String encryptionKeySource) {
        this.encryptionKeySource = encryptionKeySource;
    }

    public String getSourceFileType() {
        return sourceFileType;
    }

    public void setSourceFileType(String sourceFileType) {
        this.sourceFileType = sourceFileType;
    }

    public String getIsEncrypted() {
        return isEncrypted;
    }

    public void setIsEncrypted(String isEncrypted) {
        this.isEncrypted = isEncrypted;
    }

    public String getSourceFileFormat() {
        return sourceFileFormat;
    }

    public void setSourceFileFormat(String sourceFileFormat) {
        this.sourceFileFormat = sourceFileFormat;
    }

    @Override
    public String toString() {
        return "SourceFileDetails{" +
                "sourceFileLocation='" + sourceFileLocation + '\'' +
                ", sourceFileName='" + sourceFileName + '\'' +
                ", encryptionKeySource='" + encryptionKeySource + '\'' +
                ", sourceFileType='" + sourceFileType + '\'' +
                ", isEncrypted='" + isEncrypted + '\'' +
                ", sourceFileFormat='" + sourceFileFormat + '\'' +
                '}';
    }
}

