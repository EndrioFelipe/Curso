/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso;

/**
 *
 * @author endrio
 */
class Aluno {
    private String nomeAluno;
    private String matricula;
    private double[] notas;
    
    

    Aluno() {
        this.notas = new double[5];
    }
    
    

    /**
     * @return the nomeAluno
     */
    public String getNomeAluno() {
        return nomeAluno;
    }

    /**
     * @param nomeAluno the nomeAluno to set
     */
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the notas
     */
    public double[] getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas() {
        this.notas = notas;
    }
    
    public double mediaNotas(){
        double resultado=0;
        double media=0;
        double acumula=0;
        int i=0;
        for (i=0; i<notas.length; i++){
            if (i==0){
                notas[i]=0;
            }else{
            this.notas[i]=i+3.4;//(double)(Math.random()*10);
           //System.out.println("nota "+(i)+": "+notas[i]);
            notas[i]+=notas[i-1];
            acumula=notas[i];
            media++;
                //System.out.println("acumula: "+acumula);
            }
            resultado=acumula/media;
        }
        //System.out.println("media: "+resultado);
        
        
        return resultado;
        
    }
    
    
    /*
    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.mediaNotas();
    }
    */

    
    
}
