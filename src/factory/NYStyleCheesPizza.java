package factory;

class NYStyleCheesPizza extends Pizza{
    NYStyleCheesPizza(){
        name = "Ny cheese pizza";
        dough = "Thin crust dough";
        sauce = "marinara sauce";

        toppings.add("파인애플");
        toppings.add("삼겹살");
    }
}
