package org.example;

public class Visualizador {
    public static void carta(Carta c, Posicion p){
         Square borde = new Square (100, 150, "black");
         Square fondo = new Square(90, 140, "white");
         borde.setPosition(p.getPosX(), p.getPosY());
         fondo.setPosition(p.getPosX() + 5, p.getPosY() + 5);
         borde.makeVisible();
         fondo.makeVisible();
         int centroX = p.getPosX() + 50;
         int centroY = p.getPosY() + 75;

         String valor = " ";

         switch(c.getValor()) {
             case 1:
                 valor = "A";
                 break;
             case 11:
                 valor = "J";
                 break;
             case 12:
                 valor = "Q";
                 break;
             case 13:
                 valor = "K";
                 break;
             default:
                 valor = String.valueOf(c.getValor());
         }

         switch(c.getTipo()) {

             case CORAZONES:

                Circle corazon1 = new Circle();
                Circle corazon2 = new Circle();
                Circle corazon3 = new Circle();

                corazon1.changeColor("red");
                corazon2.changeColor("red");
                corazon3.changeColor("red");
                corazon1.setPosition(centroX - 15, centroY - 10);
                corazon2.setPosition(centroX + 5, centroY - 10);
                corazon3.setPosition(centroX - 5, centroY + 5);

                corazon1.changeSize(20);
                corazon2.changeSize(20);
                corazon3.changeSize(20);

                corazon1.makeVisible();
                corazon2.makeVisible();
                corazon3.makeVisible();

                break;
             case DIAMANTES:

                Square diamante = new Square(15,15,"red");
                diamante.setPosition(centroX - 12, centroY - 12);

                diamante.makeVisible();

                break;
             case TREBOLES:

                Person trebol = new Person();
                trebol.setPosition(centroX - 20, centroY - 35);
                trebol.changeSize(25,15);
                trebol.makeVisible();

                break;
             case ESPADAS:

                Triangle espada = new Triangle();
                espada.changeColor("black");
                espada.setPosition(centroX, centroY - 30);
                espada.changeSize(30, 30);
                espada.makeVisible();

                break;
        }

        Canvas canvas = Canvas.getCanvas();
        //canvas.drawString("A",100,100);
        canvas.drawString(valor, p.getPosX() + 10, p.getPosY() + 20);

    }

}
