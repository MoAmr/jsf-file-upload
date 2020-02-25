/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samples.linkedin.jsf.page;

import java.io.Serializable;
import java.util.logging.Logger;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.Part;

/**
 *
 * @author Eyitayo
 */

@ViewScoped
@Named("fileUploadBean")
public class FileUploadPageBean implements Serializable {
    
   private Part uploadedFile;

    /**
     * @return the uploadedFile
     */
    public Part getUploadedFile() {
        return uploadedFile;
    }

    /**
     * @param uploadedFile the uploadedFile to set
     */
    public void setUploadedFile(Part uploadedFile) {
        this.uploadedFile = uploadedFile;
    }
   
  
    public void uploadFile(){
        Logger.getAnonymousLogger().info("Uploaded file mimetype "+uploadedFile.getContentType());
    }
    
}
