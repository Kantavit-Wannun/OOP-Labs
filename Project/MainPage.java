import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPage extends JFrame implements ActionListener {

    private JButton diaryServiceButton;
    private JButton diarySummaryButton;
    private JButton searchRecordButton;
    private JButton exitButton;

    public MainPage() {
        setTitle("Barber Management System");
        setSize(500, 700);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel bg = new JPanel();
        bg.setBackground(new Color(101, 146, 135));
        bg.setLayout(null);
        setContentPane(bg);

        JPanel card = new JPanel();
        card.setBounds(40, 40, 420, 580);
        card.setBackground(new Color(230, 242, 221));
        card.setLayout(null);
        card.setBorder(BorderFactory.createLineBorder(new Color(136, 189, 164), 10));

        JLabel iconLabel = new JLabel("💈", SwingConstants.CENTER);
        iconLabel.setForeground(new Color(101, 146, 135));
        iconLabel.setBounds(0, 20, 420, 40);
        iconLabel.setFont(new Font("Aptos", Font.PLAIN, 36));

        JLabel titleLabel = new JLabel("B A R B E R  S H O P", SwingConstants.CENTER);
        titleLabel.setBounds(0, 75, 420, 35);
        titleLabel.setFont(new Font("Corbel", Font.BOLD, 28));
        titleLabel.setForeground(new Color(101, 146, 135));

        JLabel subTitleLabel = new JLabel("Management System", SwingConstants.CENTER);
        subTitleLabel.setBounds(0, 110, 420, 25);
        subTitleLabel.setFont(new Font("Corbel", Font.BOLD, 18));
        subTitleLabel.setForeground(new Color(136, 189, 164));

        diaryServiceButton = new JButton("➕  Add Diary Service");
        diaryServiceButton.setBounds(60, 180, 300, 50);
        diaryServiceButton.setFont(new Font("Aptos", Font.BOLD, 15));
        diaryServiceButton.setBackground(new Color(101, 146, 135));
        diaryServiceButton.setForeground(new Color(230, 242, 221));
        diaryServiceButton.addActionListener(this);

        diarySummaryButton = new JButton("📊  Daily Summary");
        diarySummaryButton.setBounds(60, 250, 300, 50);
        diarySummaryButton.setFont(new Font("Aptos", Font.BOLD, 15));
        diarySummaryButton.setBackground(new Color(101, 146, 135));
        diarySummaryButton.setForeground(new Color(230, 242, 221));
        diarySummaryButton.addActionListener(this);

        searchRecordButton = new JButton("🔍  Search Records");
        searchRecordButton.setBounds(60, 320, 300, 50);
        searchRecordButton.setFont(new Font("Aptos", Font.BOLD, 15));
        searchRecordButton.setBackground(new Color(101, 146, 135));
        searchRecordButton.setForeground(new Color(230, 242, 221));
        searchRecordButton.addActionListener(this);

        exitButton = new JButton("🚪  Exit ");
        exitButton.setBounds(110, 450, 200, 45);
        exitButton.setFont(new Font("Aptos", Font.BOLD, 14));
        exitButton.setBackground(new Color(220, 110, 110));
        exitButton.setForeground(new Color(230, 242, 221));
        exitButton.addActionListener(this);

        card.add(iconLabel);
        card.add(titleLabel);
        card.add(subTitleLabel);
        
        card.add(diaryServiceButton);
        card.add(diarySummaryButton);
        card.add(searchRecordButton);
        card.add(exitButton);

        bg.add(card);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        if (actionCommand.equals("➕  Add Diary Service")) {
            new DiaryService();
            dispose();
        } else if (actionCommand.equals("📊  Daily Summary")) {
            new DiarySummary();
            dispose();
        } else if (actionCommand.equals("🔍  Search Records")) {
            new SearchRecord();
            dispose();
        } else if (actionCommand.equals("🚪  Exit ")) {
            int chosenOption = JOptionPane.showConfirmDialog(this,"Do you want to exit the program?","Exit",JOptionPane.OK_CANCEL_OPTION);
            
            if (chosenOption == JOptionPane.OK_OPTION) {
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        new MainPage();
    }
}