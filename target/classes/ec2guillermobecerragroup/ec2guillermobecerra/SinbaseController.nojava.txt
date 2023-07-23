package ec2guillermobecerragroup.ec2guillermobecerra;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping(path="/")
public class SinbaseController {


	@GetMapping("/")
	public String home() {
		return "Codigo: a160A743, Nombre: GUILLERMO JOSUE BECERRA TUYA";
	}

    @GetMapping("/idat/codigo")
	public String codigo() {
		return "Codigo: a160A743";
	}

    @GetMapping("/idat/nombre-completo")
	public String nombreCompleto() {
		return "Nombre: GUILLERMO JOSUE BECERRA TUYA";
	}

}