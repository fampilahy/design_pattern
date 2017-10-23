package creational.factory;

public class DefaultUserFactoryImplementation extends UserFactory {

   public AbstractUser createUser() {
      System.out.println("DefaultUserFactoryImplementation.createUser()");
      return new DefaultUser();
   }

}
