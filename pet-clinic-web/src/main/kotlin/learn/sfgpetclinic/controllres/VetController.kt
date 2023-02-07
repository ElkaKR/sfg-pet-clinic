package learn.sfgpetclinic.controllres

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class VetController {
    @GetMapping("/vets","/vets/index","/vets/index.html")
    fun listVets():String{
        return "vets/index"
    }
}