public class FreeStyle implements Decoratable{

  private static String message;

  FreeStyle(String _message){
    message = _message;
  }

  public void decorate (){
   System.out.print("\n\n" +
           " _._     _,-\'\"\"`-._ \n" +
           "(,-.`._,'(       |\\`-/| \n" +
           "    `-.-' \\ )-`( , o o) " +  "     " + message + "\n" +
           "          `-    \\`_`\"'- \n" +
           "\n") ;
  }
}

/*
 _._     _,-'""`-._
(,-.`._,'(       |\`-/|
    `-.-' \ )-`( , o o)
          `-    \`_`"'-
 */
