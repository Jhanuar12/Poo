package Notas;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class VentanaPrincipal extends JFrame implements ActionListener {
    
    private Container contenedor;
    private JLabel nota1,nota2,nota3,nota4,nota5,promedio,desviacion,
            mayor,menor;
    
    private JTextField camponota1,camponota2,camponota3,camponota4,
            camponota5;
    
    private JButton calcular,limpiar;
    
    public VentanaPrincipal(){
        inicio();
        setTitle("Notas");
        setSize(280,380);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }
    
    
    private void inicio(){
        contenedor = getContentPane();
        contenedor.setLayout(null);
        nota1 = new JLabel();
        nota1.setText("Nota 1");
        nota1.setBounds(20,20,135,23);
        camponota1 = new JTextField();
        camponota1.setBounds(105,20,135,23);
        
        nota2 = new JLabel();
        nota2.setText("Nota 2");
        nota2.setBounds(20,50,135,23);
        camponota2 = new JTextField();
        camponota2.setBounds(105,50,135,23);
        
        nota3 = new JLabel();
        nota3.setText("Nota 3");
        nota3.setBounds(20,80,135,23);
        camponota3 = new JTextField();
        camponota3.setBounds(105,80,135,23);
        
        nota4 = new JLabel();
        nota4.setText("Nota 4");
        nota4.setBounds(20,110,135,23);
        camponota4 = new JTextField();
        camponota4.setBounds(105,110,135,23);
        
        nota5 = new JLabel();
        nota5.setText("Nota 5");
        nota5.setBounds(20,140,135,23);
        camponota5 = new JTextField();
        camponota5.setBounds(105,140,135,23);
        
        calcular = new JButton();
        calcular.setText("Calcular");
        calcular.setBounds(20,170,100,23);
        calcular.addActionListener(this);
        
        limpiar = new JButton();
        limpiar.setText("Limpiar");
        limpiar.setBounds(125,170,80,23);
        limpiar.addActionListener(this);
        
        promedio = new JLabel();
        promedio.setText("Promedio = ");
        promedio.setBounds(20,210,135,23);
        
        desviacion = new JLabel();
        desviacion.setText("Desviacion = ");
        desviacion.setBounds(20,240,120,23);
        
        mayor = new JLabel();
        mayor.setText("Nota mayor =");
        mayor.setBounds(20,270,120,23);
        
        menor = new JLabel();
        menor.setText("Nota menor =");
        menor.setBounds(20,300,120,23);
        
        contenedor.add(nota1);
        contenedor.add(camponota1);
        contenedor.add(nota2);
        contenedor.add(camponota2);
        contenedor.add(nota3);
        contenedor.add(camponota3);
        contenedor.add(nota4);
        contenedor.add(camponota4);
        contenedor.add(nota5);
        contenedor.add(camponota5);
        contenedor.add(calcular);
        contenedor.add(limpiar);
        contenedor.add(promedio);
        contenedor.add(desviacion);
        contenedor.add(mayor);
        contenedor.add(menor);
    }
    
    @Override
    public void actionPerformed(ActionEvent evento){
        if(evento.getSource() == calcular){
            Notas notas = new Notas();
            notas.listaNotas[0] = Double.parseDouble(camponota1.getText());
            notas.listaNotas[1] = Double.parseDouble(camponota2.getText());
            notas.listaNotas[2] = Double.parseDouble(camponota3.getText());
            notas.listaNotas[3] = Double.parseDouble(camponota4.getText());
            notas.listaNotas[4] = Double.parseDouble(camponota5.getText());
        
            notas.calcularPromedio();
            notas.calcularDesviacion();
            
            promedio.setText("Promedio =" + String.valueOf(String.format("%.2f",notas.calcularPromedio())));
            
            double desv = notas.calcularDesviacion();
            desviacion.setText("Desviación ="+String.format("%.2f",desv));
            
            mayor.setText("Valor mayor="+String.valueOf(notas.calcularMayor()));
            
            menor.setText("Valor menor =" + String.valueOf(notas.calcularMenor()));
        }
        
        if (evento.getSource() == limpiar){
            camponota1.setText("");
            camponota2.setText("");
            camponota3.setText("");
            camponota4.setText("");
            camponota5.setText("");
            camponota1.setText("");
        
            promedio.setText("Promedio =");
            desviacion.setText("Desviacion =");
            mayor.setText("Valor mayor =");
            menor.setText("Valor menor= ");
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
