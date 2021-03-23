/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulo
 */
public class PortaContentores extends Navio {
    
    private int noContentores;
    
    /**
     *
     * @param matricula
     */
    public PortaContentores(String matricula) {
        super(matricula);
    }

    /**
     *
     * @return Numero de Contentores
     */
    public int getNoContentores() {
        return noContentores;
    }

    /**
     *
     * @param Numero de Contentores
     */
    public void setNoContentores(int noContentores) {
        this.noContentores = noContentores;
    }
    
    
}
