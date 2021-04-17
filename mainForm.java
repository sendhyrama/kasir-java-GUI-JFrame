package kasirapp;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class mainForm extends javax.swing.JFrame {
    JFrame jf = new JFrame();
    public mainForm() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nama_makanan = new javax.swing.JComboBox<>();
        harga_makanan = new javax.swing.JTextField();
        jumlah_porsi = new javax.swing.JTextField();
        total_harga = new javax.swing.JTextField();
        nominal_uang = new javax.swing.JTextField();
        kembalian = new javax.swing.JTextField();
        batal = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        bayar = new javax.swing.JButton();
        hitung_total = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setText("= APLIKASI KASIR WARUNG LUMAYAN =");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nama Makanan  :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Harga Makanan :   Rp");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Jumlah Porsi       :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Total Harga         :    Rp ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Nominal Uang     :    Rp ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Kembali                :    Rp");

        nama_makanan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Menu", "Soto Betawi", "Sate Ayam", "Mie Ayam", "Ayam Goreng", "Bebek Goreng", "Nasi Goreng" }));
        nama_makanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_makananActionPerformed(evt);
            }
        });

        harga_makanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                harga_makananActionPerformed(evt);
            }
        });

        jumlah_porsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlah_porsiActionPerformed(evt);
            }
        });

        total_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_hargaActionPerformed(evt);
            }
        });

        nominal_uang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nominal_uangActionPerformed(evt);
            }
        });

        kembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembalianActionPerformed(evt);
            }
        });

        batal.setText("CLEAR");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });

        keluar.setText("KELUAR");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        bayar.setText("BAYAR");
        bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarActionPerformed(evt);
            }
        });

        hitung_total.setText("HITUNG TOTAL");
        hitung_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitung_totalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(keluar)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(272, 272, 272)
                                .addComponent(batal))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel7))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(total_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nominal_uang, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bayar)
                                        .addGap(24, 24, 24))))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jumlah_porsi, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(hitung_total))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(harga_makanan, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(nama_makanan, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nama_makanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(batal))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(harga_makanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jumlah_porsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hitung_total))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(total_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nominal_uang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(bayar))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(keluar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nama_makananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_makananActionPerformed
    String NamaMakanan=(String)nama_makanan.getSelectedItem();
        switch (NamaMakanan){
            case "Soto Betawi":
                harga_makanan.setText("15000");
                break;
            case "Sate Ayam":
                harga_makanan.setText("18000");
                break;
            case "Mie Ayam":
                harga_makanan.setText("10000");
                break;
            case "Ayam Goreng":
                harga_makanan.setText("15000");
                break;
            case "Bebek Goreng":
                harga_makanan.setText("20000");
                break;
            case "Nasi Goreng":
                harga_makanan.setText("16000");
                break;
        }
    }//GEN-LAST:event_nama_makananActionPerformed

    private void harga_makananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_harga_makananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_harga_makananActionPerformed

    private void jumlah_porsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlah_porsiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlah_porsiActionPerformed

    private void total_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_hargaActionPerformed

    private void nominal_uangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nominal_uangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nominal_uangActionPerformed

    private void kembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembalianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kembalianActionPerformed

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        nama_makanan.setSelectedIndex(0);
        harga_makanan.setText("");
        jumlah_porsi.setText("");
        total_harga.setText("");
        nominal_uang.setText("");
        kembalian.setText("");
    }//GEN-LAST:event_batalActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_keluarActionPerformed

    private void hitung_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitung_totalActionPerformed
        int JumlahPorsi = Integer.parseInt(jumlah_porsi.getText());
        int HargaMakanan = Integer.parseInt(harga_makanan.getText());
        total_harga.setText(Integer.toString(HargaMakanan * JumlahPorsi));
    }//GEN-LAST:event_hitung_totalActionPerformed

    private void bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayarActionPerformed
        int NominalUang = Integer.parseInt(nominal_uang.getText());
        int TotalHarga = Integer.parseInt(total_harga.getText());
            if (NominalUang >= TotalHarga){
                kembalian.setText(Integer.toString(NominalUang - TotalHarga));
            }else {
            JOptionPane.showMessageDialog(jf, "Maaf uang tidak cukup");
            }
    }//GEN-LAST:event_bayarActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batal;
    private javax.swing.JButton bayar;
    private javax.swing.JTextField harga_makanan;
    private javax.swing.JButton hitung_total;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jumlah_porsi;
    private javax.swing.JButton keluar;
    private javax.swing.JTextField kembalian;
    private javax.swing.JComboBox<String> nama_makanan;
    private javax.swing.JTextField nominal_uang;
    private javax.swing.JTextField total_harga;
    // End of variables declaration//GEN-END:variables
}