public class Main {
    public static void main(String[] args){

        Gryfindor harryPotter= new Gryfindor(" Harry Potter " ,20, 25,13,23,56 );
        Gryfindor hermioneGreinger = new Gryfindor("Hermione Greinger", 55,76,23,58,80);
        Gryfindor ronWhyslee = new Gryfindor("Ron Whyslee", 55,76,23,58,80);


        Slizerin drackoMalfoy = new Slizerin("Dracko Malfoy", 22,11,556,77,88,99,100);
        Slizerin grackhamMontegu = new Slizerin("Grackham Montegu", 22,11,556,77,88,99,100);
        Slizerin gregoryGoil = new Slizerin("Gregory Goil", 22,11,556,77,88,99,100);

        Puffenduy zackhariaSmith = new Puffenduy("Zackharia Smith", 13,11,56,70,83);
        Puffenduy cedricDiggory = new Puffenduy("Cedric Diggory", 13,11,56,70,83);
        Puffenduy  justinFinchFletchley = new Puffenduy("Justin Finch-Fletchley", 13,11,56,70,83);

        Kogtevran zhouChang = new Kogtevran("Zhou Chang", 34,76,87,56,87,82);
        Kogtevran padmaPatil = new Kogtevran("Padma Patil", 34,44,76,88, 11, 76);
        Kogtevran marcusBelby = new Kogtevran("Marcus Belby", 34,44,76,88, 11, 78);



        Gryfindor.compare(harryPotter,drackoMalfoy);

    }
}