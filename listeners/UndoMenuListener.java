import javax.swing.event.MenuListener;
import javax.swing.event.MenuEvent;
import javax.swing.*;



// он должен реализовывать интерфейс MenuListener и иметь конструктор    
// UndoMenuListener(View view, JMenuItem undoMenuItem, JMenuItem redoMenuItem).
public class UndoMenuListener implements MenuListener {
    private JMenuItem undoMenuItem;
    private JMenuItem redoMenuItem;
    private View view;


    public UndoMenuListener(View view, JMenuItem undoMenuItem, JMenuItem redoMenuItem) {
        this.undoMenuItem = undoMenuItem;
        this.redoMenuItem = redoMenuItem;
        this.view = view;
    }

    @Override
    public void menuSelected(MenuEvent menuEvent) {
        undoMenuItem.setEnabled(view.canUndo());
        redoMenuItem.setEnabled(view.canRedo());
    }

    @Override
    public void menuDeselected(MenuEvent e) {
    }

    @Override
    public void menuCanceled(MenuEvent e) {
    }
}
