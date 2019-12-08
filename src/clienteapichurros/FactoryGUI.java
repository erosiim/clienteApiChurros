package clienteapichurros;

/**
 *
 * @author exkapp
 */
public class FactoryGUI {
    public enum GUITYPE {GUICHURRO,GUICHURRERO};
    
    public static GUIGeneral getDAO(FactoryGUI.GUITYPE type){
        GUIGeneral gui= null;
         switch(type){
        case GUICHURRO:
            gui = new guiChurro();
            break;
        case GUICHURRERO:
            gui = new guiChurrero();
            break;            
            
        default:
            System.out.println("Not found");
    }
         
    return gui;
    }
}
