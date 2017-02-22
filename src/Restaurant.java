import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JTabbedPane;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Restaurant {

	private JFrame frame;
	private JTextField txtChickenBurgerAmt;
	private JTextField txtChickenBurgerMealAmt;
	private JTextField txtCheeseBurgerAmt;
	private JTextField txtCheeseBurgerMealAmt;
	private JTextField txtDrinksAmt;
	Double subTotalAmt = 0.0;
	String value1, value2, calcCommand;;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Restaurant window = new Restaurant();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Restaurant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(0, 0, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel pnlResults = new JPanel();
		pnlResults.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		pnlResults.setBounds(956, 98, 307, 521);
		frame.getContentPane().add(pnlResults);
		pnlResults.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(SwingConstants.TOP);
		tabbedPane.setBounds(16, 23, 272, 479);
		pnlResults.add(tabbedPane);
		
		JPanel pnlReceipt = new JPanel();
		tabbedPane.addTab("Receipt", null, pnlReceipt, null);
		pnlReceipt.setLayout(null);
		
		JTextPane txtReceipt = new JTextPane();
		txtReceipt.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		txtReceipt.setBounds(6, 6, 239, 421);
		pnlReceipt.add(txtReceipt);
		
		JPanel pnlCalculator = new JPanel();
		tabbedPane.addTab("Calculator", null, pnlCalculator, null);
		pnlCalculator.setLayout(null);
		
		JLabel lblCalc = new JLabel("");
		lblCalc.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCalc.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblCalc.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblCalc.setBounds(46, 22, 155, 36);
		pnlCalculator.add(lblCalc);		
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				value1 = lblCalc.getText();
				lblCalc.setText(value1 + "1");
			}
		});
		btn1.setBounds(25, 117, 50, 50);
		pnlCalculator.add(btn1);
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				value1 = lblCalc.getText();
				lblCalc.setText(value1 + "2");
			}
		});		
		btn2.setBounds(76, 117, 50, 50);
		pnlCalculator.add(btn2);
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				value1 = lblCalc.getText();
				lblCalc.setText(value1 + "3");
			}
		});			
		btn3.setBounds(127, 117, 50, 50);
		pnlCalculator.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				value1 = lblCalc.getText();
				lblCalc.setText(value1 + "4");
			}
		});			
		btn4.setBounds(25, 167, 50, 50);
		pnlCalculator.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				value1 = lblCalc.getText();
				lblCalc.setText(value1 + "5");
			}
		});			
		btn5.setBounds(76, 167, 50, 50);
		pnlCalculator.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				value1 = lblCalc.getText();
				lblCalc.setText(value1 + "6");
			}
		});			
		btn6.setBounds(127, 167, 50, 50);
		pnlCalculator.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				value1 = lblCalc.getText();
				lblCalc.setText(value1 + "7");
			}
		});			
		btn7.setBounds(25, 217, 50, 50);
		pnlCalculator.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				value1 = lblCalc.getText();
				lblCalc.setText(value1 + "8");
			}
		});			
		btn8.setBounds(76, 217, 50, 50);
		pnlCalculator.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				value1 = lblCalc.getText();
				lblCalc.setText(value1 + "9");
			}
		});			
		btn9.setBounds(127, 217, 50, 50);
		pnlCalculator.add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				value1 = lblCalc.getText();
				lblCalc.setText(value1 + "0");
			}
		});
		btn0.setBounds(76, 267, 50, 50);
		pnlCalculator.add(btn0);		
		
		JButton btnBack = new JButton("<-");
		btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				value1 = lblCalc.getText();
				Integer length = lblCalc.getText().length();
				lblCalc.setText(value1.substring(0, length - 1));
			}
		});			
		btnBack.setBounds(76, 69, 50, 50);
		pnlCalculator.add(btnBack);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblCalc.setText("");
			}
		});			
		btnClear.setBounds(127, 69, 50, 50);
		pnlCalculator.add(btnClear);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				value2 = lblCalc.getText();
				lblCalc.setText("");
				calcCommand = "Add";
			}
		});			
		btnAdd.setBounds(180, 69, 50, 50);
		pnlCalculator.add(btnAdd);
		
		JButton btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				value2 = lblCalc.getText();
				lblCalc.setText("");
				calcCommand = "Subtract";
			}
		});			
		btnSubtract.setBounds(180, 117, 50, 50);
		pnlCalculator.add(btnSubtract);
		
		JButton btnMultiply = new JButton("x");
		btnMultiply.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				value2 = lblCalc.getText();
				lblCalc.setText("");
				calcCommand = "Multiply";
			}
		});			
		btnMultiply.setBounds(180, 167, 50, 50);
		pnlCalculator.add(btnMultiply);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				value2 = lblCalc.getText();
				lblCalc.setText("");
				calcCommand = "Divide";
			}
		});			
		btnDivide.setBounds(180, 217, 50, 50);
		pnlCalculator.add(btnDivide);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Double calcValue1 = Double.parseDouble(lblCalc.getText());
				Double calcValue2 = Double.parseDouble(value2);
				Double amount = 0.0;
				switch (calcCommand) {
					case "Add":
						amount = (calcValue1 + calcValue2);
						lblCalc.setText(amount.toString());
						break;
					case "Subtract":
						amount = (calcValue2 - calcValue1);
						lblCalc.setText(amount.toString());
						break;
					case "Multiply":
						amount = (calcValue2 * calcValue1);
						lblCalc.setText(amount.toString());						
						break;
					case "Divide":
						amount = (calcValue2 / calcValue1);
						lblCalc.setText(amount.toString());
						break;						
				}
			}
		});				
		btnEquals.setBounds(180, 267, 50, 50);
		pnlCalculator.add(btnEquals);
		

		
		JButton btnDecimal = new JButton(".");
		btnDecimal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				value1 = lblCalc.getText();
				lblCalc.setText(value1 + ".");
			}
		});			
		btnDecimal.setBounds(25, 267, 50, 50);
		pnlCalculator.add(btnDecimal);
		
		JPanel pnlCost = new JPanel();
		pnlCost.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		pnlCost.setBounds(16, 459, 575, 160);
		frame.getContentPane().add(pnlCost);
		pnlCost.setLayout(null);
		
		JLabel lblCostOfDrinks = new JLabel("Cost of Drinks");
		lblCostOfDrinks.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblCostOfDrinks.setBounds(27, 25, 195, 25);
		pnlCost.add(lblCostOfDrinks);
		
		JLabel lblCostOfMeals = new JLabel("Cost of Meals");
		lblCostOfMeals.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblCostOfMeals.setBounds(27, 69, 214, 25);
		pnlCost.add(lblCostOfMeals);
		
		JLabel lblCostOfDelivery = new JLabel("Cost of Delivery");
		lblCostOfDelivery.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblCostOfDelivery.setBounds(27, 113, 195, 25);
		pnlCost.add(lblCostOfDelivery);
		
		JLabel lblDrinkAmt = new JLabel("0.00");
		lblDrinkAmt.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblDrinkAmt.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDrinkAmt.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblDrinkAmt.setBounds(325, 25, 204, 25);
		pnlCost.add(lblDrinkAmt);
		
		JLabel lblMealAmt = new JLabel("0.00");
		lblMealAmt.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMealAmt.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblMealAmt.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblMealAmt.setBounds(325, 69, 204, 25);
		pnlCost.add(lblMealAmt);
		
		JLabel lblDeliveryAmt = new JLabel("0.00");
		lblDeliveryAmt.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDeliveryAmt.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblDeliveryAmt.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblDeliveryAmt.setBounds(325, 113, 204, 25);
		pnlCost.add(lblDeliveryAmt);
		
		JPanel pnlTotals = new JPanel();
		pnlTotals.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		pnlTotals.setBounds(603, 459, 341, 160);
		frame.getContentPane().add(pnlTotals);
		pnlTotals.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblTax.setBounds(18, 25, 96, 25);
		pnlTotals.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblSubTotal.setBounds(18, 69, 96, 25);
		pnlTotals.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblTotal.setBounds(18, 113, 96, 25);
		pnlTotals.add(lblTotal);
		
		JLabel lblSubTotalAmt = new JLabel("0.00");
		lblSubTotalAmt.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSubTotalAmt.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblSubTotalAmt.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblSubTotalAmt.setBounds(164, 69, 155, 25);
		pnlTotals.add(lblSubTotalAmt);
		
		JLabel lblTotalAmt = new JLabel("0.00");
		lblTotalAmt.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalAmt.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblTotalAmt.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblTotalAmt.setBounds(164, 113, 155, 25);
		pnlTotals.add(lblTotalAmt);
		
		JPanel pnlConverter = new JPanel();
		pnlConverter.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		pnlConverter.setBounds(603, 98, 341, 349);
		frame.getContentPane().add(pnlConverter);
		pnlConverter.setLayout(null);
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurrencyConverter.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 28));
		lblCurrencyConverter.setBounds(6, 31, 329, 25);
		pnlConverter.add(lblCurrencyConverter);
		
		JComboBox cboCurrency = new JComboBox();
		cboCurrency.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		cboCurrency.setModel(new DefaultComboBoxModel(new String[] {"Select Currency...", "Dollars", "Pounds", "Euros"}));
		cboCurrency.setBounds(34, 139, 280, 35);
		pnlConverter.add(cboCurrency);
		
		JLabel lblCurrencyAmt = new JLabel("");
		lblCurrencyAmt.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCurrencyAmt.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblCurrencyAmt.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblCurrencyAmt.setBounds(34, 239, 280, 25);
		pnlConverter.add(lblCurrencyAmt);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(18, 178, 304, 17);
		pnlConverter.add(separator_1);
		
		JPanel pnlItems = new JPanel();
		pnlItems.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		pnlItems.setBounds(16, 98, 575, 349);
		frame.getContentPane().add(pnlItems);
		pnlItems.setLayout(null);
		
		JLabel lblChickenBurger = new JLabel("Chicken Burger");
		lblChickenBurger.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblChickenBurger.setBounds(26, 29, 195, 25);
		pnlItems.add(lblChickenBurger);
		
		JLabel lblChickenBurgerMeal = new JLabel("Chicken Burger Meal");
		lblChickenBurgerMeal.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblChickenBurgerMeal.setBounds(26, 66, 214, 25);
		pnlItems.add(lblChickenBurgerMeal);
		
		JLabel lblCheeseBurger = new JLabel("Cheese Burger");
		lblCheeseBurger.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblCheeseBurger.setBounds(26, 103, 195, 25);
		pnlItems.add(lblCheeseBurger);
		
		JLabel lblCheeseBurgerMeal = new JLabel("Cheese Burger Meal");
		lblCheeseBurgerMeal.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblCheeseBurgerMeal.setBounds(26, 140, 195, 25);
		pnlItems.add(lblCheeseBurgerMeal);
		
		txtChickenBurgerAmt = new JTextField();
		txtChickenBurgerAmt.setText("0");
		txtChickenBurgerAmt.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		txtChickenBurgerAmt.setBounds(325, 28, 204, 26);
		pnlItems.add(txtChickenBurgerAmt);
		txtChickenBurgerAmt.setColumns(10);
		
		txtChickenBurgerMealAmt = new JTextField();
		txtChickenBurgerMealAmt.setText("0");
		txtChickenBurgerMealAmt.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		txtChickenBurgerMealAmt.setColumns(10);
		txtChickenBurgerMealAmt.setBounds(325, 65, 204, 26);
		pnlItems.add(txtChickenBurgerMealAmt);
		
		txtCheeseBurgerAmt = new JTextField();
		txtCheeseBurgerAmt.setText("0");
		txtCheeseBurgerAmt.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		txtCheeseBurgerAmt.setColumns(10);
		txtCheeseBurgerAmt.setBounds(325, 102, 204, 26);
		pnlItems.add(txtCheeseBurgerAmt);
		
		txtCheeseBurgerMealAmt = new JTextField();
		txtCheeseBurgerMealAmt.setText("0");
		txtCheeseBurgerMealAmt.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		txtCheeseBurgerMealAmt.setColumns(10);
		txtCheeseBurgerMealAmt.setBounds(325, 139, 204, 26);
		pnlItems.add(txtCheeseBurgerMealAmt);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblDrink.setBounds(26, 202, 195, 25);
		pnlItems.add(lblDrink);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblQty.setBounds(325, 202, 195, 25);
		pnlItems.add(lblQty);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(26, 178, 513, 12);
		pnlItems.add(separator);
		
		txtDrinksAmt = new JTextField();
		txtDrinksAmt.setText("0");
		txtDrinksAmt.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		txtDrinksAmt.setColumns(10);
		txtDrinksAmt.setBounds(325, 239, 204, 26);
		pnlItems.add(txtDrinksAmt);
		
		JComboBox cboDrinks = new JComboBox();
		cboDrinks.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		cboDrinks.setModel(new DefaultComboBoxModel(new String[] {"Select a Drink...", "Coke", "Diet Coke", "Sprite", "Root Beer", "Dr. Pepper", "Mountain Dew"}));
		cboDrinks.setBounds(26, 239, 214, 27);
		pnlItems.add(cboDrinks);
		
		JCheckBox chckbxHomeDelivery = new JCheckBox("Home Delivery");
		chckbxHomeDelivery.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		chckbxHomeDelivery.setBounds(26, 278, 214, 23);
		pnlItems.add(chckbxHomeDelivery);
		
		JCheckBox chckbxTax = new JCheckBox("Tax");
		chckbxTax.setSelected(true);
		chckbxTax.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		chckbxTax.setBounds(325, 278, 214, 23);
		pnlItems.add(chckbxTax);
		
		JLabel lblTitle = new JLabel("McBurger Queen");
		lblTitle.setFont(new Font("Lucida Grande", Font.BOLD, 80));
		lblTitle.setBounds(16, 0, 1247, 95);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblTitle);
		
		JPanel pnlNav = new JPanel();
		pnlNav.setBounds(16, 631, 1247, 61);
		frame.getContentPane().add(pnlNav);
		pnlNav.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		pnlNav.setLayout(null);
		
		JLabel lblTaxAmt = new JLabel("0.06");
		lblTaxAmt.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTaxAmt.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblTaxAmt.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblTaxAmt.setBounds(164, 25, 155, 25);
		pnlTotals.add(lblTaxAmt);		
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				double numChkBurger = Double.parseDouble(txtChickenBurgerAmt.getText());
				double ChkBurgerCost = 0.89;
				
				double numChkBurgerMeal = Double.parseDouble(txtChickenBurgerMealAmt.getText());
				double ChkBurgerMealCost = 1.99;
				
				double numChzBurger = Double.parseDouble(txtCheeseBurgerAmt.getText());
				double ChzBurgerCost = 1.19;
				
				double numChzBurgerMeal = Double.parseDouble(txtCheeseBurgerMealAmt.getText());
				double ChzBurgerMealCost = 2.29;
				
				double numDrinks = Double.parseDouble(txtDrinksAmt.getText());
				double DrinksCost = 0.99;
				
				Double mealAmt = (numChkBurger * ChkBurgerCost) + (numChkBurgerMeal * ChkBurgerMealCost) + (numChzBurger * ChzBurgerCost) + (numChzBurgerMeal * ChzBurgerMealCost);
				lblMealAmt.setText(String.format("%.2f", mealAmt));
				
				Double drinkAmt = (numDrinks * DrinksCost);
				lblDrinkAmt.setText(String.format("%.2f", drinkAmt));
				
				subTotalAmt = mealAmt + drinkAmt;
				lblSubTotalAmt.setText(String.format("%.2f", subTotalAmt));				
				
				if (!chckbxTax.isSelected()){
					lblTaxAmt.setText("0.00");
					frame.revalidate();
					frame.repaint();	
				} else {
					lblTaxAmt.setText(String.format("%.2f", subTotalAmt * 0.06));
					frame.revalidate();
					frame.repaint();		
				}
				
				if (chckbxHomeDelivery.isSelected()){
					lblDeliveryAmt.setText(String.format("%.2f", 5.00));
					frame.revalidate();
					frame.repaint();
				} else {
					lblDeliveryAmt.setText(String.format("%.2f", 0.00));
				}
				
				lblTotalAmt.setText(String.format("%.2f", Double.parseDouble(lblSubTotalAmt.getText()) + Double.parseDouble(lblTaxAmt.getText())
						+ Double.parseDouble(lblDeliveryAmt.getText())
						));
			}
		});
		btnTotal.setBounds(167, 11, 117, 42);
		pnlNav.add(btnTotal);
		
		JButton btnConvertCurrency = new JButton("Convert");
		btnConvertCurrency.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Double exchangedAmt = Double.parseDouble(lblTotalAmt.getText());

				if (cboCurrency.getSelectedItem() == "Dollars"){
					lblCurrencyAmt.setText(lblTotalAmt.getText());
				} else if (cboCurrency.getSelectedItem() == "Pounds") {
					//Exchange rate is currently 1 Pound == $1.25
					lblCurrencyAmt.setText("\u00a3" + String.format("%.2f", (exchangedAmt/1.25)));
				} else if (cboCurrency.getSelectedItem() == "Euros") {
					//Exchange Rate is currently 1 Euro == $1.05
					lblCurrencyAmt.setText("\u20ac" + String.format("%.2f", (exchangedAmt/1.05)));
				}
			}
		});
		btnConvertCurrency.setBounds(34, 276, 117, 42);
		pnlConverter.add(btnConvertCurrency);
		
		JButton btnClearCurrency = new JButton("Clear");
		btnClearCurrency.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblCurrencyAmt.setText("");
				cboCurrency.setSelectedItem("Select Currency...");
			}
		});
		btnClearCurrency.setBounds(197, 276, 117, 42);
		pnlConverter.add(btnClearCurrency);
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtReceipt.setText("");
				
				btnTotal.doClick();
				
				attachString("\t\nWelcome to McBurger Queen:\n\n"
						+ "\n" + Integer.parseInt(txtChickenBurgerAmt.getText()) + " Chicken Burger(s) @ " + "$ 0.89 = $ " + (Double.parseDouble(txtChickenBurgerAmt.getText()) * 0.89)
						+ "\n" + Integer.parseInt(txtChickenBurgerMealAmt.getText()) + " Chicken Burger Meal(s) @ " + "$ 1.99 = $ " + (Double.parseDouble(txtChickenBurgerMealAmt.getText()) * 1.99)
						+ "\n" + Integer.parseInt(txtCheeseBurgerAmt.getText()) + " Cheese Burger(s) @ " + "$ 1.19 = $ " + (Double.parseDouble(txtCheeseBurgerAmt.getText()) * 1.19)
						+ "\n" + Integer.parseInt(txtCheeseBurgerMealAmt.getText()) + " Cheese Burger Meal(s) @ " + "$ 2.29 = $ " + (Double.parseDouble(txtCheeseBurgerMealAmt.getText()) * 2.29)
						+ "\n" + Integer.parseInt(txtDrinksAmt.getText()) + " Drink(s) @ " + "$ 0.99 = $ " + String.format("%.2f", Double.parseDouble(txtDrinksAmt.getText()) * 0.99)
						+ "\n\nSub Total\t\t = $ " + lblSubTotalAmt.getText()
				);		
				
				if (chckbxTax.isSelected()) {
					attachString("\nTax @ 6%\t\t = $ " + lblTaxAmt.getText());				
				}				
				
				if (chckbxHomeDelivery.isSelected()){
					attachString("\nHome Delivery @ $ 5.00\t = $ 5.00");
				}
				
				attachString("\n\nTotal\t\t = $ " + lblTotalAmt.getText());
				
			}
					

			private void attachString(String text) {
			   try {
				      Document doc = txtReceipt.getDocument();
				      doc.insertString(doc.getLength(), text, null);
				   } catch(BadLocationException exc) {
				      exc.printStackTrace();
				   }
				
			}
		});
		btnReceipt.setBounds(442, 11, 117, 42);
		pnlNav.add(btnReceipt);
		
	
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtChickenBurgerAmt.setText("0");
				txtChickenBurgerMealAmt.setText("0");
				txtCheeseBurgerAmt.setText("0");
				txtCheeseBurgerMealAmt.setText("0");
				chckbxTax.setSelected(true);
				chckbxHomeDelivery.setSelected(false);
				cboDrinks.setSelectedItem("Select a Drink...");
				cboCurrency.setSelectedItem("Select Currency...");
				txtDrinksAmt.setText("0");
				lblMealAmt.setText("0.00");
				lblDrinkAmt.setText("0.00");
				lblDeliveryAmt.setText("0.00");
				lblCurrencyAmt.setText("");
				lblTaxAmt.setText("0.06");
				lblSubTotalAmt.setText("0.00");
				lblTotalAmt.setText("0.00");
				txtReceipt.setText("");
			}
		});
		btnReset.setBounds(717, 11, 117, 42);
		pnlNav.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(992, 11, 117, 42);
		pnlNav.add(btnExit);
	}
}
