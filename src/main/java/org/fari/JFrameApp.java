package org.fari;

import javax.swing.*;

public class JFrameApp extends JFrame {

    public JFrameApp() {
        setBounds(100,100,265,400);
        setTitle("swing_calc");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new JPanelApp());
        setVisible(true);


    }
}
