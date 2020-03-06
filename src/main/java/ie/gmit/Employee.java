package ie.gmit;
//Cathal Walsh
//Group C
//06/03/2020
//Lab Exam

public class Employee {
    private String title;
    private String name;
    private int pps;
    private String phoneNumber;
    private String type;
    private int age;

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public int getPps() {
        return pps;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public Employee(String title, String name, int pps, String phoneNumber, String type, int age){
        if(title == "")
        {
            throw new IllegalArgumentException("Invalid Title or Name is not valid");
        }
        else
        {
            this.title = title;
        }
        if(name.length()<3 || ()>22)
        {
            throw new IllegalArgumentException("Name too short or long");
        }
        else
        {
            this.name = name;
        }

        if(pps == 0)
        {
            throw new IllegalArgumentException("Invalid pps");
        }
        else
        {
            this.pps = pps;
        }
        if(phoneNumber == "")
        {
            throw new IllegalArgumentException("Incorrect Phone number");
        }
        else
        {
            this.phoneNumber = phoneNumber;
        }
        if(age == 15)
        {
            throw new IllegalArgumentException("Age must be over 16");
        }
        else
        {
            this.age = age;
        }
        if(type == "")
        {
            throw new IllegalArgumentException("Invalid Type");
        }
        else
        {
            this.type = type;
        }
    }
}
