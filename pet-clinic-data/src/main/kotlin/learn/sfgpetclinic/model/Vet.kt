package learn.sfgpetclinic.model

class Vet: Person(){
    var specialities:MutableSet<Speciality> = mutableSetOf()
}