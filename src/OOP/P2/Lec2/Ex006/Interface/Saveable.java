package OOP.P2.Lec2.Ex006.Interface;

import OOP.P2.Lec2.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
