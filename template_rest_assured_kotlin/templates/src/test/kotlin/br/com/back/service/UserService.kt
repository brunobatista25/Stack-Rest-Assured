package br.com.back.service

import br.com.back.model.User
import br.com.back.support.enums.Paths
import br.com.back.support.utils.BaseRest
import java.util.HashMap

object UserService {
    @JvmStatic
    fun createUser(name: String?, email: String?, password: String?, administrador: String?) {

        // inicializando o rest assured
        BaseRest.initRest()
        //setando a url base e qual rota
        BaseRest.setPath(Paths.BASE_URL.path, Paths.POST_USER.path)

        // setando os headers necessários para a requisição
        val header: MutableMap<String, String> = HashMap()
        header["Content-type"] = "application/json"
        BaseRest.setHeader(header)

        //setando o body com um json gerado pela classe user
        val bodyUser = User(name!!, email!!, password!!, administrador!!)
        BaseRest.setBody(bodyUser.toString())

        //fazendo a requisição post
        BaseRest.postRequest()
    }
}