import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class UI extends JPanel {
    private static LookAndFeel laf = new NimbusLookAndFeel();

    static {
        try {
            UIManager.setLookAndFeel(laf);
        } catch (Exception e) {e.printStackTrace();}
    }

    public UI(String[] args) {
        super(new SpringLayout());
        SpringLayout lay = (SpringLayout)this.getLayout();

    }

    public static void main(String []args) {
        var whocares = new UI(args);
    }
}
