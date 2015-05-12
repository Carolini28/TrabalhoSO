/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalhoso;

/**
 *
 * @author ra143759
 */
public class Classe {
    private String nome;
    private String algoritmo;
    private int[] escalonador;

    public Classe(String nome, String algoritmo, int escalonador[]) {
        this.nome = nome;
        this.algoritmo =algoritmo;
        this.escalonador = escalonador;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAlgoritmo() {
        return algoritmo;
    }

    public void setAlgoritmo(String algoritmo) {
        this.algoritmo = algoritmo;
    }

    public int[] getEscalonador() {
        return escalonador;
    }

    public void setEscalonador(int[] escalonador) {
        this.escalonador = escalonador;
    }
    
    
    
}
