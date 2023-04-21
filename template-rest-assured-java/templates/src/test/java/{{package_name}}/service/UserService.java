package {{package_name}}.service;

import {{package_name}}.model.User;
import {{package_name}}.support.enums.Paths;
import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Map;

import static {{package_name}}.support.utils.BaseRest.*;

public class UserService {



    public static void createUser(String name, String email, String password, String administrador) {

        // inicializando o rest assured
        initRest();
        //setando a url base e qual rota
        setPath(Paths.BASE_URL.getPath(), Paths.POST_USER.getPath());

        // setando os headers necessários para a requisição
        Map<String, String> header = new HashMap<String, String>();
        header.put("Content-type", "application/json");
        setHeader(header);

        //setando o body com um json gerado pela classe user
        User bodyUser = new User(name, email, password, administrador);
        setBody(bodyUser.toString());

        //fazendo a requisição post
        postRequest();

    }
}
