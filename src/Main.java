import view.ChessGameFrame;
import view.Menu;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {//lambda表达式，创造JFrame，setVisible
            Menu menu = new Menu(720,720);
        });
    }
}

//测试中。。。。。
//不知道能不能看到
