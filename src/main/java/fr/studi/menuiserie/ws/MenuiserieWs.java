package fr.studi.menuiserie.ws;

import fr.studi.menuiserie.pojo.Menuiserie;
import fr.studi.menuiserie.repository.MenuiserieRepository;
import fr.studi.menuiserie.service.MenuiserieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController //C'est un bean/haricot
@RequestMapping(ApiRegistration.REST_MENUISERIE)
@CrossOrigin
public class MenuiserieWs {

    @Autowired
    private MenuiserieService menuiserieService;
    @Autowired
    private MenuiserieRepository menuiserieRepository;

    @PostMapping
    public void createMenuiserie(@RequestBody Menuiserie menuiserie){
        this.menuiserieService.createMenuiserie(menuiserie);
    }

   @GetMapping
    public Menuiserie getMenuiserie(){
        return this.menuiserieService.getMenuiserie();
  }

  @PutMapping
    public void updateMenuiserie(@RequestBody Menuiserie menuiserie){
        // Je récup la menuiserie de la bdd
        Menuiserie maMenuiserie = this.getMenuiserie();

        // Modif de la menuiserie
        maMenuiserie.setAvis(menuiserie.getAvis());
        maMenuiserie.setNom(menuiserie.getNom());
        maMenuiserie.setHoraires(menuiserie.getHoraires());

        // On envoie en bdd la modif
        this.menuiserieRepository.save(maMenuiserie);

  }
}
