
package ohtu.verkkokauppa;

import java.util.ArrayList;

/**
 *
 * @author ensio
 */
public interface TapahtumaMuisti {

    ArrayList<String> getTapahtumat();

    void lisaaTapahtuma(String tapahtuma);
    
}
