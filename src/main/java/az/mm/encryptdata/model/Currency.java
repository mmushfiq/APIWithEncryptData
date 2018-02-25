package az.mm.encryptdata.model;

/**
 *
 * @author MM <mushfiqazeri@gmail.com>
 */
public class Currency {
    private String base;
    private String date;
    private Rate rate;

    public Currency() {
    }

    public Currency(String base, String date, Rate rate) {
        this.base = base;
        this.date = date;
        this.rate = rate;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Rate getRate() {
        return rate;
    }

    public void setRate(Rate rate) {
        this.rate = rate;
    }
    
}
