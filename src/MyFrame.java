import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyFrame {

    private JFrame frame;
    private JPanel nameField, annotationsAFields, activeFields, annotationsPFields, passiveFields;
    private JPanel background;
    private JTextField nameSale, number, costOfVAT, costWithoutVAT, costSaleOfVAT,
            netMargin, delivery, installation, addExpenses, delay;
    private JLabel costSaleWithoutVAT, grossProfitWithoutVAT, interestRate, netMarginWithoutVAT,
            variableCosts, bonusManager, profitabilityWithoutVAT, markupP;

    public static void main(String[] args) {
        MyFrame gui = new MyFrame();
        gui.buildGUI();
    }

    public void buildGUI() {

        frame = new JFrame("Расчет маржинальной прибыли");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        background = new JPanel();
        background.setLayout(new BorderLayout());
        frame.getContentPane().add(BorderLayout.CENTER, background);

        //Конфигурация панели NORTH nameField
        nameField = new JPanel();
        nameField.setLayout(new FlowLayout());
        nameSale = new JTextField("", 15);
        nameSale.addActionListener(new WriteNameSaleListener());
        nameField.add(nameSale);
        JLabel jl0 = new JLabel("Наименование товара");
        nameField.add(jl0);
        JButton buttonToCalculate = new JButton("Рассчитать");
        buttonToCalculate.addActionListener(new ButtonToCalculate());
        nameField.add(buttonToCalculate);
        frame.getContentPane().add(BorderLayout.NORTH, nameField);

        //Конфигурация панели CENTER annotationsAFields
        annotationsAFields = new JPanel();
        annotationsAFields.setLayout(new GridLayout(9, 1));
        JLabel jl1 = new JLabel("Количество");
        annotationsAFields.add(jl1);
        JLabel jl2 = new JLabel("Себестоимость с НДС");
        annotationsAFields.add(jl2);
        JLabel jl3 = new JLabel("Себестоимость без НДС");
        annotationsAFields.add(jl3);
        JLabel jl4 = new JLabel("Стоимость продажи с НДС");
        annotationsAFields.add(jl4);
        JLabel jl5 = new JLabel("Чистая маржа");
        annotationsAFields.add(jl5);
        JLabel jl6 = new JLabel("Доставка");
        annotationsAFields.add(jl6);
        JLabel jl7 = new JLabel("Сборка");
        annotationsAFields.add(jl7);
        JLabel jl8 = new JLabel("Отрочка");
        annotationsAFields.add(jl8);
        JLabel jl9 = new JLabel("Стоимость продажи с НДС");
        annotationsAFields.add(jl9);
        frame.getContentPane().add(BorderLayout.CENTER, annotationsAFields);

        // Конфигурация панели WEST activeFields
        activeFields = new JPanel();
        //activeFields.setBackground(Color.orange);
        activeFields.setLayout(new BoxLayout(activeFields, BoxLayout.Y_AXIS));
        //activeFields.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        number = new JTextField("", 8);
        number.addActionListener(new NumberListener());
        activeFields.add(number);

        costOfVAT = new JTextField("");
        costOfVAT.addActionListener(new CostOfVATListener());
        activeFields.add(costOfVAT);

        costWithoutVAT = new JTextField("");
        costWithoutVAT.addActionListener(new CostWithoutVATListener());
        activeFields.add(costWithoutVAT);

        costSaleOfVAT = new JTextField("");
        costSaleOfVAT.addActionListener(new CostSaleOfVATListener());
        activeFields.add(costSaleOfVAT);

        netMargin = new JTextField("");
        netMargin.addActionListener(new NetMargListener());
        activeFields.add(netMargin);

        delivery = new JTextField("");
        delivery.addActionListener(new DeliveryListener());
        activeFields.add(delivery);

        installation = new JTextField("");
        installation.addActionListener(new InstallationListener());
        activeFields.add(installation);

        addExpenses = new JTextField("");
        addExpenses.addActionListener(new AddExpensesListener());
        activeFields.add(addExpenses);

        delay = new JTextField("");
        delay.addActionListener(new DelayListener());
        activeFields.add(delay);

        frame.getContentPane().add(BorderLayout.WEST, activeFields);

        // Конфигурация панели EAST annotationsPFields
        annotationsPFields = new JPanel();
        annotationsPFields.setLayout(new GridLayout(8, 1));
        costSaleWithoutVAT = new JLabel("Стоимость продажи без НДС: ");
        annotationsPFields.add(costSaleWithoutVAT);
        grossProfitWithoutVAT = new JLabel("Вал без НДС: ");
        annotationsPFields.add(grossProfitWithoutVAT);
        interestRate = new JLabel("Процентная ставка: ");
        annotationsPFields.add(interestRate);
        netMarginWithoutVAT = new JLabel("Маржинальный доход без НДС: ");
        annotationsPFields.add(netMarginWithoutVAT);
        variableCosts = new JLabel("Переменные затраты: ");
        annotationsPFields.add(variableCosts);
        bonusManager = new JLabel("Премия менеджеру: ");
        annotationsPFields.add(bonusManager);
        profitabilityWithoutVAT = new JLabel("Рентабельность без НДС: ");
        annotationsPFields.add(profitabilityWithoutVAT);
        markupP = new JLabel("Наценка: ");
        annotationsPFields.add(markupP);
        frame.getContentPane().add(BorderLayout.EAST, annotationsPFields);

        //passiveFields = new JPanel();
        //passiveFields.setBackground(Color.cyan);
        //passiveFields.setLayout(new BoxLayout(passiveFields, BoxLayout.Y_AXIS));
        //passiveFields.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        frame.setSize(1500, 400);
        frame.setVisible(true);
        frame.pack();
    }

    class WriteNameSaleListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            System.out.println(nameSale.getText());
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
            System.out.println(calculate());
        }
    }

    public double calculate() {
        double thisNumber;
        double thisCostOfVAT;
        double thisCostWithoutVAT = 0;
        double thisCostSaleOfVAT;
        double thisNetMargin;
        double thisDelivery = 0;
        double thisInstallation = 0;
        double thisAddExpenses;
        double thisDelay;

        double thisCostSaleWithoutVAT = 0;
        double thisGrossProfitWithoutVAT;
        //interestRate;
        double thisNetMarginWithoutVAT;
        double thisVariableCosts;
        double thisBonusManager;
        //profitabilityWithoutVAT;
        double thisMarkupP;

        if (installation != null) {
            if (isDouble(installation.getText())) {
                thisInstallation = Double.parseDouble(installation.getText());
            }
        }
        if (delivery != null) {
            if (isDouble(delivery.getText())) {
                thisDelivery = Double.parseDouble(delivery.getText());
            }
        }
        // Нужно дописать ячейку с суммой в отсрочку и использовать ее вместо "Продажа с НДС"
        if (delay != null) {
            if (isDouble(delay.getText())) {
                thisDelay = Double.parseDouble(delay.getText());
            }
        }
        // Расчет "Переменные затраты"
        thisVariableCosts = thisInstallation + thisDelivery;
        variableCosts.setText("Переменные затраты: " + thisVariableCosts);
        // Проверка "Себистоимость с НДС" на наличие значения,
        // если есть, то расчет "Себистоимость без НДС"
        if (costOfVAT != null) {
            if (isDouble(costOfVAT.getText())) {
                thisCostWithoutVAT = Double.parseDouble(costOfVAT.getText()) / 1.18;
                costWithoutVAT.setText(Double.toString(thisCostWithoutVAT));
            } else {
                costOfVAT.setText("Не число");
            }
        }
        // Проверка "Продажа с НДС" на наличие значения,
        // если есть, то расчет "Продажа без НДС"
        if (costSaleOfVAT != null) {
            if (isDouble(costSaleOfVAT.getText())) {
                thisCostSaleOfVAT = Double.parseDouble(costSaleOfVAT.getText());
                thisCostSaleWithoutVAT = thisCostSaleOfVAT  / 1.18;
                costSaleWithoutVAT.setText("Стоимость продажи без НДС: " + thisCostSaleWithoutVAT);
            } else {
                costSaleOfVAT.setText("Не число");
            }
        }
        // Расчет "Вал без НДС"
        thisGrossProfitWithoutVAT = thisCostSaleWithoutVAT - thisCostWithoutVAT;
        grossProfitWithoutVAT.setText("Вал без НДС: " + thisGrossProfitWithoutVAT);

        // Расчет "Маржинальный доход без НДС"
        thisNetMarginWithoutVAT = thisGrossProfitWithoutVAT - thisVariableCosts;
        netMarginWithoutVAT.setText("Маржинальный доход без НДС: " + thisNetMarginWithoutVAT);

        // Расчет "Премия менеджера"
        thisBonusManager = thisNetMarginWithoutVAT * 0.15;
        bonusManager.setText("Премия менеджеру: " + thisBonusManager);

        // Расчет "Чистая маржа"
        thisNetMargin = 5000;

        // Расчет "Наценка"
        thisMarkupP = thisNetMargin / thisCostSaleWithoutVAT;
        markupP.setText("Наценка: " + thisMarkupP);


        return 10;
    }

    public static boolean isDouble(String s) {
        try {
            Double.parseDouble(s);
        } catch(NumberFormatException e) {
            return false;
        //} catch(NullPointerException e) {
        //    return false;
        }
        // only got here if we didn't return false
        return true;
    }
}
