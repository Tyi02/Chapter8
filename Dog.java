package PetAbstract;

public class Dog extends Pet {

    private String size;
    private String breed;

    public Dog(String newName, int newAge,
               String newSize, String newBreed)
    {
        setName(newName);
        setAge(newAge);
        size = newSize;
        breed = newBreed;
    }

    @Override
    public void printAdoptionDetails()
    {
        System.out.println("To adopt this dog, please be aware it is: ");
        System.out.println("of a "+size+" size. It is "+getAge()+
                " years old.");
    }
}
