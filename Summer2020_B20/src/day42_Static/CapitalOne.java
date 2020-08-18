package day42_Static;

public class CapitalOne {

    public static void main(String[] args) {
        Tester_ScrumTeam[] testers = { new Tester_ScrumTeam(), new Tester_ScrumTeam(), new Tester_ScrumTeam() };
        testers[0].setInfo("Aalia", 'F', 15111L,"Lead Tester",180000);
        testers[1].setInfo("Naz",'F',15222L,"Tester", 180000);
        testers[2].setInfo("Kalbinur",  'F', 15333L, "Tester", 210000);

        Developer_ScrumTeam[] developers = {new Developer_ScrumTeam(),new Developer_ScrumTeam(),new Developer_ScrumTeam(),new Developer_ScrumTeam(),new Developer_ScrumTeam(),};
        developers[0].setInfo("waqar", 'M', 2111L, "Dev Lead" , 4500000);
        developers[1].setInfo("roza", 'F', 3222L, "Dev", 550000);
        developers[2].setInfo("burak", 'M', 43333L, "Dev", 650000);
        developers[3].setInfo("Virginia", 'F', 76543, "Dev", 130000);
        developers[4].setInfo("Akbar", 'M', 5435L, "Dev", 120000);



        ScrumTeam team1 = new ScrumTeam();

        team1.setInfo("Ramazan", "Hamit", "Ismail");
        team1.addTester(testers);
        team1.addDeveloper(developers);

        System.out.println(team1);

        System.out.println("================================");
        for(Tester_ScrumTeam each : team1.testers ){// each: every single testers in the scrum team
            System.out.println(each.name +" : $"+each.salary);
        }

        System.out.println("=====================================");

        for(Developer_ScrumTeam each : team1.developers){
            System.out.println(each.name +" : $"+each.salary);
        }

        System.out.println("=======================================");
        team1.removeTester(15333);
        team1.removeDeveloper(2111);
        team1.removeDeveloper(43333);
        System.out.println(team1);

        System.out.println("======================================");
        Developer_ScrumTeam dev1 =  new Developer_ScrumTeam();
        dev1.setInfo("luisa", 'f', 2113L, "Dev Lead" , 500000);

        team1.addDeveloper(dev1);

        System.out.println(team1);



        ScrumTeam[] scrumTeams = {team1, new ScrumTeam(), new ScrumTeam()};
        /*
        print all developers and testers from scrum team
        find the maximum salary
         */


    }
}