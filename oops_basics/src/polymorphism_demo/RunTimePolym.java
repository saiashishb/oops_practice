package polymorphism_demo;

//runtime polymorphism

// Java program to illustrate the fact that
// runtime polymorphism cannot be achieved
// by data members

// class A
class A
{
    int x = 10;
}

// class B
class B extends A
{
    int x = 20;
}

// Driver class

public class RunTimePolym {



        public static void main(String args[])
        {
            A a = new B(); // object of type B

            // Data member of class A will be accessed
            System.out.println(a.x);
        }
    }


/*


Animal

Cat extends Animal
Dog extends Animal

Animal[] animals = new Animal[5];

animals[0] = new Dog();
animals[1] = new Cat();
animals[2] = new Wolf();
animals[3] = new Hippo();
animals[4] = new Lion();

for(int i=0;i<animals.length();++i)
{
    animals[i].eat();
    animals[i].roam();
}


class Vet{

public void giveShot(Animal a)
{

    a.makeNoise();

}

}


class PetOwner {


    public void start(){

    Vet v = new Vet();

    Dog d = new Dog();

    Hippo h = new Hippo();

    v.giveShot(d);

    v.giveShot(h);

    for(int i=0;i<animals.length();++i)
    {

    vo.giveShot(animals[i]);


    }

}



 */