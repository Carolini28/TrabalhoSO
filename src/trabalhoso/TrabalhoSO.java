/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalhoso;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ra143759
 */
public class TrabalhoSO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);  
        int i, classe, tipoClasse;
        
        
        System.out.print("Entre com o número de classes: \n");  
        classe = input.nextInt();  
        i = classe;
        
       
        while(i > 0){
            System.out.println("Tipos de classe: \n");
            System.out.println("0 - First Come First Served (FCFS).\n");
            System.out.println("1 - Shortest Job First (SJF).\n");
            System.out.println("2 - Shortest Remaining Time First (SRTF).\n");
            System.out.println("3 - Escalonamento por Prioridades.\n");
            System.out.println("4 - Escalonamento por Prioridades Preemptivo.\n");
            System.out.println("5 - Round-Robin. \n");
            System.out.println("Informe o tipo de  classe: ");
            tipoClasse = input.nextInt(); 
            
            i--;
        }
    }
    
    public void Escalonadores (){
    
        
    }
    
    public List<Classe> SetarClasse(Integer tipoClasse){
        int quantun;
        Scanner input = new Scanner(System.in);  
        List<Classe> listaClasse = new ArrayList<Classe>();
        String[] algoritmo = {"First Come First Served (FCFS)","Shortest Job First (SJF)",
                              "Shortest Remaining Time First (SRTF)", "Escalonamento por Prioridades", 
                              "Escalonamento por Prioridades Preemptivo", "Round-Robin"};
        
        if(tipoClasse == 0 || tipoClasse == 1 || tipoClasse == 3){
        
        }else if(tipoClasse == 2 || tipoClasse == 4 ){
        
        }else{
            System.out.println("Informe o quantum: ");
            quantun = input.nextInt();
            
        }
       
        
        
        
        

        
        return null;
    
    
    }
    
}
