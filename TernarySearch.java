class TernarySearch {

    static int ternarySearch(int l, int r, int key, int ar[])
    {
        if (r >= l) {
            //Primer caso de recursividad
            //key =2
            //Segundo caso
            //key = 5
            //Tercer caso
            //key = 8

            int mid1 = l + (r - l) / 3; // =3 //primer caso =0//segundo caso =4//tercer caso =8 =5=
            int mid2 = r - (r - l) / 3; // =6 //primcer caso =1//segundo caso =5//tercer caso =8 =6=

            if (ar[mid1] == key) {
                return mid1;
            }
            if (ar[mid2] == key) {
                return mid2;
            }


            if (key < ar[mid1]) {
                return ternarySearch(l, mid1 - 1, key, ar);
            }
            else if (key > ar[mid2]) {
                return ternarySearch(mid2 + 1, r, key, ar);
            }
            //Valores entre mid1 y mid2
            else {
                return ternarySearch(mid1 + 1, mid2 - 1, key, ar);
            }
        }

        return -1;
    }


    public static void main(String args[])
    {
        int l, r, p, key;

        int ar[] = { 1,2,3,4,5,6,7,8,9,10 };

        l =0;

        r = ar.length-1;

        key = 8;

        p = ternarySearch(l, r, key, ar);

        if(p==-1){
            System.out.println("El valor no existe en el array");
        }
        else{
            System.out.println("El indice de " + key + " es " + p);
        }

    }
}