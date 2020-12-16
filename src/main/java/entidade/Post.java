package entidade;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");


    private Date momento;
    private String titulo;
    private String conteudo;
    private Integer likes;

    private List<Comentario> comentarios = new ArrayList<>();

    public Post(){
    }

    public Post(Date momento, String titulo, String conteudo, Integer likes) {
        this.momento = momento;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.likes = likes;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void adicionaComentario(Comentario comentario){
        comentarios.add(comentario);
    }

    public void removeComentario(Comentario comentario){
        comentarios.remove(comentario);
    }


    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append(titulo + "\n");
       sb.append(likes);
       sb.append(" Likes - ");
       sb.append(sdf.format(momento) + "\n");
       //sb.append(sdf.format(conteudo) + "\n");
       sb.append(conteudo + "\n");
       sb.append("Comentarios: \n");
       for (Comentario coment : comentarios){
           sb.append(coment.getTexto() + "\n");
       }
       return  sb.toString();
    }
}
