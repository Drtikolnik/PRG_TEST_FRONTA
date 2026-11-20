public class Fronta {

    private Node front = null;
    private Node rear = null;
    private int size = 0;

    private int pocet;

    public Fronta() {
    }

    public void add(String playerName, String favouriteClass, int MMR) {
        Hrac hrac = new Hrac(playerName, favouriteClass, MMR);
        Node newNode = new Node(hrac);
        if(front == null) {
            front = newNode;
            rear = newNode;
        }else{
            rear.setNext(newNode);
            rear = newNode;
        }
        size++;

    }

    public void deleteFirst(){
        Hrac hrac = front.getData();
        front = front.getNext();

        if(front == null){
            rear = null;
        }
        size--;
    }

    public void zaregistrovat(){
        if(front == null){
            System.out.println("Fronta je prázdná");
            return;
        }
        String name = front.getData().getPlayerName();

        deleteFirst();

        System.out.println("Hráč " +name+ " uspesne zaregistrovan");

    }


    public void printAll(){
        if(front == null){
            System.out.println("Fronta je prázdná");
            return;
        }

        Node current = front;
        while(current != null){
            System.out.println(current.getData().toString());
            current = current.getNext();



        }
    }

    public void nakouknuti(){
        if(front == null){
            System.out.println("Fronta je prázdná");
            return;
        }

        System.out.println("na řadě je:");
        System.out.println(front.getData().toString());
    }

    public void printAboveMMR(int mmr){
        if(front == null){
            System.out.println("Fronta je prázdná");
            return;
        }

        Node current = front;
        while(current != null){
            if(current.getData().getMMR() >= mmr){
                System.out.println(current.getData().toString());
            }
            current = current.getNext();

        }
    }

    public void printForName(String name){
        if(front == null){
            System.out.println("Fronta je prázdná");
            return;
        }

        Node current = front;
        while(current != null){
            if(current.getData().getPlayerName().toLowerCase().equals(name.toLowerCase())){
                System.out.println(current.getData().toString());
            }
            current = current.getNext();

        }
    }








}
