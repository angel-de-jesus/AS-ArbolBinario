package arbolbinario;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.util.Stack;
import java.util.regex.*;
import javax.swing.table.DefaultTableModel;

public class View extends javax.swing.JFrame {
    String principal = "principal";
    String [] array;
    int at;
    Stack pila = new Stack();
    int cont=0;
    public String[] columnas = {"pila"};
    public DefaultTableModel header = new DefaultTableModel(null,columnas);
    public View() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        entrada = new javax.swing.JTextField();
        titleinput = new javax.swing.JLabel();
        verificar = new javax.swing.JButton();
        derivaciones = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        derivacionP = new javax.swing.JTable();
        aceptada = new javax.swing.JLabel();
        errorS = new javax.swing.JLabel();
        clearTable = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(255, 255, 255));

        title.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(0, 153, 153));
        title.setText("Analizador sintactico");

        entrada.setBackground(new java.awt.Color(204, 255, 255));
        entrada.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        entrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputColor(evt);
            }
        });

        titleinput.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        titleinput.setText("Escriba su entrada:");

        verificar.setBackground(new java.awt.Color(0, 153, 153));
        verificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        verificar.setForeground(new java.awt.Color(255, 255, 255));
        verificar.setBorder(null);
        verificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verificar.setLabel("Analizar");
        verificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verificarMouseClicked(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(0, 102, 102));
        jScrollPane1.setForeground(new java.awt.Color(0, 102, 102));

        derivacionP.setBackground(new java.awt.Color(50, 196, 206));
        derivacionP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        derivacionP.setForeground(new java.awt.Color(51, 51, 51));
        derivacionP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "pila"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        derivacionP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        derivacionP.setGridColor(new java.awt.Color(51, 51, 255));
        derivacionP.setSelectionBackground(new java.awt.Color(0, 153, 153));
        jScrollPane1.setViewportView(derivacionP);

        aceptada.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        aceptada.setForeground(new java.awt.Color(102, 102, 255));

        errorS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        errorS.setForeground(new java.awt.Color(255, 51, 51));

        clearTable.setBackground(new java.awt.Color(255, 255, 255));
        clearTable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clearTable.setForeground(new java.awt.Color(0, 204, 204));
        clearTable.setText("Limpiar Tabla");
        clearTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearTable(evt);
            }
        });

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(derivaciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addComponent(errorS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(aceptada)
                                .addGap(46, 46, 46))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(title))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(titleinput)
                            .addComponent(verificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(entrada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                            .addComponent(clearTable, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(derivaciones)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titleinput)
                .addGap(1, 1, 1)
                .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verificar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(clearTable)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptada)
                    .addComponent(errorS))
                .addGap(110, 110, 110))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verificarMouseClicked
        String cadena = entrada.getText();
        array = cadena.split(" ");
        at=array.length;
        pila = new Stack(); 
        if(cadena.equals("")){
            JOptionPane.showMessageDialog(null,"digite una entrada");
        }else{
            entrada.setEditable(false);
            System.out.println("Entrada-> "+cadena);
            derivacionP.setGridColor(Color.blue);
            inicializarPila();   
        } 
    }//GEN-LAST:event_verificarMouseClicked

    private void inputColor(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputColor
        entrada.setCaretColor(Color.RED);
        entrada.setBackground(Color.white);
        entrada.setSelectionColor(Color.RED);
        entrada.setForeground(Color.DARK_GRAY);
        
    }//GEN-LAST:event_inputColor

    private void clearTable(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearTable
       
        entrada.setEditable(true);
        entrada.setText("");
        for(int i=0; i<derivacionP.getRowCount(); i++){
           header.removeRow(i);
           i-=1;
       }
        cont=0;
        aceptada.setText("");
        errorS.setText("");
        entrada.setBackground(Color.getHSBColor(65,70,32));
    }//GEN-LAST:event_clearTable
    public void inicializarPila(){
        pila.push("$");
        derivacionP.setModel(header);
        if(array[cont].equals("raiz")){
            pila.push("<hijos>");
            pila.push(";");
            pila.push("<numero>");
            pila.push("=");
            pila.push("cantidadHijos");
            pila.push(";");
            pila.push("<principal>");
            pila();
            salidas();
            pila.push("<numero>");
            pila.push("=");
            pila.push("raiz");
            pila();
            salidas();
            cont++;
            principal();
        }else{
            pila();
            errorS.setText("Error: "+array[0]);
            aceptada.setText("Cadena no aceptada");
        }

    }
    public void principal(){
        if(cont<at){
            if(array[cont].equals("=")){
                salidas();
                cont++;
                numero();
                if(cont<at){
                    puntoComa();
                    cantidadHijos();
                }  
            }else{
                errorS.setText("Error: "+array[cont]);
                aceptada.setText("Cadena no aceptada");
            }
        }
    }
    public void cantidadHijos(){
        if(cont<at){
            if(array[cont].equals("cantidadHijos")){
                salidas();
                cont++;
                if(cont<at){
                    if(array[cont].equals("=")){
                        salidas();
                        cont++;
                        numero();
                        if(cont<at){
                            puntoComa();
                            hijos();
                        }
                    }else{
                        errorS.setText("Error: "+array[cont]);
                        aceptada.setText("Cadena no aceptada");
                    }
                }
            }else{
                errorS.setText("Error: "+array[cont]);
                aceptada.setText("Cadena no aceptada");
            }
        }
    }
    public void hijos(){
        if(cont<at){
            if(array[cont].equals("hijos")){ 
                salidas();
                pila.push("<complemento>");
                pila.push("}");
                pila.push(";");
                pila.push("<numero>");
                pila.push(":");
                pila.push("valor");
                pila.push(";");
                pila.push("<posición>");
                pila.push(":");
                pila.push("ubicacion");
                pila.push(":");
                pila.push("<numero>");
                pila.push(":");
                pila.push("decendienteD");
                pila.push("{");
                pila.push("hijos");
                pila();
                salidas();
                cont++;
                if(cont<at){
                    if(array[cont].equals("{")){
                        salidas();
                        cont++;
                        decendiente();
                    }else{
                        errorS.setText("Error: "+array[cont]);
                        aceptada.setText("Cadena no aceptada");
                    }
                }
            }else{
                errorS.setText("Error: "+array[cont]);
                aceptada.setText("Cadena no aceptada");
            }
        }
    }
    public void decendiente(){
        if(cont<at){
            if(array[cont].equals("decendienteD")){
                salidas();
                cont++;
                if(cont<at){
                    if(array[cont].equals(":")){
                        salidas();
                        cont++;
                        numero();
                        if(cont<at){
                            puntoComa();
                            ubicacion();
                        }
                    }else{
                        errorS.setText("Error: "+array[cont]);
                        aceptada.setText("Cadena no aceptada");
                    }
                }
            }else{
                errorS.setText("Error: "+array[cont]);
                aceptada.setText("Cadena no aceptada");
            }
        }
    }
    public void ubicacion(){
        if(cont<at){
            if(array[cont].equals("posicion")){
                salidas();
                cont++;
                if(cont<at){
                    if(array[cont].equals(":")){
                        salidas();
                        cont++;
                        posicion();
                        pila();
                        salidas();
                        puntoComa();
                        valor();
                        //raiz = 2 ; cantidadHijos = 1 ; hijos { decendienteD : 2 ; posicion : derecha ; valor : 3 ; }
                    }else{
                        errorS.setText("Error: "+array[cont]);
                        aceptada.setText("Cadena no aceptada");
                    }
                }
            }else{
                errorS.setText("Error: "+array[cont]);
                aceptada.setText("Cadena no aceptada");
            }
        }
    }
    public void valor(){
        if(cont<at){
            if(array[cont].equals("valor")){
                salidas();
                cont++;
                if(cont<at){
                    if(array[cont].equals(":")){
                        salidas();
                        cont++;
                        numero();
                        puntoComa();
                        if(cont<at){
                            if(array[cont].equals("}")){
                                cont = cont + 1;
                                salidas();
                                if(cont==at){
                                    aceptada.setText("Cadena aceptada");
                                    salidas();
                                    System.out.println("******"+cont+"****"+at);
                                }else{
                                    
                                    complemento();
                                    System.out.println("******"+cont+"****"+at);
                                }
                            }else{
                                errorS.setText("Error: "+array[cont]);
                                aceptada.setText("Cadena no aceptada");
                            }
                        }
                    }else{
                        errorS.setText("Error: "+array[cont]);
                        aceptada.setText("Cadena no aceptada");
                    }
                }
            }else{
                errorS.setText("Error: "+array[cont]);
                aceptada.setText("Cadena no aceptada");
            }
        }
    }
    public void complemento(){
        if(cont<at){
            if(array[cont].equals(",")){
                pila.pop();
                pila.push("<hijos>");
                pila.push(",");
                pila();
                salidas();
                cont++;
                hijos();
            }else{
                errorS.setText("Error: "+array[cont]);
                aceptada.setText("Cadena no aceptada");
            }
        }
    }
    public void puntoComa(){
        if(array[cont].equals(";")){
            salidas();
            cont++;
        }else{
            errorS.setText("Error: "+array[cont]);
            aceptada.setText("Cadena no aceptada");
        }
    }
    public void numero(){
        Pattern cadena = Pattern.compile("[0-9]*"); 
        if(cont<at){
            Matcher matcher = cadena.matcher(array[cont]);
            if(matcher.matches()){
                salidas();
                pila.push("<restoD>");
                pila.push(array[cont]);
                pila();
                cont++;
                salidas();
                salidas();  
            }else{
                errorS.setText("error: "+array[cont]);
                System.out.println("error: "+array[cont]);
                aceptada.setText("Cadena no aceptada");
            }
        }
    }
    public void posicion(){
        Pattern cadena = Pattern.compile("derecha|izquierda");
        Matcher matcher = cadena.matcher(array[cont]);
        if(matcher.matches()){
            salidas();
            pila.push(array[cont]);
            cont++;
        }else{
            errorS.setText("error: "+array[cont]);
            System.out.println("error: "+array[cont]);
            aceptada.setText("Cadena no aceptada");
        }
    }
    public void salidas(){
        String text ="sale: "+pila.pop().toString();
        String []filas = {text}; 
        header.addRow(filas);
        System.out.println(text);
        pila();
    }
    public void pila(){
        String text = pila.toString();
        String [] filas = {text}; 
        header.addRow(filas);
        System.out.println(pila);
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aceptada;
    private javax.swing.JButton clearTable;
    private javax.swing.JTable derivacionP;
    private javax.swing.JLabel derivaciones;
    private javax.swing.JTextField entrada;
    private javax.swing.JLabel errorS;
    private javax.swing.JPanel fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel title;
    private javax.swing.JLabel titleinput;
    private javax.swing.JButton verificar;
    // End of variables declaration//GEN-END:variables
}
