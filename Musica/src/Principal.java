public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();

        minhaMusica.titulo = "Die For You";
        minhaMusica.artista = "The Weeknd";
        minhaMusica.anoLancamento = 2016;

        minhaMusica.exibeFichaTecnica();

        minhaMusica.avalia(8);
        minhaMusica.avalia(8.6);
        minhaMusica.avalia(5.0);

        double mediaAvaliacoes = minhaMusica.pegaMedia();
        System.out.println("Média das avaliações: " + mediaAvaliacoes);
    }
}