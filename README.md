# SingtelAnimal
Coding Test
This test is implemented using Decorator design pattern
1. The class Animal is super class and has 4 methods named as fly, sing, swim & walk
2. Provided abstract AnimalDecorator class which extends Animal without any overrides/implementation methods
3. Created respective decorator class by extending Animal class for each method with its method implementation though overriding, for example SingDecorator implements sing method by extending Animal, SwimDecorator implements swim method by extending Animal..
4. Now the Duck class ,  creates the object for SingDecorator & SwimDecorator class in its default constructor  same like all other Animals will create the object for respective  decorator classes.
5. The implenation provided for Sea Animals also by Adding one more abstarct class which which extends animal
6. The TestAnimal has the logic for counting the birds count for fly , swim ,walk and sing method animal types 
7. Some Test cases also coded using Junit framework.
