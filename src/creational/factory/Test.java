package creational.factory;

public class Test {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      DefaultUserFactoryImplementation dUFImpl = new DefaultUserFactoryImplementation();
      AbstractUser AbstracUser = dUFImpl.createUser();

      // System.out.println("a");
   }

}
