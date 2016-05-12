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
public class teste {
    
    public static void main(String[] args) {
        Curso cur = new Curso();
        cur.setNome("FGGG");
        cur.setHorario("17h às 22h");
       
        Professor prof = new Professor();
        prof.setNomeProfessor("Pirulla");
        prof.setDepartamento("Dpto 1");
        prof.setEmail("pirullabiologo@youtube.com");
        
        cur.setProfessor(prof);
        
        if(cur != null && cur.getProfessor()!= null){
            System.out.println("Curso: "+cur.getNome()+"; Horário: "+cur.getHorario());
            System.out.println("Professor: "+cur.getProfessor().getNomeProfessor()+" "+cur.getProfessor().getEmail()+" "+cur.getProfessor().getDepartamento());
        }
        
        Aluno aluno1 = new Aluno();
        aluno1.setNomeAluno("Gelizberto");
        aluno1.setMatricula("234234");
        aluno1.setNotas();
        
        Aluno aluno2 = new Aluno();
        aluno2.setNomeAluno("Elicleversivaldo");
        aluno2.setMatricula("436577");
        aluno2.setNotas();
        
        Aluno[] alunos = new Aluno[2];
        alunos[0]=aluno1;
        alunos[1]=aluno2;
        
        cur.setAlunos(alunos);
        if(cur != null && cur.getAlunos()!= null){
            for (Aluno a: cur.getAlunos()){
                System.out.println("O aluno "+a.getNomeAluno()+" de matrícula "+a.getMatricula()+"; media: "+a.mediaNotas());
                if (a.mediaNotas()>=6.0){
                    System.out.println("aprovado");;
                }else{
                    System.out.println("reprovado");;
                }
            }
        }
        
    }
    
    
    
}
