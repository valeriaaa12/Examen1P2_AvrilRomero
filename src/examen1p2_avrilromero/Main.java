/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examen1p2_avrilromero;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author rodge
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    int xMouse;
    int yMouse;
    
    public Main() {
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

        Tabmain = new javax.swing.JTabbedPane();
        Jugadores = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        a1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bt_Agregar1 = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        edad = new javax.swing.JTextField();
        nacionalidad = new javax.swing.JTextField();
        pie = new javax.swing.JTextField();
        cb_equipos = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cb_tipo = new javax.swing.JComboBox<>();
        l1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listar1 = new javax.swing.JTextArea();
        e1 = new javax.swing.JPanel();
        cb_Jugadores = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        bt_eliminar1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        cb_mod1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        edadN = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        nacionN = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        pieN = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Equipos = new javax.swing.JPanel();
        Eliminar = new javax.swing.JTabbedPane();
        a2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nombre_equipo = new javax.swing.JTextField();
        pais = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        l2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        listarequipos = new javax.swing.JButton();
        e3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Estadios = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tabmain.setBackground(new java.awt.Color(0, 102, 102));

        Jugadores.setBackground(new java.awt.Color(204, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(204, 255, 255));

        a1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setText("Ingrese el nombre");

        jLabel3.setText("Ingrese el pie dominante");

        jLabel4.setText("Ingrese la edad");

        jLabel5.setText("Ingrese la nacionalidad");

        jLabel6.setText("Ingrese el equipo al que pertence");

        bt_Agregar1.setBackground(new java.awt.Color(0, 0, 102));
        bt_Agregar1.setText("Agregar");
        bt_Agregar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_Agregar1MouseClicked(evt);
            }
        });

        name.setBackground(new java.awt.Color(255, 255, 255));

        edad.setBackground(new java.awt.Color(255, 255, 255));

        nacionalidad.setBackground(new java.awt.Color(255, 255, 255));

        pie.setBackground(new java.awt.Color(255, 255, 255));

        cb_equipos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setText("Que quiere que sea?");

        cb_tipo.setBackground(new java.awt.Color(255, 255, 255));
        cb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Portero", "Defensa", "Mediocampista", "Delantero" }));

        javax.swing.GroupLayout a1Layout = new javax.swing.GroupLayout(a1);
        a1.setLayout(a1Layout);
        a1Layout.setHorizontalGroup(
            a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(a1Layout.createSequentialGroup()
                .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(a1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(edad, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(name)
                            .addComponent(nacionalidad, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(pie, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(cb_equipos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(a1Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(bt_Agregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        a1Layout.setVerticalGroup(
            a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(a1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cb_equipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(bt_Agregar1)
                .addGap(31, 31, 31))
        );

        jTabbedPane1.addTab("Agregar", a1);

        l1.setBackground(new java.awt.Color(204, 255, 255));

        jButton2.setText("Listar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        listar1.setColumns(20);
        listar1.setRows(5);
        jScrollPane2.setViewportView(listar1);

        javax.swing.GroupLayout l1Layout = new javax.swing.GroupLayout(l1);
        l1.setLayout(l1Layout);
        l1Layout.setHorizontalGroup(
            l1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(l1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        l1Layout.setVerticalGroup(
            l1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(l1Layout.createSequentialGroup()
                .addGroup(l1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(l1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(l1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Listar", l1);

        e1.setBackground(new java.awt.Color(204, 255, 255));

        cb_Jugadores.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Elija el jugador a eliminar");

        bt_eliminar1.setBackground(new java.awt.Color(0, 0, 153));
        bt_eliminar1.setText("Eliminar");
        bt_eliminar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_eliminar1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout e1Layout = new javax.swing.GroupLayout(e1);
        e1.setLayout(e1Layout);
        e1Layout.setHorizontalGroup(
            e1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(e1Layout.createSequentialGroup()
                .addGroup(e1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(e1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(cb_Jugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(e1Layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(e1Layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(bt_eliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        e1Layout.setVerticalGroup(
            e1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(e1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cb_Jugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(bt_eliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eliminar", e1);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel10.setText("Edad");

        jLabel11.setText("Nacionalidad");

        jLabel12.setText("Pie dominante");

        jButton3.setText("modificar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nacionN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(edadN)
                        .addComponent(cb_mod1, 0, 181, Short.MAX_VALUE))
                    .addComponent(pieN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(209, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(317, 317, 317))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(298, 298, 298))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(297, 297, 297))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(400, 400, 400))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(292, 292, 292))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(cb_mod1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edadN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(nacionN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(pieN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificar", jPanel1);

        javax.swing.GroupLayout JugadoresLayout = new javax.swing.GroupLayout(Jugadores);
        Jugadores.setLayout(JugadoresLayout);
        JugadoresLayout.setHorizontalGroup(
            JugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        JugadoresLayout.setVerticalGroup(
            JugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        Tabmain.addTab("Jugadores", Jugadores);

        Equipos.setBackground(new java.awt.Color(204, 255, 255));

        Eliminar.setBackground(new java.awt.Color(204, 255, 255));

        a2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel8.setText("Nombre");

        jLabel9.setText("Pais");

        jButton1.setText("Agregar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout a2Layout = new javax.swing.GroupLayout(a2);
        a2.setLayout(a2Layout);
        a2Layout.setHorizontalGroup(
            a2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(a2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(a2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre_equipo, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pais, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(435, Short.MAX_VALUE))
        );
        a2Layout.setVerticalGroup(
            a2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(a2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel8)
                .addGap(26, 26, 26)
                .addComponent(nombre_equipo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(pais, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton1)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        Eliminar.addTab("Agregar", a2);

        l2.setBackground(new java.awt.Color(204, 255, 255));

        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        listarequipos.setText("Listar");

        javax.swing.GroupLayout l2Layout = new javax.swing.GroupLayout(l2);
        l2.setLayout(l2Layout);
        l2Layout.setHorizontalGroup(
            l2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(l2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(listarequipos, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        l2Layout.setVerticalGroup(
            l2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(l2Layout.createSequentialGroup()
                .addGroup(l2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(l2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(l2Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(listarequipos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        Eliminar.addTab("Listar", l2);

        e3.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout e3Layout = new javax.swing.GroupLayout(e3);
        e3.setLayout(e3Layout);
        e3Layout.setHorizontalGroup(
            e3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 697, Short.MAX_VALUE)
        );
        e3Layout.setVerticalGroup(
            e3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
        );

        Eliminar.addTab("Eliminar", e3);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 697, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
        );

        Eliminar.addTab("Modificar", jPanel2);

        javax.swing.GroupLayout EquiposLayout = new javax.swing.GroupLayout(Equipos);
        Equipos.setLayout(EquiposLayout);
        EquiposLayout.setHorizontalGroup(
            EquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Eliminar)
        );
        EquiposLayout.setVerticalGroup(
            EquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Eliminar)
        );

        Tabmain.addTab("Equipos", Equipos);

        Estadios.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout EstadiosLayout = new javax.swing.GroupLayout(Estadios);
        Estadios.setLayout(EstadiosLayout);
        EstadiosLayout.setHorizontalGroup(
            EstadiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 697, Short.MAX_VALUE)
        );
        EstadiosLayout.setVerticalGroup(
            EstadiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );

        Tabmain.addTab("Estadios", Estadios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tabmain)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tabmain)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_Agregar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_Agregar1MouseClicked
        // TODO add your handling code here:

        if (equipos.isEmpty()) {
            JOptionPane.showInputDialog(this, "No hay equipos");
        } else {
            
            String nombre = name.getText();
            int age = Integer.parseInt(edad.getText());
            String n1 = nacionalidad.getText();
            String dominante = pie.getText();
            Equipo z = (Equipo) cb_equipos.getSelectedItem();
            String tipo = cb_tipo.getSelectedItem().toString();
            if (tipo == "Portero") {
                Portero j1 = new Portero(nombre, age, n1, dominante, z);
                z.getJugadores().add(j1);
                jugadores.add(j1);
            }
            if (tipo == "Delantero") {
                Delantero j2 = new Delantero(nombre, age, n1, dominante, z);
                z.getJugadores().add(j2);
                jugadores.add(j2);
            }
            if (tipo == "Mediocampista") {
                Mediocampista j3 = new Mediocampista(nombre, age, n1, dominante, z);
                z.getJugadores().add(j3);
                jugadores.add(j3);
            }
            if (tipo == "Defensa") {
                Defensa j4 = new Defensa(nombre, age, n1, dominante, z);
                z.getJugadores().add(j4);
                jugadores.add(j4);
            }
            DefaultComboBoxModel cb = (DefaultComboBoxModel) cb_Jugadores.getModel();
            cb.removeAllElements();
            for (Jugador equipo : jugadores) {
                cb.addElement(equipo);
            }
            cb_Jugadores.setModel(cb);
            cb_mod1.setModel(cb);
            DefaultComboBoxModel cb1 = (DefaultComboBoxModel) cb_Jugadores.getModel();
            cb.removeAllElements();
            for (Jugador equipo : jugadores) {
                cb1.addElement(equipo);
            }
            cb_Jugadores.setModel(cb1);
            JOptionPane.showMessageDialog(this, "Agregado exitosamente!");
            name.setText("");
            edad.setText("");
            nacionalidad.setText("");
            pie.setText("");
        }

    }//GEN-LAST:event_bt_Agregar1MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String nombre = nombre_equipo.getText();
        String pais1 = pais.getText();
        Equipo e1 = new Equipo(nombre, pais1);
        equipos.add(e1);
        DefaultComboBoxModel cb = (DefaultComboBoxModel) cb_equipos.getModel();
        cb.removeAllElements();
        for (Equipo equipo : equipos) {
            cb.addElement(equipo);
        }
        cb_equipos.setModel(cb);
        JOptionPane.showMessageDialog(this, "Agregado exitosamente!");
        nombre_equipo.setText("");
        pais.setText("");
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        String x = "";
        for (Jugador jugadore : jugadores) {
            x += jugadore.toString();
        }
        listar1.setText(x);
    }//GEN-LAST:event_jButton2MouseClicked

    private void bt_eliminar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_eliminar1MouseClicked
        // TODO add your handling code here:
        DefaultComboBoxModel cb = (DefaultComboBoxModel) cb_Jugadores.getModel();
        cb.removeAllElements();
        for (Jugador equipo : jugadores) {
            if (equipo.equals(cb_Jugadores.getSelectedItem())) {
                cb.removeElement(equipo);
                jugadores.remove(equipo);
            }
        }
        cb_Jugadores.setModel(cb);
        cb_mod1.setModel(cb);
    }//GEN-LAST:event_bt_eliminar1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        jugadores.get(cb_mod1.getSelectedIndex()).setEdad(Integer.parseInt(edadN.getText()));
        jugadores.get(cb_mod1.getSelectedIndex()).setNacionalidad(nacionN.getText());
        jugadores.get(cb_mod1.getSelectedIndex()).setPie(pieN.getText());
    }//GEN-LAST:event_jButton3MouseClicked

    /**
     * @param args the command line arguments
     */
    private void headerMouseDragged(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
        
    }
    
    private void headerMousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
        
    }
    ArrayList<Jugador> jugadores = new ArrayList();
    ArrayList<Equipo> equipos = new ArrayList();
    
    public void ratingequipos(Equipo e1, Equipo e2) {
        int diferencia;
        int probabilidad = 1;
        if (e1.getRating() > e2.getRating()) {
            diferencia = e1.getRating() - e2.getRating();
        } else {
            diferencia = e2.getRating() - e1.getRating();
        }
        if (diferencia <= 10) {
            probabilidad = diferencia * 4;
            JOptionPane.showMessageDialog(this, "La probabilidad de ganar del equipo menor: " + probabilidad);
        } else {
            probabilidad = diferencia * 5;
            JOptionPane.showMessageDialog(this, "La probabilidad de ganar del equipo mayor: " + probabilidad);
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Eliminar;
    private javax.swing.JPanel Equipos;
    private javax.swing.JPanel Estadios;
    private javax.swing.JPanel Jugadores;
    private javax.swing.JTabbedPane Tabmain;
    private javax.swing.JPanel a1;
    private javax.swing.JPanel a2;
    private javax.swing.JButton bt_Agregar1;
    private javax.swing.JButton bt_eliminar1;
    private javax.swing.JComboBox<String> cb_Jugadores;
    private javax.swing.JComboBox<String> cb_equipos;
    private javax.swing.JComboBox<String> cb_mod1;
    private javax.swing.JComboBox<String> cb_tipo;
    private javax.swing.JPanel e1;
    private javax.swing.JPanel e3;
    private javax.swing.JTextField edad;
    private javax.swing.JTextField edadN;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel l1;
    private javax.swing.JPanel l2;
    private javax.swing.JTextArea listar1;
    private javax.swing.JButton listarequipos;
    private javax.swing.JTextField nacionN;
    private javax.swing.JTextField nacionalidad;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nombre_equipo;
    private javax.swing.JTextField pais;
    private javax.swing.JTextField pie;
    private javax.swing.JTextField pieN;
    // End of variables declaration//GEN-END:variables
}
