<p>Crie a classe Carta, que possui um naipe. Crie os métodos GET e SET para os atributos. Crie agora uma classe Baralho, que possui 52 cartas. No construtor de Baralho, inicialize as 56 cartas (juntamente com os 4 coringas, que devem se chamar "coringa" e o naipe é "coringa"). Escreva os seguintes métodos:</p>
<ul>
    <li>embaralhar() - Usando o método Math.random dá para trocar as cartas dentro do baralho, misturando-as (sorteie duas posições e troque-as. Repita este este processo diversas vezes).</li>
    <li>distribuirCartas() - Devolve uma carta, retirada do topo do baralho, se não estiver vazio ou null.</li>
    <li>hasCarta() - Verifique se tem carta no baralho, devolvendo true ou false. A classe Baralho, assim construída, será útil para programar diversos jogos de caras, através de novas classes que os implementem.</li>
    <li>imprimirBaralho() - imprime as cartas para verificar como estão dispostas (se estão embaralhadas por exemplo).</li>
</ul>
