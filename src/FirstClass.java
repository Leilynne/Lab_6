public class FirstClass {
    private char symbol;
    private String text;

    public void setValue(char symbol) {
        this.symbol = symbol;
    }
    public void setValue(String text) {
        this.text = text;
    }
    public void setValue(char[] symbol) {
       if (symbol.length > 1){
           this.text = new String(symbol);
       } else {
           this.symbol = symbol[0];
       }
    }
    public String toString() {
        return symbol + " " + text;
    }
}
