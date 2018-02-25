package az.mm.encryptdata.rest;

import az.mm.encryptdata.model.Currency;
import az.mm.encryptdata.model.Rate;
import com.google.gson.Gson;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.jasypt.util.text.BasicTextEncryptor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author MM <mushfiqazeri@gmail.com>
 */
@RestController
public class Controller {

    @GetMapping("/currency/rates")
    public String getRates() {
        
        List<Currency> rates = new ArrayList();
        Rate rateUSD = new Rate();
        rateUSD.setEUR("0.81307");
        rateUSD.setGBP("0.71502");
        rateUSD.setJPY("106.74");
        rateUSD.setRUB("56.466");
        rateUSD.setTRY("3.7869");
        
        Currency currency1 = new Currency();
        currency1.setBase("USD");
        currency1.setDate(LocalDate.now().toString());
        currency1.setRate(rateUSD);
        rates.add(currency1);
        
        Rate rateRUB = new Rate();
        rateRUB.setEUR("0.014399");
        rateRUB.setGBP("0.012663");
        rateRUB.setJPY("1.8903");
        rateRUB.setUSD("0.01771");
        rateRUB.setTRY("0.067065");
        
        Currency currency2 = new Currency();
        currency2.setBase("RUB");
        currency2.setDate(LocalDate.now().toString());
        currency2.setRate(rateRUB);
        rates.add(currency2);

        String json = new Gson().toJson(rates);
        System.out.println("gson output: " + json);
        
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPasswordCharArray("mySecretKey".toCharArray());
        String encryptedJson = textEncryptor.encrypt(json);
        
        return encryptedJson;
    }
    
    @GetMapping("/currency/rates2")
    public List<Currency> getRates2() {
        
        List<Currency> rates = new ArrayList();
        Rate rateUSD = new Rate();
        rateUSD.setEUR("0.81307");
        rateUSD.setGBP("0.71502");
        rateUSD.setJPY("106.74");
        rateUSD.setRUB("56.466");
        rateUSD.setTRY("3.7869");
        
        Currency currency1 = new Currency();
        currency1.setBase("USD");
        currency1.setDate(LocalDate.now().toString());
        currency1.setRate(rateUSD);
        rates.add(currency1);
        
        Rate rateRUB = new Rate();
        rateRUB.setEUR("0.014399");
        rateRUB.setGBP("0.012663");
        rateRUB.setJPY("1.8903");
        rateRUB.setUSD("0.01771");
        rateRUB.setTRY("0.067065");
        
        Currency currency2 = new Currency();
        currency2.setBase("RUB");
        currency2.setDate(LocalDate.now().toString());
        currency2.setRate(rateRUB);
        rates.add(currency2);

        return rates;
    }

}
