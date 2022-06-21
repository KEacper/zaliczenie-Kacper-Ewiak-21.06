//Napisz program, który usuwa wszystkie spacje z łańcucha.

class Main {
  public static void main(String []args){
        String tekst = "tekst ze spacjami";
        tekst = tekst.replaceAll(" ", "");
        System.out.println(tekst);
     
  }
}