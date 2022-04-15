import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import java.util.Map;
import java.util.Date;
import java.util.HashMap;

public class MainPanel extends JPanel {

    // class variables made public to enable more readable code.
    // avoids the need to add 15 getter/setter pairs and 1000 lines class.

    public JButton buyShareBtn;
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
    public JToggleButton apiTgl;

    // account lists for account menu
    public ArrayList<Account> accList = new ArrayList<>();
    public DefaultComboBoxModel<String> accModel;
    public JComboBox<String> accountsMenu;

    // protfolio list models
    public DefaultListModel<String> portfolioModel;
    public JList<String> portfolioLst;

    // historic prices
    public JTextArea historyTA;

    // prices history, key = Asset, val = List of entrys
    public Map<Asset, ArrayList<Pair<Date, Float>>> priceHistMap;

    // adds event listener to btn
    public void addBtnListener(AbstractButton btn, ActionListener listener) {
        btn.addActionListener(listener);
    }

    public MainPanel() {
        // construct preComponents
        this.accModel = new DefaultComboBoxModel<>();
        this.portfolioModel = new DefaultListModel<>();
        this.priceHistMap = new HashMap<>();

        // construct components
        this.accountsMenu = new JComboBox<>(accModel);
        this.portfolioLst = new JList<>(portfolioModel);

        // creates text area
        this.historyTA = new JTextArea(5, 5);
        this.historyTA.setLineWrap(true);
        this.historyTA.setWrapStyleWord(true);
        this.historyTA.setEditable(false);

        JScrollPane portfScroll = new JScrollPane(this.portfolioLst);
        JScrollPane histScroll = new JScrollPane(this.historyTA);

        histScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        portfScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        histScroll.setVisible(true);
        portfScroll.setVisible(true);

        this.buyShareBtn = new JButton("Buy");
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
        this.apiTgl = new JToggleButton("Real Data", false);

        // adjust size and set layout
        this.setPreferredSize(new Dimension(845, 575));
        this.setLayout(null);

        // add components
        this.add(buyShareBtn);

        this.add(portfScroll);
        this.add(histScroll);
        this.add(portfolioLst);
        this.add(historyTA);
        this.add(sellBtn);
        this.add(depositTf);
        this.add(balanceLbl);
        this.add(withdrawBtn);
        this.add(depositBtn);
        this.add(amountTf);
        this.add(balInstrucLbl);
        this.add(shareTf);
        this.add(buyLbl);
        this.add(sellLbl);
        this.add(portfolioLbl);
        this.add(selectedLbl);
        this.add(schemaLbl);
        this.add(currPriceLbl);
        this.add(portshareLbl);
        this.add(accountsMenu);
        this.add(accountLbl);
        this.add(accTypeLbl);
        this.add(createAccLbl);
        this.add(userNameTf);
        this.add(importLbl);
        this.add(pathTf);
        this.add(saveBtn);
        this.add(importBtn);
        this.add(instrucImportLbl);
        this.add(createUserBtn);
        this.add(createFundBtn);
        this.add(deleteBtn);
        this.add(apiTgl);

        // set component bounds
        this.buyShareBtn.setBounds(10, 435, 100, 25);
        this.portfolioLst.setBounds(395, 110, 160, 455);
        this.historyTA.setBounds(565, 110, 275, 455);
        this.sellBtn.setBounds(120, 435, 100, 25);
        this.depositTf.setBounds(10, 505, 100, 25);
        this.balanceLbl.setBounds(10, 540, 320, 25);
        this.withdrawBtn.setBounds(230, 505, 100, 25);
        this.depositBtn.setBounds(120, 505, 100, 25);
        this.amountTf.setBounds(120, 400, 100, 25);
        this.balInstrucLbl.setBounds(10, 480, 160, 25);
        this.shareTf.setBounds(10, 400, 100, 25);
        this.buyLbl.setBounds(10, 375, 100, 25);
        this.sellLbl.setBounds(120, 375, 100, 25);
        this.portfolioLbl.setBounds(565, 10, 160, 25);
        this.selectedLbl.setBounds(565, 40, 160, 25);
        this.schemaLbl.setBounds(565, 85, 145, 25);
        this.currPriceLbl.setBounds(565, 60, 165, 25);
        this.portshareLbl.setBounds(395, 85, 100, 25);
        this.accountsMenu.setBounds(65, 10, 155, 25);
        this.accountLbl.setBounds(10, 10, 55, 25);
        this.accTypeLbl.setBounds(10, 35, 155, 25);
        this.createAccLbl.setBounds(10, 75, 100, 25);
        this.userNameTf.setBounds(120, 75, 100, 25);
        this.importLbl.setBounds(10, 180, 125, 25);
        this.pathTf.setBounds(10, 200, 210, 25);
        this.saveBtn.setBounds(10, 235, 100, 25);
        this.importBtn.setBounds(120, 235, 100, 25);
        this.instrucImportLbl.setBounds(10, 155, 240, 25);
        this.createUserBtn.setBounds(10, 105, 100, 25);
        this.createFundBtn.setBounds(120, 105, 100, 25);
        this.deleteBtn.setBounds(230, 10, 100, 25);
        apiTgl.setBounds(740, 80, 100, 25);
    }

}
