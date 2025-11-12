import java.util.Scanner;

public class ejerciciojugadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] Jugador = new String [50];
        String[] edad = new String[50];
        String[] posicion = new String[50];
        String[] nombreEquipo = new String[50];

        Jugador[0] = "Jude Bellingham"; edad[0] = "21"; posicion[0] = "Centrocampista"; nombreEquipo[0] = "Real Madrid";
        Jugador[1] = "Vini Jr."; edad[1] = "24"; posicion[1] = "Delantero"; nombreEquipo[1] = "Real Madrid";
        Jugador[2] = "Federico Valverde"; edad[2] = "26"; posicion[2] = "Centrocampista"; nombreEquipo[2] = "Real Madrid";
        Jugador[3] = "Antonio Rüdiger"; edad[3] = "31"; posicion[3] = "Defensa"; nombreEquipo[3] = "Real Madrid";
        Jugador[4] = "Thibaut Courtois"; edad[4] = "32"; posicion[4] = "Portero"; nombreEquipo[4] = "Real Madrid";
        Jugador[5] = "Luka Modric"; edad[5] = "39"; posicion[5] = "Centrocampista"; nombreEquipo[5] = "Real Madrid";
        Jugador[6] = "Dani Carvajal"; edad[6] = "32"; posicion[6] = "Defensa"; nombreEquipo[6] = "Real Madrid";
        Jugador[7] = "Eduardo Camavinga"; edad[7] = "22"; posicion[7] = "Centrocampista"; nombreEquipo[7] = "Real Madrid";
        Jugador[8] = "Lamine Yamal"; edad[8] = "17"; posicion[8] = "Delantero"; nombreEquipo[8] = "FC Barcelona";
        Jugador[9] = "Gavi"; edad[9] = "20";posicion[9] = "Centrocampista"; nombreEquipo[9] = "FC Barcelona";
        Jugador[10] = "Pedri"; edad[10] = "22"; posicion[10] = "Centrocampista"; nombreEquipo[10] = "FC Barcelona";
        Jugador[11] = "Robert Lewandowski"; edad[11] = "36"; posicion[11] = "Delantero"; nombreEquipo[11] = "FC Barcelona";
        Jugador[12] = "Jules Koundé"; edad[12] = "26"; posicion[12] = "Defensa"; nombreEquipo[12] = "FC Barcelona";
        Jugador[13] = "Marc-André ter Stegen"; edad[13] = "32"; posicion[13] = "Portero"; nombreEquipo[13] = "FC Barcelona";
        Jugador[14] = "Ronald Araújo"; edad[14] = "25"; posicion[14] = "Defensa"; nombreEquipo[14] = "FC Barcelona";
        Jugador[15] = "Frenkie de Jong"; edad[15] = "27"; posicion[15] = "Centrocampista"; nombreEquipo[15] = "FC Barcelona";
        Jugador[16] = "Jesús Navas"; edad[16] = "38"; posicion[16] = "Defensa"; nombreEquipo[16] = "FC Sevilla";
        Jugador[17] = "Youssef En-Nesyri"; edad[17] = "27"; posicion[17] = "Delantero"; nombreEquipo[17] = "FC Sevilla";
        Jugador[18] = "Lucas Ocampos"; edad[18] = "30"; posicion[18] = "Delantero"; nombreEquipo[18] = "FC Sevilla";
        Jugador[19] = "Marcos Acuña"; edad[19] = "33"; posicion[19] = "Defensa"; nombreEquipo[19] = "FC Sevilla";
        Jugador[20] = "Nemanja Gudelj"; edad[20] = "32"; posicion[20] = "Centrocampista"; nombreEquipo[20] = "FC Sevilla";
        Jugador[21] = "Dodi Lukebakio"; edad[21] = "27"; posicion[21] = "Delantero"; nombreEquipo[21] = "FC Sevilla";
        Jugador[22] = "Ørjan Nyland"; edad[22] = "34"; posicion[22] = "Portero"; nombreEquipo[22] = "FC Sevilla";
        Jugador[23] = "Sergio Ramos"; edad[23] = "38"; posicion[23] = "Defensa"; nombreEquipo[23] = "FC Sevilla";
        Jugador[24] = "Nico Williams"; edad[24] = "22"; posicion[24] = "Delantero"; nombreEquipo[24] = "Athletic de Bilbao";
        Jugador[25] = "Iñaki Williams"; edad[25] = "30"; posicion[25] = "Delantero"; nombreEquipo[25] = "Athletic de Bilbao";
        Jugador[26] = "Oihan Sancet"; edad[26] = "24"; posicion[26] = "Centrocampista"; nombreEquipo[26] = "Athletic de Bilbao";
        Jugador[27] = "Unai Simón"; edad[27] = "27"; posicion[27] = "Portero"; nombreEquipo[27] = "Athletic de Bilbao";
        Jugador[28] = "Daniel Vivian"; edad[28] = "25"; posicion[28] = "Defensa"; nombreEquipo[28] = "Athletic de Bilbao";
        Jugador[29] = "Óscar de Marcos"; edad[29] = "35"; posicion[29] = "Defensa"; nombreEquipo[29] = "Athletic de Bilbao";
        Jugador[30] = "Ander Herrera"; edad[30] = "35"; posicion[30] = "Centrocampista"; nombreEquipo[30] = "Athletic de Bilbao";
        Jugador[31] = "Gorka Guruzeta"; edad[31] = "28"; posicion[31] = "Delantero"; nombreEquipo[31] = "Athletic de Bilbao";
        Jugador[32] = "Lucas Pérez"; edad[32] = "36"; posicion[32] = "Delantero"; nombreEquipo[32] = "RCD Deportivo";
        Jugador[33] = "Yeremay Hernández"; edad[33] = "22"; posicion[33] = "Centrocampista"; nombreEquipo[33] = "RCD Deportivo";
        Jugador[34] = "Diego Villares"; edad[34] = "28"; posicion[34] = "Centrocampista"; nombreEquipo[34] = "RCD Deportivo";
        Jugador[35] = "Pablo Martínez"; edad[35] = "35"; posicion[35] = "Defensa"; nombreEquipo[35] = "RCD Deportivo";
        Jugador[36] = "Germán Parreño"; edad[36] = "38"; posicion[36] = "Portero"; nombreEquipo[36] = "RCD Deportivo";
        Jugador[37] = "David Mella"; edad[37] = "19"; posicion[37] = "Delantero"; nombreEquipo[37] = "RCD Deportivo";
        Jugador[38] = "Miguel Loureiro"; edad[38] = "28"; posicion[38] = "Defensa"; nombreEquipo[38] = "RCD Deportivo";
       Jugador[39] = "Marcos Soriano"; edad[39] = "27"; posicion[39] = "Centrocampista"; nombreEquipo[39] = "RCD Deportivo";

    for{
        }

    }
}


