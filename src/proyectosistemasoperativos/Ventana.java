package proyectosistemasoperativos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame implements ActionListener {

    int pag[] = new int[15];
    int Mostrar[][] = new int[4][2];
    int hasta = 0;
    int siz = 0;
    int cuad = 0;
    int cup = 2, cug = 1, incre = 0;
    ArrayList<String> Creo = new ArrayList<String>();
    int posicion = 0;
    JButton BRandom, BInicio, BSiguiente;
    JTextField TexTamaño, TexNumeroProc, Tex3;
    JLabel EtiqTitulo, EtiqTamaño, EtiqMB, EtiqNumeroProc, LabelImagenFondo, LabelImagenCuadrosPrin,
            ls1, ls2, ls3, ls4, ls5, ls6, ls7, ls8, ls9, ls10, ls11, ls12,
            l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21,
            l22, l23, l24, l25, l26, l27, l28, l29, l30, l31, l32, l33, l34, l35, l36, l37,
            l38, l39, l40, l41, l42, l43, l44, l45, l46, l47, l48, l49,
            l1, l50, l51, l52, l53, l54, l55, l56, l57, l58, l59, l60, l61, l62,
            l63, l64, l65, l66, l67, l68, l69, l70, l71, l72, l73, l74, l75, l76, l77, l78,
            l79, l80, l81, l82, l83, l84, l85, l86, l87, l88, l89, l90;
    JPanel Panl1, Panl2, Panl3, Panl4, PanlMensaje,
            ps1, ps2, ps3, ps4, ps5, ps6, ps7, ps8, ps9, ps10, ps11, ps12,
            p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21,
            p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37,
            p38, p39, p40, p41, p42, p43, p44, p45, p46, p47, p48, p49,
            p1, p50, p51, p52, p53, p54, p55, p56, p57, p58, p59, p60, p61, p62,
            p63, p64, p65, p66, p67, p68, p69, p70, p71, p72, p73, p74, p75, p76, p77, p78,
            p79, p80, p81, p82, p83, p84, p85, p86, p87, p88, p89, p90;
    boolean[] Verificacion = new boolean[1];
    JLabel MatrizImagenCuadros[][] = new JLabel[1][12];
    JLabel MatrizImagenCuadros2[][] = new JLabel[1][12];

    public Ventana() {
        setSize(1000, 650);
        //setExtendedState(MAXIMIZED_BOTH);
        setTitle("ALGORITMO DE RELOJ");
        setBackground(Color.cyan);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        setLocationRelativeTo(null);
        setResizable(false);
        Image icon = new ImageIcon(getClass().getResource("/Imagenes/Reloj.png")).getImage();
        setIconImage(icon);
        setLayout(null);

        Panl1 = new JPanel();
        Panl1.setBackground(Color.red);
        Panl1.setLayout(null);
        Panl2 = new JPanel();
        Panl2.setBackground(Color.BLUE);
        Panl2.setLayout(null);
        Panl2.setOpaque(false);
        Panl3 = new JPanel();
        Panl3.setBackground(Color.red);
        Panl3.setLayout(null);
        Panl3.setOpaque(false);
        Panl4 = new JPanel();
        Panl4.setBackground(Color.red);
        Panl4.setLayout(null);
        Panl4.setOpaque(false);

        //--------------Creador de Paneles Superiores----------------------
        ps1 = new JPanel();
        ps1.setOpaque(false);
        ps1.setLayout(null);
        ps2 = new JPanel();
        ps2.setOpaque(false);
        ps2.setLayout(null);
        ps3 = new JPanel();
        ps3.setOpaque(false);
        ps3.setLayout(null);
        ps4 = new JPanel();
        ps4.setOpaque(false);
        ps4.setLayout(null);
        ps5 = new JPanel();
        ps5.setOpaque(false);
        ps5.setLayout(null);
        ps6 = new JPanel();
        ps6.setOpaque(false);
        ps6.setLayout(null);
        ps7 = new JPanel();
        ps7.setOpaque(false);
        ps7.setLayout(null);
        ps8 = new JPanel();
        ps8.setOpaque(false);
        ps8.setLayout(null);
        ps9 = new JPanel();
        ps9.setOpaque(false);
        ps9.setLayout(null);
        ps10 = new JPanel();
        ps10.setOpaque(false);
        ps10.setLayout(null);
        ps11 = new JPanel();
        ps11.setOpaque(false);
        ps11.setLayout(null);
        ps12 = new JPanel();
        ps12.setOpaque(false);
        ps12.setLayout(null);
        //------------------------------------------------------------

        //----------------------Creador de label Superiores-----------
        ls1 = new JLabel();
        ls2 = new JLabel();
        ls3 = new JLabel();
        ls4 = new JLabel();
        ls5 = new JLabel();
        ls6 = new JLabel();
        ls7 = new JLabel();
        ls8 = new JLabel();
        ls9 = new JLabel();
        ls10 = new JLabel();
        ls11 = new JLabel();
        ls12 = new JLabel();
        //----------------------------------------------------------------

        //--------------Creador de paneles Cuadros Grandes------------------
        p1 = new JPanel();
        p1.setOpaque(false);
        p1.setLayout(null);
        p50 = new JPanel();
        p50.setOpaque(false);
        p50.setLayout(null);
        p51 = new JPanel();
        p51.setOpaque(false);
        p51.setLayout(null);
        p52 = new JPanel();
        p52.setOpaque(false);
        p52.setLayout(null);
        p53 = new JPanel();
        p53.setOpaque(false);
        p53.setLayout(null);
        p54 = new JPanel();
        p54.setOpaque(false);
        p54.setLayout(null);
        p55 = new JPanel();
        p55.setOpaque(false);
        p55.setLayout(null);
        p56 = new JPanel();
        p56.setOpaque(false);
        p56.setLayout(null);
        p57 = new JPanel();
        p57.setOpaque(false);
        p57.setLayout(null);
        p58 = new JPanel();
        p58.setOpaque(false);
        p58.setLayout(null);
        p59 = new JPanel();
        p59.setOpaque(false);
        p59.setLayout(null);
        p60 = new JPanel();
        p60.setOpaque(false);
        p60.setLayout(null);
        p61 = new JPanel();
        p61.setOpaque(false);
        p61.setLayout(null);
        p62 = new JPanel();
        p62.setOpaque(false);
        p62.setLayout(null);
        p63 = new JPanel();
        p63.setOpaque(false);
        p63.setLayout(null);
        p64 = new JPanel();
        p64.setOpaque(false);
        p64.setLayout(null);
        p65 = new JPanel();
        p65.setOpaque(false);
        p65.setLayout(null);
        p66 = new JPanel();
        p66.setOpaque(false);
        p66.setLayout(null);
        p67 = new JPanel();
        p67.setOpaque(false);
        p67.setLayout(null);
        p68 = new JPanel();
        p68.setOpaque(false);
        p68.setLayout(null);
        p69 = new JPanel();
        p69.setOpaque(false);
        p69.setLayout(null);
        p70 = new JPanel();
        p70.setOpaque(false);
        p70.setLayout(null);
        p71 = new JPanel();
        p71.setOpaque(false);
        p71.setLayout(null);
        p72 = new JPanel();
        p72.setOpaque(false);
        p72.setLayout(null);
        p73 = new JPanel();
        p73.setOpaque(false);
        p73.setLayout(null);
        p74 = new JPanel();
        p74.setOpaque(false);
        p74.setLayout(null);
        p75 = new JPanel();
        p75.setOpaque(false);
        p75.setLayout(null);
        p76 = new JPanel();
        p76.setOpaque(false);
        p76.setLayout(null);
        p77 = new JPanel();
        p77.setOpaque(false);
        p77.setLayout(null);
        p78 = new JPanel();
        p78.setOpaque(false);
        p78.setLayout(null);
        p79 = new JPanel();
        p79.setOpaque(false);
        p79.setLayout(null);
        p80 = new JPanel();
        p80.setOpaque(false);
        p80.setLayout(null);
        p81 = new JPanel();
        p81.setOpaque(false);
        p81.setLayout(null);
        p82 = new JPanel();
        p82.setOpaque(false);
        p82.setLayout(null);
        p83 = new JPanel();
        p83.setOpaque(false);
        p83.setLayout(null);
        p84 = new JPanel();
        p84.setOpaque(false);
        p84.setLayout(null);
        p85 = new JPanel();
        p85.setOpaque(false);
        p85.setLayout(null);
        p86 = new JPanel();
        p86.setOpaque(false);
        p86.setLayout(null);
        p87 = new JPanel();
        p87.setOpaque(false);
        p87.setLayout(null);
        p88 = new JPanel();
        p88.setOpaque(false);
        p88.setLayout(null);
        p89 = new JPanel();
        p89.setOpaque(false);
        p89.setLayout(null);
        p90 = new JPanel();
        p90.setOpaque(false);
        p90.setLayout(null);
        //------------------------------------------------------------------

        //--------------------Creador de Label Cuadros Grandes---------------
        l1 = new JLabel();
        l50 = new JLabel();
        l51 = new JLabel();
        l52 = new JLabel();
        l53 = new JLabel();
        l54 = new JLabel();
        l55 = new JLabel();
        l56 = new JLabel();
        l57 = new JLabel();
        l58 = new JLabel();
        l59 = new JLabel();
        l60 = new JLabel();
        l61 = new JLabel();
        l62 = new JLabel();
        l63 = new JLabel();
        l64 = new JLabel();
        l65 = new JLabel();
        l66 = new JLabel();
        l67 = new JLabel();
        l68 = new JLabel();
        l69 = new JLabel();
        l70 = new JLabel();
        l71 = new JLabel();
        l72 = new JLabel();
        l73 = new JLabel();
        l74 = new JLabel();
        l75 = new JLabel();
        l76 = new JLabel();
        l77 = new JLabel();
        l78 = new JLabel();
        l79 = new JLabel();
        l80 = new JLabel();
        l81 = new JLabel();
        l82 = new JLabel();
        l83 = new JLabel();
        l84 = new JLabel();
        l85 = new JLabel();
        l86 = new JLabel();
        l87 = new JLabel();
        l88 = new JLabel();
        l89 = new JLabel();
        l90 = new JLabel();
        //-------------------------------------------------------------------

        //--------------Creador de paneles Cuadros Pequeños-----------------
        p2 = new JPanel();
        p2.setOpaque(false);
        p2.setLayout(null);
        p3 = new JPanel();
        p3.setOpaque(false);
        p3.setLayout(null);
        p4 = new JPanel();
        p4.setOpaque(false);
        p4.setLayout(null);
        p5 = new JPanel();
        p5.setOpaque(false);
        p5.setLayout(null);
        p6 = new JPanel();
        p6.setOpaque(false);
        p6.setLayout(null);
        p7 = new JPanel();
        p7.setOpaque(false);
        p7.setLayout(null);
        p8 = new JPanel();
        p8.setOpaque(false);
        p8.setLayout(null);
        p9 = new JPanel();
        p9.setOpaque(false);
        p9.setLayout(null);
        p10 = new JPanel();
        p10.setOpaque(false);
        p10.setLayout(null);
        p11 = new JPanel();
        p11.setOpaque(false);
        p11.setLayout(null);
        p12 = new JPanel();
        p12.setOpaque(false);
        p12.setLayout(null);
        p13 = new JPanel();
        p13.setOpaque(false);
        p13.setLayout(null);
        p14 = new JPanel();
        p14.setOpaque(false);
        p14.setLayout(null);
        p15 = new JPanel();
        p15.setOpaque(false);
        p15.setLayout(null);
        p16 = new JPanel();
        p16.setOpaque(false);
        p16.setLayout(null);
        p17 = new JPanel();
        p17.setOpaque(false);
        p17.setLayout(null);
        p18 = new JPanel();
        p18.setOpaque(false);
        p18.setLayout(null);
        p19 = new JPanel();
        p19.setOpaque(false);
        p19.setLayout(null);
        p20 = new JPanel();
        p20.setOpaque(false);
        p20.setLayout(null);
        p21 = new JPanel();
        p21.setOpaque(false);
        p21.setLayout(null);
        p22 = new JPanel();
        p22.setOpaque(false);
        p22.setLayout(null);
        p23 = new JPanel();
        p23.setOpaque(false);
        p23.setLayout(null);
        p24 = new JPanel();
        p24.setOpaque(false);
        p24.setLayout(null);
        p25 = new JPanel();
        p25.setOpaque(false);
        p25.setLayout(null);
        p26 = new JPanel();
        p26.setOpaque(false);
        p26.setLayout(null);
        p27 = new JPanel();
        p27.setOpaque(false);
        p27.setLayout(null);
        p28 = new JPanel();
        p28.setOpaque(false);
        p28.setLayout(null);
        p29 = new JPanel();
        p29.setOpaque(false);
        p29.setLayout(null);
        p30 = new JPanel();
        p30.setOpaque(false);
        p30.setLayout(null);
        p31 = new JPanel();
        p31.setOpaque(false);
        p31.setLayout(null);
        p32 = new JPanel();
        p32.setOpaque(false);
        p32.setLayout(null);
        p33 = new JPanel();
        p33.setOpaque(false);
        p33.setLayout(null);
        p34 = new JPanel();
        p34.setOpaque(false);
        p34.setLayout(null);
        p35 = new JPanel();
        p35.setOpaque(false);
        p35.setLayout(null);
        p36 = new JPanel();
        p36.setOpaque(false);
        p36.setLayout(null);
        p37 = new JPanel();
        p37.setOpaque(false);
        p37.setLayout(null);
        p38 = new JPanel();
        p38.setOpaque(false);
        p38.setLayout(null);
        p39 = new JPanel();
        p39.setOpaque(false);
        p39.setLayout(null);
        p40 = new JPanel();
        p40.setOpaque(false);
        p40.setLayout(null);
        p41 = new JPanel();
        p41.setOpaque(false);
        p41.setLayout(null);
        p42 = new JPanel();
        p42.setOpaque(false);
        p42.setLayout(null);
        p43 = new JPanel();
        p43.setOpaque(false);
        p43.setLayout(null);
        p44 = new JPanel();
        p44.setOpaque(false);
        p44.setLayout(null);
        p45 = new JPanel();
        p45.setOpaque(false);
        p45.setLayout(null);
        p46 = new JPanel();
        p46.setOpaque(false);
        p46.setLayout(null);
        p47 = new JPanel();
        p47.setOpaque(false);
        p47.setLayout(null);
        p48 = new JPanel();
        p48.setOpaque(false);
        p48.setLayout(null);
        p49 = new JPanel();
        p49.setOpaque(false);
        p49.setLayout(null);
        //-------------------------------------------------------------

        //----------------------Creador de Label Cuadros Pequeños------------
        l2 = new JLabel();
        l3 = new JLabel();
        l4 = new JLabel();
        l5 = new JLabel();
        l6 = new JLabel();
        l7 = new JLabel();
        l8 = new JLabel();
        l9 = new JLabel();
        l10 = new JLabel();
        l11 = new JLabel();
        l12 = new JLabel();
        l13 = new JLabel();
        l14 = new JLabel();
        l15 = new JLabel();
        l16 = new JLabel();
        l17 = new JLabel();
        l18 = new JLabel();
        l19 = new JLabel();
        l20 = new JLabel();
        l21 = new JLabel();
        l22 = new JLabel();
        l23 = new JLabel();
        l24 = new JLabel();
        l25 = new JLabel();
        l26 = new JLabel();
        l27 = new JLabel();
        l28 = new JLabel();
        l29 = new JLabel();
        l30 = new JLabel();
        l31 = new JLabel();
        l32 = new JLabel();
        l33 = new JLabel();
        l34 = new JLabel();
        l35 = new JLabel();
        l36 = new JLabel();
        l37 = new JLabel();
        l38 = new JLabel();
        l39 = new JLabel();
        l40 = new JLabel();
        l41 = new JLabel();
        l42 = new JLabel();
        l43 = new JLabel();
        l44 = new JLabel();
        l45 = new JLabel();
        l46 = new JLabel();
        l47 = new JLabel();
        l48 = new JLabel();
        l49 = new JLabel();
        //------------------------------------------------------------

        for (int i = 0; i < MatrizImagenCuadros.length; i++) {
            for (int j = 0; j < MatrizImagenCuadros[i].length; j++) {
                ImageIcon ImagenMatriz = new ImageIcon(getClass().getResource("/Imagenes/Cuadros.png"));
                Image Imagenma = ImagenMatriz.getImage();
                Image Iconoma = Imagenma.getScaledInstance(40, 200, java.awt.Image.SCALE_SMOOTH);
                ImageIcon Perfilma = new ImageIcon(Iconoma);
                MatrizImagenCuadros[i][j] = new JLabel(Perfilma);
                //LabelImagenFondo.setIcon(Perfilrf);
                MatrizImagenCuadros[i][j].setBounds(j * 67, 100, 40, 200);
                Panl2.add(MatrizImagenCuadros[i][j]);
            }
        }
        for (int i = 0; i < MatrizImagenCuadros2.length; i++) {
            for (int j = 0; j < MatrizImagenCuadros2[i].length; j++) {
                ImageIcon ImagenMatriz2 = new ImageIcon(getClass().getResource("/Imagenes/CuadrosP.png"));
                Image Imagenma2 = ImagenMatriz2.getImage();
                Image Iconoma2 = Imagenma2.getScaledInstance(30, 170, java.awt.Image.SCALE_SMOOTH);
                ImageIcon Perfilma2 = new ImageIcon(Iconoma2);
                MatrizImagenCuadros2[i][j] = new JLabel(Perfilma2);
                //LabelImagenFondo.setIcon(Perfilrf);
                MatrizImagenCuadros2[i][j].setBounds(j * 67, 18, 30, 170);
                Panl3.add(MatrizImagenCuadros2[i][j]);
            }
        }

        LabelImagenFondo = new JLabel();
        ImageIcon ImagenRelojFondo = new ImageIcon(getClass().getResource("/Imagenes/RelojFondo1.jpg"));
        Image Imagenrf = ImagenRelojFondo.getImage();
        Image Iconorf = Imagenrf.getScaledInstance(1000, 650, java.awt.Image.SCALE_SMOOTH);
        ImageIcon Perfilrf = new ImageIcon(Iconorf);
        LabelImagenFondo.setIcon(Perfilrf);

        LabelImagenCuadrosPrin = new JLabel();
        ImageIcon ImagenRelojCuadrosPrin = new ImageIcon(getClass().getResource("/Imagenes/CuadroPrin.png"));
        Image ImagenrCP = ImagenRelojCuadrosPrin.getImage();
        Image IconorCP = ImagenrCP.getScaledInstance(600, 50, java.awt.Image.SCALE_SMOOTH);
        ImageIcon PerfilrCP = new ImageIcon(IconorCP);
        LabelImagenCuadrosPrin.setIcon(PerfilrCP);

        EtiqTitulo = new JLabel("Algoritmo de Reloj");
        EtiqTitulo.setFont(new Font("Dinarjev Republika", Font.BOLD, 40));
        EtiqTitulo.setForeground(new Color(240, 14, 68));
        EtiqTamaño = new JLabel("Tamaño RAM:");
        EtiqTamaño.setFont(new Font("Ravie", Font.BOLD, 20));
        EtiqTamaño.setForeground(new Color(240, 14, 68));
        EtiqNumeroProc = new JLabel("N° Procesos:");
        EtiqNumeroProc.setFont(new Font("Ravie", Font.BOLD, 20));
        EtiqNumeroProc.setForeground(new Color(240, 14, 68));
        EtiqMB = new JLabel("MB");
        EtiqMB.setFont(new Font("Ravie", Font.BOLD, 20));
        EtiqMB.setForeground(new Color(240, 14, 68));

        TexTamaño = new JTextField();
        TexNumeroProc = new JTextField("      16");
        TexNumeroProc.setFont(new Font("Dinarjev Republika", Font.BOLD, 20));
        TexNumeroProc.setEnabled(false);

        BRandom = new JButton("");
        BRandom.setEnabled(false);
        BRandom.addActionListener(this);
        ImageIcon ImagenRambom = new ImageIcon(getClass().getResource("/Imagenes/Random.jpg"));
        Image Imagenr = ImagenRambom.getImage();
        Image Iconor = Imagenr.getScaledInstance(70, 50, java.awt.Image.SCALE_SMOOTH);
        ImageIcon Perfilr = new ImageIcon(Iconor);
        BRandom.setIcon(Perfilr);
        BInicio = new JButton("");
        //BInicio.setEnabled(false);
        BInicio.addActionListener(this);
        BInicio.setBorderPainted(false);
        BInicio.setContentAreaFilled(false);
        ImageIcon ImagenInicio = new ImageIcon(getClass().getResource("/Imagenes/Inicio.png"));
        Image Imageni = ImagenInicio.getImage();
        Image Iconoi = Imageni.getScaledInstance(140, 40, java.awt.Image.SCALE_SMOOTH);
        ImageIcon Perfili = new ImageIcon(Iconoi);
        BInicio.setIcon(Perfili);
        BSiguiente = new JButton("");
        BSiguiente.addActionListener(this);
        BSiguiente.setBorderPainted(false);
        BSiguiente.setContentAreaFilled(false);
        ImageIcon ImagenSiguiente = new ImageIcon(getClass().getResource("/Imagenes/Siguiente.png"));
        Image Imagens = ImagenSiguiente.getImage();
        Image Iconos = Imagens.getScaledInstance(160, 70, java.awt.Image.SCALE_SMOOTH);
        ImageIcon Perfils = new ImageIcon(Iconos);
        BSiguiente.setIcon(Perfils);
        BSiguiente.setEnabled(false);

        Panl1.setBounds(0, 0, 1000, 650);
        LabelImagenFondo.setBounds(0, 0, 1000, 650);
        Panl2.setBounds(100, 150, 810, 400);
        Panl3.setBounds(37, 100, 772, 200);
        Panl4.setBounds(0, 10, 600, 50);
        LabelImagenCuadrosPrin.setBounds(0, 0, 600, 50);
        EtiqTitulo.setBounds(300, 20, 600, 60);
        EtiqTamaño.setBounds(100, 90, 200, 30);
        EtiqMB.setBounds(420, 90, 100, 30);
        EtiqNumeroProc.setBounds(550, 90, 180, 30);
        TexTamaño.setBounds(310, 90, 100, 30);
        TexNumeroProc.setBounds(740, 90, 100, 30);
        BRandom.setBounds(720, 160, 70, 50);
        BInicio.setBounds(420, 525, 130, 40);
        BSiguiente.setBounds(600, 506, 160, 70);

        //-----------------Posiciones de Cuadros Superiores-----------
        ps1.setBounds(6, 8, 43, 32);
        ps2.setBounds(56, 8, 43, 32);
        ps3.setBounds(105, 8, 43, 32);
        ps4.setBounds(154, 8, 43, 32);
        ps5.setBounds(203, 8, 43, 32);
        ps6.setBounds(252, 8, 43, 32);
        ps7.setBounds(301, 8, 43, 32);
        ps8.setBounds(350, 8, 43, 32);
        ps9.setBounds(399, 8, 43, 32);
        ps10.setBounds(448, 8, 43, 32);
        ps11.setBounds(496, 8, 43, 32);
        ps12.setBounds(545, 8, 43, 32);
        //-------------------------------------------------------------------
        //---------------Posiciones de Cuadros Superiores Label-------------
        ls1.setBounds(0, 0, 43, 32);
        ls2.setBounds(0, 0, 43, 32);
        ls3.setBounds(0, 0, 43, 32);
        ls4.setBounds(0, 0, 43, 32);
        ls5.setBounds(0, 0, 43, 32);
        ls6.setBounds(0, 0, 43, 32);
        ls7.setBounds(0, 0, 43, 32);
        ls8.setBounds(0, 0, 43, 32);
        ls9.setBounds(0, 0, 43, 32);
        ls10.setBounds(0, 0, 43, 32);
        ls11.setBounds(0, 0, 43, 32);
        ls12.setBounds(0, 0, 43, 32);
        //----------------------------------------------------------

        //-----------------Posiciones Cuadros Grandes------------------
        p1.setBounds(4, 110, 30, 36);
        p50.setBounds(33, 10, 30, 36);
        p51.setBounds(33, 60, 30, 36);
        p52.setBounds(100, 10, 30, 36);
        p53.setBounds(100, 60, 30, 36);
        p54.setBounds(100, 110, 30, 36);
        p55.setBounds(167, 10, 30, 36);
        p56.setBounds(167, 60, 30, 36);
        p57.setBounds(167, 110, 30, 36);
        p58.setBounds(167, 158, 30, 36);
        p59.setBounds(234, 10, 30, 36);
        p60.setBounds(234, 60, 30, 36);
        p61.setBounds(234, 110, 30, 36);
        p62.setBounds(234, 158, 30, 36);
        p63.setBounds(301, 10, 30, 36);
        p64.setBounds(301, 60, 30, 36);
        p65.setBounds(301, 110, 30, 36);
        p66.setBounds(301, 158, 30, 36);
        p67.setBounds(368, 10, 30, 36);
        p68.setBounds(368, 60, 30, 36);
        p69.setBounds(368, 110, 30, 36);
        p70.setBounds(368, 158, 30, 36);
        p71.setBounds(435, 10, 30, 36);
        p72.setBounds(435, 60, 30, 36);
        p73.setBounds(435, 110, 30, 36);
        p74.setBounds(435, 158, 30, 36);
        p75.setBounds(502, 10, 30, 36);
        p76.setBounds(502, 60, 30, 36);
        p77.setBounds(502, 110, 30, 36);
        p78.setBounds(502, 158, 30, 36);
        p79.setBounds(569, 10, 30, 36);
        p80.setBounds(569, 60, 30, 36);
        p81.setBounds(569, 110, 30, 36);
        p82.setBounds(569, 158, 30, 36);
        p83.setBounds(636, 10, 30, 36);
        p84.setBounds(636, 60, 30, 36);
        p85.setBounds(636, 110, 30, 36);
        p86.setBounds(636, 158, 30, 36);
        p87.setBounds(703, 10, 30, 36);
        p88.setBounds(703, 60, 30, 36);
        p89.setBounds(703, 110, 30, 36);
        p90.setBounds(703, 158, 30, 36);
        //---------------------------------------------------------------

        //------------------Posiciones de Label, Cuadro Grandes-------------
        l1.setBounds(0, 0, 30, 36);
        l50.setBounds(0, 0, 30, 36);
        l51.setBounds(0, 0, 30, 36);
        l52.setBounds(0, 0, 30, 36);
        l53.setBounds(0, 0, 30, 36);
        l54.setBounds(0, 0, 30, 36);
        l55.setBounds(0, 0, 30, 36);
        l56.setBounds(0, 0, 30, 36);
        l57.setBounds(0, 0, 30, 36);
        l58.setBounds(0, 0, 30, 36);
        l59.setBounds(0, 0, 30, 36);
        l60.setBounds(0, 0, 30, 36);
        l61.setBounds(0, 0, 30, 36);
        l62.setBounds(0, 0, 30, 36);
        l63.setBounds(0, 0, 30, 36);
        l64.setBounds(0, 0, 30, 36);
        l65.setBounds(0, 0, 30, 36);
        l66.setBounds(0, 0, 30, 36);
        l67.setBounds(0, 0, 30, 36);
        l68.setBounds(0, 0, 30, 36);
        l69.setBounds(0, 0, 30, 36);
        l70.setBounds(0, 0, 30, 36);
        l71.setBounds(0, 0, 30, 36);
        l72.setBounds(0, 0, 30, 36);
        l73.setBounds(0, 0, 30, 36);
        l74.setBounds(0, 0, 30, 36);
        l75.setBounds(0, 0, 30, 36);
        l76.setBounds(0, 0, 30, 36);
        l77.setBounds(0, 0, 30, 36);
        l78.setBounds(0, 0, 30, 36);
        l79.setBounds(0, 0, 30, 36);
        l80.setBounds(0, 0, 30, 36);
        l81.setBounds(0, 0, 30, 36);
        l82.setBounds(0, 0, 30, 36);
        l83.setBounds(0, 0, 30, 36);
        l84.setBounds(0, 0, 30, 36);
        l85.setBounds(0, 0, 30, 36);
        l86.setBounds(0, 0, 30, 36);
        l87.setBounds(0, 0, 30, 36);
        l88.setBounds(0, 0, 30, 36);
        l89.setBounds(0, 0, 30, 36);
        l90.setBounds(0, 0, 30, 36);
        //-----------------------------------

        //-----------------Posiciones Cuadros Pequeños------------------
        p2.setBounds(5, 22, 20, 20);
        p3.setBounds(5, 68, 20, 20);
        p4.setBounds(5, 117, 20, 20);
        p5.setBounds(5, 163, 20, 20);
        p6.setBounds(71, 22, 20, 20);
        p7.setBounds(71, 68, 20, 20);
        p8.setBounds(71, 117, 20, 20);
        p9.setBounds(71, 163, 20, 20);
        p10.setBounds(138, 22, 20, 20);
        p11.setBounds(138, 68, 20, 20);
        p12.setBounds(138, 117, 20, 20);
        p13.setBounds(138, 163, 20, 20);
        p14.setBounds(205, 22, 20, 20);
        p15.setBounds(205, 68, 20, 20);
        p16.setBounds(205, 117, 20, 20);
        p17.setBounds(205, 163, 20, 20);
        p18.setBounds(272, 22, 20, 20);
        p19.setBounds(272, 68, 20, 20);
        p20.setBounds(272, 117, 20, 20);
        p21.setBounds(272, 163, 20, 20);
        p22.setBounds(339, 22, 20, 20);
        p23.setBounds(339, 68, 20, 20);
        p24.setBounds(339, 117, 20, 20);
        p25.setBounds(339, 163, 20, 20);
        p26.setBounds(406, 22, 20, 20);
        p27.setBounds(406, 68, 20, 20);
        p28.setBounds(406, 117, 20, 20);
        p29.setBounds(406, 163, 20, 20);
        p30.setBounds(473, 22, 20, 20);
        p31.setBounds(473, 68, 20, 20);
        p32.setBounds(473, 117, 20, 20);
        p33.setBounds(473, 163, 20, 20);
        p34.setBounds(540, 22, 20, 20);
        p35.setBounds(540, 68, 20, 20);
        p36.setBounds(540, 117, 20, 20);
        p37.setBounds(540, 163, 20, 20);
        p38.setBounds(607, 22, 20, 20);
        p39.setBounds(607, 68, 20, 20);
        p40.setBounds(607, 117, 20, 20);
        p41.setBounds(607, 163, 20, 20);
        p42.setBounds(674, 22, 20, 20);
        p43.setBounds(674, 68, 20, 20);
        p44.setBounds(674, 117, 20, 20);
        p45.setBounds(674, 163, 20, 20);
        p46.setBounds(741, 22, 20, 20);
        p47.setBounds(741, 68, 20, 20);
        p48.setBounds(741, 117, 20, 20);
        p49.setBounds(741, 163, 20, 20);
        //-------------------------------------------------------------------

        //---------------------Posiciones de Label, Cuadros Pequeños--------
        l2.setBounds(0, 0, 20, 20);
        l3.setBounds(0, 0, 20, 20);
        l4.setBounds(0, 0, 20, 20);
        l5.setBounds(0, 0, 20, 20);
        l6.setBounds(0, 0, 20, 20);
        l7.setBounds(0, 0, 20, 20);
        l8.setBounds(0, 0, 20, 20);
        l9.setBounds(0, 0, 20, 20);
        l10.setBounds(0, 0, 20, 20);
        l11.setBounds(0, 0, 20, 20);
        l12.setBounds(0, 0, 20, 20);
        l13.setBounds(0, 0, 20, 20);
        l14.setBounds(0, 0, 20, 20);
        l15.setBounds(0, 0, 20, 20);
        l16.setBounds(0, 0, 20, 20);
        l17.setBounds(0, 0, 20, 20);
        l18.setBounds(0, 0, 20, 20);
        l19.setBounds(0, 0, 20, 20);
        l20.setBounds(0, 0, 20, 20);
        l21.setBounds(0, 0, 20, 20);
        l22.setBounds(0, 0, 20, 20);
        l23.setBounds(0, 0, 20, 20);
        l24.setBounds(0, 0, 20, 20);
        l25.setBounds(0, 0, 20, 20);
        l26.setBounds(0, 0, 20, 20);
        l27.setBounds(0, 0, 20, 20);
        l28.setBounds(0, 0, 20, 20);
        l29.setBounds(0, 0, 20, 20);
        l30.setBounds(0, 0, 20, 20);
        l31.setBounds(0, 0, 20, 20);
        l32.setBounds(0, 0, 20, 20);
        l33.setBounds(0, 0, 20, 20);
        l34.setBounds(0, 0, 20, 20);
        l35.setBounds(0, 0, 20, 20);
        l36.setBounds(0, 0, 20, 20);
        l37.setBounds(0, 0, 20, 20);
        l38.setBounds(0, 0, 20, 20);
        l39.setBounds(0, 0, 20, 20);
        l40.setBounds(0, 0, 20, 20);
        l41.setBounds(0, 0, 20, 20);
        l42.setBounds(0, 0, 20, 20);
        l43.setBounds(0, 0, 20, 20);
        l44.setBounds(0, 0, 20, 20);
        l45.setBounds(0, 0, 20, 20);
        l46.setBounds(0, 0, 20, 20);
        l47.setBounds(0, 0, 20, 20);
        l48.setBounds(0, 0, 20, 20);
        l49.setBounds(0, 0, 20, 20);
        //-----------------------------------

        add(Panl1);
        Panl1.add(LabelImagenFondo);
        LabelImagenFondo.add(Panl2);
        Panl2.add(Panl3);
        Panl2.add(Panl4);
        Panl4.add(LabelImagenCuadrosPrin);
        LabelImagenFondo.add(EtiqTitulo);
        LabelImagenFondo.add(EtiqTamaño);
        LabelImagenFondo.add(EtiqMB);
        LabelImagenFondo.add(EtiqNumeroProc);
        LabelImagenFondo.add(TexTamaño);
        LabelImagenFondo.add(TexNumeroProc);
        LabelImagenFondo.add(BRandom);
        LabelImagenFondo.add(BInicio);
        LabelImagenFondo.add(BSiguiente);

        //------------Mostrar Paneles Cuadros Grandes-----------
        Panl2.add(p1);
        Panl3.add(p50);
        Panl3.add(p51);
        Panl3.add(p52);
        Panl3.add(p53);
        Panl3.add(p54);
        Panl3.add(p55);
        Panl3.add(p56);
        Panl3.add(p57);
        Panl3.add(p58);
        Panl3.add(p59);
        Panl3.add(p60);
        Panl3.add(p61);
        Panl3.add(p62);
        Panl3.add(p63);
        Panl3.add(p64);
        Panl3.add(p65);
        Panl3.add(p66);
        Panl3.add(p67);
        Panl3.add(p68);
        Panl3.add(p69);
        Panl3.add(p70);
        Panl3.add(p71);
        Panl3.add(p72);
        Panl3.add(p73);
        Panl3.add(p74);
        Panl3.add(p75);
        Panl3.add(p76);
        Panl3.add(p77);
        Panl3.add(p78);
        Panl3.add(p79);
        Panl3.add(p80);
        Panl3.add(p81);
        Panl3.add(p82);
        Panl3.add(p83);
        Panl3.add(p84);
        Panl3.add(p85);
        Panl3.add(p86);
        Panl3.add(p87);
        Panl3.add(p88);
        Panl3.add(p89);
        Panl3.add(p90);
        //-----------------------------------------------------

        //--------------Mostrar Label de Cuadros Peuqueños----------
        p1.add(l1);
        p50.add(l50);
        p51.add(l51);
        p52.add(l52);
        p53.add(l53);
        p54.add(l54);
        p55.add(l55);
        p56.add(l56);
        p57.add(l57);
        p58.add(l58);
        p59.add(l59);
        p60.add(l60);
        p61.add(l61);
        p62.add(l62);
        p63.add(l63);
        p64.add(l64);
        p65.add(l65);
        p66.add(l66);
        p67.add(l67);
        p68.add(l68);
        p69.add(l69);
        p70.add(l70);
        p71.add(l71);
        p72.add(l72);
        p73.add(l73);
        p74.add(l74);
        p75.add(l75);
        p76.add(l76);
        p77.add(l77);
        p78.add(l78);
        p79.add(l79);
        p80.add(l80);
        p81.add(l81);
        p82.add(l82);
        p83.add(l83);
        p84.add(l84);
        p85.add(l85);
        p86.add(l86);
        p87.add(l87);
        p88.add(l88);
        p89.add(l89);
        p90.add(l90);
        //---------------------------------------------------------

        //------------Mostrar Paneles Cuadros Pequeños-----------
        Panl3.add(p2);
        Panl3.add(p3);
        Panl3.add(p4);
        Panl3.add(p5);
        Panl3.add(p6);
        Panl3.add(p7);
        Panl3.add(p8);
        Panl3.add(p9);
        Panl3.add(p10);
        Panl3.add(p11);
        Panl3.add(p12);
        Panl3.add(p13);
        Panl3.add(p14);
        Panl3.add(p15);
        Panl3.add(p16);
        Panl3.add(p17);
        Panl3.add(p18);
        Panl3.add(p19);
        Panl3.add(p20);
        Panl3.add(p21);
        Panl3.add(p22);
        Panl3.add(p23);
        Panl3.add(p24);
        Panl3.add(p25);
        Panl3.add(p26);
        Panl3.add(p27);
        Panl3.add(p28);
        Panl3.add(p29);
        Panl3.add(p30);
        Panl3.add(p31);
        Panl3.add(p32);
        Panl3.add(p33);
        Panl3.add(p34);
        Panl3.add(p35);
        Panl3.add(p36);
        Panl3.add(p37);
        Panl3.add(p38);
        Panl3.add(p39);
        Panl3.add(p40);
        Panl3.add(p41);
        Panl3.add(p42);
        Panl3.add(p43);
        Panl3.add(p44);
        Panl3.add(p45);
        Panl3.add(p46);
        Panl3.add(p47);
        Panl3.add(p48);
        Panl3.add(p49);
        //-----------------------------------------------------

        //-----------------Mostrar Label de cuadros Grandes--------------
        p2.add(l2);
        p3.add(l3);
        p4.add(l4);
        p5.add(l5);
        p6.add(l6);
        p7.add(l7);
        p8.add(l8);
        p9.add(l9);
        p10.add(l10);
        p11.add(l11);
        p12.add(l12);
        p13.add(l13);
        p14.add(l14);
        p15.add(l15);
        p16.add(l16);
        p17.add(l17);
        p18.add(l18);
        p19.add(l19);
        p20.add(l20);
        p21.add(l21);
        p22.add(l22);
        p23.add(l23);
        p24.add(l24);
        p25.add(l25);
        p26.add(l26);
        p27.add(l27);
        p28.add(l28);
        p29.add(l29);
        p30.add(l30);
        p31.add(l31);
        p32.add(l32);
        p33.add(l33);
        p34.add(l34);
        p35.add(l35);
        p36.add(l36);
        p37.add(l37);
        p38.add(l38);
        p39.add(l39);
        p40.add(l40);
        p41.add(l41);
        p42.add(l42);
        p43.add(l43);
        p44.add(l44);
        p45.add(l45);
        p46.add(l46);
        p47.add(l47);
        p48.add(l48);
        p49.add(l49);
        //-----------------------------------------------------------

        //-------------------Mostrar Paneles Superiores-------------------
        Panl4.add(ps1);
        Panl4.add(ps2);
        Panl4.add(ps3);
        Panl4.add(ps4);
        Panl4.add(ps5);
        Panl4.add(ps6);
        Panl4.add(ps7);
        Panl4.add(ps8);
        Panl4.add(ps9);
        Panl4.add(ps10);
        Panl4.add(ps11);
        Panl4.add(ps12);
        //----------------------------------------------------------
        //------------------Mostrar Labels Superiores en los paneles----------
        ps1.add(ls1);
        ps2.add(ls2);
        ps3.add(ls3);
        ps4.add(ls4);
        ps5.add(ls5);
        ps6.add(ls6);
        ps7.add(ls7);
        ps8.add(ls8);
        ps9.add(ls9);
        ps10.add(ls10);
        ps11.add(ls11);
        ps12.add(ls12);
        //-----------------------------------------------------------------

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Validaciones Vali = new Validaciones();
        try {
            if (e.getSource() == BInicio) {
                if (Vali.Validaciones_Numeros(TexTamaño.getText()) == true) {
                    Mensajes n = new Mensajes(1);
                } else {
                    Vali.Validar_Tamaño(TexTamaño.getText());
                }
                if (Vali.Validar_Numero_Adecuado(TexTamaño.getText()) == true) {
                    BRandom.setEnabled(true);
                    BInicio.setEnabled(false);
                }
            }
        } catch (Exception ex) {
        }
        if (e.getSource() == BRandom) {
            BSiguiente.setEnabled(true);
            Aleatorio();
            Generar();
            for (int i = 0; i < pag.length; i++) {
                switch (i) {
                    case 0:
                        Organizar(ls1, String.valueOf(pag[i]), ls1.getWidth(), ls1.getHeight());
                        break;
                    case 1:
                        Organizar(ls2, String.valueOf(pag[i]), ls12.getWidth(), ls2.getHeight());
                        break;
                    case 2:
                        Organizar(ls3, String.valueOf(pag[i]), ls3.getWidth(), ls3.getHeight());
                        break;
                    case 3:
                        Organizar(ls4, String.valueOf(pag[i]), ls4.getWidth(), ls4.getHeight());

                        break;
                    case 4:
                        Organizar(ls5, String.valueOf(pag[i]), ls5.getWidth(), ls5.getHeight());

                        break;
                    case 5:
                        Organizar(ls6, String.valueOf(pag[i]), ls6.getWidth(), ls6.getHeight());

                        break;
                    case 6:
                        Organizar(ls7, String.valueOf(pag[i]), ls7.getWidth(), ls7.getHeight());

                        break;
                    case 7:
                        Organizar(ls8, String.valueOf(pag[i]), ls8.getWidth(), ls8.getHeight());

                        break;
                    case 8:
                        Organizar(ls9, String.valueOf(pag[i]), ls9.getWidth(), ls9.getHeight());

                        break;
                    case 9:
                        Organizar(ls10, String.valueOf(pag[i]), ls10.getWidth(), ls10.getHeight());

                        break;
                    case 10:
                        Organizar(ls11, String.valueOf(pag[i]), ls11.getWidth(), ls11.getHeight());

                        break;
                    case 11:
                        Organizar(ls12, String.valueOf(pag[i]), ls12.getWidth(), ls12.getHeight());

                        break;

                }
            }
            BRandom.setEnabled(false);
        }
        if (e.getSource() == BSiguiente) {
            if (siz <= Creo.size()) {
                for (int i = cuad; i >= 0; i--) {
                    System.out.println(i);
                    switch (i) {
                        case 0:
                            Organizar(l1, Letra(0, 0), l1.getWidth(), l1.getHeight());
                            Organizar(l2, Letra(1, 0), l2.getWidth(), l2.getHeight());
                            Organizar(l3, "0", l2.getWidth(), l2.getHeight());
                            Organizar(l4, "0", l2.getWidth(), l2.getHeight());
                            Organizar(l5, "0", l2.getWidth(), l2.getHeight());
                            break;
                        case 1:
                            Organizar(l50, Letra(0, 1), l1.getWidth(), l1.getHeight());
                            Organizar(l6, Letra(1, 1), l2.getWidth(), l2.getHeight());
                            Organizar(l51, Letra(0, 2), l1.getWidth(), l1.getHeight());
                            Organizar(l7, Letra(1, 2), l2.getWidth(), l2.getHeight());
                            Organizar(l8, "0", l2.getWidth(), l2.getHeight());
                            Organizar(l9, "0", l2.getWidth(), l2.getHeight());

                            break;
                        case 2:
                            Organizar(l52, Letra(0, 3), l1.getWidth(), l1.getHeight());
                            Organizar(l10, Letra(1, 3), l2.getWidth(), l2.getHeight());
                            Organizar(l53, Letra(0, 4), l1.getWidth(), l1.getHeight());
                            Organizar(l11, Letra(1, 4), l2.getWidth(), l2.getHeight());
                            Organizar(l54, Letra(0, 5), l1.getWidth(), l1.getHeight());
                            Organizar(l12, Letra(1, 5), l2.getWidth(), l2.getHeight());
                            Organizar(l13, "0", l2.getWidth(), l2.getHeight());
                            break;
                        case 3:
                            Organizar(l55, Letra(0, 6), l1.getWidth(), l1.getHeight());
                            Organizar(l14, Letra(1, 6), l2.getWidth(), l2.getHeight());
                            Organizar(l56, Letra(0, 7), l1.getWidth(), l1.getHeight());
                            Organizar(l15, Letra(1, 7), l2.getWidth(), l2.getHeight());
                            Organizar(l57, Letra(0, 8), l1.getWidth(), l1.getHeight());
                            Organizar(l16, Letra(1, 8), l2.getWidth(), l2.getHeight());
                            Organizar(l58, Letra(0, 9), l2.getWidth(), l2.getHeight());
                            Organizar(l17, Letra(1, 9), l2.getWidth(), l2.getHeight());
                            break;
                        case 4:
                            Organizar(l59, Letra(0, 10), l1.getWidth(), l1.getHeight());
                            Organizar(l18, Letra(1, 10), l2.getWidth(), l2.getHeight());
                            Organizar(l60, Letra(0, 11), l1.getWidth(), l1.getHeight());
                            Organizar(l19, Letra(1, 11), l2.getWidth(), l2.getHeight());
                            Organizar(l61, Letra(0, 12), l1.getWidth(), l1.getHeight());
                            Organizar(l20, Letra(1, 12), l2.getWidth(), l2.getHeight());
                            Organizar(l62, Letra(0, 13), l2.getWidth(), l2.getHeight());
                            Organizar(l21, Letra(1, 13), l2.getWidth(), l2.getHeight());
                            break;
                        case 5:
                            Organizar(l63, Letra(0, 14), l1.getWidth(), l1.getHeight());
                            Organizar(l22, Letra(1, 14), l2.getWidth(), l2.getHeight());
                            Organizar(l64, Letra(0, 15), l1.getWidth(), l1.getHeight());
                            Organizar(l23, Letra(1, 15), l2.getWidth(), l2.getHeight());
                            Organizar(l65, Letra(0, 16), l1.getWidth(), l1.getHeight());
                            Organizar(l24, Letra(1, 16), l2.getWidth(), l2.getHeight());
                            Organizar(l66, Letra(0, 17), l2.getWidth(), l2.getHeight());
                            Organizar(l25, Letra(1, 17), l2.getWidth(), l2.getHeight());
                            break;
                        case 6:
                            Organizar(l67, Letra(0, 18), l1.getWidth(), l1.getHeight());
                            Organizar(l26, Letra(1, 18), l2.getWidth(), l2.getHeight());
                            Organizar(l68, Letra(0, 19), l1.getWidth(), l1.getHeight());
                            Organizar(l27, Letra(1, 19), l2.getWidth(), l2.getHeight());
                            Organizar(l69, Letra(0, 20), l1.getWidth(), l1.getHeight());
                            Organizar(l28, Letra(1, 20), l2.getWidth(), l2.getHeight());
                            Organizar(l70, Letra(0, 21), l2.getWidth(), l2.getHeight());
                            Organizar(l29, Letra(1, 21), l2.getWidth(), l2.getHeight());
                            break;
                        case 7:
                            Organizar(l71, Letra(0, 22), l1.getWidth(), l1.getHeight());
                            Organizar(l30, Letra(1, 22), l2.getWidth(), l2.getHeight());
                            Organizar(l72, Letra(0, 23), l1.getWidth(), l1.getHeight());
                            Organizar(l31, Letra(1, 23), l2.getWidth(), l2.getHeight());
                            Organizar(l73, Letra(0, 24), l1.getWidth(), l1.getHeight());
                            Organizar(l32, Letra(1, 24), l2.getWidth(), l2.getHeight());
                            Organizar(l74, Letra(0, 25), l2.getWidth(), l2.getHeight());
                            Organizar(l33, Letra(1, 25), l2.getWidth(), l2.getHeight());
                            break;
                        case 8:
                            Organizar(l75, Letra(0, 26), l1.getWidth(), l1.getHeight());
                            Organizar(l34, Letra(1, 26), l2.getWidth(), l2.getHeight());
                            Organizar(l76, Letra(0, 27), l1.getWidth(), l1.getHeight());
                            Organizar(l35, Letra(1, 27), l2.getWidth(), l2.getHeight());
                            Organizar(l77, Letra(0, 28), l1.getWidth(), l1.getHeight());
                            Organizar(l36, Letra(1, 28), l2.getWidth(), l2.getHeight());
                            Organizar(l78, Letra(0, 29), l2.getWidth(), l2.getHeight());
                            Organizar(l37, Letra(1, 29), l2.getWidth(), l2.getHeight());
                            break;
                        case 9:
                            Organizar(l79, Letra(0, 30), l1.getWidth(), l1.getHeight());
                            Organizar(l38, Letra(1, 30), l2.getWidth(), l2.getHeight());
                            Organizar(l80, Letra(0, 31), l1.getWidth(), l1.getHeight());
                            Organizar(l39, Letra(1, 31), l2.getWidth(), l2.getHeight());
                            Organizar(l81, Letra(0, 32), l1.getWidth(), l1.getHeight());
                            Organizar(l40, Letra(1, 32), l2.getWidth(), l2.getHeight());
                            Organizar(l82, Letra(0, 33), l2.getWidth(), l2.getHeight());
                            Organizar(l41, Letra(1, 33), l2.getWidth(), l2.getHeight());
                            break;
                        case 10:
                            Organizar(l83, Letra(0, 34), l1.getWidth(), l1.getHeight());
                            Organizar(l42, Letra(1, 34), l2.getWidth(), l2.getHeight());
                            Organizar(l84, Letra(0, 35), l1.getWidth(), l1.getHeight());
                            Organizar(l43, Letra(1, 35), l2.getWidth(), l2.getHeight());
                            Organizar(l85, Letra(0, 36), l1.getWidth(), l1.getHeight());
                            Organizar(l44, Letra(1, 36), l2.getWidth(), l2.getHeight());
                            Organizar(l86, Letra(0, 37), l2.getWidth(), l2.getHeight());
                            Organizar(l45, Letra(1, 37), l2.getWidth(), l2.getHeight());
                            
                            break;
                        case 11:
                            Organizar(l87, Letra(0, 38), l1.getWidth(), l1.getHeight());
                            Organizar(l46, Letra(1, 38), l2.getWidth(), l2.getHeight());
                            Organizar(l88, Letra(0, 39), l1.getWidth(), l1.getHeight());
                            Organizar(l47, Letra(1, 39), l2.getWidth(), l2.getHeight());
                            Organizar(l89, Letra(0, 40), l1.getWidth(), l1.getHeight());
                            Organizar(l48, Letra(1, 40), l2.getWidth(), l2.getHeight());
                            Organizar(l90, Letra(0, 41), l2.getWidth(), l2.getHeight());
                            Organizar(l49, Letra(1, 41), l2.getWidth(), l2.getHeight());
                            
                            break;
                        
                    }
                    siz++;
                    break;
                }
                cuad++;
            }
        }

    }

    public String Letra(int posi, int y) {
        String[] arreglo = Creo.get(y).split(" ");
        return arreglo[posi];
    }

    public void Aleatorio() {
        for (int i = 0; i < pag.length; i++) {
            pag[i] = (int) (Math.random() * 12) + 1;
        }

    }

    public void Organizar(JLabel x, String y, int tamx, int tamy) {

        ImageIcon ImagenRelojFondo = new ImageIcon(getClass().getResource("/Imagenes/" + y + ".png"));
        Image Imagenrf = ImagenRelojFondo.getImage();
        Image Iconorf = Imagenrf.getScaledInstance(tamx, tamy, java.awt.Image.SCALE_SMOOTH);
        ImageIcon Perfilrf = new ImageIcon(Iconorf);
        x.setIcon(Perfilrf);
    }

    public void Generar() {
        for (int i = 0; i < pag.length; i++) {
            if (i > 0) {

                Mostrar_Ma(Mostrar);
            }
            int var = Encontrar_cero(Mostrar);
            Mostrar_Algo();
            aqui:

            if (var != 4) {

                if (Encontrar_repetido(Mostrar, pag, posicion)[0].equals(false)) {
                    Mostrar[var][0] = pag[i];
                    Mostrar[var][1] = 1;

                } else {
                    int donde = Integer.parseInt(Encontrar_repetido(Mostrar, pag, posicion)[1].toString());
                    i++;
                    posicion = i + 1;
                    if (Mostrar[donde][1] == 0 && Mostrar[donde][0] > 0) {
                        Mostrar[donde][1] = 1;
//                        Creo.add(Mostrar[donde][0] + " " + Mostrar[donde][1]);
                        break aqui;
                    }
                    if (Encontrar_repetido(Mostrar, pag, posicion - 1)[0].equals(true)) {
                        break aqui;
                    }
                    Mostrar[var][0] = pag[i];
                    Mostrar[var][1] = 1;
//                    Creo.add(Mostrar[var][0] + " " + Mostrar[var][1]);
                    break aqui;
                }

                posicion++;
            } else {
                Volver_cero(Mostrar);
                i--;
                break aqui;
            }

        }
    }

    public static Object[] Encontrar_repetido(int[][] x, int[] y, int posicion) {
        Object[] Encontro = new Object[2];
        Encontro[0] = false;
//        posicion--;
        for (int i = 0; i < x.length; i++) {
            if (posicion < y.length && posicion >= 0) {
                if (x[i][0] == y[posicion]) {
                    Encontro[0] = true;
                    Encontro[1] = i;
                    i = x.length;

                }
            } else {
                break;
            }
        }
        return Encontro;
    }

    public static int Encontrar_cero(int[][] x) {
        int h = 4;
        for (int i = 0; i < x.length; i++) {
            if (x[i][1] == 0) {
                h = i;
                break;
            }
        }
        return h;
    }

    public void Volver_cero(int[][] x) {
        for (int[] x1 : x) {
            x1[1] = 0;
        }
    }

    public void Mostrar_Ma(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            if (Mostrar[i][0] != 0) {
                String re = Mostrar[i][0] + " " + Mostrar[i][1];
                Creo.add(re);
                
            }

        }
    }
    public void Mostrar_Algo(){
        for (int i = 0; i < Mostrar.length; i++) {
            for (int j = 0; j < Mostrar[i].length; j++) {
                System.out.print("["+Mostrar[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
