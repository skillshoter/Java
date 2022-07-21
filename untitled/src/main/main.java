


public class main {
    public static void main(String[] args) {
       System.out.println("Gerente ----------------------");
        Manager gerente = new Manager("Eduardo","Siqueroli");
        System.out.println(gerente.FirstName());
        System.out.println(gerente.LastName());
        System.out.println(gerente.FullName());
        System.out.println(gerente.NameUperCase());
        System.out.println(gerente.NameAbbreviated());

        System.out.println("Cliente ------------------------");
        Client cliente = new Client("Roberto","Silva");
        System.out.println(cliente.FirstName());
        System.out.println(cliente.LastName());
        System.out.println(cliente.FullName());
        System.out.println(cliente.NameUperCase());
        System.out.println(cliente.NameAbbreviated());

        System.out.println("Robo --------------------------");
        Robot robo = new Robot("Roberto","Silva");
        System.out.println(robo.FirstName());
        System.out.println(robo.LastName());
        System.out.println(robo.FullName());
        System.out.println(robo.NameUperCase());
        System.out.println(robo.NameAbbreviated());

        System.out.println("Robo nome grande ----------------------");
        Robot roboLargeName = new Robot("Roberto","Silva Pires");
        System.out.println(roboLargeName.FirstName());
        System.out.println(roboLargeName.LastName());
        System.out.println(roboLargeName.FullName());
        System.out.println(roboLargeName.NameUperCase());
        System.out.println(roboLargeName.NameAbbreviated());

        System.out.println("Robo extra nome grande -------------------");
        Robot roboExtraLargeName = new Robot("Roberto","Silva Pires Robsom Segundo");
        System.out.println(roboExtraLargeName.FirstName());
        System.out.println(roboExtraLargeName.LastName());
        System.out.println(roboExtraLargeName.FullName());
        System.out.println(roboExtraLargeName.NameUperCase());
        System.out.println(roboExtraLargeName.NameAbbreviated());
    }


}
