package org.example;
    public class Animaux{
        public static void main(String[] a){
            Criant[] tab = new Criant[4];
            tab[0] = new Chat();
            tab[1] = new Chien();
            tab[2] = new Chat();
            tab[3] = new Chien();
            for (int i=0; i<4; i++){
                tab[i].crier();
            }
        }
}
