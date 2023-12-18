package ru.wolfnord.lab22.task3;

public interface IDocument {
    void openFile();
    void newFile();
    void saveFile();
    String getInfo();
    void setInfo(String info);
}