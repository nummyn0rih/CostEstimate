import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame {

    //JFrame frame;
    //JPanel passiveFields;
    //JPanel activeFields;
    //JPanel north = new JPanel();
    //JPanel south;
    //JPanel center = new JPanel();

    public void setFrame() {

        JFrame frame = new JFrame("Расчет маржинальной прибыли");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.setVisible(true);
        BorderLayout layout = new BorderLayout();
        JPanel background =  new JPanel(layout);
        background.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel activeFields = new JPanel();
        activeFields.setBackground(Color.orange);

/*        JTextField nameSale = new JTextField("Наименование товара", 45);
        nameSale.addActionListener(new WriteNameSaleListener());
        activeFields.add(nameSale);

        JTextField number = new JTextField("Количество", 5);
        number.addActionListener(new NumberListener());
        activeFields.add(number);

        JTextField costOfVAT = new JTextField("Себестоимость с НДС", 25);
        costOfVAT.addActionListener(new CostOfVATListener());
        activeFields.add(costOfVAT);

        JTextField costWithoutVAT = new JTextField("Себестоимость без НДС", 25);
        costWithoutVAT.addActionListener(new CostWithoutVATListener());
        activeFields.add(costWithoutVAT);

        JTextField costSaleOfVAT = new JTextField("Стоимость продажи с НДС", 25);
        costSaleOfVAT.addActionListener(new CostSaleOfVATListener());
        activeFields.add(costSaleOfVAT);

        JTextField netMargin = new JTextField("Чистая маржа", 25);
        netMargin.addActionListener(new NetMargListener());
        activeFields.add(netMargin);

        JTextField delivery = new JTextField("Доставка", 25);
        delivery.addActionListener(new DeliveryListener());
        activeFields.add(delivery);

        JTextField installation = new JTextField("Сборка", 25);
        installation.addActionListener(new InstallationListener());
        activeFields.add(installation);

        JTextField addExpenses = new JTextField("Дополнительные расходы", 25);
        addExpenses.addActionListener(new AddExpensesListener());
        activeFields.add(addExpenses);

        JTextField delay = new JTextField("Отрочка", 25);
        delay.addActionListener(new DelayListener());
        activeFields.add(delay);
*/
        background.add(BorderLayout.WEST, activeFields);

        JPanel passiveFields = new JPanel(layout);
        passiveFields.setBackground(Color.cyan);

        background.add(BorderLayout.EAST, passiveFields);

        frame.getContentPane().add(background);

/*        String costSaleWVAT = " ";
        Label costSaleWithoutVAT = new Label(costSaleWVAT);
        passiveFields.add(costSaleWithoutVAT);

        String grossProfitWVAT = " ";
        Label grossProfitWithoutVAT = new Label(grossProfitWVAT);
        passiveFields.add(grossProfitWithoutVAT);

        String interestR = " ";
        Label interestRate = new Label(interestR);
        passiveFields.add(interestRate);

        String netMarginWVAT = " ";
        Label netMarginWithoutVAT = new Label(netMarginWVAT);
        passiveFields.add(netMarginWithoutVAT);

        String variableC = " ";
        Label variableCosts = new Label(variableC);
        passiveFields.add(variableCosts);

        //String costSaleWVAT = " ";
        //Label costSaleWithoutVAT = new Label(costSaleWVAT);
        //passiveFields.add(costSaleWithoutVAT);

        String profitabilityWVAT = " ";
        Label profitabilityWithoutVAT = new Label(profitabilityWVAT);
        passiveFields.add(profitabilityWithoutVAT);

        //String сostSaleWithoutVAT = " ";
        //Label сostSaleWithoutVAT = new Label(сostSaleWithoutVAT);
        //passiveFields.add(costSaleWithoutVAT);
        
        frame.getContentPane().add(BorderLayout.EAST, passiveFields);
        //frame.getContentPane().add(BorderLayout.NORTH, north);
        frame.getContentPane().add(BorderLayout.SOUTH, south);
        //frame.getContentPane().add(BorderLayout.CENTER, center);

        //north.setBackground(Color.black);
        south.setBackground(Color.green);
        //center.setBackground(Color.orange);

        JButton buttonToCalculate = new JButton("Рассчитать");
        buttonToCalculate.addActionListener(new ButtonToCalculate());
        south.add(buttonToCalculate);
*/
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
            System.out.println("ButtonToCalculate");
        }
    }


}
