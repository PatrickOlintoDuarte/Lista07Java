public class Impressora {

    public void Exibir(float f1){
        System.out.println(f1);
    }
    public void Exibir(float f1, float f2){
        System.out.println(f1+ "," +f2);
        
    }
    public void Exibir(float f1, String s1){
        System.out.println(f1 + "," + s1);
    }
    public void Exibir(String s1, float f1){
        Exibir(f1,s1);
    }

    public void Exibir(String s1,String s2, String s3){
        System.out.printf("%s, %s, %s \n",s1,s2,s3);
    }

    public void Exibir(int a1, int a2, String s1){
        System.out.println(a1 + ", " + a2 + ", " + s1 );
    }
}