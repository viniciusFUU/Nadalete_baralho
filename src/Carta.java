public class Carta {
    private String carta, naipe;
    
    public Carta(String carta, String naipe){
        this.carta = carta;
        this.naipe = naipe;
    }

    public String getCarta() {
        return carta;
    }

    public void setCarta(String carta) {
        this.carta = carta;
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }
}
