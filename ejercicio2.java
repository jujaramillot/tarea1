public class ejercicio2 {
    public static void main(String[] args) {
        double suma, x ,y;
        suma = 0;
        x =20;
        suma = x + suma;
        y = 40;
        x= x + Math.pow(y,2);
        suma = suma + (x/y);
        System.out.println("El valor de la suma es:" + suma);
    }

}
