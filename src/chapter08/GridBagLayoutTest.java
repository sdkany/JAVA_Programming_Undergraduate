package chapter08;

import javax.swing.*;
import java.awt.*;

/**
 * @author SDKany
 * @ClassName GridBagLayoutTest
 * @Date 2023/5/21 13:55
 * @Version V1.0
 * @Description
 */
public class GridBagLayoutTest extends JFrame {
    private JPanel panelResult;
    private JPanel panelM;
    private JPanel panelParam;

    private JTextField textFieldResult;

    private JButton buttonMC;
    private JButton buttonMR;
    private JButton buttonMPlus;
    private JButton buttonMDec;
    private JButton buttonMs;
    private JButton buttonM;
    private JButton buttonCE;
    private JButton buttonC;
    private JButton buttonClear;
    private JButton buttonDIV;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton buttonMUL;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton buttonDec;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton buttonAdd;
    private JButton buttonMinus;
    private JButton button0;
    private JButton buttonPoint;
    private JButton buttonEqual;

    private void initCompents() {
        this.textFieldResult = new JTextField();
        this.textFieldResult.setBackground(Color.WHITE);
        this.textFieldResult.setFont(new Font(Font.SERIF, Font.BOLD, 32));
        this.textFieldResult.setHorizontalAlignment(SwingConstants.RIGHT);
        this.textFieldResult.setEnabled(false);
        this.textFieldResult.setText("0");

        this.buttonMC = new JButton("MC");
        this.buttonMR = new JButton("MR");
        this.buttonMPlus = new JButton("M+");
        this.buttonMDec = new JButton("M-");
        this.buttonMs = new JButton("MS");
        this.buttonM = new JButton("M`");

        this.buttonCE = new JButton("CE");
        this.buttonC = new JButton("C");
        this.buttonClear = new JButton("Clear");
        this.buttonDIV = new JButton("/");
        this.button7 = new JButton("7");
        this.button8 = new JButton("8");
        this.button9 = new JButton("9");
        this.buttonMUL = new JButton("*");
        this.button4 = new JButton("4");
        this.button5 = new JButton("5");
        this.button6 = new JButton("6");
        this.buttonDec = new JButton("-");
        this.button1 = new JButton("1");
        this.button2 = new JButton("2");
        this.button3 = new JButton("3");
        this.buttonMinus = new JButton("+_");
        this.button0 = new JButton("0");
        this.buttonPoint = new JButton(".");
        this.buttonEqual = new JButton("=");
        this.buttonAdd = new JButton("+");

        this.panelM = new JPanel();
        this.panelParam = new JPanel();
        this.panelResult = new JPanel();

    }

    private void initLayout() {
        this.setSize(420, 500);
        this.setLocationRelativeTo(null);
        this.getContentPane().setLayout(new GridBagLayout());
        this.setTitle("计算器");

        this.getContentPane().add(panelResult, new GridBagConstraintsHelper(0, 0, 1, 1).setWeight(1, 1).setAnchor(GridBagConstraints.WEST).setFill(GridBagConstraints.BOTH));
        this.getContentPane().add(panelM, new GridBagConstraintsHelper(0, 1, 1, 1).setWeight(1, 0).setAnchor(GridBagConstraints.WEST).setFill(GridBagConstraints.BOTH));
        this.getContentPane().add(panelParam, new GridBagConstraintsHelper(0, 3, 1, 1).setWeight(1, 1).setAnchor(GridBagConstraints.WEST).setFill(GridBagConstraints.BOTH));

        this.panelResult.setLayout(new GridBagLayout());
        this.panelResult.add(this.textFieldResult, new GridBagConstraintsHelper(0, 0, 1, 1).setInsets(5, 1, 0, 1).setIpad(0, 30).setWeight(1, 1).setAnchor(GridBagConstraints.CENTER).setFill(GridBagConstraints.BOTH));

        this.panelM.setLayout(new GridBagLayout());
        this.panelM.add(this.buttonMC, new GridBagConstraintsHelper(0, 0, 1, 1).setInsets(1).setWeight(1, 1).setAnchor(GridBagConstraints.CENTER).setFill(GridBagConstraints.BOTH));
        this.panelM.add(this.buttonMR, new GridBagConstraintsHelper(1, 0, 1, 1).setInsets(1).setWeight(1, 1).setAnchor(GridBagConstraints.CENTER).setFill(GridBagConstraints.BOTH));
        this.panelM.add(this.buttonMPlus, new GridBagConstraintsHelper(2, 0, 1, 1).setInsets(1).setWeight(1, 1).setAnchor(GridBagConstraints.CENTER).setFill(GridBagConstraints.BOTH));
        this.panelM.add(this.buttonMDec, new GridBagConstraintsHelper(3, 0, 1, 1).setInsets(1).setWeight(1, 1).setAnchor(GridBagConstraints.CENTER).setFill(GridBagConstraints.BOTH));
        this.panelM.add(this.buttonMs, new GridBagConstraintsHelper(4, 0, 1, 1).setInsets(1).setWeight(1, 1).setAnchor(GridBagConstraints.CENTER).setFill(GridBagConstraints.BOTH));
        this.panelM.add(this.buttonM, new GridBagConstraintsHelper(5, 0, 1, 1).setInsets(1).setWeight(1, 1).setAnchor(GridBagConstraints.CENTER).setFill(GridBagConstraints.BOTH));

        this.panelParam.setLayout(new GridBagLayout());
        this.panelParam.add(this.buttonCE, new GridBagConstraintsHelper(0, 0, 1, 1).setInsets(1).setIpad(5, 20).setWeight(1, 1).setAnchor(GridBagConstraints.WEST).setFill(GridBagConstraints.BOTH));
        this.panelParam.add(this.buttonC, new GridBagConstraintsHelper(1, 0, 1, 1).setInsets(1).setIpad(5, 20).setWeight(1, 1).setAnchor(GridBagConstraints.WEST).setFill(GridBagConstraints.BOTH));
        this.panelParam.add(this.buttonClear, new GridBagConstraintsHelper(2, 0, 1, 1).setInsets(1).setIpad(5, 20).setWeight(1, 1).setAnchor(GridBagConstraints.WEST).setFill(GridBagConstraints.BOTH));
        this.panelParam.add(this.buttonDIV, new GridBagConstraintsHelper(3, 0, 1, 1).setInsets(1).setIpad(5, 20).setWeight(2, 1).setAnchor(GridBagConstraints.WEST).setFill(GridBagConstraints.BOTH));
        this.panelParam.add(this.button7, new GridBagConstraintsHelper(0, 1, 1, 1).setInsets(1).setIpad(5, 20).setWeight(1, 1).setAnchor(GridBagConstraints.WEST).setFill(GridBagConstraints.BOTH));
        this.panelParam.add(this.button8, new GridBagConstraintsHelper(1, 1, 1, 1).setInsets(1).setIpad(5, 20).setWeight(1, 1).setAnchor(GridBagConstraints.WEST).setFill(GridBagConstraints.BOTH));
        this.panelParam.add(this.button9, new GridBagConstraintsHelper(2, 1, 1, 1).setInsets(1).setIpad(5, 20).setWeight(1, 1).setAnchor(GridBagConstraints.WEST).setFill(GridBagConstraints.BOTH));
        this.panelParam.add(this.buttonMUL, new GridBagConstraintsHelper(3, 1, 1, 1).setInsets(1).setIpad(5, 20).setWeight(2, 1).setAnchor(GridBagConstraints.WEST).setFill(GridBagConstraints.BOTH));
        this.panelParam.add(this.button4, new GridBagConstraintsHelper(0, 2, 1, 1).setInsets(1).setIpad(5, 20).setWeight(1, 1).setAnchor(GridBagConstraints.WEST).setFill(GridBagConstraints.BOTH));
        this.panelParam.add(this.button5, new GridBagConstraintsHelper(1, 2, 1, 1).setInsets(1).setIpad(5, 20).setWeight(1, 1).setAnchor(GridBagConstraints.WEST).setFill(GridBagConstraints.BOTH));
        this.panelParam.add(this.button6, new GridBagConstraintsHelper(2, 2, 1, 1).setInsets(1).setIpad(5, 20).setWeight(1, 1).setAnchor(GridBagConstraints.WEST).setFill(GridBagConstraints.BOTH));
        this.panelParam.add(this.buttonDec, new GridBagConstraintsHelper(3, 2, 1, 1).setInsets(1).setIpad(5, 20).setWeight(2, 1).setAnchor(GridBagConstraints.WEST).setFill(GridBagConstraints.BOTH));
        this.panelParam.add(this.button1, new GridBagConstraintsHelper(0, 3, 1, 1).setInsets(1).setIpad(5, 20).setWeight(1, 1).setAnchor(GridBagConstraints.WEST).setFill(GridBagConstraints.BOTH));
        this.panelParam.add(this.button2, new GridBagConstraintsHelper(1, 3, 1, 1).setInsets(1).setIpad(5, 20).setWeight(1, 1).setAnchor(GridBagConstraints.WEST).setFill(GridBagConstraints.BOTH));
        this.panelParam.add(this.button3, new GridBagConstraintsHelper(2, 3, 1, 1).setInsets(1).setIpad(5, 20).setWeight(1, 1).setAnchor(GridBagConstraints.WEST).setFill(GridBagConstraints.BOTH));
        this.panelParam.add(this.buttonAdd, new GridBagConstraintsHelper(3, 3, 1, 1).setInsets(1).setIpad(5, 20).setWeight(2, 1).setAnchor(GridBagConstraints.WEST).setFill(GridBagConstraints.BOTH));
        this.panelParam.add(this.buttonMinus, new GridBagConstraintsHelper(0, 4, 1, 1).setInsets(1).setIpad(5, 20).setWeight(1, 1).setAnchor(GridBagConstraints.WEST).setFill(GridBagConstraints.BOTH));
        this.panelParam.add(this.button0, new GridBagConstraintsHelper(1, 4, 1, 1).setInsets(1).setIpad(5, 20).setWeight(1, 1).setAnchor(GridBagConstraints.WEST).setFill(GridBagConstraints.BOTH));
        this.panelParam.add(this.buttonPoint, new GridBagConstraintsHelper(2, 4, 1, 1).setInsets(1).setIpad(5, 20).setWeight(1, 1).setAnchor(GridBagConstraints.WEST).setFill(GridBagConstraints.BOTH));
        this.panelParam.add(this.buttonEqual, new GridBagConstraintsHelper(3, 4, 1, 1).setInsets(1).setIpad(5, 20).setWeight(2, 1).setAnchor(GridBagConstraints.WEST).setFill(GridBagConstraints.BOTH));
    }

    private static void createAndShowGUI() {
        // 创建一个名为GridLayout的窗体
        GridBagLayoutTest gridBagLayoutTest = new GridBagLayoutTest();
        gridBagLayoutTest.initCompents();
        gridBagLayoutTest.initLayout();
        gridBagLayoutTest.setVisible(true);
        gridBagLayoutTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GridBagLayoutTest::createAndShowGUI);
    }
}
