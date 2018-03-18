
package guia4;

import guias5.GUIA3;
import java.awt.Container;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class mr16143ml16023 extends javax.swing.JFrame {
    int numero,cpu,garantia,pantalla;
   int bateria,principal,secundaria;
    double num,ram,precio;
    String marca;
    private String marca1;
    private double valor,capacidad;
    boolean flash=false;
    boolean flash1=false;
    private int pant,bateria1,puntajebp,puntajemarca,puntajeprecio;
    private int puntajegarantia,nucleos,puntajecpu,puntajeram,puntos;
    private int principal1,secundaria1,puntajepixel,meses;
    
    String camara,salir,salir1;
   
    public mr16143ml16023(){
        initComponents();
    }
    public int bateriapantalla(int pantalla,int bateria){
      if(this.pantalla<=4) {
          if(this.bateria<=1200){
          puntajebp=0;
          }else if(this.bateria>1200 && this.bateria<2400){
          puntajebp=1;
          }else if(this.bateria>2400 && this.bateria<3100){
          puntajebp=2;
          }else if(this.bateria>3100){
          puntajebp=3;}
      } else if(this.pantalla<=5) {
          if(this.bateria<=1200){
          puntajebp=1;
          }else if(this.bateria>1200 && this.bateria<2400){
          puntajebp=2;
          }else if(this.bateria>2400 && this.bateria<3100){
          puntajebp=3;
          }else if(this.bateria>3100){
          puntajebp=4;
          }}
          else if(this.pantalla<=6) {
          if(this.bateria<=1200){
          puntajebp=3;
          }else if(this.bateria>1200 && this.bateria<2400){
          puntajebp=4;
          }else if(this.bateria>2400 && this.bateria<3100){
          puntajebp=5;
          }else if(this.bateria>3100){
          puntajebp=6;}  
          } return puntajebp;
    }
    
    public int rangoprecio(double valor){
    valor=this.valor;
    if(valor<100){
        puntajeprecio=2;
    }else if(valor>=100 && valor<=350){
    puntajeprecio=3;
    }else if(valor>350){
    puntajeprecio=4;
    } return puntajeprecio;
    }
    
     public int ram(double capacidad){
    capacidad=this.capacidad;
    if(capacidad<=1){
    puntajeram=0;
    }else if(capacidad>1 && capacidad<=2){
    puntajeram=1;
    }else if(capacidad>2 && capacidad<=4){
    puntajeram=4;
    }else if(capacidad>4){
    puntajeram=6;}
    return puntajeram;
    }
    
     public int garantia(int meses){
meses=this.meses;
if(meses<=3){
puntajegarantia=1;
}else if(meses>3 && meses<6){
puntajegarantia=2;
}else if(meses>6){
puntajegarantia=3;}
return puntajegarantia;
}
     
     public int refdemarca(String marca){
    marca=this.marca;
        switch (marca) {
            case "NEXUS":
            case "GOOGLE":
            case "LENOVO":
            case "HUAWEI":
            case "APPLE":
            case "SONY":
                puntajemarca=4;
                break;
            case "SAMSUNG":
            case "ALCATEL":
            case "LG":
                puntajemarca=3;
                break;
            default:
                puntajemarca=2;
                break;
        } return puntajemarca;
    }
     
     public int cpu(int nucleos){
    nucleos=this.nucleos;
        switch (nucleos) {
            case 2:
                puntajecpu=0;
                break;
            case 4:
                puntajecpu=1;
                break;
            case 6:
                puntajecpu=2;
                break;
            case 8:
                puntajecpu=3;
                break;
            default:
                break;
        }
        return puntajecpu;
    }
     
     public int pixelaje(int principal, int secundaria, boolean flash){
    principal=this.principal;
    secundaria=this.secundaria;
    flash=this.flash;
    if(principal<=5){
        if(secundaria<=2){
            puntajepixel=1;
                }else if(secundaria>2){
                puntajepixel=2;
                }
    }else if(principal>5 && principal<=8){
    if(secundaria<2){
    puntajepixel=1;
    }else if(secundaria>1 && secundaria<3){
    puntajepixel=2;
    }else if(secundaria>=3){
    puntajepixel=3;
    } 
    } else if(principal>8){
      if(secundaria<2){
      puntajepixel=1;
      }else if(secundaria>=2 && secundaria<5){
      puntajepixel=2;
      }else if(secundaria>=5){
      puntajepixel=3;
      }
    }
    if(flash==false){
        puntajepixel=puntajepixel-1;
    }return puntajepixel;
    }
     
     public String mostrar(){
    puntos=this.cpu(nucleos)+this.bateriapantalla(pantalla, bateria)+this.garantia(meses)+this.pixelaje(principal, secundaria, flash)+this.ram(capacidad)+this.rangoprecio(valor)+this.refdemarca(marca);
    if (puntos<=7){
    salir1="No es buena inversion con "+puntos+" puntos";
    }else if(puntos>7 && puntos<=14){
         salir1="inversion de riesgo con "+puntos+" puntos";
    }else if(puntos>14 && puntos<=21){
     salir1="inversion viable con "+puntos+" puntos";
    }else if(puntos>22){
     salir1="Buena inversion con "+puntos+" puntos";
    }
    return salir1;
    }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tbateria = new javax.swing.JTextField();
        tpantalla = new javax.swing.JTextField();
        tgarantia = new javax.swing.JTextField();
        tprecio = new javax.swing.JTextField();
        tram = new javax.swing.JTextField();
        ccpu = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cmarca = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cprincipal = new javax.swing.JCheckBox();
        csecundaria = new javax.swing.JCheckBox();
        cflash = new javax.swing.JCheckBox();
        txrincipal1 = new javax.swing.JTextField();
        tsecundaria = new javax.swing.JTextField();
        bejecutar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtdescripcion = new javax.swing.JTextArea();
        LIMPIAR = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jLabel4.setText("cpu");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("clasificador de puntaje");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 12, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bateria");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pantalla");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Garantia");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("precio:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ram:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        tbateria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbateriaActionPerformed(evt);
            }
        });
        tbateria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbateriaKeyPressed(evt);
            }
        });
        getContentPane().add(tbateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 100, -1));

        tpantalla.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tpantalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tpantallaKeyPressed(evt);
            }
        });
        getContentPane().add(tpantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 100, -1));

        tgarantia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tgarantia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgarantiaActionPerformed(evt);
            }
        });
        tgarantia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tgarantiaKeyPressed(evt);
            }
        });
        getContentPane().add(tgarantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 100, -1));

        tprecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tprecioKeyPressed(evt);
            }
        });
        getContentPane().add(tprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 100, -1));

        tram.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tram.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tramKeyPressed(evt);
            }
        });
        getContentPane().add(tram, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 100, -1));

        ccpu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ccpu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "4", "6", "8" }));
        getContentPane().add(ccpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 100, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("CPU:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        cmarca.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cmarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEXUS", "GOOGLE", "LENOVO", "HUAWEI", "SONY", "APPLE", "SAMSUNG", "ALCATEL", "LG", "Otra marca" }));
        getContentPane().add(cmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Marca:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Camara:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        cprincipal.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cprincipal.setForeground(new java.awt.Color(240, 240, 240));
        cprincipal.setText("Principal");
        cprincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cprincipalActionPerformed(evt);
            }
        });
        getContentPane().add(cprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        csecundaria.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        csecundaria.setForeground(new java.awt.Color(240, 240, 240));
        csecundaria.setText("secundaria");
        csecundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csecundariaActionPerformed(evt);
            }
        });
        getContentPane().add(csecundaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));

        cflash.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cflash.setForeground(new java.awt.Color(240, 240, 240));
        cflash.setText("flash");
        cflash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cflashActionPerformed(evt);
            }
        });
        getContentPane().add(cflash, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));

        txrincipal1.setEditable(false);
        txrincipal1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 75, -1));

        tsecundaria.setEditable(false);
        tsecundaria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tsecundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsecundariaActionPerformed(evt);
            }
        });
        getContentPane().add(tsecundaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 80, -1));

        bejecutar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bejecutar.setText("Ejecutar");
        bejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bejecutarActionPerformed(evt);
            }
        });
        getContentPane().add(bejecutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, -1, -1));

        txtdescripcion.setEditable(false);
        txtdescripcion.setColumns(20);
        txtdescripcion.setRows(5);
        txtdescripcion.setText(" \n");
        jScrollPane3.setViewportView(txtdescripcion);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 380, 140));

        LIMPIAR.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LIMPIAR.setText("limpiar");
        LIMPIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIMPIARActionPerformed(evt);
            }
        });
        getContentPane().add(LIMPIAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, -1, -1));

        jToggleButton3.setText("SALIR");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Plain-design-pattern-dark-background-image-HD-resolution-latest-pack-800x600.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbateriaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbateriaKeyPressed
char c= evt.getKeyChar();
int car=evt.getKeyChar();
        if(Character.isLetter(c) || (car>=32 && car<=47)){
            JOptionPane.showMessageDialog(null, "solo introduzca numeros");
            tbateria.setText(null);
        } 
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        numero=Integer.parseInt(tbateria.getText());
            if(numero<=0){
            JOptionPane.showMessageDialog(null, "debe ser mayor que cero");
            tbateria.setText("");
            }else{
            tpantalla.requestFocus();
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tbateriaKeyPressed

    private void tpantallaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpantallaKeyPressed
char c= evt.getKeyChar();
int car=evt.getKeyChar();
        if(Character.isLetter(c) || (car>=32 && car<=45) || car==47){
            JOptionPane.showMessageDialog(null, "solo introduzca numeros");
            tpantalla.setText(null);
        } 
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        numero=Integer.parseInt(tpantalla.getText());
            if(numero<=0 || numero>6){
            JOptionPane.showMessageDialog(null, "debe estar entre 0 y 6");
            tpantalla.setText("");
            }else{
            tram.requestFocus();
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tpantallaKeyPressed

    private void tramKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tramKeyPressed
       char c= evt.getKeyChar();
       int car=evt.getKeyChar();
        if(Character.isLetter(c) || (car>=32 && car<=45) || car==47){
            JOptionPane.showMessageDialog(null, "solo introduzca numeros");
            tram.setText(null);
        } 
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        num=Double.parseDouble(tram.getText());
            if(num<=0){
            JOptionPane.showMessageDialog(null, "debe ser mayor de 0");
            tram.setText("");
            }else{
            tgarantia.requestFocus();
            }
        }       // TODO add your handling code here:
    }//GEN-LAST:event_tramKeyPressed

    private void tgarantiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tgarantiaKeyPressed
char c= evt.getKeyChar();
int car=evt.getKeyChar();
        if(Character.isLetter(c) || (car>=32 && car<=47)){
            JOptionPane.showMessageDialog(null, "solo introduzca numeros");
            tgarantia.setText(null);
        } 
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        numero=Integer.parseInt(tgarantia.getText());
            if(numero<0){
            JOptionPane.showMessageDialog(null, "debe estar ser mayor o igual a cero");
            tgarantia.setText("");
            }else{
            tprecio.requestFocus();
            }
        }              // TODO add your handling code here:
    }//GEN-LAST:event_tgarantiaKeyPressed

    private void tgarantiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgarantiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tgarantiaActionPerformed

    private void tprecioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tprecioKeyPressed
char c= evt.getKeyChar();
int car=evt.getKeyChar();
        if(Character.isLetter(c) || (car>=32 && car<=45) || car==47){
            JOptionPane.showMessageDialog(null, "solo introduzca numeros");
            tprecio.setText(null);
        } 
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        num=Double.parseDouble(tprecio.getText());
            if(num<=0){
            JOptionPane.showMessageDialog(null, "El precio debe ser mayor de cero");
            tprecio.setText("");
            }else{
            ccpu.requestFocus();
            }
        }              // TODO add your handling code here:
    }//GEN-LAST:event_tprecioKeyPressed

    private void cprincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cprincipalActionPerformed
     if(cprincipal.isSelected()){
     txrincipal1.setText(null);
     txrincipal1.setEditable(true);
     txrincipal1.requestFocus();
     }
        // TODO add your handling code here:
    }//GEN-LAST:event_cprincipalActionPerformed

    private void tsecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsecundariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tsecundariaActionPerformed

    private void tbateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbateriaActionPerformed

    private void bejecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bejecutarActionPerformed
      if(tpantalla.getText().length()==0 || tbateria.getText().length()==0 || tram.getText().length()==0 || tprecio.getText().length()==0){
      JOptionPane.showMessageDialog(null, "debe llenar todos los campos");}
      else{
      ram=Double.parseDouble(tram.getText());
      this.ram(ram);
      precio=Double.parseDouble(tprecio.getText());
      this.rangoprecio(precio);
      pantalla=Integer.parseInt(tpantalla.getText());
      bateria=Integer.parseInt(tbateria.getText());
      this.bateriapantalla(pantalla, bateria);
      garantia=Integer.parseInt(tgarantia.getText());
      this.garantia(garantia);
      marca=String.valueOf(cmarca.getSelectedItem());
      this.refdemarca(marca);
      cpu=Integer.parseInt(String.valueOf(ccpu.getSelectedItem()));
      this.cpu(cpu);
      principal=Integer.parseInt(txrincipal1.getText());
      secundaria=Integer.parseInt(tsecundaria.getText());
      flash1=cflash.isSelected();
      this.pixelaje(principal, secundaria, flash1);
      if(cprincipal.isSelected() && csecundaria.isSelected() && cflash.isSelected()){
        camara=" principal:"+txrincipal1.getText()+"mpx        secundaria:"+tsecundaria.getText()+"mpx\nTiene Flash";
       } else if(cprincipal.isSelected() && cflash.isSelected()){
            camara=" principal:"+txrincipal1.getText()+"mpx       Tiene Flash";}
       else if(cprincipal.isSelected() && csecundaria.isSelected()){
           camara=" principal:"+txrincipal1.getText()+"        secundaria:"+tsecundaria.getText();
       } else if(cprincipal.isSelected()){
           camara=" principal:"+txrincipal1.getText()+"mpx";
       }else if(csecundaria.isSelected()){
       camara=" secundaria:"+tsecundaria.getText()+"mpx";
       }else{
           camara=" no tiene camara:";}
        salir="El numero de cpu es:"+ccpu.getSelectedItem()+"\nEl tamaño de pantalla es:"+tpantalla.getText()+" pulgadas\nLa memoria ram es de:"+tram.getText()+"Gb\n La garantia es de :"+tgarantia.getText()+"meses\nSu precio es de:$"+tprecio.getText()+"\nY la marca es:"+cmarca.getSelectedItem()+"\nPosee camara:"+camara+"\n"+this.mostrar();
        txtdescripcion.setText(salir);   
      }
// TODO add your handling code here:
    }//GEN-LAST:event_bejecutarActionPerformed

    private void csecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csecundariaActionPerformed
        if(csecundaria.isSelected()){
        tsecundaria.setText(null);
            tsecundaria.setEditable(true);
            tsecundaria.requestFocus();
        }
        
// TODO add your handling code here:
    }//GEN-LAST:event_csecundariaActionPerformed

    private void cflashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cflashActionPerformed
     // TODO add your handling code here:
    }//GEN-LAST:event_cflashActionPerformed

    private void LIMPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPIARActionPerformed
    tpantalla.setText(null);
    tram.setText(null);
    tprecio.setText(null);
    tbateria.setText(null);
    tgarantia.setText(null);
    txtdescripcion.setText(null); 
    

// TODO add your handling code here:
    }//GEN-LAST:event_LIMPIARActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jToggleButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(mr16143ml16023.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mr16143ml16023.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mr16143ml16023.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mr16143ml16023.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new mr16143ml16023().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton LIMPIAR;
    private javax.swing.JButton bejecutar;
    private javax.swing.JComboBox<String> ccpu;
    private javax.swing.JCheckBox cflash;
    private javax.swing.JComboBox<String> cmarca;
    private javax.swing.JCheckBox cprincipal;
    private javax.swing.JCheckBox csecundaria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JTextField tbateria;
    private javax.swing.JTextField tgarantia;
    private javax.swing.JTextField tpantalla;
    private javax.swing.JTextField tprecio;
    private javax.swing.JTextField tram;
    private javax.swing.JTextField tsecundaria;
    private javax.swing.JTextField txrincipal1;
    private javax.swing.JTextArea txtdescripcion;
    // End of variables declaration//GEN-END:variables


}
