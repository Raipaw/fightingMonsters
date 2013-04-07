package Game;

/**
 *
 * @author Phil
 */
import javax.swing.JFrame;

public class Main extends JFrame {
int height = 161;
int width = 241;
int times = 4;
    public Main() {
        width = width * times;
        height = height * times;
        add(new Board());
        setTitle("Fighting Monsters!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(width, height);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }
    public static void main(String[] args) {
        Main main;
        main = new Main();
    }
}
