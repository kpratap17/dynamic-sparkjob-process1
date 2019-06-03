package org.usbank.aiml.dip.businessServices;

import com.jcraft.jsch.*;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.SftpException;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class SFTPService {
        public void uploadFile(String serverAddress,
                               Integer serverPort,
                               String username,
                               String password
                //,
          //                     String file,
        //                       String destinationPath
        ) throws JSchException, SftpException, IOException {
            Session session = null;
            ChannelSftp channelSftp = null;
            try {


                JSch jsch = new JSch();
                session = jsch.getSession(username, serverAddress, serverPort);
                session.setPassword(password);

                java.util.Properties config = new java.util.Properties();
                config.put("StrictHostKeyChecking", "no");

                session.setConfig(config);
                session.connect();
                if(session.isConnected()){
                    System.out.println("Connected..........");
                }
                channelSftp = (ChannelSftp) session.openChannel("sftp");
                channelSftp.connect();
                if (channelSftp.isConnected()) {

                    System.out.println("Connected to channel");
                }
               // channelSftp.cd(destinationPath);
                //channelSftp.put(file.getInputStream(), file.getOriginalFilename(), ChannelSftp.OVERWRITE);

                channelSftp.disconnect();
                session.disconnect();
            } finally {
                if (channelSftp != null && channelSftp.isConnected()) {
                    channelSftp.disconnect();
                }

                if (session != null && session.isConnected()) {
                    session.disconnect();
                }
            }
        }
}


