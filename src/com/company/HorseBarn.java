package com.company;

public interface Horse
{
    String getName();
   // int getWeight();
}
public class HorseBarn {

    private Horse[] spaces;

    public static void main(String[] args) {
        Horse horse1 = new Mustang("Secretariat", 12000);
        Horse horse2 = new Mustang("Dusty Trail", 22000);
        Horse horse3 = new Mustang("Silver", 12000);

        Horse[] horses = new Horse[6];

        horses[1]=horse1;
        horses[3]=horse2;
        horses[5]=horse3;
        HorseBarn barn = new HorseBarn(horses);

        System.out.println(barn);
        System.out.println(" Dustry trail is in space: " + barn.findHorseSpace("Dusty Trail"));

        barn.consolidate();

        System.out.println(barn);
        System.out.println(" Dustry trail is now in space: " + barn.findHorseSpace("Dusty Trail"))

    }

    public int findHorseSpace(String name)
        {
            for(int i=0;i<spaces.length;i++)
            {
                if(spaces[i].equals(name))
                {
                    return i;
                }

            }
            return -1;

    }
    public void consolidate()
    {

        for(int i=0;i<spaces.length;i++)
        {
            if(spaces[i]==null)
            {
                spaces[i] = spaces[i+1];
                spaces[i+1]=null;
            }

        }

    }
}
