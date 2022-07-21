import java.util.ArrayList;
import java.util.Arrays;

public class CommonAttributes {

    private String firstName;
    private String lastName;
    private String fullName;

    public CommonAttributes(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
    }

    public String FullName() {
        return this.fullName;
    }
    public String FirstName() {
        return this.firstName;
    }
    public String LastName() {
        return this.lastName;
    }
    public String NameUperCase() {
        return this.fullName.toUpperCase();
    }
    public String NameAbbreviated() {
        String[] names = this.fullName.split(" ");
        if(Arrays.stream(names).count() == 2){
            return names[0] + " " + names[1].charAt(0);
        }
        else if(Arrays.stream(names).count() == 3)
        {
            return names[0] + " " + names[1].charAt(0) + " " + names[2];
        }else
        {
            ArrayList<String> sobrenomes = new ArrayList<String>();
            int count = 0;
            for(String name : names) {
                count++;
                if(count==0)
                {
                    continue;
                }else{
                    if(count < (Arrays.stream(names).count())-1){
                    sobrenomes.add(String.valueOf((names[count].charAt(0))));
                    }else if(count < (Arrays.stream(names).count()))
                    {
                        int location = (int) Arrays.stream(names).count()-1;
                        String ultimoNome = names[location];
                        sobrenomes.add(ultimoNome);
                    }
                }
            }

            if(sobrenomes == null || sobrenomes.isEmpty())
            {
                return names[0];
            }
            else
            {
                String listNames = String.join(" ", sobrenomes);
                 return names[0]+" "+listNames;
            }
        }
    }
}
