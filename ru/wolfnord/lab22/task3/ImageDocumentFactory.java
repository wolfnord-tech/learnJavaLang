package ru.wolfnord.lab22.task3;

public class ImageDocumentFactory implements IDocumentFactory {

    @Override
    public IDocument createNewDocument() {
        return new ImageDocument();
    }

    @Override
    public IDocument openExistingDocument(String info) {
        ImageDocument document = new ImageDocument();
        document.setInfo(info);
        return document;
    }
}