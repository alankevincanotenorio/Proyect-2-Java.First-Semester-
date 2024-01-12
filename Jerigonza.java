/** Clase que implementa la interfaz Metodos 
 * @author Alan Kevin Cano Tenorio, Malinalli Escobedo Irineo
 * @version 1.0
 */
public class Jerigonza implements Metodos {

    //Metodos auxiliares

    private String depurar(String original){
            String depurado = original.replaceAll("[^\\p{L}\\s]", "");
            depurado = depurado
                    .replaceAll("[áÁäÄ]", "a")
                    .replaceAll("[éÉëË]", "e")
                    .replaceAll("[íÍïÏ]", "i")
                    .replaceAll("[óÓöÖ]", "o")
                    .replaceAll("[1234567890]", "")
                    .replaceAll("[úÚüÜ]", "u");
            return depurado;
    }

    private boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    
    private String invertirSilabas (String  pal ){
        String palabra = "a" + pal;
        String volteada = "";
        int a= palabra.length();           
        for(int i=a-1; i>0; i--){
            char consonate = palabra.charAt(i);
            char vocal = palabra.charAt(i-1);
                 if(esVocal(vocal) && (!esVocal(consonate))){
                    String silabas=  palabra.substring(i, a);
                    volteada = volteada +silabas;
                    a=i;
                    }else if( palabra.length()<3){
                        volteada = pal;
                    }      
               }
        return volteada;
    }
    
    private String quitar(String palabra){
        String vocal ="";
        int i =-1;
        int a=palabra.length();
        int j=palabra.length();
        for (i++; i<palabra.length(); i++) {
            char letra = palabra.charAt(i);
                if(esVocal(letra)){
                vocal += letra;
                }else{
                break;
                }
        }
        for (j--; j>0; j--) {
            char letra = palabra.charAt(j);
            if(!esVocal(letra)){
            a--;
                }else{
                break;
                }
        }
    String invertida = invertirSilabas(palabra.substring(i,j+1));
    return vocal + invertida + palabra.substring(a);
    }


    //metodos de interfaz

    /**
    * Usando el idioma de la consonante x, cifra un mensaje .
    *
    * @param original El texto a cifrar .
    * @param x La consonante con la que se va a cifrar .
    * @return el mensaje cifrado .
    */
    public String cifraIdiomaLetra ( String original , char x ){
        String depurado = depurar(original);
        String minus = depurado.toLowerCase();
        String mensaje = "";
        for(int i=1; i<minus.length(); i++){
            char carac2 = minus.charAt(i -1);
            char carac1 = minus.charAt(i);
            if(esVocal(carac1) && !esVocal(carac2)){
                mensaje=mensaje+carac2+carac1+x;
            }else{
                mensaje = mensaje + carac2;
            }
        }
        return mensaje + minus.charAt(minus.length()-1); 
    }

   /**
    * Descifra un mensaje escrito en idima de la consonante x, donde
    * la consonante x con que se cifr  ́o se puede inferir del mensaje .
    *
    * @param mensaje El texto a descifrar .
    * @return el mensaje descifrado .
    */
    public String descifraIdiomaLetra ( String mensaje ){
        String depurado = depurar(mensaje);
        String minus = depurado.toLowerCase();
        String menDes = "";
        for(int i=1; i<minus.length(); i++){
            char carac2 = minus.charAt(i -1);
            char carac1 = minus.charAt(i);
                if(esVocal(carac1) && !esVocal(carac2)){
                menDes = menDes + carac2;
                i+=2;
                }else
        menDes = menDes + carac2 ;
        }
        return menDes + minus.charAt(minus.length()-1); 
    }
    
    /**
    * Usando el idioma del ladrón y la vocal v, cifra un mensaje .
    *
    * @param original El texto a cifrar .
    * @param v La vocal de apoyo en el cifrado .
    * @return el mensaje cifrado .
    */
    public String cifraIdiomaLadron ( String original , char v ){
        String depurado = depurar(original);
        String minus = depurado.toLowerCase();
        String mensaje = "";
        for(int i=0; i<minus.length(); i++){
            char carac2 = minus.charAt(i);
            if(!esVocal(carac2) && carac2!=' '){
                mensaje = mensaje + carac2 + v + carac2;
            }else
                mensaje = mensaje + carac2;
        }
        return mensaje ; 
    }

    /**
    * Descifra un mensaje escrito en idioma del ladr  ́on, donde
    * la vocal v con que se cifró se puede inferir del mensaje .
    *
    * @param mensaje El texto a descifrar .
    * @return el mensaje descifrado .
    */
    public String descifraIdiomaLadron ( String mensaje ){
    String depurado = depurar(mensaje);
    String minus = depurado.toLowerCase();
    String men = "";
    for(int i=0; i<minus.length(); i++){
        char carac2 = minus.charAt(i);
        if(!esVocal(carac2)&& carac2!=' '){
            men = men + carac2 ;
            i+=2;
            }else
        men = men + carac2;
        }
    return men;    
    }

    /**
    * Aplica vesre a un mensaje , ya sea para cifrarlo o decscifrarlo .
    *
    * @param mensaje El texto con el que se va a trabajar .
    * @return el mensaje tras aplicarle vesre .
    */
    public String aplicaVesre(String mensaje) {
        String depurado = depurar(mensaje);
        String minus = depurado.toLowerCase();
        String conVesre ="";
        int a=0;
        for (int i = 0; i<minus.length(); i++) {
            char espacio = minus.charAt(i);
            if(espacio ==' '){
                String palabra = minus.substring(a, i);
                conVesre += quitar(palabra) + " ";
                a = i + 1; 
            }
        }
    return conVesre +quitar(minus.substring(a));
        }
}    