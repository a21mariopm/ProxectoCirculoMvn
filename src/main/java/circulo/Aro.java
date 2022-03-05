package circulo;

/**
 * Probas clase Aro
 * @author a21mariopm
 */
public final class Aro {

    /**
     * @return a coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * @param valorX the valorX to set
     */
    public void setCoordenadaX(int valorX) {
        this.coordenadaX = valorX;
    }

    /**
     * @return a coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * @param valorY the valorY to set
     */
    public void setCoordenadaY(int valorY) {
        this.coordenadaY = valorY;
    }

    /**
     * @return o radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * 
     * @param valorRadio the radio to set
     */
    public void setRadio(double valorRadio) {
        this.radio = (valorRadio < MINIMO ? MINIMO : valorRadio);
    }

    private static final double LIMITERADIO = 0.0;

    /**
     * definición das variables
     */
    public static final double MINIMO = LIMITERADIO;

    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    /**
     * constructor vacío
     */
    public Aro() {
    }

    /**
     * 
     * @param valorX
     * @param valorY
     * @param valorRadio
     */
    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }

    /**
     * Obten diametro do radio
     * @return o radio multiplicado por 2
     */
    public double obterDiametro() {
        return radio * 2;
    }

    /**
     * Obtencircunferencia do aro
     * @return Math.PI * obterDiametro()
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    /**
     * Obten superficie do aro
     * @return Math.PI * radio * radio
     */
    public double obterSuperficie() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Centro = [" + coordenadaX + "," + coordenadaY + "]; Radio = " + radio;
    }

    /**
     *
     * @param trasladarx
     * @param trasladary
     */
    public void trasladarCentro(int trasladarx, int trasladary){
        coordenadaX += trasladarx;
        coordenadaY += trasladary;
    }
}