class Account {
  int acNo;  // default access modifier
  public String name;  // public
  protected String email;  // protected - can be accessed in this class and subclasses
  private String password;  // private

  // getters and setters
  public String getPassword(){
    return this.password;
  }

  public void setPassword(String pass){
    this.password = pass;
  }
}

// Data hiding is the process of protecting members of class from unintended changes whereas, abstraction is hiding the implementation details and showing only important/useful parts to the user.

public class Class17_Bank {
  public static void main(String[] args) {
    Account ac = new Account();
    ac.name = "Apna College";
    ac.email = "jrk2001.mymail@gmail.com";
    // ac.password = "Jk123";
    ac.setPassword("Jyoti@123");
    System.out.println(ac.getPassword());
  }
}
