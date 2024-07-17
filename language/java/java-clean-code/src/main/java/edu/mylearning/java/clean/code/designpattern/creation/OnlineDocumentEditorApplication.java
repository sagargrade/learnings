package edu.mylearning.java.clean.code.designpattern.creation;

public class OnlineDocumentEditorApplication {
    public static void main(String[] args) {
        // Singleton : Get Application Configuration
        ApplicationConfig applicationConfig = ApplicationConfig.getInstance();
        applicationConfig.setConfigValue("Light Mode");

        // Factory Method : Create a Word Document
        DocumentFactory documentFactory = new WordDocumentFactory();
        Document document = documentFactory.createDocument();
        document.open();

        // Abstract Factory : Create a Text Editor
        EditorFactory editorFactory = new TextEditorFactory();
        Editor editor = editorFactory.createEditor();
        editor.edit();

        // Builder : Build a complex Object
        DocumentDetail documentDetail = new DocumentDetailBuilder()
                .setTitle("Design Patterns")
                .setContext("Context of document")
                .setAuthor("John Doe")
                .build();
        System.out.println(documentDetail);

        // Prototype : Clone an existing document
        PrototypeDocument originalDocument = new PrototypeDocument("Original", "This is the original document");
        System.out.println("Original : " + originalDocument);

        try {
            PrototypeDocument cloneDocument = originalDocument.clone();
            cloneDocument.setTitle("Cloned Document");
            cloneDocument.setContent("This is the cloned content");
            System.out.println("Cloned : " + cloneDocument);
            System.out.println("Original after cloning : " + originalDocument);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

/**
 * Singleton Pattern - We'll use the Singleton pattern for managing the application configuration,
 * ensuring there's only one instance of configuration settings.
 */
class ApplicationConfig {
    private static ApplicationConfig instance;
    private String configValue;

    // Private constructor to prevent instantiation
    private ApplicationConfig() {
    }

    public static synchronized ApplicationConfig getInstance() {
        if (instance == null) {
            instance = new ApplicationConfig();
        }
        return instance;
    }

    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }
}

/**
 * Factory Method Pattern - We'll use the Factory Method pattern for creating different types of documents.
 * Each type of document (Word, Excel, PDF) will be created by a specific factory method.
 */
abstract class Document {
    public abstract void open();
}

class WordDocument extends Document {

    @Override
    public void open() {
        System.out.println("Opening work document..");
    }
}

class ExcelDocument extends Document {

    @Override
    public void open() {
        System.out.println("Opening excel document..");
    }
}

class PdfDocument extends Document {

    @Override
    public void open() {
        System.out.println("Opening pdf document..");
    }
}

abstract class DocumentFactory {
    public abstract Document createDocument();
}

class WordDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

class ExcelDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}

class PdfDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}

/**
 * Abstract Factory Pattern - We'll use the Abstract Factory pattern to create families of related objects,
 * such as different types of editors (e.g., text editor, spreadsheet editor).
 */
interface Editor {
    void edit();
}

class TextEditor implements Editor {

    @Override
    public void edit() {
        System.out.println("Editing text document");
    }
}

class SpreadSheetEditor implements Editor {

    @Override
    public void edit() {
        System.out.println("Editing spreadsheet document");
    }
}

interface EditorFactory {
    Editor createEditor();
}

class TextEditorFactory implements EditorFactory {

    @Override
    public Editor createEditor() {
        return new TextEditor();
    }
}

class SpreadSheetEditorFactory implements EditorFactory {

    @Override
    public Editor createEditor() {
        return new SpreadSheetEditor();
    }
}

/**
 * Builder Pattern - We'll use the Builder pattern to construct complex document objects step by step.
 */
class DocumentDetail {
    private String title;
    private String context;
    private String author;

    public DocumentDetail(String title, String context, String author) {
        this.title = title;
        this.context = context;
        this.author = author;
    }

    @Override
    public String toString() {
        return "DocumentDetail{" +
                "title='" + title + '\'' +
                ", context='" + context + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class DocumentDetailBuilder {
    private String title;
    private String context;
    private String author;

    public DocumentDetailBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public DocumentDetailBuilder setContext(String context) {
        this.context = context;
        return this;
    }

    public DocumentDetailBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    public DocumentDetail build() {
        return new DocumentDetail(title, context, author);
    }
}

/**
 * Prototype Pattern - We'll use the Prototype pattern to create new document instances by copying existing ones.
 */
class PrototypeDocument implements Cloneable {
    private String title;
    private String content;

    public PrototypeDocument(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    protected PrototypeDocument clone() throws CloneNotSupportedException {
        return (PrototypeDocument) super.clone();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "PrototypeDocument{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}