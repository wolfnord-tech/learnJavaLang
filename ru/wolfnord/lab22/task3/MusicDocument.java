package ru.wolfnord.lab22.task3;

public class MusicDocument implements IDocument {
    private String info;

    @Override
    public void openFile() {
        System.out.println("Open Music Document: " + info);
    }

    @Override
    public void newFile() {
        info = "";
        System.out.println("New Music Document Created");
    }

    @Override
    public void saveFile() {
        System.out.println("Music Document Saved");
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
