package fes.aragon.test;

public class AnalisisString {

    private String parrafo;

    public AnalisisString(String parrafo) {
        this.parrafo = parrafo;
    }

    public int longitudParrafo() {
        return parrafo.length();
    }

    public int numeroDePalabras() {
        String[] palabras = parrafo.split(" ");
        return palabras.length;
    }

    public String palabrasRepetidas() {
        String cadena = "";
        String[] palabras = parrafo.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            for (int j = i+1; j < palabras.length; j++) {
                if(palabras[i].equals(palabras[j])){
                    if(cadena.indexOf(palabras[i])==-1){
                        cadena+=palabras[i] + "\n";
                        j=palabras.length;
                    }
                }
            }
        }
        return cadena;
    }
    public static void main(String[] args) {
        String parrafo = "La amistad es un alma que habita en dos cuerpos; un corazón que habita en dos almas. que";
        AnalisisString obj = new AnalisisString(parrafo);
        System.out.println(obj.palabrasRepetidas());
        
    }
}
