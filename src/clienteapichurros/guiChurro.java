/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteapichurros;

/**
 *
 * @author exkapp
 */
public class guiChurro extends GUIGeneral{
    private churros ch = new churros();
    private apiChurroCliente clienteChurro = new apiChurroCliente();

    public guiChurro() {
        this.setTitle("CHURRO");
        jLabel3.setText("Precio");
        modelo.setColumnIdentifiers(new Object[]{"Id", "Nombre", "Precio"});
        jTable1.setModel(modelo);
    }
    
    

    @Override
    protected void insert() {
        ch.setId_churro(txt1.getText());
        ch.setTipo(txt2.getText());
        ch.setPrecio(txt3.getText());
        clienteChurro.insert(ch);
    }

    @Override
    protected void update() {
        ch.setId_churro(txt1.getText());
        ch.setTipo(txt2.getText());
        ch.setPrecio(txt3.getText());
        clienteChurro.update(ch);
    }

    @Override
    protected void delete() {
        ch.setId_churro(txt1.getText());
        clienteChurro.deleteOne(ch,ch.getId_churro());
    }

    @Override
    protected void find() {
       ch.setId_churro(txt1.getText());
       churros oneByID = clienteChurro.getOneByID(churros.class,ch.getId_churro());
       modelo.addRow(new Object[]{oneByID.getId_churro(),oneByID.getTipo(),oneByID.getPrecio()}); 
    }

    @Override
    protected void showTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
