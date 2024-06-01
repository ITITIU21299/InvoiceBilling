package invoicebilling;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerGUI extends JFrame {
    private JTable table;
    private JTextField idField, nameField, emailField, phoneField;
    private JButton addButton;

    public CustomerGUI() {
        setTitle("Buyers Details");
        setSize(720, 720);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());
        initializeUI();
        display();
    }

    private void initializeUI() {
        JPanel inputPanel = new JPanel(new GridLayout(1, 5, 10, 10));
        idField = new JTextField();
        nameField = new JTextField();
        emailField = new JTextField();
        phoneField = new JTextField();

        inputPanel.add(idField);
        inputPanel.add(nameField);
        inputPanel.add(emailField);
        inputPanel.add(phoneField);

        addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addCustomer();
            }
        });
        inputPanel.add(addButton);

        add(inputPanel, BorderLayout.NORTH);

        JLabel headerLabel = new JLabel("Customer Information");
        headerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(headerLabel, BorderLayout.NORTH);

        String[] columnNames = {"Customer ID", "Name", "Email", "Phone Number"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        table = new JTable(model);
        styleTable();
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
         table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
    }

    private void addCustomer() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        String id = idField.getText();
        String name = nameField.getText();
        String email = emailField.getText();
        String phone = phoneField.getText();
        model.addRow(new Object[]{id, name, email, phone});
        idField.setText("");
        nameField.setText("");
        emailField.setText("");
        phoneField.setText("");
    }

    private void styleTable() {
        table.setFont(new Font("Arial", Font.PLAIN, 14));
        table.setRowHeight(25);
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 16));
        table.getTableHeader().setReorderingAllowed(false);
        table.getTableHeader().setBackground(new Color(255, 204, 153));
        table.getTableHeader().setForeground(Color.BLACK);
        table.setGridColor(new Color(233, 233, 233));
        table.setShowVerticalLines(false);
    }
    
    public void display(){
        DefaultTableModel tblModel = (DefaultTableModel) table.getModel();            
        try (java.sql.Connection connection = DriverManager.getConnection(main.jdbcUrl, main.dbUsername, main.dbPassword)) {
                String sql = "Select * from customer";     
                try (PreparedStatement statement = connection.prepareStatement(sql)) {                                        
                    try (ResultSet resultSet = statement.executeQuery()) {
                        while (resultSet.next()) {  
                            String customerID = resultSet.getString("customerID");
                            String name = resultSet.getString("Name");
                            String email = resultSet.getString("Email");
                            String phone = resultSet.getString("PhoneNumber");
                            tblModel.addRow(new Object[]{customerID, name, email, phone});
                        }                        
                    }
                }            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
         private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
         DefaultTableModel model = (DefaultTableModel) table.getModel();
         int row=  table.getSelectedRow();
         String name=(String) model.getValueAt(row,1);
         invoicesOfCustomer invoice=new invoicesOfCustomer(name);
         invoice.setVisible(true);
    }    
}
