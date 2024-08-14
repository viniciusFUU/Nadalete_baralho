public class Baralho {
    public Carta[] baralho = new Carta[56];
    public String[] cartas = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "dama", "valete", "reis", "coringa"};
    public String[] naipe = {"ouros", "espadilha", "copas", "paus"};
    public int posicao;

    public Baralho(){
        int index = 0;

        for (int i=0; i < cartas.length ; i++){
            for (int j=0; j < naipe.length; j++){
                Carta carta = new Carta(cartas[i], naipe[j]);
                baralho[index] = carta;

                if (carta.getCarta() == "coringa"){
                    Carta cartaCoringa = new Carta("coringa", "coringa");
                    baralho[index] = cartaCoringa;
                }

                index++;
            }
        }
    }

    public void embaralha(){
        int qtdCartasNoBaralho = baralho.length;

        for (int i=0; i < qtdCartasNoBaralho; i++){
            int valorAletorio = (int) (Math.random() * qtdCartasNoBaralho);

            Carta atual = baralho[i];
            baralho[i] = baralho[valorAletorio];
            baralho[valorAletorio] = atual;
        }
    }

    public Carta distribuirCartas(){
        Carta baralhoAtual = baralho[posicao];
        posicao++;

        return baralhoAtual;
    }

    public void imprimeBaralho(){
        int qtdCartasNoBaralho = baralho.length;

        for(int i = 0; i < qtdCartasNoBaralho; i++){
            System.out.println(i);
            String carta = baralho[i].getCarta().toString();
            String naipe =  baralho[i].getNaipe().toString();
            System.out.println(carta + " de " + naipe); 
        }
    }

    public static void main(String[] args) throws Exception {
        Baralho baralho = new Baralho();
        // baralho.imprimeBaralho();
        baralho.embaralha();
        baralho.imprimeBaralho();
    }
}
