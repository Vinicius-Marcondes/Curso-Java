package curso.exercicios.classes;


public class Usuarios {
    String nome;
    String email;

    Usuarios(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public boolean equals(Object objeto) {

        if(objeto instanceof Usuarios){
            Usuarios outro = (Usuarios) objeto;
            return outro.nome.equals(this.nome) && outro.email.equals(this.email);
        }
        else{
            return false;
        }

    }
}
