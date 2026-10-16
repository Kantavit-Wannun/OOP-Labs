import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;

public class SearchRecord extends JFrame implements ActionListener {

    private JComboBox<String> searchByComboBox;
    private String[] searchOptions = {"Date", "Barber", "Service"};

    private JPanel dateInput;
    private JComboBox<String> day, month, year;
    private String[] days = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", 
                             "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", 
                             "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    private String[] months = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
    private String[] years = {"2026", "2027", "2028", "2029", "2030", "2031"};

    private JPanel barberInput;
    private JComboBox<String> barberComboBox;
    private String[] barbers = {"Barber 1", "Barber 2", "Barber 3"};

    private JPanel serviceInput;
    private JComboBox<String> serviceComboBox;
    private String[] services = {"Haircut", "Other Service"};

    private JButton searchButton;
    private JButton backToMainPageButton;

    private JTextArea searchResult;

    public SearchRecord() {
        super("Barber Shop Management System - Search Record");
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

        JLabel titleLabel = new JLabel("Search Record", SwingConstants.CENTER);
        titleLabel.setBounds(0, 20, 440, 30);
        titleLabel.setFont(new Font("Corbel", Font.BOLD, 22));
        titleLabel.setForeground(new Color(101, 146, 135));

        JSeparator titleLine = new JSeparator();
        titleLine.setBackground(new Color(101, 146, 135));
        titleLine.setForeground(new Color(101, 146, 135));
        titleLine.setBounds(100, 50, 240, 2);

        JLabel searchByLabel = new JLabel("Search By");
        searchByLabel.setBounds(40, 68, 120, 20);
        searchByLabel.setFont(new Font("Aptos", Font.BOLD, 13));
        searchByLabel.setForeground(new Color(101, 146, 135));

        searchByComboBox = new JComboBox<>(searchOptions);
        searchByComboBox.setBounds(40, 90, 120, 30);

        dateInput = new JPanel(null);
        dateInput.setBounds(170, 68, 230, 55);
        dateInput.setOpaque(false);

        JLabel valueDate = new JLabel("Search Value (Date)");
        valueDate.setBounds(0, 0, 230, 20);
        valueDate.setFont(new Font("Aptos", Font.BOLD, 13));
        valueDate.setForeground(new Color(101, 146, 135));

        day = new JComboBox<>(days);
        day.setBounds(0, 22, 65, 30);
        month = new JComboBox<>(months);
        month.setBounds(72, 22, 65, 30);
        year = new JComboBox<>(years);
        year.setBounds(144, 22, 80, 30);

        dateInput.add(valueDate);
        dateInput.add(day);
        dateInput.add(month);
        dateInput.add(year);

        barberInput = new JPanel(null);
        barberInput.setBounds(170, 68, 230, 55);
        barberInput.setOpaque(false);
        barberInput.setVisible(false);

        JLabel valueBarber = new JLabel("Search Value (Barber)");
        valueBarber.setBounds(0, 0, 230, 20);
        valueBarber.setFont(new Font("Aptos", Font.BOLD, 13));
        valueBarber.setForeground(new Color(101, 146, 135));

        barberComboBox = new JComboBox<>(barbers);
        barberComboBox.setBounds(0, 22, 224, 30);

        barberInput.add(valueBarber);
        barberInput.add(barberComboBox);

        serviceInput = new JPanel(null);
        serviceInput.setBounds(170, 68, 230, 55);
        serviceInput.setOpaque(false);
        serviceInput.setVisible(false);

        JLabel valueService = new JLabel("Search Value (Service)");
        valueService.setBounds(0, 0, 230, 20);
        valueService.setFont(new Font("Aptos", Font.BOLD, 13));
        valueService.setForeground(new Color(101, 146, 135));

        serviceComboBox = new JComboBox<>(services);
        serviceComboBox.setBounds(0, 22, 224, 30);

        serviceInput.add(valueService);
        serviceInput.add(serviceComboBox);

        searchByComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = (String) searchByComboBox.getSelectedItem();
                if (selected.equals("Date")) {
                    dateInput.setVisible(true); 
                    barberInput.setVisible(false);
                    serviceInput.setVisible(false);

                } else if (selected.equals("Barber")) {
                    dateInput.setVisible(false);
                    barberInput.setVisible(true);
                    serviceInput.setVisible(false);

                } else if (selected.equals("Service")) {
                    dateInput.setVisible(false);
                    barberInput.setVisible(false);
                    serviceInput.setVisible(true);
                }
            }
        });

        searchButton = new JButton("🔍  Search");
        searchButton.setBounds(150, 133, 140, 36);
        searchButton.setFont(new Font("Aptos", Font.BOLD, 14));
        searchButton.setBackground(new Color(101, 146, 135));
        searchButton.setForeground(new Color(230, 242, 221));
        searchButton.addActionListener(this);

        JPanel resultBox = new JPanel();
        resultBox.setBounds(35, 180, 370, 375);
        resultBox.setBackground(new Color(250, 252, 255));
        resultBox.setBorder(BorderFactory.createLineBorder(new Color(215, 225, 235), 1));
        resultBox.setLayout(null);

        JLabel resultTitle = new JLabel("Search Result", SwingConstants.CENTER);
        resultTitle.setBounds(0, 12, 370, 20);
        resultTitle.setFont(new Font("Aptos", Font.BOLD, 15));
        resultTitle.setForeground(new Color(24, 43, 73));

        JSeparator resultLine = new JSeparator();
        resultLine.setBounds(15, 38, 340, 2);
        resultLine.setForeground(new Color(100, 50, 240, 2));

        searchResult = new JTextArea();
        searchResult.setEditable(false);
        searchResult.setBackground(new Color(250, 252, 255));
        searchResult.setFont(new Font("Monospaced", Font.PLAIN, 11));
        searchResult.setMargin(new Insets(8, 8, 8, 8));
        searchResult.setText("   Select criteria and click Search to view records.");

        JScrollPane scrollPane = new JScrollPane(searchResult);
        scrollPane.setBounds(10, 45, 350, 318);
        scrollPane.setBorder(null);

        resultBox.add(resultTitle);
        resultBox.add(resultLine);
        resultBox.add(scrollPane);

        backToMainPageButton = new JButton("⬅️  Back to Main Page");
        backToMainPageButton.setBounds(110, 575, 220, 38);
        backToMainPageButton.setFont(new Font("Aptos", Font.BOLD, 14));
        backToMainPageButton.setBackground(new Color(220, 110, 110));
        backToMainPageButton.setForeground(new Color(230, 242, 221));
        backToMainPageButton.addActionListener(this);

        card.add(titleLabel);
        card.add(titleLine);
        card.add(searchByLabel);
        card.add(searchByComboBox);

        card.add(dateInput);
        card.add(barberInput);
        card.add(serviceInput);

        card.add(searchButton);
        card.add(resultBox);
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

    private List<ServiceRecord> searchByDate(String targetDate) {
        List<ServiceRecord> results = new ArrayList<>();
        for (ServiceRecord record : Database.serviceList) {
            if (record.getDate().equals(targetDate)) {
                results.add(record);
            }
        }
        return results;
    }

    private List<ServiceRecord> searchByBarber(String targetBarber) {
        List<ServiceRecord> results = new ArrayList<>();
        for (ServiceRecord record : Database.serviceList) {
            if (record.getBarber().equals(targetBarber)) {
                results.add(record);
            }
        }
        return results;
    }

    private List<ServiceRecord> searchByService(String targetService) {
        List<ServiceRecord> results = new ArrayList<>();
        for (ServiceRecord record : Database.serviceList) {
            if (targetService.equals("Haircut")) {
                if (record instanceof HaircutService) {
                    results.add(record);
                }
            } else if (targetService.equals("Other Service")) {
                if (record instanceof OtherService) {
                    results.add(record);
                }
            }
        }
        return results;
    }

    private void performSearch() {
        String searchType = (String) searchByComboBox.getSelectedItem();
        List<ServiceRecord> matchedList = new ArrayList<>();

        if (searchType.equals("Date")) {
            String targetDate = day.getSelectedItem()+ "/" +month.getSelectedItem()+ "/" +year.getSelectedItem();
            matchedList = searchByDate(targetDate);
        } else if (searchType.equals("Barber")) {
            String targetBarber = (String) barberComboBox.getSelectedItem();
            matchedList = searchByBarber(targetBarber);
        } else if (searchType.equals("Service")) {
            String targetService = (String) serviceComboBox.getSelectedItem();
            matchedList = searchByService(targetService);
        }

        if (matchedList.isEmpty()) {
            searchResult.setText("   No matching records found.");
            return;
        }
        
        String resultText = "Date | Barber | Service | Quantity | Total\n";
        resultText = resultText + "---------------------------------------------------\n";

        for (ServiceRecord record : matchedList) {
            if (record instanceof Service) {
                Service s = (Service) record;
                
                resultText = resultText +s.getDate()+ " | " +s.getBarber()+ " | " +s.getDescription()+ " | " +s.getQuantity()+ " | " +s.calculateTotal()+ " ฿\n";
            }
        }

        resultText = resultText + "---------------------------------------------------\n";
        resultText = resultText + "Total Records Found: " +matchedList.size()+ "\n";

        searchResult.setText(resultText);
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
        } else if (actionCommand.equals("🔍  Search")) {
            performSearch();
        } else if (actionCommand.equals("⬅️  Back to Main Page")) {
            new MainPage();
            dispose();
        }
    }

    public static void main(String[] args) {
        new SearchRecord();
    }
}