import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame {

    JFrame frame;
    JPanel passiveFields;
    JPanel activeFields;
    JPanel background;
    //JPanel south;
    //JPanel center = new JPanel();
    public static void main(String[] args) {
        Frame gui = new Frame();
        gui.buildGUI();
    }

    public void buildGUI() {

        frame = new JFrame("Расчет маржинальной прибыли");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        background = new JPanel();
        background.setLayout(new BorderLayout());
        frame.getContentPane().add(BorderLayout.CENTER, background);

        JButton jb = new JButton("465");
        background.add(jb);
        background.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Конфигурация левой активной зоны
        activeFields = new JPanel();
        activeFields.setBackground(Color.orange);
        activeFields.setLayout(new BoxLayout(activeFields, BoxLayout.Y_AXIS));
        activeFields.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JTextField nameSale = new JTextField("Наименование товара");
        nameSale.addActionListener(new WriteNameSaleListener());
        activeFields.add(nameSale);

        JTextField number = new JTextField("Количество");
        number.addActionListener(new NumberListener());
        activeFields.add(number);

        JTextField costOfVAT = new JTextField("Себестоимость с НДС");
        costOfVAT.addActionListener(new CostOfVATListener());
        activeFields.add(costOfVAT);

        JTextField costWithoutVAT = new JTextField("Себестоимость без НДС");
        costWithoutVAT.addActionListener(new CostWithoutVATListener());
        activeFields.add(costWithoutVAT);

        JTextField costSaleOfVAT = new JTextField("Стоимость продажи с НДС");
        costSaleOfVAT.addActionListener(new CostSaleOfVATListener());
        activeFields.add(costSaleOfVAT);

        JTextField netMargin = new JTextField("Чистая маржа");
        netMargin.addActionListener(new NetMargListener());
        activeFields.add(netMargin);

        JTextField delivery = new JTextField("Доставка");
        delivery.addActionListener(new DeliveryListener());
        activeFields.add(delivery);

        JTextField installation = new JTextField("Сборка");
        installation.addActionListener(new InstallationListener());
        activeFields.add(installation);

        JTextField addExpenses = new JTextField("Дополнительные расходы");
        addExpenses.addActionListener(new AddExpensesListener());
        activeFields.add(addExpenses);

        JTextField delay = new JTextField("Отрочка");
        delay.addActionListener(new DelayListener());
        activeFields.add(delay);

        frame.getContentPane().add(BorderLayout.WEST, activeFields);

        // Конфигурация правой неактивной зоны
        passiveFields = new JPanel();
        passiveFields.setBackground(Color.cyan);
        passiveFields.setLayout(new BoxLayout(passiveFields, BoxLayout.Y_AXIS));
        passiveFields.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        String costSaleWVAT = "Стоимость продажи без НДС";
        JLabel costSaleWithoutVAT = new JLabel(costSaleWVAT);
        passiveFields.add(costSaleWithoutVAT);

        String grossProfitWVAT = "Вал без НДС";
        JLabel grossProfitWithoutVAT = new JLabel(grossProfitWVAT);
        passiveFields.add(grossProfitWithoutVAT);

        String interestR = "Процентная ставка";
        JLabel interestRate = new JLabel(interestR);
        passiveFields.add(interestRate);

        String netMarginWVAT = "Маржинальный доход без НДС";
        JLabel netMarginWithoutVAT = new JLabel(netMarginWVAT);
        passiveFields.add(netMarginWithoutVAT);

        String variableC = "Переменные затраты";
        JLabel variableCosts = new JLabel(variableC);
        passiveFields.add(variableCosts);

        String bonus = "Премия менеджеру";
        JLabel bonusManager = new JLabel(bonus);
        passiveFields.add(bonusManager);

        String profitabilityWVAT = "Рентабельность без НДС";
        JLabel profitabilityWithoutVAT = new JLabel(profitabilityWVAT);
        passiveFields.add(profitabilityWithoutVAT);

        String markup = " ";
        JLabel markupP = new JLabel(markup);
        passiveFields.add(markupP);

        frame.getContentPane().add(BorderLayout.EAST, passiveFields);

        JButton buttonToCalculate = new JButton("Рассчитать");
        buttonToCalculate.addActionListener(new ButtonToCalculate());
        passiveFields.add(buttonToCalculate);

        frame.setSize(800, 400);
        frame.setVisible(true);
        frame.pack();

    }

    public class WriteNameSaleListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            System.out.println("WriteNameSaleListener");
        }
    }

    public class NumberListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            System.out.println("NumberListener");
        }
    }

    public class CostOfVATListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            System.out.println("CostOfVATListener");
        }
    }

    public class CostWithoutVATListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            System.out.println("CostWithoutVATListener");
        }
    }

    public class CostSaleOfVATListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            System.out.println("CostSaleOfVATListener");
        }
    }

    public class NetMargListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            System.out.println("NetMargListener");
        }
    }

    public class DeliveryListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            System.out.println("DeliveryListener");
        }
    }

    public class InstallationListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            System.out.println("InstallationListener");
        }
    }

    public class AddExpensesListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            System.out.println("AddExpensesListener");
        }
    }

    public class DelayListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            System.out.println("DelayListener");
        }
    }

    public class ButtonToCalculate implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            System.out.println();
        }
    }


}
