
package ohtu.verkkokauppa;

/**
 *
 * @author ensio
 */
public interface TuoteKokoelma {

    Tuote haeTuote(int id);

    void otaVarastosta(Tuote t);

    void palautaVarastoon(Tuote t);

    int saldo(int id);
    
}
