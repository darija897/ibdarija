public class Contact{ //declare and initialize instance variables
    private String name;
    private String phoneNum;
    private String email;

    public Contact(String name, String phoneNum, String email){ //constructor: assigns (присваевает) parameters to the corresponding (соответствующим) iv
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
    }
    public String getName(){ //return the value of iv that it is associated with
        return name;
    }
    public String getPhoneNum(){
        return phoneNum;
    }
    public String getEmail() {
        return email;
    }

    public void setName(String name){ //set what was gotten (the returned value) to the parameter
        this.name = name;
    }
    public void setPhoneNum(String phoneNum){
        this.phoneNum = phoneNum;
    }
    public void setEmail(String email){
        this.email = email;
    }
        }

    //the aim: to create contact objects, access them (GETTER) and modify (SETTER)

