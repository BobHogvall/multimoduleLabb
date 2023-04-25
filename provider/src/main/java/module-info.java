import org.example.provider.Euro;
import org.example.provider.Peso;
import org.example.provider.Won;
import org.example.service.CurrencyConverter;



module org.example.provider {
    requires org.example.service;
    provides CurrencyConverter with Euro, Won, Peso;

}