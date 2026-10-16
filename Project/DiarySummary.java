import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DiarySummary extends JFrame implements ActionListener {

    private JComboBox<String> day, month, year;
    private String[] days = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", 
                             "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", 
                             "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    private String[] months = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
    private String[] years = {"2026", "2027", "2028", "2029", "2030", "2031"};

    private JLabel totalCustomerLabel;
    private JLabel totalIncomeLabel;
    
    private JButton backToMainPageButton;

    private JTextArea summaryDetailText;

    public DiarySummary() {
        super("Barber Shop Management System - Daily Summary");
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

        JLabel titleLabel = new JLabel("Daily Summary", SwingConstants.CENTER);
        titleLabel.setBounds(0, 20, 440, 30);
        titleLabel.setFont(new Font("Corbel", Font.BOLD, 28));
        titleLabel.setForeground(new Color(101, 146, 135));

        JSeparator titleLine = new JSeparator();
        titleLine.setBackground(new Color(101, 146, 135));
        titleLine.setForeground(new Color(101, 146, 135));
        titleLine.setBounds(100, 50, 240, 2);

        JLabel selectDateLabel = new JLabel("Select Date", SwingConstants.CENTER);
        selectDateLabel.setBounds(0, 68, 440, 20);
        selectDateLabel.setFont(new Font("Aptos", Font.BOLD, 13));
        selectDateLabel.setForeground(new Color(136, 189, 164));

        day = new JComboBox<>(days);
        day.setBounds(85, 92, 80, 30);
        month = new JComboBox<>(months);
        month.setBounds(175, 92, 80, 30);
        year = new JComboBox<>(years);
        year.setBounds(265, 92, 90, 30);

        ActionListener dateChangeListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displaySummary();
            }
        };
        
        day.addActionListener(dateChangeListener);
        month.addActionListener(dateChangeListener);
        year.addActionListener(dateChangeListener);

        JPanel summaryBox = new JPanel();
        summaryBox.setBounds(40, 138, 360, 420);
        summaryBox.setBackground(new Color(250, 252, 255));
        summaryBox.setBorder(BorderFactory.createLineBorder(new Color(215, 225, 235), 1));
        summaryBox.setLayout(null);

        JLabel customerLabel = new JLabel("Total Customers:");
        customerLabel.setBounds(25, 20, 150, 25);
        customerLabel.setFont(new Font("Aptos", Font.BOLD, 14));

        totalCustomerLabel = new JLabel("0", SwingConstants.RIGHT);
        totalCustomerLabel.setBounds(200, 20, 135, 25);
        totalCustomerLabel.setFont(new Font("Aptos", Font.BOLD, 16));
        totalCustomerLabel.setForeground(new Color(41, 158, 185));

        JLabel incomeLabel = new JLabel("Total Income:");
        incomeLabel.setBounds(25, 50, 150, 25);
        incomeLabel.setFont(new Font("Aptos", Font.BOLD, 14));

        totalIncomeLabel = new JLabel("0.00฿", SwingConstants.RIGHT);
        totalIncomeLabel.setBounds(200, 50, 135, 25);
        totalIncomeLabel.setFont(new Font("Aptos", Font.BOLD, 16));
        totalIncomeLabel.setForeground(new Color(101, 146, 135));

        JSeparator line = new JSeparator();
        line.setForeground(new Color(101, 146, 135));
        line.setBounds(20, 88, 320, 2);

        summaryDetailText = new JTextArea();
        summaryDetailText.setEditable(false);
        summaryDetailText.setBackground(new Color(250, 252, 255));
        summaryDetailText.setFont(new Font("Monospaced", Font.PLAIN, 12));
        summaryDetailText.setMargin(new Insets(10, 10, 10, 10));

        JScrollPane scrollPane = new JScrollPane(summaryDetailText);
        scrollPane.setBounds(15, 98, 330, 305);
        scrollPane.setBorder(null);

        summaryBox.add(customerLabel);
        summaryBox.add(totalCustomerLabel);
        summaryBox.add(incomeLabel);
        summaryBox.add(totalIncomeLabel);
        summaryBox.add(line);
        summaryBox.add(scrollPane);

        backToMainPageButton = new JButton("⬅️  Back to Main Page");
        backToMainPageButton.setBounds(110, 575, 220, 38);
        backToMainPageButton.setFont(new Font("Aptos", Font.BOLD, 14));
        backToMainPageButton.setBackground(new Color(220, 110, 110));
        backToMainPageButton.setForeground(new Color(230, 242, 221));
        backToMainPageButton.addActionListener(this);

        card.add(titleLabel);
        card.add(titleLine);
        card.add(selectDateLabel);
        card.add(day);
        card.add(month);
        card.add(year);
        card.add(summaryBox);
        card.add(backToMainPageButton);

        bg.add(card);

        displaySummary();
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

    private void displaySummary() {
        String selectedDate = day.getSelectedItem()+ "/" +month.getSelectedItem()+ "/" +year.getSelectedItem();

        int totalCustomers = 0;
        double totalIncome = 0;

        int barber1Customers = 0;
        int barber2Customers = 0;
        int barber3Customers = 0;

        for (ServiceRecord record : Database.serviceList) {
            if (record.getDate().equals(selectedDate)) {
                if (record instanceof Service) {
                    Service s = (Service) record;

                    totalCustomers = totalCustomers + s.getQuantity();
                    totalIncome = totalIncome + s.calculateTotal();

                    if (s.getBarber().equals("Barber 1")) {
                        barber1Customers = barber1Customers + s.getQuantity();
                    } else if (s.getBarber().equals("Barber 2")) {
                        barber2Customers = barber2Customers + s.getQuantity();
                    } else if (s.getBarber().equals("Barber 3")) {
                        barber3Customers = barber3Customers + s.getQuantity();
                    }
                }
            }
        }

        totalCustomerLabel.setText(String.valueOf(totalCustomers));
        totalIncomeLabel.setText(totalIncome + " ฿");

        if (totalCustomers == 0) {
            summaryDetailText.setText("   No service records found for " +selectedDate+ "\n");
        } else {
            String result = "";
            result = result + "Performance by Barber:\n";
            result = result + "-----------------------------------\n";
            result = result + "Barber 1          : " +barber1Customers+ " customer(s)\n";
            result = result + "Barber 2          : " +barber2Customers+ " customer(s)\n";
            result = result + "Barber 3          : " +barber3Customers+ " customer(s)\n";

            summaryDetailText.setText(result);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        String selectedDay = (String) day.getSelectedItem();
        String selectedMonth = (String) month.getSelectedItem();
        String selectedYear = (String) year.getSelectedItem();

        if (!dateCheck(selectedDay, selectedMonth, selectedYear)) {
            JOptionPane.showMessageDialog(this, "Invalid date for the selected month.", "Date Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (actionCommand.equals("⬅️  Back to Main Page")) {
            new MainPage();
            dispose();
        }
    }

    public static void main(String[] args) {
        new DiarySummary();
    }
}