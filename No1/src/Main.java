public class Main {
    public static void main(String[] args) {
        //b. Object
        PokemonNo1 charmander = new PokemonNo1("Charmander", 5, "Api");
        PokemonNo1 bulbasaur = new PokemonNo1();

        charmander.serang("Rattata","Nafas Api");
        bulbasaur.bertahan();
        charmander.naikLevel(10);
    }
}