package models;

public class MotivoFueraServicio {

    private String comentario;
    private MotivoTipo motivoTipo;

    public MotivoFueraServicio(MotivoTipo motivoTipo, String comentario) {
        this.motivoTipo = motivoTipo;
        this.comentario = comentario;
    }

     public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public MotivoTipo getMotivoTipo() {
        return motivoTipo;
    }

    public void setMotivoTipo(MotivoTipo motivoTipo) {
        this.motivoTipo = motivoTipo;
    }

    @Override
    public String toString() {
        return "MotivoFueraServicio{" +
                "comentario='" + comentario + '\'' +
                ", motivoTipo=" + motivoTipo +
                '}';
    }

    public void conoceMotivoTipo(){}

}