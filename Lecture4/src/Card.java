public class Card{
  public static void main (String[] args){
    Card card1, card2, card3;
    card1 = new Card(Card.SPADE, 1);
    card2 = new Card(Card.DIAMOND, 2);
    card3 = new Card(Card.SPADE, 13);

    System.out.println("Card 1");
    System.out.println(card1.toString());
    System.out.println(card1.getColor());
    System.out.println(card1.getMark());
    System.out.println(card1.getNumber());

    System.out.println("Card 2");
    System.out.println(card2.toString());
    System.out.println(card2.getColor());
    System.out.println(card2.getMark());
    System.out.println(card2.getNumber());

    System.out.println("Card 3");
    System.out.println(card3.toString());
    System.out.println(card3.getColor());
    System.out.println(card3.getMark());
    System.out.println(card3.getNumber());

  }

  private int mark;
  private int number;

  public static final int SPADE = 0;
  public static final int HEART = 1;
  public static final int CLUB = 2;
  public static final int DIAMOND = 3;

  public static final int BLACK = 0;
  public static final int RED = 1;

  public Card (int m, int num){
    this.mark = m;
    this.number = num;
  }

  public int getMark(){
    return this.mark;
  }

  public int getNumber(){
    return this.number;
  }

  public String getColor(){
    switch(this.mark){
      case SPADE:
      case CLUB:
        return "黒を表す値";
      default:
        return "赤を表す値";
    }
  }

  public String toString(){
    String outputString = "";
    switch(this.mark){
      case SPADE:
        outputString = outputString.concat("S");
        break;
      case HEART:
        outputString = outputString.concat("H");
        break;
      case CLUB:
        outputString = outputString.concat("C");
        break;
      case DIAMOND:
        outputString = outputString.concat ("D");
        break;
      default:
        outputString = outputString.concat(" ");
        break;
    }
    switch(this.number){
      case 1:
        outputString = outputString.concat(",A");
        break;
      case 11:
        outputString = outputString.concat(",J");
        break;
      case 12: 
        outputString = outputString.concat(",Q");
        break;
      case 13:
        outputString = outputString.concat(",K");
        break;
      default:
        outputString = outputString.concat("," + this.number);
    }
    return outputString;
  }

}

