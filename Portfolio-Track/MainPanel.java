
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.*;

import javax.swing.*;

public class MainPanel extends JPanel {

    // class variables made public to enable more readable code.
    // avoids the need to add 15 getter/setter pairs and 1000 lines class.

    public JButton buyShareBtn;
    public JList historyLst;
    public JButton sellBtn;
    public JTextField depositTf;
    public JLabel balanceLbl;
    public JButton withdrawBtn;
    public JButton depositBtn;
    public JTextField amountTf;
    public JLabel balInstrucLbl;
    public JTextField shareTf;
    public JLabel buyLbl;
    public JLabel sellLbl;
    public JLabel portfolioLbl;
    public JLabel selectedLbl;
    public JLabel schemaLbl;
    public JLabel currPriceLbl;
    public JLabel portshareLbl;
    public JLabel accountLbl;
    public JLabel accTypeLbl;
    public JLabel createAccLbl;
    public JTextField userNameTf;
    public JLabel importLbl;
    public JTextField pathTf;
    public JButton saveBtn;
    public JButton importBtn;
    public JLabel instrucImportLbl;
    public JButton createUserBtn;
    public JButton createFundBtn;
    public JButton deleteBtn;
    public JScrollPane portScrollPan;
    public JScrollPane portHistPan;

    // account lists for account menu
    public ArrayList<Account> accList = new ArrayList<>();
    public DefaultComboBoxModel<String> accModel;
    public JComboBox<String> accountsMenu;

    // protfolio list models
    public DefaultListModel<String> portfolioModel;
    public JList<String> portfolioLst;

    // adds event listener to btn
    public void addBtnListener(AbstractButton btn, ActionListener listener) {
        btn.addActionListener(listener);
    }

    public MainPanel() {
        // construct preComponents
        this.accModel = new DefaultComboBoxModel<>();
        this.portfolioModel = new DefaultListModel<>();

        // construct components
        this.accountsMenu = new JComboBox<>(accModel);
        this.portfolioLst = new JList<>(portfolioModel);
        this.historyLst = new JList();

        this.buyShareBtn = new JButton("Buy");
        this.portScrollPan = new JScrollPane(portfolioLst);
        this.portHistPan = new JScrollPane(historyLst);
        this.sellBtn = new JButton("Sell");
        this.depositTf = new JTextField(5);
        this.balanceLbl = new JLabel("Balance: $0");
        this.withdrawBtn = new JButton("Withdraw");
        this.depositBtn = new JButton("Deposit");
        this.amountTf = new JTextField(5);
        this.balInstrucLbl = new JLabel("Deposit or Withdraw Cash:");
        this.shareTf = new JTextField(5);
        this.buyLbl = new JLabel("Asset Name:");
        this.sellLbl = new JLabel("Amount $ :");
        this.portfolioLbl = new JLabel("Portfolio Worth: $");
        this.selectedLbl = new JLabel("Selected: ");
        this.schemaLbl = new JLabel("Date--Open--Close");
        this.currPriceLbl = new JLabel("$/Share: $");
        this.portshareLbl = new JLabel("Shares--Value($)");
        this.accountLbl = new JLabel("Account");
        this.accTypeLbl = new JLabel("Account Type: ");
        this.createAccLbl = new JLabel("Create Account");
        this.userNameTf = new JTextField(5);
        this.importLbl = new JLabel("Account File Path :");
        this.pathTf = new JTextField(5);
        this.saveBtn = new JButton("Save");
        this.importBtn = new JButton("Import");
        this.instrucImportLbl = new JLabel("Save current account / Import from file");
        this.createUserBtn = new JButton("New User");
        this.createFundBtn = new JButton("New Fund");
        this.deleteBtn = new JButton("Delete");

        // adjust size and set layout
        setPreferredSize(new Dimension(845, 575));
        setLayout(null);

        // add components
        add(buyShareBtn);
        add(portfolioLst);
        add(historyLst);
        add(portScrollPan);
        add(portHistPan);
        add(sellBtn);
        add(depositTf);
        add(balanceLbl);
        add(withdrawBtn);
        add(depositBtn);
        add(amountTf);
        add(balInstrucLbl);
        add(shareTf);
        add(buyLbl);
        add(sellLbl);
        add(portfolioLbl);
        add(selectedLbl);
        add(schemaLbl);
        add(currPriceLbl);
        add(portshareLbl);
        add(accountsMenu);
        add(accountLbl);
        add(accTypeLbl);
        add(createAccLbl);
        add(userNameTf);
        add(importLbl);
        add(pathTf);
        add(saveBtn);
        add(importBtn);
        add(instrucImportLbl);
        add(createUserBtn);
        add(createFundBtn);
        add(deleteBtn);

        // set component bounds
        buyShareBtn.setBounds(10, 435, 100, 25);
        portfolioLst.setBounds(395, 110, 160, 455);
        historyLst.setBounds(565, 110, 275, 455);
        sellBtn.setBounds(120, 435, 100, 25);
        depositTf.setBounds(10, 505, 100, 25);
        balanceLbl.setBounds(10, 540, 320, 25);
        withdrawBtn.setBounds(230, 505, 100, 25);
        depositBtn.setBounds(120, 505, 100, 25);
        amountTf.setBounds(120, 400, 100, 25);
        balInstrucLbl.setBounds(10, 480, 160, 25);
        shareTf.setBounds(10, 400, 100, 25);
        buyLbl.setBounds(10, 375, 100, 25);
        sellLbl.setBounds(120, 375, 100, 25);
        portfolioLbl.setBounds(565, 10, 160, 25);
        selectedLbl.setBounds(565, 40, 160, 25);
        schemaLbl.setBounds(565, 85, 145, 25);
        currPriceLbl.setBounds(565, 60, 165, 25);
        portshareLbl.setBounds(395, 85, 100, 25);
        accountsMenu.setBounds(65, 10, 155, 25);
        accountLbl.setBounds(10, 10, 55, 25);
        accTypeLbl.setBounds(10, 35, 155, 25);
        createAccLbl.setBounds(10, 75, 100, 25);
        userNameTf.setBounds(120, 75, 100, 25);
        importLbl.setBounds(10, 180, 125, 25);
        pathTf.setBounds(10, 200, 210, 25);
        saveBtn.setBounds(10, 235, 100, 25);
        importBtn.setBounds(120, 235, 100, 25);
        instrucImportLbl.setBounds(10, 155, 240, 25);
        createUserBtn.setBounds(10, 105, 100, 25);
        createFundBtn.setBounds(120, 105, 100, 25);
        deleteBtn.setBounds(230, 10, 100, 25);

    }

}
