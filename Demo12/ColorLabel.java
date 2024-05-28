package Demo12;

import javax.swing.*;
import java.awt.*;

public  class ColorLabel extends JLabel {
    public ColorLabel(String test, Color color) {
        this.setText(test);
        this.setOpaque(true);
        this.setBackground(color);
        this.setPreferredSize(new Dimension(60,30));
        this.setHorizontalAlignment(SwingConstants.CENTER);

    }
}