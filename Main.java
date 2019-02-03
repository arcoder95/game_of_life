package gameoflife;


public class Main {

    public static void main(String[] args) {
        // voit tehdä tänne testikoodia

        // Jos ohjelmassa on useampi luokka, joka sisältää main-metodin, voi
        // halutun main metodin käynnistää valitsemalla luokka vasemmalla
        // olevasta projektilistauksesta ja painamalla oikealla
        // hiirennapilla "Run File".
        GameOfLife gol = new GameOfLife(3, 3);

int[][] taulukko = new int[3][3];
taulukko[0][0] = 2;
taulukko[1][0] = 3;
taulukko[2][0] = 4;
taulukko[0][1] = 5;
taulukko[1][1] = 1;
taulukko[2][1] = 6;
taulukko[0][2] = 7;
taulukko[1][2] = 8;
taulukko[2][2] = 9;

System.out.println(gol.elossaOleviaNaapureita(taulukko, 1, 1));

    }

}
