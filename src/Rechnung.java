
public class Rechnung {

    private final double nummernrechts;
    private final double nummerlinks;
    private final String op;

    public Rechnung(double number, double secnumber, String op){
        this.nummernrechts = number;
        this.nummerlinks = secnumber;
        this.op = op;
    }
    public Rechnung(double nummerlinks, String op){
        this.nummerlinks = nummerlinks;
        this.nummernrechts = 0;
        this.op = op;
    }
    public double rechne() {
        if (op.equals("+")){
            return  nummerlinks + nummernrechts;
        }
        if (op.equals("-")){
            return nummerlinks - nummernrechts;
        }
        if (op.equals("*")){
            return nummerlinks * nummernrechts;
        }
        if (op.equals("/")){
                if (nummernrechts == 0.00){
                    throw new NumberFormatException();
                }
                return nummernrechts / nummerlinks;
        }
        if (op.equals("w")){
            return Math.sqrt(nummerlinks);
        }
        return -1;
    }

}
