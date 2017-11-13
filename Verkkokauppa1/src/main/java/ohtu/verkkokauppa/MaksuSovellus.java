package ohtu.verkkokauppa;

/**
 *
 * @author ensio
 */
public interface MaksuSovellus {

    boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa);
    
}
