package learn.sfgpetclinic.controllres

import learn.sfgpetclinic.services.VetService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class VetController {
    @Autowired
    lateinit var vetService: VetService
    @GetMapping("/vets","/vets/index","/vets/index.html")
    fun listVets(model: Model):String{
        model.addAttribute("vets", vetService.findAll())
        return "vets/index"
    }
}
