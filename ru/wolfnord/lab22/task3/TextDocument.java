package ru.wolfnord.lab22.task3;

public class TextDocument implements IDocument {
    private String info;

    @Override
    public void openFile() {
        System.out.println("Open Text Document: " + info);
    }

    @Override
    public void newFile() {
        info = "";
        System.out.println("New Text Document Created");
    }

    @Override
    public void saveFile() {
        System.out.println("Text Document Saved");
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
