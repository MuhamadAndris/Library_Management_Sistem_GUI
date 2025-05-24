package gui;

import javax.swing.JFrame;
import model.Library;

public class LibraryGUI {
    Library library = new Library();
    JFrame frame = new JFrame(library.getTitle());
}
