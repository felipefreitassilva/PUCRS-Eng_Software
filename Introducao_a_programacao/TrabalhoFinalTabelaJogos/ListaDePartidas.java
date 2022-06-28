public class ListaDePartidas {

    private Partida[] partidas;

    public ListaDePartidas() {
        this.partidas = new Partida[380];
    }

    public Partida[] getPartidas() {
        return this.partidas;
    }

    private int getQuantidadePartidas() {
        int quantidadePartidas = 0;

        for (Partida partida : partidas)
            if (partida != null)
                quantidadePartidas++;

        return quantidadePartidas;
    }

    public boolean existePartida(int numeroPartida) {
        if (indiceDeAlgoEmUmVetor(numeroPartida) > -1)
            if (partidas[indiceDeAlgoEmUmVetor(numeroPartida)] != null)
                return true;
        return false;
    }

    public Partida consultaPartida(int numeroPartida) {
        return partidas[indiceDeAlgoEmUmVetor(numeroPartida)];
    }

    private int indiceDeAlgoEmUmVetor(int numeroProcurado) {
        int i = 0;

        if (partidas == null)
            return -1;

        while (i < partidas.length) {
            if (partidas[i] != null)
                if (partidas[i].getNumeroPartida() == numeroProcurado)
                    return i;
                else i += 1;
            else
                i += 1;
        }

        return -1;
    }

    public void alteraClubesPartida(String clubeAntigo, String clubeNovo) {
        for (int i = 0; i < partidas.length; i++)
            if (partidas[i] != null) {
                Clube clube1 = partidas[i].getClube1();
                Clube clube2 = partidas[i].getClube2();
                if(clubeAntigo.trim().equalsIgnoreCase(clube1.getNomeClube().trim()))
                    clube1.setNomeClube(clubeNovo.trim());
                if(clubeAntigo.trim().equalsIgnoreCase(clube2.getNomeClube().trim()))
                    clube2.setNomeClube(clubeNovo.trim());
            }
    }

    public void inserePartida(Data dataPorInserir, Clube[] clubesPorInserir, int[] placarPorInserir) {
        Partida partidaPorInserir = new Partida(dataPorInserir, clubesPorInserir, placarPorInserir);

        for (int i = 0; i < partidas.length; i++)
            if (partidas[i] == null) {
                partidas[i] = partidaPorInserir;
                partidas[i].setNumeroPartida(i + 1);
                break;
            }
    }

    public void ordenarTabelaData() {
        int quantidadePartidas = getQuantidadePartidas() - 1;
        for (int i = 0; i < quantidadePartidas; i++) {
            for (int j = 0; j < quantidadePartidas - i; j++) {
                Data dataPartida = partidas[j].getData();
                Data dataPartidaSeguinte = partidas[j + 1].getData();
                int mesPartida = dataPartida.getMes();
                int mesPartidaSeguinte = dataPartidaSeguinte.getMes();
                int diaPartida = dataPartida.getDia();
                int diaPartidaSeguinte = dataPartidaSeguinte.getDia();
                int horaPartida = dataPartida.getHora();
                int horaPartidaSeguinte = dataPartidaSeguinte.getHora();
                int minutoPartida = dataPartida.getMinuto();
                int minutoPartidaSeguinte = dataPartidaSeguinte.getMinuto();
                if (mesPartida > mesPartidaSeguinte)
                    troca(j);
                else if (mesPartida == mesPartidaSeguinte)
                    if (diaPartida > diaPartidaSeguinte)
                        troca(j);
                    else if (diaPartida == diaPartidaSeguinte)
                        if (horaPartida > horaPartidaSeguinte)
                            troca(j);
                        else if (horaPartida == horaPartidaSeguinte)
                            if (minutoPartida > minutoPartidaSeguinte)
                                troca(j);
            }
        }
    }

    private void troca(int posicaoProcurada) {
        Partida aux = partidas[posicaoProcurada];
        partidas[posicaoProcurada] = partidas[posicaoProcurada + 1];
        partidas[posicaoProcurada + 1] = aux;
    }
}
