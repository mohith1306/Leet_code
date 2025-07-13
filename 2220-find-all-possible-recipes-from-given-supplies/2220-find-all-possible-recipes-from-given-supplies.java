import java.util.*;

class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        HashMap<String, Integer> recipeMade = new HashMap<>();
        HashSet<String> supplyMap = new HashSet<>(Arrays.asList(supplies));
        ArrayList<String> ans = new ArrayList<>();

        for (String reci : recipes) {
            recipeMade.put(reci, 0); 
        }

        boolean progress = true;
        while (progress) {
            progress = false;

            for (int i = 0; i < recipes.length; i++) {
                String currentRecipe = recipes[i];

                if (recipeMade.get(currentRecipe) == 1) continue;

                List<String> ingList = ingredients.get(i);
                boolean canMake = true;

                for (String ing : ingList) {
                    if (!supplyMap.contains(ing)) {
                        canMake = false;
                        break;
                    }
                }

                if (canMake) {
                    recipeMade.put(currentRecipe, 1);
                    ans.add(currentRecipe);
                    supplyMap.add(currentRecipe);
                    progress = true;
                }
            }
        }

        return ans;
    }
}
