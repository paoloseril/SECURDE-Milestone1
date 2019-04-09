package View;

import Controller.SQLite;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SearchLog extends JFrame {

    public SQLite sqlite;
    private JTextField desc, date;
    private JLabel text, search;
    private JPanel panel, checkPanel1, checkPanel2, textFieldsPanel;
    private JButton searchBtn;
    private List<JCheckBox> checkBoxesFunctionalities, checkBoxesTests;
    private JCheckBox c1, c2, c3, c4, c5, c6, c7, c8, c9,c10, c11, c12;
    private List<JCheckBox> checkBoxesUser;

    public SearchLog(SQLite sqlite) {
        this.sqlite = sqlite;
        initComponents();
    }

    private void initComponents() {
        checkBoxesFunctionalities = new ArrayList<>();
        checkBoxesTests = new ArrayList<>();
        checkBoxesUser = new ArrayList<>();

        desc = new JTextField();
        text = new JLabel("Description");
        search = new JLabel("Date (YYYY-MM-DD)");

        date = new JTextField();

        c1 = new JCheckBox("CP");
        c2 = new JCheckBox("LO");

        c3 = new JCheckBox("UUL");
        c4 = new JCheckBox("UL");

        c5 = new JCheckBox("ER");
        c6 = new JCheckBox("DU");
        c7 = new JCheckBox("PP");
        c8 = new JCheckBox("AP");
        c9 = new JCheckBox("RP");
        c10 = new JCheckBox("EP");

        c11 = new JCheckBox("F");
        c12 = new JCheckBox("S");

        Collections.addAll(checkBoxesFunctionalities, c1,
                c2, c5, c6, c7, c8, c9, c10);
        Collections.addAll(checkBoxesTests, c11, c12);
        Collections.addAll(checkBoxesUser, c3, c4);
        checkPanel1 = new JPanel();
        checkPanel2 = new JPanel();

        checkPanel1.setLayout(new FlowLayout());
        checkPanel2.setLayout(new FlowLayout());

        checkPanel1.add(c1);
        checkPanel1.add(c2);
        checkPanel1.add(c3);
        checkPanel1.add(c4);
        checkPanel1.add(c5);
        checkPanel1.add(c6);

        checkPanel2.add(c7);
        checkPanel2.add(c8);
        checkPanel2.add(c9);
        checkPanel2.add(c10);
        checkPanel2.add(c11);
        checkPanel2.add(c12);

        text.setLabelFor(desc);
        text.setAlignmentY(CENTER_ALIGNMENT);
        text.setAlignmentX(CENTER_ALIGNMENT);
        search.setLabelFor(date);
        search.setAlignmentX(CENTER_ALIGNMENT);
        search.setAlignmentY(CENTER_ALIGNMENT);

        Border padding = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(padding);

        searchBtn = new JButton("Search Logs");
        searchBtn.setAlignmentX(CENTER_ALIGNMENT);
        searchBtn.setAlignmentY(CENTER_ALIGNMENT);
        panel.add(text);
        panel.add(desc);
        panel.add(search);
        panel.add(date);
        panel.add(checkPanel1);
        panel.add(checkPanel2);

        panel.add(searchBtn);

        setSize(400, 400);
        add(panel);
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                //frame.dispose();
            }
        });
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public JButton getSearchBtn() {
        return searchBtn;
    }

    public JTextField getDate() {
        return date;
    }

    public JTextField getDesc() {
        return desc;
    }

    public List<String> getCheckBoxesFunctionalities() {
        ArrayList<String> checkedCheckBoxes = new ArrayList<>();
        for (JCheckBox checkBox: checkBoxesFunctionalities) {
            if (checkBox.isSelected()) {
                checkedCheckBoxes.add(checkBox.getText());
            }
        }
        return checkedCheckBoxes.size() >= 1 ? checkedCheckBoxes : Collections.emptyList();
    }

    public List<String> getCheckBoxesTests() {
        ArrayList<String> checkedCheckBoxes = new ArrayList<>();
        for (JCheckBox checkBox: checkBoxesTests) {
            if (checkBox.isSelected()) {
                checkedCheckBoxes.add(checkBox.getText());
            }
        }
        return checkedCheckBoxes.size() >= 1 ? checkedCheckBoxes : Collections.emptyList();
    }

    public List<String> getCheckBoxesUser() {
        ArrayList<String> checkedCheckBoxes = new ArrayList<>();
        for (JCheckBox checkBox: checkBoxesUser) {
            if (checkBox.isSelected()) {
                checkedCheckBoxes.add(checkBox.getText());
            }
        }
        return checkedCheckBoxes.size() >= 1 ? checkedCheckBoxes : Collections.emptyList();
    }
}
