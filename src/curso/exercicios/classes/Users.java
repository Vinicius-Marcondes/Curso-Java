package curso.exercicios.classes;


import java.util.Objects;

public class Users {
    String name;
    String email;

    Users(String name, String email){
        this.name = name;
        this.email = email;
    }

    Users(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(name, users.name) &&
                Objects.equals(email, users.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }
}
