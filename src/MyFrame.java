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
        JLabel jl8 = new JLabel("Дополнительные затраты");
        annotationsAFields.add(jl8);
        JLabel jl9 = new JLabel("Отрочка");
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
        netMargin.addActionListener(new NetMarginListener());
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
        interestRate = new JLabel("Проценты: ");
        annotationsPFields.add(interestRate);
        netMarginWithoutVAT = new JLabel("Маржинальный доход без НДС: ");
        annotationsPFields.add(netMarginWithoutVAT);
        variableCosts = new JLabel("Переменные затраты: ");
        annotationsPFields.add(variableCosts);
        bonusManager = new JLabel("Премия менеджеру: ");
        annotationsPFields.add(bonusManager);
        profitabilityWithoutVAT = new JLabel("Рентабельность без НДС: ");
        annotationsPFields.add(profitabilityWithoutVAT);
        markupP = new JLabel("Наценка, %: ");
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

    public class NetMarginListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            System.out.println("NetMarginListener");
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
        double thisAddExpenses = 0;
        double thisDelay = 0;

        double thisCostSaleWithoutVAT = 0;
        double thisGrossProfitWithoutVAT = 0;
        //interestRate;
        double thisNetMarginWithoutVAT = 0;
        double thisVariableCosts;
        double thisBonusManager;
        double thisProfitabilityWithoutVAT;
        double thisMarkupP;

        // Расчет "Переменные затраты"
        if (installation.getText().equals("")) {
        } else {
            if (isDouble(installation.getText())) {
                thisInstallation = Double.parseDouble(installation.getText());
            }
        }
        if (delivery.getText().equals("")) {
        } else {
            if (isDouble(delivery.getText())) {
                thisDelivery = Double.parseDouble(delivery.getText());
            }
        }
        if (addExpenses.getText().equals("")) {
        } else {
            if (isDouble(addExpenses.getText())) {
                thisAddExpenses = Double.parseDouble(addExpenses.getText());
            }
        }
        // Нужно дописать ячейку с суммой в отсрочку и использовать ее вместо "Продажа с НДС"
        if (delay != null) {
            if (isDouble(delay.getText())) {
                thisDelay = Double.parseDouble(delay.getText());
            }
        }
        thisVariableCosts = thisInstallation + thisDelivery + thisAddExpenses + thisDelay;
        variableCosts.setText("Переменные затраты: " + thisVariableCosts);

        // Проверка "Себестоимость с НДС" на наличие значения,
        // если есть, то расчет "Себестоимость без НДС"
        // если нет, то проверка значения "Себестоимость без НДС"
        // если есть, то расчет "Себестоимость с НДС"
        if (costOfVAT.getText().equals("")) {
            if (costWithoutVAT.getText().equals("")) {
            } else  {
                if (isDouble(costWithoutVAT.getText())) {
                    thisCostWithoutVAT = Double.parseDouble(costWithoutVAT.getText());
                    thisCostOfVAT = thisCostWithoutVAT * 1.18;
                    costOfVAT.setText(Double.toString(thisCostOfVAT));
                }
            }
        } else {
            if (isDouble(costOfVAT.getText())) {
                thisCostWithoutVAT = Double.parseDouble(costOfVAT.getText()) / 1.18;
                costWithoutVAT.setText(Double.toString(thisCostWithoutVAT));
            }
        }

        // Проверка "Продажа с НДС" на наличие значения,
        // если есть, то расчет "Продажа без НДС"
        if (costSaleOfVAT.getText().equals("")) {
        } else {
            if (isDouble(costSaleOfVAT.getText())) {
                thisCostSaleOfVAT = Double.parseDouble(costSaleOfVAT.getText());
                thisCostSaleWithoutVAT = thisCostSaleOfVAT  / 1.18;
                costSaleWithoutVAT.setText("Стоимость продажи без НДС: " + thisCostSaleWithoutVAT);
            }
        }

        // Расчет "Продажа с НДС" и "Продажа без НДС"
        // Расчет "Чистая маржа"
        if (netMargin.getText().equals("")) {
            if (costSaleOfVAT.getText().equals("")) {
            } else {
                if (isDouble(costSaleOfVAT.getText())) {
                    thisCostSaleOfVAT = Double.parseDouble(costSaleOfVAT.getText());
                    thisCostSaleWithoutVAT = thisCostSaleOfVAT / 1.18;
                    costSaleWithoutVAT.setText(Double.toString(thisCostSaleWithoutVAT));
                    thisNetMargin = (thisCostSaleWithoutVAT - thisCostWithoutVAT -
                            thisVariableCosts) * .85;
                    netMargin.setText(Double.toString(thisNetMargin));
                    // Расчет "Наценка"
                    thisMarkupP = thisNetMargin / thisCostSaleWithoutVAT;
                    markupP.setText(Double.toString(thisMarkupP));
                }
            }
        } else {
            if (isDouble(netMargin.getText())) {
                thisNetMargin = Double.parseDouble(netMargin.getText());
                thisCostSaleOfVAT = (thisNetMargin / .85) * 1.18 +
                        thisCostWithoutVAT * 1.18 + thisVariableCosts * 1.18;
                thisCostSaleWithoutVAT = thisNetMargin / .85 +
                        thisCostWithoutVAT + thisVariableCosts;
                costSaleOfVAT.setText(Double.toString(thisCostSaleOfVAT));
                // Расчет "Наценка"
                thisMarkupP = thisNetMargin / thisCostSaleWithoutVAT;
                markupP.setText(Double.toString(thisMarkupP));
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

        // Расчет "Рентабельность без НДС"
        thisProfitabilityWithoutVAT = thisCostSaleWithoutVAT / thisNetMarginWithoutVAT;
        profitabilityWithoutVAT.setText(Double.toString(thisProfitabilityWithoutVAT));

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