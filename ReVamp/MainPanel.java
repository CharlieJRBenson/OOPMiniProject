
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MainPanel extends JPanel {
    private JButton buyBtn;
    private JList portfolioLst;
    private JList historyLst;
    private JButton sellBtn;
    private JTextField depositTf;
    private JLabel balanceLbl;
    private JButton withdrawBtn;
    private JButton depositBtn;
    private JTextField amountTf;
    private JLabel balInstrucLbl;
    private JTextField shareTf;
    private JLabel buyLbl;
    private JLabel sellLbl;
    private JLabel portfolioLbl;
    private JLabel selectedLbl;
    private JLabel schemaLbl;
    private JLabel currPriceLbl;
    private JLabel portshareLbl;
    private JComboBox accountsMenu;
    private JLabel accountLbl;
    private JLabel accTypeLbl;
    private JLabel createAccLbl;
    private JTextField userNameTf;
    private JLabel importLbl;
    private JTextField pathTf;
    private JButton saveBtn;
    private JButton importBtn;
    private JLabel instrucImportLbl;
    private JButton createUserBtn;
    private JButton createFundBtn;
    private JButton deleteBtn;
    private JScrollPane portScrollPan;
    private JScrollPane portHistPan;

    public MainPanel() {
        // construct preComponents
        String[] portfolioLstItems = { "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a",
                "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", };
        String[] historyLstItems = { "1/1/1, 50, 40,", "1/1/1, 50, 40,", "1/1/1, 50, 40,", "1/1/1, 50, 40,",
                "1/1/1, 50, 40,", "1/1/1, 50, 40,", "1/1/1, 50, 40,", "1/1/1, 50, 40,", "1/1/1, 50, 40,",
                "1/1/1, 50, 40,", "1/1/1, 50, 40,", "1/1/1, 50, 40,", "1/1/1, 50, 40,", "1/1/1, 50, 40,",
                "1/1/1, 50, 40,", "1/1/1, 50, 40,", "1/1/1, 50, 40,", "1/1/1, 50, 40,", "1/1/1, 50, 40,",
                "1/1/1, 50, 40,", "1/1/1, 50, 40,", "1/1/1, 50, 40,", "1/1/1, 50, 40,", "1/1/1, 50, 40,",
                "1/1/1, 50, 40,", "1/1/1, 50, 40,", "1/1/1, 50, 40,", "1/1/1, 50, 40,", "1/1/1, 50, 40,", };
        String[] accountsMenuItems = { "Charlie", "David", "FundSmith" };

        // construct components
        this.buyBtn = new JButton("Buy");
        this.portfolioLst = new JList(portfolioLstItems);
        this.historyLst = new JList(historyLstItems);
        this.portScrollPan = new JScrollPane(portfolioLst);
        this.portHistPan = new JScrollPane(historyLst);

        this.sellBtn = new JButton("Sell");
        this.depositTf = new JTextField(5);
        this.balanceLbl = new JLabel("Balance: $500");
        this.withdrawBtn = new JButton("Withdraw");
        this.depositBtn = new JButton("Deposit");
        this.amountTf = new JTextField(5);
        this.balInstrucLbl = new JLabel("Deposit or Withdraw Cash:");
        this.shareTf = new JTextField(5);
        this.buyLbl = new JLabel("Share:");
        this.sellLbl = new JLabel("Amount $ :");
        this.portfolioLbl = new JLabel("Portfolio Worth: $500");
        this.selectedLbl = new JLabel("Selected: TSLA");
        this.schemaLbl = new JLabel("Date        Open        Close");
        this.currPriceLbl = new JLabel("Current Price: $500");
        this.portshareLbl = new JLabel("Portfolio Shares");
        this.accountsMenu = new JComboBox(accountsMenuItems);
        this.accountLbl = new JLabel("Account");
        this.accTypeLbl = new JLabel("Account Type: User");
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
        setPreferredSize(new Dimension(845, 570));
        setLayout(null);

        // add components
        add(buyBtn);
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

        // set component bounds (only needed by Absolute Positioning)
        buyBtn.setBounds(10, 435, 100, 25);
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
