package org.usbank.aiml.dip.businessServices;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.usbank.aiml.dip.pojoDetails.*;
import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

@Service
public class MetaSrvcSrcFileService {

        private ArrayList<AttributesModel> attribList = new ArrayList<>(Arrays.asList(
                new AttributesModel(1,"RECORDTYPE","string",2,0,2,"trim",""),
                new AttributesModel(2,"ACCOUNTNUM","string",22,0,2,"trim",""),
                new AttributesModel(3,"RTN","string",9,0,2,"trim",""),
                new AttributesModel(4,"PRODUCTCODE","string",20,0,2,"trim",""),
                new AttributesModel(5,"RECORDACTION","string",1,0,2,"trim",""),
                new AttributesModel(6,"BALANCE","string",16,0,2,"trim",""),
                new AttributesModel(7,"DATE","string",14,0,2,"trim",""),
                new AttributesModel(8,"POINTOFSALEDATE","string",14,0,2,"trim",""),
                new AttributesModel(9,"AMOUNT","string",15,0,2,"trim",""),
                new AttributesModel(10,"TRANSACTIONDESCRIPTION","string",255,0,2,"trim",""),
                new AttributesModel(11,"SEQUENCENUM","string",10,0,2,"trim",""),
                new AttributesModel(12,"TRNUID","string",36,0,2,"trim",""),
                new AttributesModel(13,"MERCHANTCODE","string",8,0,2,"trim",""),
                new AttributesModel(14,"LEVEL3INDICATOR","string",1,0,2,"trim",""),
                new AttributesModel(15,"SOURCENAME","string",30,0,2,"trim",""),
                new AttributesModel(16,"SOURCECARDNUMBER","string",4,0,2,"trim",""),
                new AttributesModel(17,"REFERENCENUMBER","string",23,0,2,"trim",""),
                new AttributesModel(18,"LEVEL3NAME","string",16,0,2,"trim",""),
                new AttributesModel(19,"LEVEL3DATE","string",8,0,2,"trim",""),
                new AttributesModel(20,"LEVEL3DATA1","string",30,0,2,"trim",""),
                new AttributesModel(21,"LEVEL3DATA2","string",30,0,2,"trim",""),
                new AttributesModel(22,"FROMACCT","string",20,0,2,"trim",""),
                new AttributesModel(23,"FROMROUTING","string",9,0,2,"trim",""),
                new AttributesModel(24,"CARDPRESENTIND","string",1,0,2,"trim",""),
                new AttributesModel(25,"MERCNTRYCDE","string",3,0,2,"trim",""),
                new AttributesModel(26,"MERCHNBR","string",7,0,2,"trim",""),
                new AttributesModel(27,"CRDACID","string",15,0,2,"trim",""),
                new AttributesModel(28,"MERCHDESC","string",40,0,2,"trim",""),
                new AttributesModel(29,"MERNME","string",36,0,2,"trim",""),
                new AttributesModel(30,"FRGCURCAMT","string",20,0,2,"trim",""),
                new AttributesModel(31,"FRGCURCCDE","string",3,0,2,"trim",""),
                new AttributesModel(32,"HOGANSUBPRDCTCODE","string",2,0,2,"trim",""),
                new AttributesModel(33,"TOKENPAN","string",20,0,2,"trim",""),
                new AttributesModel(34,"ICSCURCCDE","string",3,0,2,"trim",""),
                new AttributesModel(35,"STATUSCDE","string",10,0,2,"trim",""),
                new AttributesModel(36,"RECURIND","string",1,0,2,"trim",""),
                new AttributesModel(37,"PAYIND","string",1,0,2,"trim",""),
                new AttributesModel(38,"TRANCODE","string",3,0,2,"trim",""),
                new AttributesModel(39,"TRANDESC","string",40,0,2,"trim",""),
                new AttributesModel(40,"FILLER1","string",202,0,2,"trim","")
        ));
        private SparkMetaServiceModel smodel;
        private ArrayList<SparkMetaServiceModel> smodelList = new ArrayList<>();
        private TargetSystemdetails tgtInfo;
        private ArrayList<SourceFileDetails> srcInfo;
        private ScheduleInformation schdInfo;
        private String srcSystem;
        private String tgtFileName;
        @Value("${message.default.json-conf}")
        private String jsonConfFolder;
        private String jsonFileName;
    /*private List<MetaServiceFileInfo> list = new ArrayList<>(Arrays.asList(
            new MetaServiceFileInfo("abc","def","efg","h")
    ));

    public List<MetaServiceFileInfo> getEvents() {
        return list;
    }*/

    /*public void writeJsonFileFromObject(Object obj, File fileName){
        ObjectMapper mapper = new ObjectMapper();

        mapper.writeValueAsString(new File("C:\\Users\\pxkinja\\Desktop\\Project\\GCP\\Metadata\\Source-MetaService-Response\\config"), obj);
    }*/

        public ArrayList<SparkMetaServiceModel> addEvent(MetaServiceFileInfo metaInfo) {
            tgtInfo = metaInfo.getTargetSystemDetails();
            System.out.println("Select Src File -->"+ tgtInfo );
            srcInfo = metaInfo.getSourceFileDetails();
            // tgtInfo.setTargetFilename(metaInfo.getTargetSystemDetails().getTargetFilename().split(",")[0]);
            srcSystem = metaInfo.getSourceSystem();
            srcInfo.forEach(x -> {
                //System.out.println(x);
                tgtFileName = srcSystem+"_"+x.getSourceFileName().split("txt")[0]+"parquet";
                System.out.println(tgtFileName);
                TargetSystemdetails  ts = new TargetSystemdetails(metaInfo.getTargetSystemDetails().getTargetFileLocation(),metaInfo.getTargetSystemDetails().getTargetFormat(),tgtFileName);
                schdInfo = x.getScheduleInformation();
                SparkMetaServiceModel smodel = new SparkMetaServiceModel(srcSystem,x,ts,schdInfo,attribList);
                //System.out.println("model --->"+ smodel.toString());
                ObjectMapper mapper = new ObjectMapper();
                jsonFileName = jsonConfFolder+srcSystem+"_"+x.getSourceFileName().split("txt")[0]+"json";
                try {
                    mapper.writeValue(new File(jsonFileName), smodel);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                smodelList.add(smodel);
            });

            System.out.println(smodelList);
            return smodelList;
        }
    }

