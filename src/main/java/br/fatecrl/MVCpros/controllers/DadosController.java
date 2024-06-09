package br.fatecrl.MVCpros.controllers;

import br.fatecrl.MVCpros.models.ProSettings;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/prosettings")
public class DadosController {
    private static final List<ProSettings> ProConfigs = new ArrayList<ProSettings>();

    public DadosController() {
        ProConfigs.add(new ProSettings("Erick 'Aspas' Santos","LOGITECH G PRO X SUPERLIGHT 2 WHITE","WOOTING 60 HE","ZOWIE XL2586X","HyperX Cloud Alpha S","Artisan Ninja FX Zero Soft",0.4));
        ProConfigs.add(new ProSettings("Felipe 'Less' Basso","VAXEE XE WIRELESS WHITE","WOOTING TWO HE","ZOWIE XL2566K","HyperX Cloud II","Lethal Gaming Gear Saturn Pro",0.32));
        ProConfigs.add(new ProSettings("Olavo 'Heat' Marcelo","LAMZU ATLANTIS 4K","Wooting 60 HE","ZOWIE XL2546K","HyperX Cloud III","Artisan Ninja FX Zero XSoft",0.45));
        ProConfigs.add(new ProSettings("Cauan 'Cauanzin' Pereira","VAXEE XE WIRELESS YELLOW","RAZER HUNTSMAN V3 PRO TKL BLACK","AOC AG251FZ","Logitech G Pro X Headset","Yuki Aim Kitsune",0.25));
        ProConfigs.add(new ProSettings("Matias 'Saadhak' Delipetro","RAZER VIPER V3 PRO BLACK","HyperX Alloy FPS","HP OMEN 24.5","Razer BlackShark V2","SteelSeries QcK Heavy",0.23));
    }

    @GetMapping
    public List<ProSettings> getProConfigs()
    {
        return ProConfigs;
    }
}
