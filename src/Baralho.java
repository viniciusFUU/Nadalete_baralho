import java.util.ArrayList;

public class Baralho {
    public ArrayList<Carta> listaDeCartas = new ArrayList<>();
    public String[] cartas = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "dama", "valete", "reis", "coringa"};
    public String[] naipe = {"ouros", "espadilha", "copas", "paus"};
    public int posicao;

    public Baralho(){
        for (int i=0; i < cartas.length ; i++){
            for (int j=0; j < naipe.length; j++){
                Carta carta = new Carta(cartas[i], naipe[j]);
                listaDeCartas.add(carta);

                if (carta.getCarta().equals("coringa")){
                    Carta cartaCoringa = new Carta("coringa", "coringa");
                    listaDeCartas.add(cartaCoringa);
                }
            }
        }
    }

    public void embaralha(){
        int qtdCartasBaralho = listaDeCartas.size();

        for (int i = 0; i < qtdCartasBaralho; i++){
            int posicaoAleatoriaDaCarta = (int) (Math.random() * qtdCartasBaralho);

            Carta cartaAtual = listaDeCartas.get(i);
            listaDeCartas.set(i, listaDeCartas.get(posicaoAleatoriaDaCarta));
            listaDeCartas.set(posicaoAleatoriaDaCarta, cartaAtual);
        }
    }

    public String distribui(){
        Carta carta = listaDeCartas.get(posicao);
        listaDeCartas.remove(posicao);
        return "Toma para vc " + carta.getCarta().toString() + " de " + carta.getNaipe().toString();
    }

    public void imprimeBaralho(){
        for (Carta carta : listaDeCartas){
            System.out.println(carta.getCarta().toString() + " de " + carta.getNaipe().toString());
        }
    }

    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        System.out.println(baralho.distribui());
        System.out.println(baralho.distribui());
        System.out.println(baralho.distribui());
        baralho.embaralha();
        System.out.println(baralho.distribui());
        baralho.imprimeBaralho();

    }
}
