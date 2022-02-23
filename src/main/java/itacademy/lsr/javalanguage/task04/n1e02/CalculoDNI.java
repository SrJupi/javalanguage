package itacademy.lsr.javalanguage.task04.n1e02;

public class CalculoDNI {
    String dniLetters = "TRWAGMYFPDXBNJZSQVHLCKE";

    public char getLetter(String numberDNI) throws Exception {
        if (numberDNI.length() > 8){
            throw new Exception("DNI size should not be bigger than 8 digits!");
        }
        while (numberDNI.charAt(0) == '0' && numberDNI.length() > 1){
            numberDNI = numberDNI.substring(1);
        }
        return dniLetters.charAt(Integer.parseInt(numberDNI) % 23);
    }
}