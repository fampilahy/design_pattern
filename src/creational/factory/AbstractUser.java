package creational.factory;

public abstract class AbstractUser {

   public void printUser() {
      System.out.println("AbstractUser.printUser()");
   }

   public abstract AbstractUser getUser();
}
