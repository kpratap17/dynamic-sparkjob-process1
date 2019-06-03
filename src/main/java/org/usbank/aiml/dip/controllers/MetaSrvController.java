package org.usbank.aiml.dip.controllers;

import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.SftpException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.usbank.aiml.dip.businessServices.GCPConnect;
import org.usbank.aiml.dip.businessServices.MetaSrvcSrcFileService;
import org.usbank.aiml.dip.businessServices.SFTPService;
import org.usbank.aiml.dip.pojoDetails.MetaServiceFileInfo;
import org.usbank.aiml.dip.pojoDetails.SparkMetaServiceModel;

import java.io.IOException;
import java.util.ArrayList;

 @RestController
 public class MetaSrvController {

        @Autowired
        private MetaSrvcSrcFileService metaSrvc;

        @Autowired
        private SFTPService sftpService;

        @Autowired
        private GCPConnect gcpConnect;

        @Autowired
        public MetaSrvController(SFTPService sftpService) {
            this.sftpService = sftpService;
        }

        private ArrayList<SparkMetaServiceModel> sfdet;

        @Value("${message.default.spark-host}")
        private String sparkHost;
        @Value("${message.default.spark-port}")
        private Integer sparkPort;
        @Value("${message.default.spark-user}")
        private String sparkUser;
        @Value("${message.default.spark-password}")
        private String sparkPassword;

    @RequestMapping("/eventBySrcFile")
    public String getEvents(){
        /*try {
            gcpConnect.connectGCP();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
      /*  try {
            sftpService.uploadFile(
                        sparkHost,
                        sparkPort,
                        sparkUser,
                        sparkPassword);
        } catch (JSchException e) {
            System.out.println("JSchException"+ e.getMessage());
            e.printStackTrace();
        } catch (SftpException e) {
            System.out.println("SftpException"+ e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IO Exception"+ e.getMessage());
            e.printStackTrace();
        }*/
        return "USB GCP";
    }

//        @RequestMapping(method= RequestMethod.POST, value="/eventBySrcFile")
//        public ResponseEntity addEventBySrc(@RequestBody MetaServiceFileInfo mInfo) throws JSchException, SftpException, IOException {
//            System.out.println("Select Src File -->");
//            sfdet = metaSrvc.addEvent(mInfo);
//       /* sfdet.forEach(x -> {
//            System.out.println(x);
//            SparkMetaServiceModel smodel = new SparkMetaServiceModel("ICS",null,null,null,null);
//            System.out.println("model --->"+ smodel.toString());
//        });*/
//            // sparkMetaService.buildMetaServiceJson(sfdet);
//            /*Connect to Linux Server and execute Spark Job*/
//           /* sftpService.uploadFile(
//                    sparkHost,
//                    sparkPort,
//                    sparkUser,
//                    sparkPassword,
//                    "C:\\Users\\pxkinja\\IdeaProjects\\dynamic-sparkjob-process\\src\\main\\resources\\sample-small.txt",
//                    "/u01/infrit/shared/stage/LkpFiles"
//            );*/
//
//        /*sftpService.uploadFile(
//                "vmaksa69901dm5",
//                22,
//                "infrdev",
//                "x6V8XGrvD4YW",
//                "C:\\Users\\pxkinja\\IdeaProjects\\dynamic-sparkjob-process\\src\\main\\resources\\sample-small.txt",
//                "/u01/infrit/shared/stage/LkpFiles"
//        );*/
//
//            return ResponseEntity.ok(HttpStatus.OK);
//        }
 }

