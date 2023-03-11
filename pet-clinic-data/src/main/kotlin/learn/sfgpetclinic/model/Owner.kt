package learn.sfgpetclinic.model

class Owner:Person() {
      var adress:String? = null
      var city:String? = null
      var telephone:String? = null
      var pets:MutableSet<Pet> = mutableSetOf()
}