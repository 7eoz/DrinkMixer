package com.studies.sandrini.drinkmixer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView drinkName, drinkIngredients, drinkDirections;
    private int drinkId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        drinkName = (TextView) findViewById(R.id.drink_name);
        drinkIngredients = (TextView) findViewById(R.id.ingredients);
        drinkDirections = (TextView) findViewById(R.id.directions);

        String[] drinks = new String[]{"The Real Mojito", "Margaritas", "Pretty in Pink Sangria"};

        String[] ingredients = new String[]{"    10 fresh mint leaves\n" +
                "    1/2 lime, cut into 4 wedges\n" +
                "    2 tablespoons white sugar, or to taste\n" +
                "    1 cup ice cubes\n" +
                "    1 1/2 fluid ounces white rum\n" +
                "    1/2 cup club soda ",
                "1 (6 ounce) can frozen limeade concentrate\n" +
                "6 fluid ounces tequila\n" +
                "2 fluid ounces triple sec",
                "2 (10 ounce) packages frozen sliced strawberries, thawed\n" +
                "1 (12 fluid ounce) can frozen lemonade concentrate, thawed\n" +
                "2 (750 milliliter) bottles chilled rose wine, such as white Zinfandel\n" +
                "2 cups pineapple juice\n" +
                "1 liter ginger ale" };

        String[] directions = new String[]{"Place mint leaves and 1 lime wedge into a sturdy glass." +
                " Use a muddler to crush the mint and lime to release the mint oils and lime juice." +
                " Add 2 more lime wedges and the sugar, and muddle again to release the lime juice." +
                " Do not strain the mixture. Fill the glass almost to the top with ice. Pour the rum" +
                " over the ice, and fill the glass with carbonated water. Stir, taste, and add more " +
                "sugar if desired. Garnish with the remaining lime wedge.",
                "Fill blender with crushed ice. Pour in limeade concentrate," +
                " tequila and triple sec. Blend until smooth. Pour into glasses and serve.",
                "Stir the strawberries, lemonade concentrate, rose wine," +
                " and pineapple juice in a punch bowl until combined. Stir in the ginger ale just before serving."};

        Intent intent = getIntent();
        if(intent != null){
            drinkId = intent.getIntExtra("drink", 3);
        }

        if(drinkId == 3) {
            drinkName.setText("Drink not found");
            drinkIngredients.setText("");
            drinkDirections.setText("");
        }else{
            drinkName.setText(drinks[drinkId]);
            drinkIngredients.setText(ingredients[drinkId]);
            drinkDirections.setText(directions[drinkId]);
        }


    }
}
