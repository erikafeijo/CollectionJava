package Animal_POO;

public class CollectionJava {

}

Scanner sc = new Scanner(System.in);

Cavalo horse = new Cavalo("Pé de Pano",10);
Cachorro dog = new Cachorro("Revoada", 15);
Preguica p = new Preguica("Preguicinha",3);


Cavalo horse = new Cavalo(null,null);
Cachorro dog = new Cachorro(null,null);
Preguica p = new Preguica(null,null);



System.out.println("\nQual animal você deseja?");
@@ -23,7 +26,7 @@ public static void main(String[] args) {

switch(op) {
case 1: 
horse.imprimirInfo(null, op);
horse.imprimirInfo(nome, idade);
horse.CaveloCorrer();
horse.EmitirSom(null);
break;