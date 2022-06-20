/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.itlsco.organization.orbanizationwebcommons;

import java.io.Serializable;
import org.primefaces.event.CaptureEvent;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.file.UploadedFile;

/**
 *
 * @author milind
 */
public class UploadFileOrClickPhoto implements Serializable {

    //private final Document document;
    private String givenFileName;
    private byte[] fileContents;
    private String contentType;

    private boolean showUploadFile;
    // private UploadedFile uploadedFile;

    public UploadFileOrClickPhoto(String givenFileName, byte[] fileContents, String contentType) {
        this.givenFileName = givenFileName;
        this.fileContents = fileContents;
        this.contentType = contentType;
    }

//    public UploadFileOrClickPhoto(@NotNull Document document) {
//        showUploadFile = false;
//        //this.document = document;
//    }
//    public Document getDocument() {
//        return document;
//    }
    public boolean isShowUploadFile() {
        return showUploadFile;
    }

    public void setShowUploadFile(boolean showUploadFile) {
        this.showUploadFile = showUploadFile;
    }

    public String getGivenFileName() {
//        return document.getGivenFileName(); 
        return givenFileName;
    }

    public byte[] getFileContents() {
//        return document.getFileContents();
        return fileContents;
    }

    public String getContentType() {
        return contentType;
    }

    public void onUpload(FileUploadEvent event) {
        UploadedFile uploadedFile = event.getFile();
        fileContents = uploadedFile.getContent();
        givenFileName = uploadedFile.getFileName();
        contentType = uploadedFile.getContentType();

//        document.setFileContents(uploadedFile.getContent());
//        document.setGivenFileName(uploadedFile.getFileName());
//        document.setContentType(uploadedFile.getContentType());
    }

    public void onCapture(CaptureEvent captureEvent) {
        fileContents = captureEvent.getData();
        givenFileName = "ClickedPhoto.jpg";
        contentType = "image/jpeg";
//        document.setFileContents(captureEvent.getData());
//        document.setGivenFileName("ClickedPhoto.jpg");
//        document.setContentType("image/jpeg");
    }

}
