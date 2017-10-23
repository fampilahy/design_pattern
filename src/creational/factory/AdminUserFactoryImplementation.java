package creational.factory;

public class AdminUserFactoryImplementation extends UserFactory {

   public AbstractUser createUser() {
      System.out.println("AdminUserFactoryImplementation.createUser()");
      return new AdminUser();
   }

}
