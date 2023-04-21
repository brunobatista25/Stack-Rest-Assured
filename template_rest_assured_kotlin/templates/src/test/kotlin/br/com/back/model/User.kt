package br.com.back.model

class User(var nome: String, var email: String, var password: String, var administrador: String) {

    override fun toString(): String {
        return "{\n" +
                "  \"nome\": \"$nome\",\n" +
                "  \"email\": \"$email\",\n" +
                "  \"password\": \"$password\",\n" +
                "  \"administrador\": \"$administrador\"\n" +
                "}"
    }
}