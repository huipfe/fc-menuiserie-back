package fr.studi.menuiserie.ws;

import fr.studi.menuiserie.pojo.Menuiserie;
import fr.studi.menuiserie.service.MenuiserieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MenuiserieWs {

    @Autowired
    private MenuiserieService menuiserieService;

    @PostMapping
    public void createMenuiserie(@RequestBody Menuiserie menuiserie){
        this.menuiserieService.createMenuiserie(menuiserie);

  }
}
