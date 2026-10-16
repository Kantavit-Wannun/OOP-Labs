import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DiaryService extends JFrame implements ActionListener {

    private JComboBox<String> day, month, year;
    private String[] days = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", 
                             "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", 
                             "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    private String[] months = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
    private String[] years = {"2026", "2027", "2028", "2029", "2030", "2031"};

    private JComboBox<String> barberComboBox;
    private String[] barbers = {"Barber 1", "Barber 2", "Barber 3"};

    private JComboBox<String> serviceComboBox;
    private String[] services = {"Haircut", "Shaving", "Hair Coloring"};

    private JComboBox<String> haircutTypeComboBox;
    private String[] customerTypes = {"Child", "Student", "Teenager", "Adult"};

    private JTextField quantityText;
    private JTextField priceText;

    private JButton addServiceButton;
    private JButton clearButton;
    private JButton backToMainPageButton;

    private JTextArea serviceLogText;

    public DiaryService() {
        super("Barber Shop Management System - Add Service");
        setSize(500, 720);
        setResizable(false);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel bg = new JPanel();
        bg.setBackground(new Color(101, 146, 135));
        bg.setLayout(null);
        setContentPane(bg);

        JPanel card = new JPanel();
        card.setBounds(30, 25, 440, 630);
        card.setBackground(new Color(230, 242, 221));
        card.setLayout(null);
        card.setBorder(BorderFactory.createLineBorder(new Color(136, 189, 164), 10));

        JLabel titleLabel = new JLabel("Add Daily Service", SwingConstants.CENTER);
        titleLabel.setBounds(0, 20, 440, 30);
        titleLabel.setFont(new Font("Corbel", Font.BOLD, 28));
        titleLabel.setForeground(new Color(101, 146, 135));

        JSeparator titleLine = new JSeparator();
        titleLine.setBackground(new Color(101, 146, 135));
        titleLine.setForeground(new Color(101, 146, 135));
        titleLine.setBounds(100, 50, 240, 2);

        JLabel dateLabel = new JLabel("Date");
        dateLabel.setBounds(40, 70, 100, 20);
        dateLabel.setFont(new Font("Aptos", Font.BOLD, 13));
        dateLabel.setForeground(new Color(101, 146, 135));

        day = new JComboBox<>(days);
        day.setBounds(40, 92, 100, 30);
        month = new JComboBox<>(months);
        month.setBounds(150, 92, 110, 30);
        year = new JComboBox<>(years);
        year.setBounds(270, 92, 130, 30);

        JLabel barberLabel = new JLabel("Barber");
        barberLabel.setBounds(40, 125, 360, 20);
        barberLabel.setFont(new Font("Aptos", Font.BOLD, 13));
        barberLabel.setForeground(new Color(101, 146, 135));

        barberComboBox = new JComboBox<>(barbers);
        barberComboBox.setBounds(40, 147, 360, 30);

        JLabel serviceLabel = new JLabel("Service Category");
        serviceLabel.setBounds(40, 180, 360, 20);
        serviceLabel.setFont(new Font("Aptos", Font.BOLD, 13));
        serviceLabel.setForeground(new Color(101, 146, 135));

        serviceComboBox = new JComboBox<>(services);
        serviceComboBox.setBounds(40, 202, 360, 30);

        JLabel haircutTypeLabel = new JLabel("Customer Type / Details");
        haircutTypeLabel.setBounds(40, 235, 360, 20);
        haircutTypeLabel.setFont(new Font("Aptos", Font.BOLD, 13));
        haircutTypeLabel.setForeground(new Color(101, 146, 135));

        haircutTypeComboBox = new JComboBox<>(customerTypes);
        haircutTypeComboBox.setBounds(40, 257, 360, 30);

        serviceComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String selected = (String) serviceComboBox.getSelectedItem();
                if (selected.equals("Haircut")) {
                    haircutTypeComboBox.setEnabled(true);
                } else {
                    haircutTypeComboBox.setEnabled(false);
                }
            }
        });

        JLabel quantityLabel = new JLabel("Quantity");
        quantityLabel.setBounds(40, 290, 160, 20);
        quantityLabel.setFont(new Font("Aptos", Font.BOLD, 13));
        quantityLabel.setForeground(new Color(101, 146, 135));

        quantityText = new JTextField("1");
        quantityText.setBounds(40, 312, 160, 30);

        JLabel priceLabel = new JLabel("Price per Unit (฿)");
        priceLabel.setBounds(220, 290, 180, 20);
        priceLabel.setFont(new Font("Aptos", Font.BOLD, 13));
        priceLabel.setForeground(new Color(101, 146, 135));

        priceText = new JTextField("80");
        priceText.setBounds(220, 312, 180, 30);

        addServiceButton = new JButton("➕  Add Service");
        addServiceButton.setBounds(40, 360, 220, 40);
        addServiceButton.setFont(new Font("Aptos", Font.BOLD, 14));
        addServiceButton.setBackground(new Color(101, 146, 135));
        addServiceButton.setForeground(new Color(230, 242, 221));
        addServiceButton.addActionListener(this);

        clearButton = new JButton("➖  Clear");
        clearButton.setBounds(270, 360, 130, 40);
        clearButton.setFont(new Font("Aptos", Font.BOLD, 14));
        clearButton.setBackground(new Color(136, 189, 164));
        clearButton.setForeground(new Color(230, 242, 221));
        clearButton.addActionListener(this);

        JLabel logTitleLabel = new JLabel("Current Session Logs");
        logTitleLabel.setBounds(40, 405, 360, 20);
        logTitleLabel.setFont(new Font("Aptos", Font.BOLD, 13));
        logTitleLabel.setForeground(new Color(101, 146, 135));

        serviceLogText = new JTextArea();
        serviceLogText.setEditable(false);
        serviceLogText.setFont(new Font("Monospaced", Font.PLAIN, 12));
        display();

        JScrollPane scrollPane = new JScrollPane(serviceLogText);
        scrollPane.setBounds(40, 428, 360, 130);
        scrollPane.setBorder(BorderFactory.createLineBorder(new Color(220, 225, 230)));

        backToMainPageButton = new JButton("⬅️  Back to Main Page");
        backToMainPageButton.setBounds(110, 575, 220, 38);
        backToMainPageButton.setFont(new Font("Aptos", Font.BOLD, 14));
        backToMainPageButton.setBackground(new Color(220, 110, 110));
        backToMainPageButton.setForeground(new Color(230, 242, 221));
        backToMainPageButton.addActionListener(this);

        card.add(titleLabel);
        card.add(titleLine);
        card.add(dateLabel);
        card.add(day);
        card.add(month);
        card.add(year);

        card.add(barberLabel);
        card.add(barberComboBox);

        card.add(serviceLabel);
        card.add(serviceComboBox);

        card.add(haircutTypeLabel);
        card.add(haircutTypeComboBox);

        card.add(quantityLabel);
        card.add(quantityText);

        card.add(priceLabel);
        card.add(priceText);

        card.add(addServiceButton);
        card.add(clearButton);
        card.add(logTitleLabel);
        card.add(scrollPane);
        card.add(backToMainPageButton);

        bg.add(card);

        setVisible(true);
    }
    
    public boolean dateCheck(String Day,String Month,String Year){
        int day = Integer.parseInt(Day);
        int month = Integer.parseInt(Month);
        int year = Integer.parseInt(Year);

        int maxDays = 31;

        if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                maxDays = 29;
            } else {
                maxDays = 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDays = 30;
        }
        return day <= maxDays;
    }

    private void display() {
        if (Database.serviceList.isEmpty()) {
            serviceLogText.setText("   No records added yet.\n");
        } else {
            serviceLogText.setText("");
            for (ServiceRecord record : Database.serviceList) {
                if (record instanceof Service) {
                    Service s = (Service) record;
                    String output = "[" +s.getDate()+ "] " +s.getBarber()+ " | " +s.getDescription()+ " x" +s.getQuantity()+ " = " +s.calculateTotal()+ " ฿\n";
                    serviceLogText.append(output);
                }
            }
        }
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        if (actionCommand.equals("➕  Add Service")) {
            try {
                String date = day.getSelectedItem() + "/" + month.getSelectedItem() + "/" + year.getSelectedItem();
                String selectedDay = (String) day.getSelectedItem();
                String selectedMonth = (String) month.getSelectedItem();
                String selectedYear = (String) year.getSelectedItem();

                String barber = (String) barberComboBox.getSelectedItem();
                String serviceCategory = (String) serviceComboBox.getSelectedItem();
                String haircutType = (String) haircutTypeComboBox.getSelectedItem();
                int quantity = Integer.parseInt(quantityText.getText());
                double price = Double.parseDouble(priceText.getText());

                if (!dateCheck(selectedDay, selectedMonth, selectedYear)) {
                    JOptionPane.showMessageDialog(this, "Invalid date for the selected month.", "Date Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                Service newRecord;
                if (serviceCategory.equals("Haircut")) {
                    newRecord = new HaircutService(date, barber, quantity, price, haircutType);
                } else {
                    newRecord = new OtherService(date, barber, quantity, price, serviceCategory);
                }

                Database.serviceList.add(newRecord);
                display();

                JOptionPane.showMessageDialog(this, "Record saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid numeric values for Quantity and Price.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }

        } else if (actionCommand.equals("➖  Clear")) {
            barberComboBox.setSelectedIndex(0);
            serviceComboBox.setSelectedIndex(0);
            haircutTypeComboBox.setSelectedIndex(0);
            quantityText.setText("1");
            priceText.setText("80");

        } else if (actionCommand.equals("⬅️  Back to Main Page")) {
            new MainPage();
            dispose();
        }
    }

    public static void main(String[] args) {
        new DiaryService();
    }
}