import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        initHandle();
        initData();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        radioEspresso = new javax.swing.JRadioButton();
        radioCappuccino = new javax.swing.JRadioButton();
        radioAmericano = new javax.swing.JRadioButton();
        radioLatte = new javax.swing.JRadioButton();
        radioMacchiato = new javax.swing.JRadioButton();
        checkboxMilk = new javax.swing.JCheckBox();
        checkboxCinnamon = new javax.swing.JCheckBox();
        checkboxMocha = new javax.swing.JCheckBox();
        checkboxWhip = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTotal = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTotalBeforeTax = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtTax = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        btnPrintBill = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("SATELLITE COFFEE SHOP");

        radioEspresso.setText("Espresso");
        radioEspresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEspressoActionPerformed(evt);
            }
        });

        radioCappuccino.setText("Cappuccino");
        radioCappuccino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCappuccinoActionPerformed(evt);
            }
        });

        radioAmericano.setText("Americano");
        radioAmericano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAmericanoActionPerformed(evt);
            }
        });

        radioLatte.setText("Latte");
        radioLatte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioLatteActionPerformed(evt);
            }
        });

        radioMacchiato.setText("Macchiato");
        radioMacchiato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMacchiatoActionPerformed(evt);
            }
        });

        checkboxMilk.setText("Milk");
        checkboxMilk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxMilkActionPerformed(evt);
            }
        });

        checkboxCinnamon.setText("Cinnamon");
        checkboxCinnamon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxCinnamonActionPerformed(evt);
            }
        });

        checkboxMocha.setText("Mocha");
        checkboxMocha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxMochaActionPerformed(evt);
            }
        });

        checkboxWhip.setText("Whip");
        checkboxWhip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxWhipActionPerformed(evt);
            }
        });

        jLabel2.setText("Total:");

        jLabel3.setText("Tax:");

        jLabel4.setText("Total before tax:");

        jScrollPane1.setViewportView(txtTotal);

        jScrollPane2.setViewportView(txtTotalBeforeTax);

        jScrollPane3.setViewportView(txtTax);

        jLabel5.setText("Customer Name:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel6.setText("Phone:");

        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });

        btnPrintBill.setText("PrintBill");
        btnPrintBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintBillActionPerformed(evt);
            }
        });

        btnEnter.setText("Enter");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel4))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGap(10, 10, 10)
                                                                        .addComponent(jLabel6)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel5)
                                                                .addGap(4, 4, 4))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3)))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(btnPrintBill))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                                .addComponent(txtName)
                                                .addComponent(jScrollPane2)
                                                .addComponent(jScrollPane1)))
                                .addGap(0, 43, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(radioMacchiato)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(radioCappuccino)
                                                        .addComponent(radioLatte)
                                                        .addComponent(radioEspresso, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(radioAmericano))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(checkboxWhip)
                                                        .addComponent(checkboxCinnamon)
                                                        .addComponent(checkboxMilk)
                                                        .addComponent(checkboxMocha))
                                                .addGap(94, 94, 94))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(radioLatte)
                                        .addComponent(checkboxMilk))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(radioEspresso)
                                        .addComponent(checkboxMocha))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(radioCappuccino)
                                        .addComponent(checkboxCinnamon))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(radioAmericano)
                                        .addComponent(checkboxWhip))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(radioMacchiato))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(54, 54, 54)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel5)
                                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel3)
                                                .addComponent(btnEnter))
                                        .addComponent(btnPrintBill)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }

    private void radioEspressoActionPerformed(java.awt.event.ActionEvent evt) {
        state = SELECTED;
    }

    private void radioCappuccinoActionPerformed(java.awt.event.ActionEvent evt) {
        state = SELECTED;
    }

    private void radioAmericanoActionPerformed(java.awt.event.ActionEvent evt) {
        state = SELECTED;
    }

    private void radioLatteActionPerformed(java.awt.event.ActionEvent evt) {
        state = SELECTED;
    }

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnPrintBillActionPerformed(java.awt.event.ActionEvent evt) {
        if (state == ENTERED) {
            if (txtName.getText().length()==0) {
                JOptionPane.showMessageDialog(this, "Please enter customer name", "WARNING", JOptionPane.INFORMATION_MESSAGE);
            } else if (txtPhone.getText().length()==0) {
                JOptionPane.showMessageDialog(this, "Please enter customer phone", "WARNING", JOptionPane.INFORMATION_MESSAGE);
            }
            else if (txtPhone.getText().length()!=10|| !pattern.matcher(txtPhone.getText()).matches()) {
                JOptionPane.showMessageDialog(this, "Please enter valid customer phone", "WARNING", JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(this,
                        drinks.getDescription() + "\n"
                                + "Customer: " + txtName.getText() + "\n"
                                + "Phone: " + txtPhone.getText() + "\n"
                                + "Subtotal: " + txtTotalBeforeTax.getText() + "\n"
                                + "Tax: " + txtTax.getText() + "\n"
                                + "Total: " + txtTotal.getText(),
                        "BILL", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please press enter to calculate before printing the bill", "WARNING", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {
        switch (state) {
            case NOTSELECT:
                JOptionPane.showMessageDialog(this, "Please select a drink", "WARNING", JOptionPane.INFORMATION_MESSAGE);
                break;
            case SELECTED:
                priceCalculation();
                state = ENTERED;
                break;
            case ENTERED:
                break;
            default:
                throw new AssertionError();
        }

    }

    private void radioMacchiatoActionPerformed(java.awt.event.ActionEvent evt) {
        state = SELECTED;
    }

    private void checkboxMilkActionPerformed(java.awt.event.ActionEvent evt) {
        if (state == ENTERED)
            state = SELECTED;
    }

    private void checkboxMochaActionPerformed(java.awt.event.ActionEvent evt) {
        if (state == ENTERED)
            state = SELECTED;
    }

    private void checkboxCinnamonActionPerformed(java.awt.event.ActionEvent evt) {
        if (state == ENTERED)
            state = SELECTED;
    }

    private void checkboxWhipActionPerformed(java.awt.event.ActionEvent evt) {
        if (state == ENTERED)
            state = SELECTED;
    }

    private void priceCalculation() {
        //variables
        final double TAX_RATE = 0.1; // 10% tax
        double total;
        double totalBeforeTax = 0;
        double tax;
        Set<String> toppings = new HashSet<>();
        String drinkName = null;
        DrinkFactory drinkFactory = new DrinkFactory();

        //handlers
        if (radioLatte.isSelected()) {
            drinkName = "latte";
        } else if (radioMacchiato.isSelected()) {
            drinkName = "macchiato";
        } else if (radioAmericano.isSelected()) {
            drinkName = "americano";
        } else if (radioEspresso.isSelected()) {
            drinkName = "espresso";
        } else if (radioCappuccino.isSelected()) {
            drinkName = "cappuccino";
        }

        if (checkboxMilk.isSelected()) {
            toppings.add("milk");
        }
        if (checkboxMocha.isSelected()) {
            toppings.add("mocha");
        }
        if (checkboxCinnamon.isSelected()) {
            toppings.add("cinnamon");
        }
        if (checkboxWhip.isSelected()) {
            toppings.add("whip");
        }

        drinks = drinkFactory.createDrink(drinkName, toppings);

        // calculate
        totalBeforeTax = drinks.cost();
        totalBeforeTax = (double) Math.round(totalBeforeTax * 100) / 100; // have it rounded up so that the number doesn't go into a floating point number
        tax = totalBeforeTax * TAX_RATE;
        tax = (double) Math.round(tax * 100) / 100;
        total = tax + totalBeforeTax;
        total = (double) Math.round(total * 100) / 100; // just to be safe

        txtTax.setText(Double.toString(tax));
        txtTotal.setText(Double.toString(total));
        txtTotalBeforeTax.setText(Double.toString(totalBeforeTax));
    }


    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnPrintBill;
    private javax.swing.JCheckBox checkboxMilk;
    private javax.swing.JCheckBox checkboxMocha;
    private javax.swing.JCheckBox checkboxCinnamon;
    private javax.swing.JCheckBox checkboxWhip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton radioLatte;
    private javax.swing.JRadioButton radioMacchiato;
    private javax.swing.JRadioButton radioAmericano;
    private javax.swing.JRadioButton radioEspresso;
    private javax.swing.JRadioButton radioCappuccino;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextPane txtTotalBeforeTax;
    private javax.swing.JTextPane txtTax;
    private javax.swing.JTextPane txtTotal;
    // End of variables declaration

    public static final int NOTSELECT = 0;
    public static final int SELECTED = 1;
    public static final int ENTERED = 2;

    private int state;
    private Drinks drinks;
    private ButtonGroup buttonGroup;

    private Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

    private void initHandle() {
        buttonGroup = new ButtonGroup();
        buttonGroup.add(radioAmericano);
        buttonGroup.add(radioLatte);
        buttonGroup.add(radioEspresso);
        buttonGroup.add(radioMacchiato);
        buttonGroup.add(radioCappuccino);
    }

    private void initData() {
        state = NOTSELECT;
    }

}
