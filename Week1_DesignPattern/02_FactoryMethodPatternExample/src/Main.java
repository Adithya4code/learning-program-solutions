class ConcreteWordDocument implements Document {
    public void use() {
        System.out.println("Using Word Document");
    }
}
class ConcretePdfDocument implements Document {
    public void use() {
        System.out.println("Using PDF Document");
    }
}

class ConcreteExcelDocument implements Document {
    public void use() {
        System.out.println("Using Excel Document");
    }
}

class WordDocumentCreator extends DocumentFactory {
    public Document createDocument() {
        return new ConcreteWordDocument();
    }
}

class PdfDocumentCreator extends DocumentFactory {
    public Document createDocument() {
        return new ConcretePdfDocument();
    }
}

class ExcelDocumentCreator extends DocumentFactory {
    public Document createDocument() {
        return new ConcreteExcelDocument();
    }
}

public class Main {
    public static void main(String[] args) {
        testDocumentCreation("WORD");
        testDocumentCreation("PDF");
        testDocumentCreation("EXCEL");
        testDocumentCreation("TEXT"); // Unsupported type
    }

    public static void testDocumentCreation(String type) {
        DocumentFactory factory;

        switch (type.toUpperCase()) {
            case "WORD":
                factory = new WordDocumentCreator();
                break;
            case "PDF":
                factory = new PdfDocumentCreator();
                break;
            case "EXCEL":
                factory = new ExcelDocumentCreator();
                break;
            default:
                System.out.println("Unsupported document type: " + type);
                return;
        }

        Document document = factory.createDocument();
        document.use();
    }
}