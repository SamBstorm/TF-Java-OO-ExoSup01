import java.util.ArrayList;
import java.util.List;

public class Recette {
    String nom;
    String auteur;
    List<Ingredient> ingredients;

    public void AjouterIngredient(Ingredient ingredient){
        //if(ingredient == null) throw new IllegalArgumentException();
        if(this.ingredients == null) this.ingredients = new ArrayList<>();
        this.ingredients.add(ingredient);
    }

    public void AjouterIngredient(String ingredientNom, int ingredientQuantite, String ingredientUnite){
        Ingredient ingredient = new Ingredient();
        ingredient.nom = ingredientNom;
        ingredient.quantite = ingredientQuantite;
        ingredient.unite = ingredientUnite;
        this.AjouterIngredient(ingredient);
    }

    public void AfficheRecette(int nbPersonne){
        System.out.println(this.nom);
        System.out.println("Recette de "+ this.auteur);
        System.out.println("Ingrédients pour " + nbPersonne + " personne(s): ");
        for (int i = 0; i < this.ingredients.size(); i++) {
            float qte = (ingredients.get(i).quantite / 2f) * nbPersonne;
            System.out.printf("\t- %s %.2f %s\n",ingredients.get(i).nom, qte, ingredients.get(i).unite);
        }
    }
}
