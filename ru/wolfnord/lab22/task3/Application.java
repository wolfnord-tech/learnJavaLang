package ru.wolfnord.lab22.task3;

public class Application {
    public static void main(String[] args) {
        IDocumentFactory textFactory = new TextDocumentFactory();
        IDocumentFactory musicFactory = new MusicDocumentFactory();
        IDocumentFactory imageFactory = new ImageDocumentFactory();

        Application textApp = new Application(textFactory);
        textApp.createNewDocument();
        textApp.setDocumentInfo("Test Text Document");
        textApp.saveDocument();

        Application musicApp = new Application(musicFactory);
        musicApp.createNewDocument();
        musicApp.setDocumentInfo("Test Music Document");
        musicApp.saveDocument();

        Application imageApp = new Application(imageFactory);
        imageApp.createNewDocument();
        imageApp.setDocumentInfo("Test Image Document");
        imageApp.saveDocument();
    }
    private IDocumentFactory documentFactory;
    private IDocument document;

    public Application(IDocumentFactory documentFactory) {
        this.documentFactory = documentFactory;
    }

    public void createNewDocument() {
        document = documentFactory.createNewDocument();
        document.newFile();
    }

    public void openExistingDocument(String info) {
        document = documentFactory.openExistingDocument(info);
        document.openFile();
    }

    public void saveDocument() {
        if (document != null) {
            document.saveFile();
        } else {
            System.out.println("No document to save");
        }
    }

    public void setDocumentInfo(String info) {
        if (document != null) {
            document.setInfo(info);
        } else {
            System.out.println("No document to set info");
        }
    }

    public String getDocumentInfo() {
        if (document != null) {
            return document.getInfo();
        } else {
            System.out.println("No document to get info from");
            return null;
        }
    }
}
