package org.example;

import animals.AnimalType;
import animals.petstore.pet.Pet;
import animals.petstore.pet.attributes.Breed;
import animals.petstore.pet.attributes.Gender;
import animals.petstore.pet.attributes.Skin;
import animals.petstore.pet.types.Cat;
import animals.petstore.pet.types.Dog;
import animals.petstore.pet.types.Snake;
import animals.petstore.store.DuplicatePetStoreRecordException;
import animals.petstore.store.PetNotFoundSaleException;
import animals.petstore.store.PetStore;
import  animals.petstore.pet.Pet;


import java.awt.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Dog dog = new Dog(AnimalType.DOMESTIC, Skin.HAIR, Gender.MALE, Breed.POODLE);
//        System.out.println(dog.toString());
//        System.out.println("\n");
//        dog = new Dog(AnimalType.WILD, Skin.FUR, Gender.MALE, Breed.GERMAN_SHEPARD);
//        System.out.println(dog.toString());
//
//        Cat cat = new Cat(AnimalType.DOMESTIC, Skin.FUR, Gender.MALE, Breed.BURMESE);
//        System.out.println(cat.toString());
//
//        Snake snake = new Snake(AnimalType.WILD, Skin.SCALES, Gender.FEMALE, Breed.BALL_PYTHON);
//        System.out.println(snake.toString());
//
//        snake = new Snake(AnimalType.DOMESTIC, Skin.SCALES, Gender.MALE, Breed.COPPERHEAD);
//        System.out.println(snake.toString());
          PetStore petStore = new PetStore();
          petStore.init();

          System.out.println("initial inventory");
          petStore.printInventory();

          Dog dog = new Dog(AnimalType.DOMESTIC, Skin.HAIR, Gender.MALE, Breed.POODLE);
          Dog dog2 = new Dog(AnimalType.WILD, Skin.FUR, Gender.MALE, Breed.GERMAN_SHEPARD);
          Cat cat = new Cat(AnimalType.DOMESTIC, Skin.FUR, Gender.MALE, Breed.BURMESE);
          Snake snake = new Snake(AnimalType.WILD, Skin.SCALES, Gender.FEMALE, Breed.BALL_PYTHON);
          Snake snake2 = new Snake(AnimalType.DOMESTIC, Skin.SCALES, Gender.MALE, Breed.COPPERHEAD);

          petStore.addPetInventoryItem(dog);
          petStore.addPetInventoryItem(dog2);
          petStore.addPetInventoryItem(cat);
          petStore.addPetInventoryItem(snake);
          petStore.addPetInventoryItem(snake2);


          System.out.println("updated inventory");
          petStore.printInventory();

          System.out.println("pets sales list");
          List<Pet> petsforSale = petStore.getPetsForSale();

          for (Pet pet : petsforSale) {
              System.out.println(pet.toString());
          }


    }


}
