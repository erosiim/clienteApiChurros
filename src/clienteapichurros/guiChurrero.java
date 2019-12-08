package clienteapichurros;

/**
 *
 * @author exkapp
 */
public class guiChurrero extends GUIGeneral{
    
    private churrero ch = new churrero();
    private apiChurreroCliente clienteChurrero = new apiChurreroCliente();
    
    public guiChurrero() {
        this.setTitle("CHURRERO");
        jLabel2.setText("Nombre");
        modelo.setColumnIdentifiers(new Object[]{"Id", "Nombre", "Edad"});
        jTable1.setModel(modelo);
    }
    
    @Override
    protected void insert() {
        ch.setId_churrero(txt1.getText());
        ch.setNombre(txt2.getText());
        ch.setEdad(txt3.getText());
        clienteChurrero.insert(ch);
    }

    @Override
    protected void update() {
        ch.setId_churrero(txt1.getText());
        ch.setNombre(txt2.getText());
        ch.setEdad(txt3.getText());
        clienteChurrero.update(ch);
    }

    @Override
    protected void delete() {
        ch.setId_churrero(txt1.getText());
        clienteChurrero.deleteOne(ch,ch.getId_churrero());
    }

    @Override
    protected void find() {
        ch.setId_churrero(txt1.getText());
        churrero oneByID = clienteChurrero.getOneByID(churrero.class,ch.getId_churrero());
        modelo.addRow(new Object[]{oneByID.getId_churrero(),oneByID.getNombre(),oneByID.getEdad()});
    }

    @Override
    protected void showTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
