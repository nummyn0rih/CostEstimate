import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyFrame {

    private JFrame frame;
    private JPanel nameField, activeFields, passiveFields;
    private JPanel background;
    private JTextField nameSale, number, costOfVAT, costWithoutVAT, costSaleOfVAT,
            netMargin, delivery, installation, addExpenses, delay;
    private JTextField costSaleWithoutVAT, grossProfitWithoutVAT, netMarginWithoutVAT,
            variableCosts, bonusManager, profitabilityWithoutVAT, markupP, interestRateSumm, interestRateDay;

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

        // Конфигурация панели NORTH nameField
        nameField = new JPanel();
        nameField.setLayout(new FlowLayout());
        nameSale = new JTextField("", 25);
        nameSale.addActionListener(new WriteNameSaleListener());
        nameField.add(nameSale);
        JLabel jl0 = new JLabel("Наименование товара");
        nameField.add(jl0);
        JButton buttonToCalculate = new JButton("Рассчитать");
        buttonToCalculate.addActionListener(new ButtonToCalculate());
        nameField.add(buttonToCalculate);
        frame.getContentPane().add(BorderLayout.NORTH, nameField);

        // Конфигурация панели WEST activeFields
        activeFields = new JPanel();
        activeFields.setLayout(new GridLayout(9, 2));

        number = new JTextField("", 5);
        number.addActionListener(new NumberListener());
        activeFields.add(number);
        JLabel jl1 = new JLabel("Количество");
        activeFields.add(jl1);
        costOfVAT = new JTextField("");
        costOfVAT.addActionListener(new CostOfVATListener());
        activeFields.add(costOfVAT);
        JLabel jl2 = new JLabel("Себестоимость с НДС");
        activeFields.add(jl2);
        costWithoutVAT = new JTextField("");
        costWithoutVAT.addActionListener(new CostWithoutVATListener());
        activeFields.add(costWithoutVAT);
        JLabel jl3 = new JLabel("Себестоимость без НДС");
        activeFields.add(jl3);
        costSaleOfVAT = new JTextField("");
        costSaleOfVAT.addActionListener(new CostSaleOfVATListener());
        activeFields.add(costSaleOfVAT);
        JLabel jl4 = new JLabel("Стоимость продажи с НДС");
        activeFields.add(jl4);
        netMargin = new JTextField("");
        netMargin.addActionListener(new NetMarginListener());
        activeFields.add(netMargin);
        JLabel jl5 = new JLabel("Чистая маржа");
        activeFields.add(jl5);
        delivery = new JTextField("");
        delivery.addActionListener(new DeliveryListener());
        activeFields.add(delivery);
        JLabel jl6 = new JLabel("Доставка");
        activeFields.add(jl6);
        installation = new JTextField("");
        installation.addActionListener(new InstallationListener());
        activeFields.add(installation);
        JLabel jl7 = new JLabel("Сборка");
        activeFields.add(jl7);
        addExpenses = new JTextField("");
        addExpenses.addActionListener(new AddExpensesListener());
        activeFields.add(addExpenses);
        JLabel jl8 = new JLabel("Дополнительные затраты");
        activeFields.add(jl8);
        delay = new JTextField("");
        delay.addActionListener(new DelayListener());
        delay.setEditable(false);
        activeFields.add(delay);
        JLabel jl9 = new JLabel("Отрочка");
        activeFields.add(jl9);
        frame.getContentPane().add(BorderLayout.WEST, activeFields);

        // Конфигурация панели EAST passiveFields
        passiveFields = new JPanel();
        passiveFields.setLayout(new GridLayout(9, 2));

        costSaleWithoutVAT = new JTextField("", 5);
        costSaleWithoutVAT.setEditable(false);
        passiveFields.add(costSaleWithoutVAT);
        JLabel jl00 = new JLabel("Стоимость продажи без НДС");
        passiveFields.add(jl00);
        grossProfitWithoutVAT = new JTextField();
        grossProfitWithoutVAT.setEditable(false);
        passiveFields.add(grossProfitWithoutVAT);
        JLabel jl01 = new JLabel("Вал без НДС");
        passiveFields.add(jl01);
        netMarginWithoutVAT = new JTextField();
        netMarginWithoutVAT.setEditable(false);
        passiveFields.add(netMarginWithoutVAT);
        JLabel jl02 = new JLabel("Маржинальный доход без НДС");
        passiveFields.add(jl02);
        variableCosts = new JTextField();
        variableCosts.setEditable(false);
        passiveFields.add(variableCosts);
        JLabel jl03 = new JLabel("Переменные затраты");
        passiveFields.add(jl03);
        bonusManager = new JTextField();
        bonusManager.setEditable(false);
        passiveFields.add(bonusManager);
        JLabel jl04 = new JLabel("Премия менеджеру");
        passiveFields.add(jl04);
        profitabilityWithoutVAT = new JTextField();
        profitabilityWithoutVAT.setEditable(false);
        passiveFields.add(profitabilityWithoutVAT);
        JLabel jl05 = new JLabel("Рентабельность без НДС");
        passiveFields.add(jl05);
        markupP = new JTextField();
        markupP.setEditable(false);
        passiveFields.add(markupP);
        JLabel jl06 = new JLabel("Наценка, %");
        passiveFields.add(jl06);
        interestRateSumm = new JTextField("");
        passiveFields.add(interestRateSumm);
        JLabel jl07 = new JLabel("Сумма в отсрочку");
        passiveFields.add(jl07);
        interestRateDay = new JTextField("");
        passiveFields.add(interestRateDay);
        JLabel jl08 = new JLabel("Отсрочка, кол-во дней");
        passiveFields.add(jl08);

        frame.getContentPane().add(BorderLayout.EAST, passiveFields);

        frame.setSize(1500, 400);
        frame.setVisible(true);
        frame.pack();
    }

    class WriteNameSaleListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            calculate();
        }
    }

    public class NumberListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            calculate();
        }
    }

    public class CostOfVATListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            calculate();
        }
    }

    public class CostWithoutVATListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            calculate();
        }
    }

    public class CostSaleOfVATListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            calculate();
        }
    }

    public class NetMarginListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            calculate();
        }
    }

    public class DeliveryListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            calculate();
        }
    }

    public class InstallationListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            calculate();
        }
    }

    public class AddExpensesListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            calculate();
        }
    }

    public class DelayListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            calculate();
        }
    }

    public class ButtonToCalculate implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            calculate();
        }
    }

    public boolean calculate() {
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
        double thisNetMarginWithoutVAT = 0;
        double thisVariableCosts;
        double thisBonusManager;
        double thisProfitabilityWithoutVAT;
        double thisMarkupP;
        double thisInterestRateSumm = 0;
        double thisInterestRateDay = 0;

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

        // Расчет "Отсрочка"
        if (interestRateSumm.getText().equals("")) {
        } else {
            if (isDouble(interestRateSumm.getText())) {
                thisInterestRateSumm = Double.parseDouble(interestRateSumm.getText());
            }
        }
        if (interestRateDay.getText().equals("")) {
        } else {
            if (isDouble(interestRateDay.getText())) {
                thisInterestRateDay = Double.parseDouble(interestRateDay.getText());
            }
        }
        thisDelay = thisInterestRateSumm * (20.0 / 100.0 / 365.0 * thisInterestRateDay);
        delay.setText(Double.toString(thisDelay));

        thisVariableCosts = thisInstallation + thisDelivery + thisAddExpenses + thisDelay;
        variableCosts.setText(Double.toString(thisVariableCosts));

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
                costSaleWithoutVAT.setText(Double.toString(thisCostSaleWithoutVAT));
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
                costSaleWithoutVAT.setText(Double.toString(thisCostSaleWithoutVAT));
                // Расчет "Наценка"
                thisMarkupP = thisNetMargin / thisCostSaleWithoutVAT;
                markupP.setText(Double.toString(thisMarkupP));
            }
        }

        // Расчет "Вал без НДС"
        thisGrossProfitWithoutVAT = thisCostSaleWithoutVAT - thisCostWithoutVAT;
        grossProfitWithoutVAT.setText(Double.toString(thisGrossProfitWithoutVAT));

        // Расчет "Маржинальный доход без НДС"
        thisNetMarginWithoutVAT = thisGrossProfitWithoutVAT - thisVariableCosts;
        netMarginWithoutVAT.setText(Double.toString(thisNetMarginWithoutVAT));

        // Расчет "Премия менеджера"
        thisBonusManager = thisNetMarginWithoutVAT * 0.15;
        bonusManager.setText(Double.toString(thisBonusManager));

        // Расчет "Рентабельность без НДС"
        thisProfitabilityWithoutVAT = thisCostSaleWithoutVAT / thisNetMarginWithoutVAT;
        profitabilityWithoutVAT.setText(Double.toString(thisProfitabilityWithoutVAT));

        return true;
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