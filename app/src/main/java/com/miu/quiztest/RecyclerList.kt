package com.miu.quiztest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.cs473_5.Item
import com.example.cs473_5.ListAdaptor
import kotlinx.android.synthetic.main.activity_recycler_list.*

class RecyclerList:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_list)

        var itemList = ArrayList<Item>()
        itemList.add(
            Item("Coffee",R.drawable.coffee_pot ,"Recipe: Coffee preparation is the process of turning coffee beans into a beverage. While the\n" +
                "particular steps vary with the type of coffee and with the raw materials, the process includes four\n" +
                "basic steps; raw coffee beans must be roasted, the roasted coffee beans must then be ground, the\n" +
                "ground coffee must then be mixed with hot water for a certain time (brewed), and finally the\n" +
                "liquid coffee must be separated from the used grounds")
        )

        itemList.add(
            Item("Espersso",R.drawable.espresso,"Recipe: Espresso’s authentic formula is clear and basic, its proper execution a matter of training,\n" +
                "experience and natural talent. A jet of hot water at 88°-93°C (190°-200°F) passes under a\n" +
                "pressure of nine or more atmospheres through a seven-gram (.25 oz) cake-like layer of ground\n" +
                "and tamped coffee. Done right, the result is a concentrate of not more than 30 ml (one oz) of pure\n" +
                "sensorial pleasure")
        )

        itemList.add(
            Item("French Fires" ,R.drawable.french_fries , "Recipe: Heat a few inches of vegetable oil to 300 degrees F in a heavy pot. In 3 or 4 batches, fry\n" +
                "the potatoes about 4 to 5 minutes per batch, or until soft. They should not be brown at all at this\n" +
                "point-you just want to start the cooking process. Remove each batch and drain them on new, dry\n" +
                "paper towels")
        )

        itemList.add(
            Item("Honey" ,R.drawable.honey,"Recipe: While it is less likely that anyone would do this on their own if they are not a beekeeper,\n" +
                "this might be useful for those who aspire to become one. Bees are really great and easy to keep, \u0000\n" +
                "even in the urban environment! As Novella Carpenter calls them, bees are animal for urban. All\n" +
                "you need is some space in the backyard/deck. The process of honey harvesting and extraction\n" +
                "most likely happens on a separate days. These are the tools required.")
        )

        itemList.add(
            Item("Strawberry" ,R.drawable.strawberry_ice_cream, "Recipe: Preparation. Coarsely mash strawberries with sugar, lemon juice, and salt using a potato\n" +
                "masher in a large bowl. Let stand, stirring and mashing occasionally, 10 minutes. Transfer half of\n" +
                "strawberry mixture to a blender and purée with cream until smooth. Freeze mixture in ice cream\n" +
                "maker.")
        )

        itemList.add(
            Item("Sugar cubes",R.drawable.sugar_cubes,"Recipe: Sugar cubes are extremely simple to make at home - all you need is sugar and water. In\n" +
                "addition to standard cubes, you can add color and flavor to add fun flair to a tea party or another\n" +
                "gathering. Learn how to make sugar cubes using two different methods: using a pan in the oven\n" +
                "or an ice cube tray you leave out overnight.")
        )


        recycler_view.layoutManager = GridLayoutManager(this,2)
        var adaptor = ListAdaptor(itemList)

        recycler_view.adapter = adaptor

    }
}