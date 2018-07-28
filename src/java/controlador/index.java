/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import controladorPessoa.Pessoa;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Caroline
 */
@Controller
public class index {

    @RequestMapping("/inicio")
    public String index() {
        return "index";//view de retorno
    }

    @RequestMapping("/cadastrarAlguem")
    public String cadastro() {
        return "pessoas/cadastroPessoas";//view de retorno
    }

    @RequestMapping("/persistePessoa")
    public String persistePessoa(Model m, Pessoa p, HttpServletRequest request) {

        //persistencia usando collections...
        ArrayList pessoas = new ArrayList();

        if (request.getSession().getAttribute("pessoas") != null) {
            pessoas = (ArrayList) request.getSession().getAttribute("pessoas");
        }

        pessoas.add(p);

        request.getSession().setAttribute("pessoas", pessoas);

        //faz a persistencia
        m.addAttribute("pessoa", p);
        return "mensagemCadastro";
    }
}
