public class CalculadoraCientifica {
    
    public double raiz(int ra){
        return Math.sqrt(ra);
    }
    
    public double raiz(double db){
        return Math.sqrt(db);
    }
    
    public double raiz(String s1){
        return raiz(Double.parseDouble(s1));
    }
   
    public double potencia(byte a, byte b){
        return Math.pow(a,b);
    }
    
    public double potencia(String s1, String s2){
        return Math.pow(Double.parseDouble(s1),Double.parseDouble(s2));
    }
    
    public double potencia(int a, double b){
        return Math.pow(a,b);
    }
}
