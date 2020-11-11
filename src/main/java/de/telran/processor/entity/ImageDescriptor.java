package de.telran.processor.entity;

import de.telran.processor.application.ImageProcessor;

public class ImageDescriptor {
    private String imageURL;
    private String actionName;

    public ImageDescriptor(String imageURL, String actionName){
        this.actionName = actionName;
        this.imageURL = imageURL;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getActionName() {
        return actionName;
    }

    @Override
    public String toString() {
        return "ImageDescriptor{" +
                "imageURL='" + imageURL + '\'' +
                ", actionName='" + actionName + '\'' +
                '}';
    }
}
