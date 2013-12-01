package org.atrzaska.ebiznes.projekt1.gui;

import org.apache.mahout.cf.taste.eval.RecommenderBuilder;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;
import org.atrzaska.ebiznes.projekt1.api.RestaurantRecommender;
import org.atrzaska.ebiznes.projekt1.api.UserBasedRestaurantRecommenderBuilder;

public class RecommenderBuilderCreatorForm extends javax.swing.JFrame {
    
    protected RestaurantRecommender restaurantRecommender;

    /**
     * Creates new form RecommenderBuilderCreatorForm
     */
    public RecommenderBuilderCreatorForm(RestaurantRecommender restaurantRecommender) {
        this.restaurantRecommender = restaurantRecommender;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        boxRecommenderType = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        boxSimilarityType = new javax.swing.JComboBox();
        panelSposobWyboru = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        radioNNUserBased = new javax.swing.JRadioButton();
        radioThresholdBased = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        txtWartosc = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("wybór sposobu rekomendacji");

        boxRecommenderType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "na podstawie użytkowników", "na podstawie restauracji" }));
        boxRecommenderType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxRecommenderTypeActionPerformed(evt);
            }
        });

        jLabel1.setText("Generuj rekomendajce");

        jLabel2.setText("Metoda obliczania podobieństwa");

        boxSimilarityType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "kosinusowa", "cityblock", "pearsona", "log likelihood", "tanimoto coefficient", "spearman'a", "odległość euklidesowa" }));

        panelSposobWyboru.setBorder(javax.swing.BorderFactory.createTitledBorder("sposób wyboru podobnych użytkowników"));

        jLabel3.setText("wybierz");

        buttonGroup1.add(radioNNUserBased);
        radioNNUserBased.setSelected(true);
        radioNNUserBased.setText("najbardziej podobnych użytkowników");
        radioNNUserBased.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNNUserBasedActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioThresholdBased);
        radioThresholdBased.setText("użytkowników, których profil jest zgodny ");
        radioThresholdBased.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioThresholdBasedActionPerformed(evt);
            }
        });

        jLabel4.setText("podaj wartość");

        txtWartosc.setText("10");

        javax.swing.GroupLayout panelSposobWyboruLayout = new javax.swing.GroupLayout(panelSposobWyboru);
        panelSposobWyboru.setLayout(panelSposobWyboruLayout);
        panelSposobWyboruLayout.setHorizontalGroup(
            panelSposobWyboruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSposobWyboruLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSposobWyboruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSposobWyboruLayout.createSequentialGroup()
                        .addGroup(panelSposobWyboruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioThresholdBased)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtWartosc, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSposobWyboruLayout.createSequentialGroup()
                        .addGroup(panelSposobWyboruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioNNUserBased)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelSposobWyboruLayout.setVerticalGroup(
            panelSposobWyboruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSposobWyboruLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioNNUserBased)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioThresholdBased)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSposobWyboruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtWartosc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(panelSposobWyboru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(boxRecommenderType, 0, 255, Short.MAX_VALUE)
                                    .addComponent(boxSimilarityType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxRecommenderType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(boxSimilarityType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSposobWyboru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(btnOK)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxRecommenderTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxRecommenderTypeActionPerformed
        String selectedValue = (String) boxRecommenderType.getSelectedItem();
        if(selectedValue.equalsIgnoreCase("na podstawie restauracji")) {
            panelSposobWyboru.setVisible(false);
        } else {
            panelSposobWyboru.setVisible(true);
        }
    }//GEN-LAST:event_boxRecommenderTypeActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        String recommenderType = (String) boxRecommenderType.getSelectedItem();
        String similarityType = (String) boxSimilarityType.getSelectedItem();
        
        Recommender recommender;
        
        if(recommenderType.equalsIgnoreCase("na podstawie użytkowników")) {
            recommender = this.createUserBasedRecommender();
        } else {
            recommender = this.createItemBasedRecommender();
        }

        this.setVisible(false);
        this.dispose();
//        this.restaurantRecommender.
    }//GEN-LAST:event_btnOKActionPerformed

    private void radioThresholdBasedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioThresholdBasedActionPerformed
        this.txtWartosc.setText("0.1");
    }//GEN-LAST:event_radioThresholdBasedActionPerformed

    private void radioNNUserBasedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNNUserBasedActionPerformed
        this.txtWartosc.setText("10");
    }//GEN-LAST:event_radioNNUserBasedActionPerformed

    private UserSimilarity getUserSimilarity() {
        return null;
    }

    private Recommender createUserBasedRecommender() {
        return null;
    }

    private Recommender createItemBasedRecommender() {
        return null;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxRecommenderType;
    private javax.swing.JComboBox boxSimilarityType;
    private javax.swing.JButton btnOK;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelSposobWyboru;
    private javax.swing.JRadioButton radioNNUserBased;
    private javax.swing.JRadioButton radioThresholdBased;
    private javax.swing.JTextField txtWartosc;
    // End of variables declaration//GEN-END:variables
}