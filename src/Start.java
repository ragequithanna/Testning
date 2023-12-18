public class Start {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                StartWindow startWindow = new StartWindow();
                startWindow.setVisible(true);
            }
        });
    }
}