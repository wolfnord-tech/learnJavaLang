package ru.wolfnord.lab22.task3;

public class ImageDocument implements IDocument {
    private String info;

    @Override
    public void openFile() {
        System.out.println("Open Image Document: " + info);
    }

    @Override
    public void newFile() {
        info = "";
        System.out.println("New Image Document Created");
    }

    @Override
    public void saveFile() {
        System.out.println("Image Document Saved");
    }

    @Override
    public String getInfo() {
        return info;
    }

    @Override
    public void setInfo(String info) {
        this.info = info;
    }
}
