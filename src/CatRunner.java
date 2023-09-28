public class CatRunner {
    public static void main(String[] args){
        //First instance from Cat Class
        Cat cat1 = new Cat("Farhan", 7, 7);
        cat1.introduce();
        cat1.printCatInfo();
        //Second instance from Cat Class
        Cat cat2 = new Cat("Karim", 4, 24);
        cat2.introduce();
        cat2.printCatInfo();

    }
}
