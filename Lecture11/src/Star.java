public class Star implements Decoratable {
  private String str;
  public static void main(String[] args){

  }
  Star(String str){
   this.str = str;
  }
  public void decorate (){
   System.out.println("*" + this.str + "*") ;
  }
}
