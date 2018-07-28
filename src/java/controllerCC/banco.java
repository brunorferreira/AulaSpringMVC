/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerCC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Caroline
 */
@Controller
public class banco {
    
    @RequestMapping("/home")
    public String banco() {
        return "banco/contas";//view de retorno
    }
    
    @RequestMapping("/relatorio")
    public String relatorios() {
        return "banco/relatoriocontas";//view de retorno
    }
   
      
}
