package learn.sfgpetclinic.controllres

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/owners")
@Controller
class OwnerController {
    @GetMapping("", "/","/index","/index.html")
    fun listOwners():String{
        return "owners/index"
    }
}