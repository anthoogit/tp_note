import java.util.Objects;

public class Rôle {
    private String nomRôle;

    public Rôle(String nomRôle) {
        this.nomRôle = nomRôle;
    }

    public String getNomRôle() {
        return nomRôle;
    }

    public void setNomRôle(String nomRôle) {
        this.nomRôle = nomRôle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rôle rôle = (Rôle) o;
        return Objects.equals(nomRôle, rôle.nomRôle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomRôle);
    }
}
