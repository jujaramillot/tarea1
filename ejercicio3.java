public class ejercicio3 {
    public static void main(String[] args) {
        double horas_tr, vl_hora, retencion, bruto, neto;
        horas_tr = 48;
        vl_hora = 5000;
        bruto = vl_hora * horas_tr;
        retencion = bruto * (15.5/100);
        neto = bruto - retencion;
        System.out.println("El valor bruto es:" + bruto);
        System.out.println("La retencion es:" + retencion);
        System.out.println("El valor neto es:" + neto);
        

    }
}
