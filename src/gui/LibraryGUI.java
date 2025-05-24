package src.gui;

import javax.swing.JFrame;
import src.model.Library;

public class LibraryGUI {
    Library library = new Library();
    JFrame frame = new JFrame(library.getTitle());
}
