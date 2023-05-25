public class App {
    public static void main(String[] args) throws Exception {
        Auto ferrari=new Auto("pan", 1, "ferrari");
        Auto mercedes=new Auto("cosma", 2, "mercedes");
        Auto tesla=new Auto("rizzoti", 3, "tesla");
        Auto fiat=new Auto("langone", 4, "fiat");
        
        mercedes.start();
        ferrari.start();
        tesla.start();
        fiat.start();

        

    }
}

