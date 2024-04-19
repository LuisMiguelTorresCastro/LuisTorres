package mx.utng.Sesion004;

public class ContadorCaracteres {
    
    public boolean isVocal(char caracter){
        
        return caracter == 'a'
                            ||caracter =='e'
                            ||caracter =='i'
                            ||caracter =='o'
                            ||caracter =='u';
    }
    public boolean isConsonante(char caracter){
        short codigoAscii = (short)caracter;
        return(codigoAscii >=97 && codigoAscii<=122) && !isVocal(caracter);
    }

    public boolean isNumero(char caracter){
        short codigoAscii = (short)caracter;
        
        return codigoAscii >= 48 && codigoAscii <= 57;
    }

    public boolean isSimbolo(char caracter){

        return !(isVocal(caracter));
    }

    public int cuentaVocales(String palabra){
        Return 0;
    }

    public int cuentaConsonante(String palabra){
        Return 0;
    }

    public int cuentaNumero(String palabra){
        Return 0;
    }

    public int cuentaSImbolo(String palabra){
        Return 0;
    }
}