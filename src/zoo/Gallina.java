package zoo;

/**
 *
 * @author osds
 */
public class Gallina extends Ave {
 
    private String cacareo = "GRRRRR";
    
    /**
     *
     */
    public Gallina () {}
    
    /**
     *
     * @param habitat
     * @param comida
     * @param longevidad
     * @param periodoIncubacion
     */
    public Gallina (Habitat habitat, String comida, int longevidad, int periodoIncubacion) {
        super(habitat, comida, longevidad, periodoIncubacion);
    }
    
    /**
     *
     * @param cacareo
     */
    public void setCacareo (String cacareo) { this.cacareo = cacareo; }
    
    /**
     *
     * @return
     */
    public String getCacareo () { return cacareo; }
    
    /**
     *
     */
    public void rugir () { System.out.println(cacareo); }
    
    /**
     *
     */
    public void comer () { System.out.println("Estoy comiendo " + comida); }
    
    /**
     *
     */
    public void desplazar () { System.out.println("Estoy volando con mucha dificultad"); }
}
