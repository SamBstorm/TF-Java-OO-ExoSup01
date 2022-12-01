import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Recette spagheti = new Recette();
        spagheti.nom = "Spagheti";
        spagheti.auteur = "Samuel";
        Ingredient pasta = new Ingredient();
        pasta.nom = "patte";
        pasta.quantite = 400;
        pasta.unite = "g";

        /*
        List<Ingredient> list = new ArrayList<>();
        list.add(pasta);
        spagheti.ingredients = list;*/

        spagheti.AjouterIngredient(pasta);
        //spagheti.AjouterIngredient(null);
        spagheti.AjouterIngredient("tomate",2,"pièce");
        spagheti.AjouterIngredient("haché",600,"g");
        spagheti.AfficheRecette(3);
    }
}
