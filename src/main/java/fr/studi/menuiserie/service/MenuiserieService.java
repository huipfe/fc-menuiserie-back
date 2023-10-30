package fr.studi.menuiserie.service;


import fr.studi.menuiserie.pojo.Menuiserie;
import fr.studi.menuiserie.repository.MenuiserieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuiserieService {


    @Autowired
    private MenuiserieRepository menuiserieRepository;

    public void createMenuiserie(Menuiserie menuiserie) {
        this.menuiserieRepository.save(menuiserie);

    }

    public Menuiserie getMenuiserie(){
        Menuiserie maMenuiserie = null; //Création d'un objet null/vide
        List<Menuiserie>menuiseriesList=this.menuiserieRepository.findAll(); //Je vais en base, et je récup tout les menuiseries
        if(!menuiseriesList.isEmpty()){ //Si ma liste n'est pas vide
            maMenuiserie = menuiseriesList.get(0); //Alors je récup ma menuiserie, je l'affecte ma variable
        }
        return maMenuiserie; //Et je la retourne
    }
}
