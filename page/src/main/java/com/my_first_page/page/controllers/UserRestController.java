package com.my_first_page.page.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;


import com.my_first_page.page.models.UserModel;



// @RestController
// @RequestMapping("/api")
// public class UserRestController {
//     @GetMapping("/detalles")
//     public Map<String,Object> detalles(){
//         UserModel userModel = new UserModel("Juan","gomez");
//         Map<String, Object> body = new HashMap<>();
//         body.put("title", "Monda");
//         body.put("user", userModel);
//         return body;
//     }
// }

// Aca la el path seria http://localhost:8080/api/detalles 

// Otro dato aca es que con este codigo Retornamos la informacion en Formato JSON o XML 

// Ahora vamos aRetornar la Vista,Screen, Graphic de la informacion.

@Controller
// @RequestMapping("/monda")
public class UserRestController {
    @GetMapping("/detalles")
    public String detalles(Model model){
        UserModel userModel = new UserModel("Epa","La Arepa");
        model.addAttribute("title", "DesarrollandoCon Spring Perrita");
        model.addAttribute("userModel", userModel);
        // Recordar que userModel debe ser igual que en el Tempalte
        
        return "detalles";
    }
}