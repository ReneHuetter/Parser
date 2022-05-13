public class Parser {

    private final String rechnung;

    public Parser(String rechnung) {
        this.rechnung = rechnung;
    }

    public Rechnung parse () {
        String trimrechnung = rechnung.trim();
        String [] temp;
        Rechnung rechnung = null;
        trimrechnung = trimrechnung.replace(" ", "");
        if (trimrechnung.contains("+")){
            temp = trimrechnung.split("\\++");
            rechnung = new Rechnung(Double.parseDouble(temp[0]),Double.parseDouble(temp[1]),"+");
        }
        if (trimrechnung.contains("-")){
            temp = trimrechnung.split("-");
            rechnung = new Rechnung(Double.parseDouble(temp[0]), Double.parseDouble(temp[1]), "-");
        }
        if (trimrechnung.contains("*")){
            temp = trimrechnung.split("\\*+");
            rechnung = new Rechnung(Double.parseDouble(temp[0]), Double.parseDouble(temp[1]), "*");
        }
        if (trimrechnung.contains("/")){
            temp = trimrechnung.split("/");
            rechnung = new Rechnung(Double.parseDouble(temp[0]),Double.parseDouble(temp[1]),"/");
        }
        if (trimrechnung.contains("w")){
            temp = trimrechnung.split("w");
            rechnung = new Rechnung(Double.parseDouble(temp[0]),"w");
        }

        return rechnung;
    }

}
