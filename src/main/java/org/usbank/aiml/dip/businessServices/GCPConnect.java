package org.usbank.aiml.dip.businessServices;

import com.google.auth.Credentials;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.*;
import org.springframework.stereotype.Service;
import com.google.api.gax.paging.Page;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@Service
public class GCPConnect {

    public void connectGCP () throws IOException {
        //Storage storage = StorageOptions.getDefaultInstance().getService();
        Credentials credentials = GoogleCredentials
                .fromStream(new FileInputStream("/Users/kinjarapu/Desktop/Learnings/Springboot-Spark/GCP-key/datasciencesandbox-8b67edc56727.json"));
        Storage storage = StorageOptions.newBuilder().setCredentials(credentials)
                .setProjectId("datasciencesandbox-232920").build().getService();


        /*System.out.println("Connected.....");
        Bucket bucket = storage.create(BucketInfo.of("sample-bucket12345"));
        String value = "Hello, World!";
        byte[] bytes = value.getBytes();
        Blob blob = bucket.create("my-first-blob", bytes);*/

        Bucket bucket = storage.get("sample-bucket12345");

        Page<Blob> blobs = bucket.list();
        for (Blob blob: blobs.getValues()) {
            if ("ICS_sample-small.json".equals(blob.getName())) {
                System.out.println("inside Data -->"+new String(blob.getContent()));
            }

            System.out.println("out side Data -->"+new String(blob.getContent()));
        }

       /* Blob blob = storage.get();
        String value = new String(blob.getContent());*/
    }
}
