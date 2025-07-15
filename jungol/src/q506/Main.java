package q506;

public class Main {
    int height;
    double weight;


    public Main(int he, double we) {
        this.height = he;
        this.weight = we;
    }


    public void printDetails() {
        System.out.println("My height");
        System.out.println(this.height);
        System.out.println("My weight");
        System.out.printf("%.6f%n", this.weight); 
    }

   
    
    
    
    
    
    public static void main(String[] args) {
        Main ma = new Main(170, 68.6);
        ma.printDetails(); 
    }
}
