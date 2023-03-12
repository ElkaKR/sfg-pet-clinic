package learn.sfgpetclinic.bootstrap

import learn.sfgpetclinic.model.Owner
import learn.sfgpetclinic.model.Pet
import learn.sfgpetclinic.model.PetType
import learn.sfgpetclinic.model.Vet
import learn.sfgpetclinic.services.OwnerService
import learn.sfgpetclinic.services.PetTypeService
import learn.sfgpetclinic.services.VetService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import java.time.LocalDate

@Component
class DataLoader : CommandLineRunner {
    @Autowired
    lateinit var ownerService: OwnerService
    @Autowired
    lateinit var vetService: VetService
    @Autowired
    lateinit var petTypeService: PetTypeService

    override fun run(vararg args: String?) {

        val dog = PetType().apply { name = "dog" }.also { petTypeService.save(it) }
        val cat = PetType().apply { name = "cat" }.also { petTypeService.save(it) }
        println("Loaded pettypes...")
        Owner().apply {
            firstName = "Michael"
            lastName = "Weston"
            adress = "Peremoga street, 26"
            city = "Krivij Rig"
            telephone = "123456789"
        }.also { it.pets.addAll(
                setOf((Pet().apply {
                    this.name = "Rich"
                    this.petType = dog
                    this.owner = it
                    this.birthday = LocalDate.now()
                    }),
                    (Pet().apply {
                        this.name = "Ron"
                        this.petType = dog
                        this.owner = it
                        this.birthday = LocalDate.now()
                    }))
        ) }.also { ownerService.save(it) }
        Owner().apply {
            firstName = "Fiona"
            lastName = "Glenanne"
            adress = "Darvin street, 2"
            city = "Zaporijja"
            telephone = "987654321"
        }.also { it.pets.addAll(
            setOf((Pet().apply {
                this.name = "Motia"
                this.petType = cat
                this.owner = it
                this.birthday = LocalDate.now()
            }),
                (Pet().apply {
                    this.name = "Rygyi"
                    this.petType = cat
                    this.owner = it
                    this.birthday = LocalDate.now()
                }))
        ) }.also { ownerService.save(it) }
        println("Loaded owners...")
        Vet().apply {
            firstName = "Sam"
            lastName = "Axe"
        }.also { vetService.save(it) }
        Vet().apply {
            firstName = "John"
            lastName = "Silver"
        }.also { vetService.save(it) }
        println("Loaded vets...")
    }
}