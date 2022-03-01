package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author a21mariopm
 */
public class Aro {
    public static final double MINIMO = 0.0;
    private static final double LIMITERADIO = 0.0;
    private int coordenadaX;
    private int coordenadaY;
    private double radio;
    

    public Aro() {
    }
 
    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        establecerRadio(valorRadio);
    }

    public void establecerX(int valorX) {
        this.coordenadaX=valorX;
    }

    public int obterX() {
        return getCoordenadaX();
    }

    public void establecerY(int valorY) {
        this.coordenadaY=valorY;
    }

    public int obterY() {
        return getCoordenadaY();
    }

    public void establecerRadio(double valorRadio) {

        radio=(valorRadio < MINIMO ? MINIMO : valorRadio);
    }

    public double obterRadio() {
        return getRadio();
    }

    public double obterDiametro() {
        return getRadio() * 2;
    }

    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    public double obterSuperficie() {
        return Math.PI * getRadio() * getRadio();
    }

    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }

    public void trasladarCentro(int trasladarX, int trasladarY){
        coordenadaX=getCoordenadaX() + trasladarX;
        coordenadaY=getCoordenadaY() + trasladarY;
    }

    /**
     * @return the coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * @return the coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }
}
 