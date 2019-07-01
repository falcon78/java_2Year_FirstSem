public class List implements Decoratable{
  private String str ;
  private int n;

  List(String str, int n){
    this.str = str;
    this.n = n;
  }
  public void decorate (){
    for (int i =0; i< n; i++){
      System.out.println("・" + this.str );
    }
  }
    
}
