import java.util.*;
//exercício não feito
public class Seriados {
     public static void main(String[] args) {

          Set<Seriado> meusSeriados=new HashSet<>() {{
               add(new Seriado("got", "fantasia", 60));
               add(new Seriado("dark", "drama", 60));
               add(new Seriado("that '70s show", "comédia", 25));
               add(new Seriado("the office", "reality show", 85));
          }};

          System.out.println("--\tOrdem gênero\t--");
          Set<Seriado> meusSeriados1 = new TreeSet<>(meusSeriados);
          for (Seriado seriado:meusSeriados) System.out.println(seriado.getNome()+
                  "-"+seriado.getGenero()+"-"+seriado.getTempoEpisodio());


//
//          System.out.println(seriado.getNome()+" - "
//                  + seriado.getGenero()+" - "+seriado.getTempoEpisodio());



//     System.out.println("--\tOrdem tempo episódio\t--");

     }
}

class Seriado {
     private String nome;
     private String genero;
     private Integer tempoEpisodio;

     public String getNome() {
          return nome;
     }

     public String getGenero() {
          return genero;
     }

     public Integer getTempoEpisodio() {
          return tempoEpisodio;
     }


     @Override
     public String toString() {
          return  "nome='" + nome + '\'' +
                  ", gênero='" + genero + '\'' +
                  ", tempoEpisodio=" + tempoEpisodio;
     }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Seriado seriado = (Seriado) o;
          return Objects.equals(nome, seriado.nome) && Objects.equals(genero, seriado.genero) && Objects.equals(tempoEpisodio, seriado.tempoEpisodio);
     }

     @Override
     public int hashCode() {
          return Objects.hash(nome, genero, tempoEpisodio);
     }

     public Seriado(String nome, String genero, Integer tempoEpisodio) {
          this.nome = nome;
          this.genero = genero;
          this.tempoEpisodio = tempoEpisodio;

     }
}

     class ComparatorGenero implements Comparator<Seriado> {
          @Override
          public int compare(Seriado s1, Seriado s2) {
               int genero = s1.getGenero().compareTo(s2.getGenero());
               if (genero != 0) return genero;

               return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
          }
     }

