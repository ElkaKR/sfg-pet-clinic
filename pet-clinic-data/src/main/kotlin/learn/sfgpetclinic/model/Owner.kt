package learn.sfgpetclinic.model

class Owner:Person() {
      val pets:MutableSet<Pet> = mutableSetOf()
}