import java.awt.*;
import javax.swing.*;

public class JTextAreaDemo extends JFrame {
    JTextArea resultArea = new JTextArea(5, 20);

    public JTextAreaDemo() {
        resultArea.setText("Enter more text to see scrollbars");
        JScrollPane scrollingArea = new JScrollPane(resultArea);

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(scrollingArea, BorderLayout.CENTER);

        this.setContentPane(contentPane);
        this.setTitle("JTextArea Demo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }

    public static void main(String[] args) {
        JFrame aFrame = new JTextAreaDemo();
        aFrame.setVisible(true);
    }
}
