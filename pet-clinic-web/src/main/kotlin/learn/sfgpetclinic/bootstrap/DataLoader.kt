package learn.sfgpetclinic.bootstrap

import learn.sfgpetclinic.model.*
import learn.sfgpetclinic.services.OwnerService
import learn.sfgpetclinic.services.PetTypeService
import learn.sfgpetclinic.services.SpecialityService
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

    @Autowired
    lateinit var specialityService: SpecialityService

    override fun run(vararg args: String?) {
        if (petTypeService.findAll().isEmpty())
           LoadData()
    }

    private fun LoadData() {
        val dog = PetType().apply { name = "dog" }.also { petTypeService.save(it) }
        val cat = PetType().apply { name = "cat" }.also { petTypeService.save(it) }
        println("Loaded pettypes...")
        Owner().apply {
            firstName = "Michael"
            lastName = "Weston"
            adress = "Peremoga street, 26"
            city = "Krivij Rig"
            telephone = "123456789"
        }.also {
            it.pets.addAll(
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
                    })
                )
            )
        }.also { ownerService.save(it) }
        Owner().apply {
            firstName = "Fiona"
            lastName = "Glenanne"
            adress = "Darvin street, 2"
            city = "Zaporijja"
            telephone = "987654321"
        }.also {
            it.pets.addAll(
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
                    })
                )
            )
        }.also { ownerService.save(it) }
        println("Loaded owners...")
        val dentistry = Speciality().apply { description = "dentistry" }.also { specialityService.save(it) }
        val surgery = Speciality().apply { description = "surgery" }.also { specialityService.save(it) }
        val radiology = Speciality().apply { description = "radiology" }.also { specialityService.save(it) }
        println("Loaded specialities...")
        Vet().apply {
            firstName = "Sam"
            lastName = "Axe"
            specialities.addAll(setOf(dentistry, radiology))
        }.also { vetService.save(it) }
        Vet().apply {
            firstName = "John"
            lastName = "Silver"
            specialities.addAll(setOf(surgery, radiology))
        }.also { vetService.save(it) }
        println("Loaded vets...")
    }
}