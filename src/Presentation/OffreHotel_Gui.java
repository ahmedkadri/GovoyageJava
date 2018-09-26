/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Dao.HotelDao;
import Dao.OffreHotelDao;
import entite.OffreHotel;
import java.awt.event.KeyEvent;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ahmed
 */
public class OffreHotel_Gui extends javax.swing.JFrame {
    private Object lMessage2;

    /**
     * Creates new form OffreHotel_Gui
     */
    public OffreHotel_Gui() {
        initComponents();
        UpdateHotel();
        UpdateOffreHotel();
    }
    
       public void UpdateHotel(){
        
        DefaultTableModel model =(DefaultTableModel) JtableHotel1.getModel();
        HotelDao odao = new HotelDao();
        Object[] rowData = new Object[11];
        
        for(int i=0;i<odao.afficherHotel().size();i++){
         
            //rowData[0] = odao.afficherHotel().get(i).getIdHotel();
             rowData[0] = odao.afficherHotel().get(i).getNomHotel();
               rowData[1] = odao.afficherHotel().get(i).getNBEtoile();
                rowData[2] = odao.afficherHotel().get(i).getDescription();
                 rowData[3] = odao.afficherHotel().get(i).getChambreType();
                  rowData[4] = odao.afficherHotel().get(i).getVille();
                   rowData[5] = odao.afficherHotel().get(i).getNombrePlace();
                    rowData[6] = odao.afficherHotel().get(i).getPrixPC();
                     rowData[7] = odao.afficherHotel().get(i).getPrixDP();
                      rowData[8] = odao.afficherHotel().get(i).getPrixLPD();
                       rowData[9] = odao.afficherHotel().get(i).getPhoto();
                model.addRow(rowData);          
        }   
    }
    
       
       
           public void UpdateOffreHotel(){
               
             TableRowSorter<TableModel> rowSorter
            = new TableRowSorter<>(JtableOffreHotel.getModel());
            
            JtableOffreHotel.setRowSorter(rowSorter);
            //******************    
        
        DefaultTableModel model =(DefaultTableModel) JtableOffreHotel.getModel();
        OffreHotelDao odao = new OffreHotelDao();
        Object[] rowData = new Object[14];
        
        for(int i=0;i<odao.AfficherOffreHotel().size();i++){
         
            rowData[0] = odao.AfficherOffreHotel().get(i).getIdHotel();
             rowData[1] = odao.AfficherOffreHotel().get(i).getReduction();
               rowData[2] = odao.AfficherOffreHotel().get(i).getNomHotel();
                rowData[3] = odao.AfficherOffreHotel().get(i).getVille();
                 rowData[4] = odao.AfficherOffreHotel().get(i).getDescription();
                  rowData[5] = odao.AfficherOffreHotel().get(i).getDate_Debut();
                   rowData[6] = odao.AfficherOffreHotel().get(i).getDate_Fin();
                    rowData[7] = odao.AfficherOffreHotel().get(i).getPrixPC();
                     rowData[8] = odao.AfficherOffreHotel().get(i).getPrixDP();
                      rowData[9] = odao.AfficherOffreHotel().get(i).getPrixLPD();
                       rowData[10] = odao.AfficherOffreHotel().get(i).getChambreType();
                        rowData[11] = odao.AfficherOffreHotel().get(i).getNBEtoiles();
                         rowData[12] = odao.AfficherOffreHotel().get(i).getDisponibiliter();
                model.addRow(rowData);          
        }
        
       jtfFilter.getDocument().addDocumentListener(new DocumentListener(){

            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = jtfFilter.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(javax.swing.RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = jtfFilter.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(javax.swing.RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        }); 
        
        
        
    }   
       
           
          void reset() {
        DefaultTableModel model =(DefaultTableModel) JtableOffreHotel.getModel();
            model.setRowCount(0);
        }     
           

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtableOffreHotel = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        JTextReduction = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextnomhotel = new javax.swing.JTextField();
        jTextville = new javax.swing.JTextField();
        jTextdescription = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jTextprixpc = new javax.swing.JTextField();
        jTextprixdp = new javax.swing.JTextField();
        jTextchambretype = new javax.swing.JTextField();
        jTextprixlpd = new javax.swing.JTextField();
        jTextnombretoiles = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextdisponibiliter = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        AjouterOffreHotel = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        JtableHotel1 = new javax.swing.JTable();
        Retour = new javax.swing.JButton();
        jtfFilter = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JtableOffreHotel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JtableOffreHotel.setFont(new java.awt.Font("Yu Gothic Medium", 2, 11)); // NOI18N
        JtableOffreHotel.setForeground(new java.awt.Color(0, 0, 204));
        JtableOffreHotel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Reduction", "NomHotel", "Ville", "Description", "DateDebut", "DateFin", "PrixPC", "PrixDP", "PrixLPd", "ChambreType", "NbrEtoiles", "Disponibiliter"
            }
        ));
        JtableOffreHotel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtableOffreHotelMouseClicked(evt);
            }
        });
        JtableOffreHotel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JtableOffreHotelKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(JtableOffreHotel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 950, 160));

        jLabel2.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("%");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 20, 20));

        JTextReduction.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        JTextReduction.setForeground(new java.awt.Color(0, 153, 0));
        JTextReduction.setText("25");
        JTextReduction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextReductionActionPerformed(evt);
            }
        });
        getContentPane().add(JTextReduction, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 155, 30, -1));

        jLabel3.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Search :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 130, 20));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Offre Hotel Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 3, 24), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(240, 240, 240));

        jLabel5.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        jLabel5.setText("Ville :");

        jLabel4.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        jLabel4.setText("Nom Hotel :");

        jLabel6.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        jLabel6.setText("Description :");

        jLabel7.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        jLabel7.setText("Date Debut :");

        jLabel8.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        jLabel8.setText("Date Fin :");

        jLabel9.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        jLabel9.setText("Prix DP :");

        jLabel11.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        jLabel11.setText("Prix LPD :");

        jLabel12.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        jLabel12.setText("Chambre Type :");

        jLabel13.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        jLabel13.setText("Prix PC :");

        jLabel14.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        jLabel14.setText("Nombre D'Etoiles :");

        jLabel15.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        jLabel15.setText("Disponibiliter :");

        jTextdisponibiliter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextdisponibiliterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextville, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextnomhotel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextdescription, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel9)
                        .addComponent(jLabel13)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextprixdp, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jTextdisponibiliter, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextprixpc, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15))
                            .addComponent(jTextprixlpd, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextchambretype, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextnombretoiles, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextchambretype, jTextnombretoiles, jTextprixdp, jTextprixlpd, jTextprixpc});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jTextchambretype, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextnomhotel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextville, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextdescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(jTextprixpc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jTextprixdp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextprixlpd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jTextdisponibiliter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jTextnombretoiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextchambretype, jTextnombretoiles, jTextprixdp, jTextprixlpd, jTextprixpc});

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 600, 250));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Button", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 18), new java.awt.Color(51, 0, 255)), "Buttons", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 36), new java.awt.Color(51, 0, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(240, 240, 240));

        AjouterOffreHotel.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        AjouterOffreHotel.setForeground(new java.awt.Color(51, 153, 255));
        AjouterOffreHotel.setText("Ajouter");
        AjouterOffreHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjouterOffreHotelActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 153, 255));
        jButton2.setText("Modifier");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 153, 255));
        jButton3.setText("Supprimer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(AjouterOffreHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(51, 51, 51))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AjouterOffreHotel, jButton2, jButton3});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(AjouterOffreHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AjouterOffreHotel, jButton2, jButton3});

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, 250, 230));
        jPanel2.getAccessibleContext().setAccessibleName("");

        JtableHotel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JtableHotel1.setFont(new java.awt.Font("Yu Gothic Medium", 2, 11)); // NOI18N
        JtableHotel1.setForeground(new java.awt.Color(0, 0, 204));
        JtableHotel1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NomHotel", "NBEtoiles", "Description", "Chambre", "Ville", "NBPlace", "PrixPC", "PrixDP", "PrixLPd", "Photo"
            }
        ));
        JtableHotel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtableHotel1MouseClicked(evt);
            }
        });
        JtableHotel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JtableHotel1KeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(JtableHotel1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 640, 120));

        Retour.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        Retour.setText("Retour");
        Retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetourActionPerformed(evt);
            }
        });
        getContentPane().add(Retour, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 610, 110, 30));

        jtfFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfFilterKeyReleased(evt);
            }
        });
        getContentPane().add(jtfFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 390, 140, 40));

        jLabel10.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Réduction :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 130, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Capture_Projet.PNG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1010, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTextReductionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextReductionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextReductionActionPerformed

    private void jTextdisponibiliterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextdisponibiliterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextdisponibiliterActionPerformed

    private void JtableOffreHotelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtableOffreHotelMouseClicked
        
        DefaultTableModel model =(DefaultTableModel) JtableOffreHotel.getModel();
        
        JTextReduction.setText(model.getValueAt(JtableOffreHotel.getSelectedRow(), 1).toString());
        jTextnomhotel.setText(model.getValueAt(JtableOffreHotel.getSelectedRow(), 2).toString());
        jTextville.setText(model.getValueAt(JtableOffreHotel.getSelectedRow(), 3).toString());
        jTextdescription.setText(model.getValueAt(JtableOffreHotel.getSelectedRow(), 4).toString());
        jDateChooser1.setDate((Date) model.getValueAt(JtableOffreHotel.getSelectedRow(),5));
        jDateChooser2.setDate((Date) model.getValueAt(JtableOffreHotel.getSelectedRow(),6));
        jTextprixpc.setText(model.getValueAt(JtableOffreHotel.getSelectedRow(), 7).toString());
        jTextprixdp.setText(model.getValueAt(JtableOffreHotel.getSelectedRow(), 8).toString());
        jTextprixlpd.setText(model.getValueAt(JtableOffreHotel.getSelectedRow(), 9).toString());
        jTextchambretype.setText(model.getValueAt(JtableOffreHotel.getSelectedRow(), 10).toString());
        jTextnombretoiles.setText(model.getValueAt(JtableOffreHotel.getSelectedRow(), 11).toString());
        jTextdisponibiliter.setText(model.getValueAt(JtableOffreHotel.getSelectedRow(), 12).toString());
    
        
    }//GEN-LAST:event_JtableOffreHotelMouseClicked

    private void AjouterOffreHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouterOffreHotelActionPerformed

        OffreHotel o1 = new OffreHotel();
        OffreHotelDao odao = new OffreHotelDao();
      
        
         java.sql.Date tanggalMulai = new java.sql.Date(jDateChooser1.getDate().getTime());
         java.sql.Date tanggalMulai2 = new java.sql.Date(jDateChooser2.getDate().getTime());
        
         Date aujourdhui = new Date();

        DefaultTableModel model =(DefaultTableModel) JtableOffreHotel.getModel();
        
        if(tanggalMulai.compareTo(aujourdhui)>0 )
        { 
            if(tanggalMulai.compareTo(tanggalMulai2)<0)
            {
                o1.setReduction(Integer.parseInt(JTextReduction.getText()));
                o1.setNomHotel(jTextnomhotel.getText());
                o1.setVille(jTextville.getText());
                o1.setDescription(jTextdescription.getText());
                o1.setDate_Debut(tanggalMulai);   
                o1.setDate_Fin(tanggalMulai2);
                o1.setPrixPC(Float.parseFloat(jTextprixpc.getText()));
                o1.setPrixDP(Float.parseFloat(jTextprixdp.getText()));
                o1.setPrixLPD(Float.parseFloat(jTextprixlpd.getText()));
                o1.setChambreType(jTextchambretype.getText());
                o1.setNBEtoiles(Integer.parseInt(jTextnombretoiles.getText()));
                o1.setDisponibiliter(Integer.parseInt(jTextdisponibiliter.getText()));

                odao.AjouterOffreHotel(o1);

                reset();
                UpdateOffreHotel();

                JOptionPane.showMessageDialog(rootPane, "Offre Hotel Ajouter");
            }else{JOptionPane.showMessageDialog(rootPane, "La 2éme Date Doit etre Apres La date Du Debut");}
        }else{JOptionPane.showMessageDialog(rootPane, "La Date Doit etre Apres La date D'Aujourdhui");}
    }//GEN-LAST:event_AjouterOffreHotelActionPerformed

    private void JtableHotel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtableHotel1MouseClicked
             DefaultTableModel model =(DefaultTableModel) JtableHotel1.getModel();
        
        jTextnomhotel.setText(model.getValueAt(JtableHotel1.getSelectedRow(), 0).toString());
        jTextnombretoiles.setText(model.getValueAt(JtableHotel1.getSelectedRow(), 1).toString());
        jTextdescription.setText(model.getValueAt(JtableHotel1.getSelectedRow(), 2).toString());
        jTextchambretype.setText(model.getValueAt(JtableHotel1.getSelectedRow(), 3).toString());
        jTextville.setText(model.getValueAt(JtableHotel1.getSelectedRow(), 4).toString());
        jTextdisponibiliter.setText(model.getValueAt(JtableHotel1.getSelectedRow(), 5).toString());
 

        int red = Integer.parseInt(JTextReduction.getText());
        
        int prixpc = (int) JtableHotel1.getModel().getValueAt(JtableHotel1.getSelectedRow(), 6);
        int prixdp = (int) JtableHotel1.getModel().getValueAt(JtableHotel1.getSelectedRow(), 7);
        int prixlpd = (int) JtableHotel1.getModel().getValueAt(JtableHotel1.getSelectedRow(), 8);
         
        float prixpcred = prixpc - (prixpc*red)/100 ;
        float prixdpred = prixdp -(prixdp*red)/100 ;
        float prixlpdred = prixlpd -(prixlpd*red)/100 ;
        
        String f1pcp = Float.toString(prixpcred);
        String f1pdp = Float.toString(prixdpred);
        String f1plpd = Float.toString(prixlpdred);
        
        
        jTextprixpc.setText(f1pcp);
        jTextprixdp.setText(f1pdp);
        jTextprixlpd.setText(f1plpd);
    }//GEN-LAST:event_JtableHotel1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        OffreHotel o1 = new OffreHotel();
        OffreHotelDao odao = new OffreHotelDao();
        DefaultTableModel model =(DefaultTableModel) JtableOffreHotel.getModel();
        

        if(JtableOffreHotel.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(null, "Veuillez séléctionner une Offre Hotel !!"
                ,"Message",JOptionPane.INFORMATION_MESSAGE);

        }
        else{
            
            odao.SupprimerOffreHotel((int) JtableOffreHotel.getValueAt(JtableOffreHotel.getSelectedRow(),0));
          model.removeRow(JtableOffreHotel.getSelectedRow());  
    } 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

           OffreHotel o1 = new OffreHotel();
        OffreHotelDao odao = new OffreHotelDao();
        
        //lMessage2.setText("" );
        DefaultTableModel model =(DefaultTableModel) JtableOffreHotel.getModel();
        
          java.sql.Date tanggalMulai = new java.sql.Date(jDateChooser1.getDate().getTime());
         java.sql.Date tanggalMulai2 = new java.sql.Date(jDateChooser2.getDate().getTime());

        if(JtableOffreHotel.getSelectedRow()== -1){
            
            JOptionPane.showMessageDialog(rootPane, "vous deviez selectioné");
            
        }else{
           
          
            
         o1.setReduction(Integer.parseInt(JTextReduction.getText()));
         o1.setNomHotel(jTextnomhotel.getText());
         o1.setVille(jTextville.getText());
         o1.setDescription(jTextdescription.getText());
         o1.setDate_Debut(tanggalMulai);   
         o1.setDate_Fin(tanggalMulai2);
         o1.setPrixPC(Float.parseFloat(jTextprixpc.getText()));
         o1.setPrixDP(Float.parseFloat(jTextprixdp.getText()));
         o1.setPrixLPD(Float.parseFloat(jTextprixlpd.getText()));
         o1.setChambreType(jTextchambretype.getText());
         o1.setNBEtoiles(Integer.parseInt(jTextnombretoiles.getText()));
         o1.setDisponibiliter(Integer.parseInt(jTextdisponibiliter.getText()));

            odao.ModifierOffreHotel(o1,(int) JtableOffreHotel.getValueAt(JtableOffreHotel.getSelectedRow(),0));

         reset();
         UpdateOffreHotel();
            
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void JtableOffreHotelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtableOffreHotelKeyPressed
          if(evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_UP )
        {
             DefaultTableModel model =(DefaultTableModel) JtableOffreHotel.getModel();
        
        JTextReduction.setText(model.getValueAt(JtableOffreHotel.getSelectedRow(), 1).toString());
        jTextnomhotel.setText(model.getValueAt(JtableOffreHotel.getSelectedRow(), 2).toString());
        jTextville.setText(model.getValueAt(JtableOffreHotel.getSelectedRow(), 3).toString());
        jTextdescription.setText(model.getValueAt(JtableOffreHotel.getSelectedRow(), 4).toString());
        jDateChooser1.setDate((Date) model.getValueAt(JtableOffreHotel.getSelectedRow(),5));
        jDateChooser2.setDate((Date) model.getValueAt(JtableOffreHotel.getSelectedRow(),6));
        jTextprixpc.setText(model.getValueAt(JtableOffreHotel.getSelectedRow(), 7).toString());
        jTextprixdp.setText(model.getValueAt(JtableOffreHotel.getSelectedRow(), 8).toString());
        jTextprixlpd.setText(model.getValueAt(JtableOffreHotel.getSelectedRow(), 9).toString());
        jTextchambretype.setText(model.getValueAt(JtableOffreHotel.getSelectedRow(), 10).toString());
        jTextnombretoiles.setText(model.getValueAt(JtableOffreHotel.getSelectedRow(), 11).toString());
        jTextdisponibiliter.setText(model.getValueAt(JtableOffreHotel.getSelectedRow(), 12).toString());
        }
    }//GEN-LAST:event_JtableOffreHotelKeyPressed

    private void JtableHotel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtableHotel1KeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_UP )
        {
             DefaultTableModel model =(DefaultTableModel) JtableHotel1.getModel();
        
         jTextnomhotel.setText(model.getValueAt(JtableHotel1.getSelectedRow(), 0).toString());
        jTextnombretoiles.setText(model.getValueAt(JtableHotel1.getSelectedRow(), 1).toString());
        jTextdescription.setText(model.getValueAt(JtableHotel1.getSelectedRow(), 2).toString());
        jTextchambretype.setText(model.getValueAt(JtableHotel1.getSelectedRow(), 3).toString());
        jTextville.setText(model.getValueAt(JtableHotel1.getSelectedRow(), 4).toString());
        jTextdisponibiliter.setText(model.getValueAt(JtableHotel1.getSelectedRow(), 5).toString());
 

        int red = Integer.parseInt(JTextReduction.getText());
        
        int prixpc = (int) JtableHotel1.getModel().getValueAt(JtableHotel1.getSelectedRow(), 6);
        int prixdp = (int) JtableHotel1.getModel().getValueAt(JtableHotel1.getSelectedRow(), 7);
        int prixlpd = (int) JtableHotel1.getModel().getValueAt(JtableHotel1.getSelectedRow(), 8);
         
        float prixpcred = prixpc - (prixpc*red)/100 ;
        float prixdpred = prixdp -(prixdp*red)/100 ;
        float prixlpdred = prixlpd -(prixlpd*red)/100 ;
        
        String f1pcp = Float.toString(prixpcred);
        String f1pdp = Float.toString(prixdpred);
        String f1plpd = Float.toString(prixlpdred);
        
        
        jTextprixpc.setText(f1pcp);
        jTextprixdp.setText(f1pdp);
        jTextprixlpd.setText(f1plpd);
        }
    }//GEN-LAST:event_JtableHotel1KeyPressed

    private void RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetourActionPerformed
        home_offre ac = new home_offre();
        ac.setVisible(true);
        this.hide();
    }//GEN-LAST:event_RetourActionPerformed

    private void jtfFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfFilterKeyReleased

        //nklnlnlmknlknklnlk
    }//GEN-LAST:event_jtfFilterKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OffreHotel_Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OffreHotel_Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OffreHotel_Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OffreHotel_Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OffreHotel_Gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AjouterOffreHotel;
    private javax.swing.JTextField JTextReduction;
    private javax.swing.JTable JtableHotel1;
    private javax.swing.JTable JtableOffreHotel;
    private javax.swing.JButton Retour;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextchambretype;
    private javax.swing.JTextField jTextdescription;
    private javax.swing.JTextField jTextdisponibiliter;
    private javax.swing.JTextField jTextnombretoiles;
    private javax.swing.JTextField jTextnomhotel;
    private javax.swing.JTextField jTextprixdp;
    private javax.swing.JTextField jTextprixlpd;
    private javax.swing.JTextField jTextprixpc;
    private javax.swing.JTextField jTextville;
    private javax.swing.JTextField jtfFilter;
    // End of variables declaration//GEN-END:variables
}
