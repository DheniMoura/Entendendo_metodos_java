public class Main {
    public static void main(String[] args) throws Exception {
        double area1 = Quadrilateros.area(3.5);
        double area2 = Quadrilateros.area(5d, 1.2d);
        float area3 = Quadrilateros.area(5f, 1.2f);
        double area4 = Quadrilateros.area(2, 3,1.2);
        double area5 = Quadrilateros.area(2.5);
        double area6 = Quadrilateros.area(3d,1.5d);
        float area7 = Quadrilateros.area(3f,1.5f);
        double area8 = Quadrilateros.area(3,2,1);

        System.out.println("Impressões");
        System.out.println("Área do quadrado: " + area1);
        System.out.println("Área do retângulo: " + area2);
        System.out.println("Área do trapézio: " + area3);
        System.out.println("Área do losango: " + area4);
        System.out.println("Área do quadrado: " + area5);
        System.out.println("Área do retângulo: " + area6);
        System.out.println("Área do trapézio: " + area7);
        System.out.println("Área do losango: " + area8); 
        System.out.println(Math.ceil(2.5)); 


    }
}


