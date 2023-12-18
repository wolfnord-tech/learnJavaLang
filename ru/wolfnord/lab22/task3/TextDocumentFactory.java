package ru.wolfnord.lab22.task3;

public class TextDocumentFactory implements IDocumentFactory {

    @Override
    public IDocument createNewDocument() {
        return new TextDocument();
    }

    @Override
    public IDocument openExistingDocument(String info) {
        TextDocument document = new TextDocument();
        document.setInfo(info);
        return document;
    }
}