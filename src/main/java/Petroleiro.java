/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulo
 */
public class Petroleiro extends Navio {
    private float carga;

    /**
     *
     * @param matricula
     */
    public Petroleiro(String matricula) {
        super(matricula);
    }

    /**
     *
     * @return Carga
     */
    public float getCarga() {
        return carga;
    }

    /**
     *
     * @param carga
     */
    public void setCarga(float carga) {
        this.carga = carga;
    }
    
    
}

