public class TesteModelo {
    public static void main(String[] args){
        Modelo m = new Modelo();
        System.out.println("Booleano: " + m.bool);
        System.out.println("char: " + m.c);
        System.out.println("int: " + m.inteiro);
        System.out.println("double: " + m.quebrado);
        System.out.println("String: " + m.str);

        System.out.println("m = " + m); // toString da classe Object gera a hashcode do objeto

        Modelo m2 = new Modelo();
        System.out.println("m2 = " + m);
    }
}