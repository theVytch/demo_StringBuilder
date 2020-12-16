package aplicacao;



import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidade.Comentario;
import entidade.Post;


public class Programa {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");


        Comentario c1 = new Comentario("have a nice trip!");
        Comentario c2 = new Comentario("Wow isso é incrivel");

        Post p1 = new Post(
                sdf.parse("21/06/2018 13:05:44"),
                "Viajando por New York",
                "eu estou visitando um lugar incrivel!",
                12);

        p1.adicionaComentario(c1);
        p1.adicionaComentario(c2);





        System.out.println(p1);
    }


}
